package org.padtec.control;

import org.bson.types.ObjectId;
import org.padtec.entity.Task;
import org.padtec.entity.TaskPojo;

import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class TaskService {

    public void updateTask(Task task) {
        task.persistOrUpdate();
    }

    public void setDone(String id) {
        Task task = Task.findById(new ObjectId(id));
        task.setDone(!task.getDone());
        task.persistOrUpdate();
    }

    public void delete(String id) {
        Task task = Task.findById(new ObjectId(id));
        task.delete();
    }

    public List<TaskPojo> findAllTasks() {
        List<TaskPojo> result = new ArrayList<>();

        List<Task> list = Task.findAll().list();
        list.stream().forEach(n -> {
            result.add(new TaskPojo(n.id.toString(), n.getDescription(), n.getDone()));
        });

        return result;
    }
}
