package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    private String processYearMonthDate;

    private Boolean processed = false;

    public Long getId() {
        return id;
    }

    public Task setId(Long id) {
        this.id = id;
        return this;
    }

    public String getProcessYearMonthDate() {
        return processYearMonthDate;
    }

    public Task setProcessYearMonthDate(String birthday) {
        this.processYearMonthDate = birthday;
        return this;
    }

    public Boolean getProcessed() {
        return processed;
    }

    public Task setProcessed(Boolean processed) {
        this.processed = processed;
        return this;
    }
}
