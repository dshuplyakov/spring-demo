package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class TaskService {
    final private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Long createTask(String birthday) {
        Task task = new Task();
        if (birthday == null) {
            task.setBirthday(new java.sql.Date(Instant.now().toEpochMilli()));
        } else {
            task.setBirthday(java.sql.Date.valueOf(birthday));
        }
        repository.save(task);

        return task.getId();
    }
}