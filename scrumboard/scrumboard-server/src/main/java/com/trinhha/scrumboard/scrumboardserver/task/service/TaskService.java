package com.trinhha.scrumboard.scrumboardserver.task.service;

import com.trinhha.scrumboard.scrumboardserver.task.entity.Task;
import com.trinhha.scrumboard.scrumboardserver.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class TaskService implements ITaskService {

    @Autowired
    public TaskRepository taskRepository;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = EmptyResultDataAccessException.class)
    public Task addNewTask(Task task) {
        return this.taskRepository.save(task);

    }

    public Collection<Task> getAllTasks() {
        return this.taskRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Task getTaskById(int taskId) {
        return this.taskRepository.findOne(taskId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = EmptyResultDataAccessException.class)
    public void deletedTask(int taskId) throws EmptyResultDataAccessException {
        this.taskRepository.delete(taskId);
    }
}
