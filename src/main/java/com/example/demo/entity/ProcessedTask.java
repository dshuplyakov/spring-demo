package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class ProcessedTask {

    @EmbeddedId
    private ProcessedTaskId processedTaskId;
    private LocalDate nextBirthDay;

    public ProcessedTaskId getProcessedTaskId() {
        return processedTaskId;
    }

    public ProcessedTask setProcessedTaskId(ProcessedTaskId processedTaskId) {
        this.processedTaskId = processedTaskId;
        return this;
    }

    public LocalDate getNextBirthDay() {
        return nextBirthDay;
    }

    public ProcessedTask setNextBirthDay(LocalDate nextBirthDay) {
        this.nextBirthDay = nextBirthDay;
        return this;
    }
}
