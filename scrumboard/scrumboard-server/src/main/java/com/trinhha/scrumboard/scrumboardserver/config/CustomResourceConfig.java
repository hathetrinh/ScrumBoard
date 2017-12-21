package com.trinhha.scrumboard.scrumboardserver.config;


import com.trinhha.scrumboard.scrumboardserver.task.controller.TaskController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class CustomResourceConfig extends ResourceConfig{
    public CustomResourceConfig() {
        register(TaskController.class);
    }
}
