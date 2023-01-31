package com.redis.example.redis.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.lang.annotation.Documented;

@RedisHash("person_redis")
@Getter
@Setter
public class Person {

    @Id
    private Long id;

    @Indexed
    private String name;

    private Long order;
}
