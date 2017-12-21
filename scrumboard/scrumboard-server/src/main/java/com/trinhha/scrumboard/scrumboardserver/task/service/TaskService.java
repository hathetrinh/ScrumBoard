package com.trinhha.scrumboard.scrumboardserver.task.service;

import com.trinhha.scrumboard.scrumboardserver.task.entity.Task;
import com.trinhha.scrumboard.scrumboardserver.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TaskService implements ITaskService {

    @Autowired
    public TaskRepository taskRepository;

    public Task addNewTask(Task task) {

        return this.taskRepository.save(task);

    }

    public Collection<Task> getAllTasks() {
        return this.taskRepository.findAll();
    }

    public Task getTaskById(int taskId) {
        return this.taskRepository.findOne(taskId);
    }

}
