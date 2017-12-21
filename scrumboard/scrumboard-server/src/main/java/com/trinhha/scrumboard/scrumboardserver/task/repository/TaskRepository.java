package com.trinhha.scrumboard.scrumboardserver.task.repository;

import com.trinhha.scrumboard.scrumboardserver.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
