package com.example.demo.dto.request;

public class CreatingRequest {
    private String birthday = null;

    public String getBirthday() {
        return birthday;
    }

    public CreatingRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
}
