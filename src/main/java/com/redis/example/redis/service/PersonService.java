package com.redis.example.redis.service;

import com.redis.example.redis.domain.Person;

import java.util.List;

public interface PersonService{
    void savePerson(Person person);
    List<Person> getAllPerson();
}
