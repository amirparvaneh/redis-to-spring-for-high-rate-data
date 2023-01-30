package com.redis.example.redis.service.serviceImpl;

import com.redis.example.redis.domain.Person;
import com.redis.example.redis.repository.PersonRepository;
import com.redis.example.redis.service.PersonService;
import org.springframework.stereotype.Service;


@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    @Override
    public void savePerson(Person person) {
        personRepository.save(person);
    }
}
