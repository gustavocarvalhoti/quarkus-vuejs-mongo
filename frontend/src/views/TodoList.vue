<template>
  <section class>
    <div v-show="false">
      <TodoMessage :id="messageId" />

      <TodoPageHeader title="Todo list" />

      <TodoTable
        :fields="fields"
        :items="tasks"
        :searchable="true"
        :paginated="true"
        :pageSize="5"
        @onRowClick="(item) => this.gotoUpdate(item.id)"
      >
        <template v-slot:table-col="props">
          <template v-if="props.field.name === 'done'">
            <i class="fa fa-check" />
            {{props.field.label}}
          </template>
          <template v-else-if="props.field.name === 'actions'">
            <i class="fa fa-bolt" />
            {{props.field.label}}
          </template>
          <template v-else>{{props.field.label}}</template>
        </template>

        <!-- Opcional usar somente se customizações forem necessárias nos dados -->
        <template v-slot:table-row="props">
          <template v-if="props.field === 'description'">
            <div
              :class="props.item.done ? 'task-finished' : ''"
            >{{props.item.description}}//Souisso//</div>
          </template>

          <template v-else-if="props.field === 'done'">
            <div class="center">{{props.item.done ? 'Sim' : 'Não'}}</div>
          </template>

          <!-- botões tabela antiga -->
          <template v-else-if="props.field === 'actions'">
            <div class="center">
              <TodoButton
                v-if="!props.item.done"
                @onClick="gotoUpdate(props.item.id)"
                icon="edit"
                circle
                tooltip="Alterar"
                clazz="line-action-button"
              />

              <TodoButton
                v-if="props.item.done"
                @onClick="removeTask(props.item)"
                icon="trash"
                circle
                tooltip="Excluir"
                clazz="line-action-button"
              />

              <TodoButton
                @onClick="toggleTaskState(props.item)"
                :icon="props.item.done ? 'undo' : 'check'"
                circle
                :tooltip="props.item.done ? 'Reabrir' : 'Finalizar'"
                clazz="line-action-button"
              />
            </div>
          </template>

          <template v-else>{{props.value}}</template>
        </template>
      </TodoTable>

      <div class="list-actions">
        <TodoButton label="Adicionar" icon="plus" @onClick="gotoCreate" />
      </div>

      <TodoModalConfirm
        :id="idDeleteConfirm"
        title="Exclusão de Task"
        message="Deseja realmente excluir a task"
        :messageComp="`${this.task ? this.task.description : ''}?`"
        labelOk="Sim"
        labelCancel="Não"
        @onOk="confirmRemoveTask"
        @onCancel="cancelRemoveTask"
      />
    </div>
    <!-- PrimeVue  -->
    <div>
      <DataTable :value="cars">
        <template #header>
          <div style="line-height:1.87em" class="p-clearfix">
            <Button icon="pi pi-refresh" style="float: left" />Lista de Colaboradores
          </div>
        </template>
        <Column field="name" header="Nome"></Column>
        <Column field="position" header="Cargo">Cargo</Column>
        <Column field="functional" header="Area Funcional">Area Funcional</Column>
        <Column field="register" header="Matricula">Matricula</Column>
        <Column headerStyle="width: 8em" bodyStyle="text-align: center">
          <template #header>Opções</template>
          <template #body="slotProps">
            <Button type="button" icon="pi pi-save" class="p-button-success" style="margin: .1em"></Button>
            <Button type="button" icon="pi pi-pencil" class="p-button-warning"></Button>
            <Button type="button" icon="pi pi-trash" class="p-button-danger"></Button>
          </template>
        </Column>
      </DataTable>
    </div>
  </section>
</template>

<script>
import TodoService from "../services/todo-service.js";
import TodoMessageService from "@/components/todo-message/TodoMessageService";

import TodoPageHeader from "@/components/todo-page-header/TodoPageHeader";
import TodoTable from "@/components/todo-table/TodoTable";
//import TodoModalConfirm from "@/components/todo-modal/TodoModalConfirm";
import TodoModalService from "@/components/todo-modal/TodoModalService";

export default {
  components: {
    TodoPageHeader,
    TodoTable,
    
  },

  carService: null,

  data() {
    return {
      tasks: [],
      task: undefined,
      cars: null
    };
  },
  computed: {
    messageId() {
      return "listMessage";
    },
    fields() {
      return [
        {
          label: "Descrição",
          name: "description"
        },
        {
          label: "Finalizado",
          name: "done"
        },
        {
          label: "Ações",
          name: "actions"
        }
      ];
    },
    idDeleteConfirm() {
      return "deleteTaskConfirm";
    }
  },
  methods: {
    gotoCreate() {
      this.$router.push({ name: "todo-create" });
    },
    gotoUpdate(id) {
      this.$router.push({ name: "todo-update", params: { id } });
    },
    removeTask(task) {
      this.task = task;
      TodoModalService.open(this.idDeleteConfirm);
    },
    confirmRemoveTask() {
      TodoService.delete(this.task)
        .then(() => this.listAll())
        .catch(() =>
          TodoMessageService.error(this.messageId, "Erro ao remover a task")
        )
        .finally(() => this.cancelRemoveTask());
    },
    cancelRemoveTask() {
      this.task = undefined;
    },
    toggleTaskState(task) {
      TodoService.updateState(task)
        .then(() => this.listAll())
        .catch(() =>
          TodoMessageService.error(
            this.messageId,
            "Erro ao mudar o estado da task"
          )
        );
    },
    listAll() {
      TodoService.listAll()
        .then(tasks => (this.tasks = tasks))
        .catch(() =>
          TodoMessageService.error(this.messageId, "Erro ao listar as tasks")
        );
    }
  },
  created() {
    this.listAll();
  },

  mounted() {
    this.cars = [
      {
        name: "Bruno",
        position: "Estagiario",
        functional: "desenvolvimento de software",
        register: "1234"
      },
      {
        name: "Lucas",
        position: "Eng. de Software pleno",
        functional: "desenvolvimento de software",
        register: "2345"
      },
      {
        name: "Thiago",
        position: "Eng. de Software jr.",
        functional: "desenvolvimento de software",
        register: "3456"
      }
    ];
  }
};
</script>

<style >
</style>
