package com.redis.example.redis.domain;


import com.redis.om.spring.annotations.Document;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.index.Indexed;

@Data
@Setter
@Getter
@Document
public class Customer {

    @Id
    private String msisdn;
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
