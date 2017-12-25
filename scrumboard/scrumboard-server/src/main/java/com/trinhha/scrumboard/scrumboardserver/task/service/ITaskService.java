package com.trinhha.scrumboard.scrumboardserver.task.service;

import com.trinhha.scrumboard.scrumboardserver.task.entity.Task;

import java.util.Collection;

public interface ITaskService {

    Task addNewTask(Task task);

    Task getTaskById(int taskId);

    Collection<Task> getAllTasks();

    void deletedTask(int taskId);
}
