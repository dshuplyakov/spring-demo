package com.example.demo.dto.request;

public class ProcessingRequest {
    private String processYearMonthDate = null;

    public String getProcessYearMonthDate() {
        return processYearMonthDate;
    }

    public ProcessingRequest setProcessYearMonthDate(String processYearMonthDate) {
        this.processYearMonthDate = processYearMonthDate;
        return this;
    }
}
