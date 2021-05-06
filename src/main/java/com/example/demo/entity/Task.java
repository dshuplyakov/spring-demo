package com.example.demo.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private java.sql.Date birthday;

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
}
