package com.example.demo.controller;

import com.example.demo.dto.request.CreatingRequest;
import com.example.demo.dto.response.CreatingResult;
import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/task")
public class TaskController {

    final private TaskService taskService;
    final private TaskRepository taskRepository;

    public TaskController(
        TaskService taskService,
        TaskRepository taskRepository
    ) {
        this.taskService = taskService;
        this.taskRepository = taskRepository;
    }

    @PostMapping("/create")
    public CreatingResult createTask(@RequestBody CreatingRequest createRequest) {
        return new CreatingResult(
            taskService.createTask(createRequest.getBirthday())
        );
    }

    @GetMapping("/check")
    public Optional<Task> checkTask(@RequestParam Long id) {
        return taskRepository.findById(id);
    }
}
