package com.redis.example.redis.domain;


import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("person_redis")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person extends BaseEntity{
}
