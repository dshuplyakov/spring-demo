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

    public Long createTask(Integer monthToProcess) throws IllegalArgumentException {
        Task task = new Task();
        if (monthToProcess == null) {
            SimpleDateFormat format = new SimpleDateFormat("M");
            task.setMonthToProcess(
                Integer.parseInt(format.format(new Date(Instant.now().toEpochMilli())))
            );
        } else if (1 < monthToProcess && 12 > monthToProcess){
            task.setMonthToProcess(monthToProcess);
        } else {
            throw new IllegalArgumentException("Invalid month: month value can be between 1 and 12");
        }
        repository.save(task);

        return task.getId();
    }
}