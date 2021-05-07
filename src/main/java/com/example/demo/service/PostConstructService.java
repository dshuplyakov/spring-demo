package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PostConstructService {

    final private PersonRepository personRepository;

    public PostConstructService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostConstruct
    public void init() {
        loadRandomPersons();
    }

    private void loadRandomPersons() {
        LocalDate start = LocalDate.now().minus(6, ChronoUnit.MONTHS);
        LocalDate end = LocalDate.now();
        EasyRandomParameters parameters = new EasyRandomParameters()
                .dateRange(start, end);
        EasyRandom generator = new EasyRandom(parameters);
        List<Person> persons = generator.objects(Person.class, 5000)
                .collect(Collectors.toList());

        personRepository.saveAll(persons);
    }
}
