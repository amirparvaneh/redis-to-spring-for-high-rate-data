package com.redis.example.redis.repository;

import com.redis.example.redis.domain.Customer;
import com.redis.om.spring.annotations.Query;
import com.redis.om.spring.repository.RedisDocumentRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends RedisDocumentRepository<Customer, String> {

    @Query(value = "select count(*) from customer")
    Long couCustomer();
}
