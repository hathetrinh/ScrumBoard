package com.trinhha.scrumboard.scrumboardserver.task.controller;

import com.trinhha.scrumboard.scrumboardserver.task.entity.Task;
import com.trinhha.scrumboard.scrumboardserver.task.service.ITaskService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Path("add-new-task")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addNewTask(@RequestParam("task") Task task) {
        this.taskService.addNewTask(task);
        log.info("add new task");
        return Response.ok().build();
    }

    @GET
    @Path("all-task")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllTask() {
        return Response.accepted(this.taskService.getAllTasks()).build();
    }

    @GET
    @Path("task")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTaskById(@QueryParam("id") int id) {
        return Response.accepted(this.taskService.getTaskById(id)).build();
    }
}
