package com.redis.example.redis.service;

import com.redis.example.redis.domain.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService {

    void saveCustomer(Customer customer);

    List<Customer> getAllCustomer();

    Long countTheCustomer();

    void deleteCustomer(String Id);

    void deleteAllCustomer();

    Optional<Customer> getCustomerById(String msisdn);
}
