package com.redis.example.redis.controller;

import com.redis.example.redis.domain.Person;
import com.redis.example.redis.service.serviceImpl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {

    private final PersonServiceImpl personService;

    @Autowired
    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPeron() {
        return personService.getAllPerson();
    }

    @PostMapping
    public void saveNewPerson(Person person){
        personService.savePerson(person);
    }
}
