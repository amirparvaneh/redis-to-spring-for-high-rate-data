package com.redis.example.redis.service.serviceImpl;

import com.redis.example.redis.domain.Person;
import com.redis.example.redis.repository.PersonsRepository;
import com.redis.example.redis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

    private final PersonsRepository personsRepository;

    @Autowired
    public PersonServiceImpl(PersonsRepository personsRepository){
        this.personsRepository = personsRepository;
    }


    @Override
    public void savePerson(Person person) {
        personsRepository.save(person);
    }
}
