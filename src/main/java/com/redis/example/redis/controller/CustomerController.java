package com.redis.example.redis.controller;


import com.redis.example.redis.domain.Customer;
import com.redis.example.redis.service.serviceImpl.CustomerServiceImpl;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/customer")
public class CustomerController {
    private CustomerServiceImpl customerService;

    @Autowired
    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void saveCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping(value = "/count")
    public Long getCountOfCustomer() {
        return customerService.countTheCustomer();
    }

    @PostMapping(value = "/insertBulk")
    public void insetBulKCustomers(Long number, @RequestParam String firstId) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            Customer customer = new Customer();
            customer.setMsisdn(firstId + i);
            customer.setOrder0(i);
            customer.setOrder1(i + 1);
            customer.setOrder2(i + 2);
            customer.setOrder3(i + 3);
            customer.setOrder4(i + 4);
            customer.setOrder5(i + 5);
            customer.setOrder6(i + 6);
            customer.setOrder7(i + 7);
            customer.setPoolId(number + i);
            customerService.saveCustomer(customer);
        }
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        System.out.println("$$$$ time is "+ elapsedTime);
    }

    @GetMapping(value = "/{msisdn}")
    @ResponseBody
    public Customer getCustomerById(@PathVariable String msisdn) {
        Optional<Customer> customer;
        customer = customerService.getCustomerById(msisdn);
        return customer.get();
    }

    @DeleteMapping
    public void deleteAllCustomer(){
        customerService.deleteAllCustomer();
    }
}
