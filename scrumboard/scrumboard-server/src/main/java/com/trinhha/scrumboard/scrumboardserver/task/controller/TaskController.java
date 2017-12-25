package com.trinhha.scrumboard.scrumboardserver.task.controller;

import com.trinhha.scrumboard.scrumboardserver.task.entity.Task;
import com.trinhha.scrumboard.scrumboardserver.task.service.ITaskService;
import com.trinhha.scrumboard.scrumboardserver.util.Constants;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Log4j
@RestController
@Path("/task")
public class TaskController {

    @Autowired
    private ITaskService taskService;

    @POST
    @Path("add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNewTask(@RequestParam("task") Task task) {
        Task ref = this.taskService.addNewTask(task);
        return Response.ok(ref).build();
    }

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllTask() {
        return Response.ok(this.taskService.getAllTasks()).build();
    }

    @GET
    @Path("task")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTaskById(@DefaultValue("1") @QueryParam("id") int id) {
        return Response.ok(this.taskService.getTaskById(id)).build();
    }


    @POST
    @Path("delete")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteTaskById(@QueryParam("id") int taskId) {
        try {
            this.taskService.deletedTask(taskId);
            return Response.ok(Constants.getSuccessMessage(TaskController.class.getName())).build();
        } catch (EmptyResultDataAccessException ex) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

    }
}
