package com.redis.example.redis.repository;


import com.redis.example.redis.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsRepository extends CrudRepository<Person,Long> {
}
