package com.redis.example.redis.domain;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("person_redis_Non_Id")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonWithoutId {

    private String name;
}
