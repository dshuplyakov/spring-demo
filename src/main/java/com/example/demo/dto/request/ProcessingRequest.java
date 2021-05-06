package com.example.demo.dto.request;

public class ProcessingRequest {
    private String birthday = null;

    public String getBirthday() {
        return birthday;
    }

    public ProcessingRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
}
