package com.example.demo.dto.response;

import com.example.demo.entity.Person;

public class ProcessingResult {
    private Boolean processed;

    private Iterable<Person> persons;

    public Boolean getProcessed() {
        return processed;
    }

    public ProcessingResult setProcessed(Boolean processed) {
        this.processed = processed;
        return this;
    }

    public Iterable<Person> getPersons() {
        return persons;
    }

    public ProcessingResult setPersons(Iterable<Person> persons) {
        this.persons = persons;
        return this;
    }
}
