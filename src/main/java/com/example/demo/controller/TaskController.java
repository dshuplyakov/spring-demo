package com.example.demo.controller;

import com.example.demo.dto.request.CreatingRequest;
import com.example.demo.dto.response.CreatingResult;
import com.example.demo.service.TaskService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/task")
public class TaskController {

    final private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/create")
    public CreatingResult createTask(@RequestBody CreatingRequest createRequest) {

        return new CreatingResult(
                taskService.createTask(createRequest.getBirthday())
        );
    }

    @GetMapping("/check")
    public void checkTask() {

    }
}
