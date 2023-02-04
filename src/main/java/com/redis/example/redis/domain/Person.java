package com.redis.example.redis.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;


@RedisHash("person_redis")
@Getter
@Setter
@Data
public class Person {
    @Id
    private Long id;
    @Indexed
    private Integer order0;
    @Indexed
    private Integer order1;
    @Indexed
    private Integer order2;
    @Indexed
    private Integer order3;
    @Indexed
    private Integer order4;
    @Indexed
    private Integer order5;
    @Indexed
    private Integer order6;
    @Indexed
    private Integer order7;
    @Indexed
    private Long poolId;
}
