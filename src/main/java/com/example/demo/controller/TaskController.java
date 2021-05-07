package com.example.demo.controller;

import com.example.demo.dto.request.ProcessingRequest;
import com.example.demo.dto.response.CreatingResult;
import com.example.demo.dto.response.ProcessingResult;
import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import com.example.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.Optional;

import static org.springframework.http.HttpStatus.NOT_FOUND;


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
    public CreatingResult createTask(@RequestBody ProcessingRequest createRequest) {
        return new CreatingResult(
            taskService.createTask(createRequest.getProcessYearMonthDate())
        );
    }

    @GetMapping("/check")
    public ProcessingResult checkTask(@RequestParam Long id) {
        Optional<Task> optionalTask = taskRepository.findById(id);

        if (optionalTask.isEmpty()) {
            throw new ResponseStatusException(NOT_FOUND, "Task not found");
        }

        ProcessingResult result = new ProcessingResult();
        result.setProcessed(optionalTask.get().getProcessed());

        return result;
    }
}
