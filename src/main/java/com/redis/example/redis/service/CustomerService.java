package com.redis.example.redis.service;

import com.redis.example.redis.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CustomerService {

    void saveCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Long countTheCustomer();

    void deleteCustomer(Long Id);

    void deleteAllCustomer();
}
