package com.redis.example.redis.repository;

import com.redis.example.redis.domain.Customer;
import com.redis.om.spring.repository.RedisDocumentRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends RedisDocumentRepository<Customer, Long> {
    Long countCustomerByMsisdn();
}
