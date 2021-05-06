package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    private java.sql.Date birthday;

    private Boolean processed = false;

    public Long getId() {
        return id;
    }

    public Task setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Task setBirthday(Date birthday) {
        this.birthday = birthday;
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
