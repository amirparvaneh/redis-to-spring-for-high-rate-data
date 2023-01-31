package com.redis.example.redis.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("person_redis")
@Getter
@Setter
public class Person {

    @Id
    private Long id;

    private String name;
}
