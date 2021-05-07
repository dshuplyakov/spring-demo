package com.example.demo.repository;

import com.example.demo.entity.ProcessedTask;
import org.springframework.data.repository.CrudRepository;

public interface ProcessedTaskRepository extends CrudRepository<ProcessedTask, Long> {
}
