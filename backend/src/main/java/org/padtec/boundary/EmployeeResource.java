package org.padtec.boundary;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.padtec.control.EmployeeService;
import org.padtec.entity.Employee;
import org.padtec.entity.Task;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/employee")
public class EmployeeResource {

    private ObjectMapper mapper = new ObjectMapper();

    @Inject
    private EmployeeService employeeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getList() throws JsonProcessingException {
        //return this.mapper.writeValueAsString(taskService.findAllTasks());
        return null;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getByID(@PathParam("id") String id) throws JsonProcessingException {
        Task task = Task.findById(new ObjectId(id));
        return this.mapper.writeValueAsString(task);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void newEmployee(String task) {
        //Task task2 = new Task(task.split(",")[0].split(":")[1].replace("\"", ""));
        Employee employee = new Employee("Bruno");
        employeeService.updateTask(employee);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}/updateStatus")
    public void changeStatus(@PathParam("id") String id) {
        Task task = Task.findById(new ObjectId(id));
        task.setDone(task.getDone() == null ? true : !task.getDone());
        task.persistOrUpdate();
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateTask(@PathParam("id") String id, String payload) {
        Task task = Task.findById(new ObjectId(id));
        task.setDescription(payload.split(",")[1].split(":")[1].replace("\"", ""));
        task.persistOrUpdate();
    }

    @DELETE
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") String id) {
        //taskService.delete(id);
    }
}