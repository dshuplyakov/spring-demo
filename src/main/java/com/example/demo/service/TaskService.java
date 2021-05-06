package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

@Component
public class TaskService {
    final private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Long createTask(String processYearMonthDate) {
        Task task = new Task();
        if (processYearMonthDate == null) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
            task.setProcessYearMonthDate(
                format.format(new Date(Instant.now().toEpochMilli()))
            );
        } else {
            task.setProcessYearMonthDate(processYearMonthDate);
        }
        repository.save(task);

        return task.getId();
    }
}