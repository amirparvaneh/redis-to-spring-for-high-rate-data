package com.redis.example.redis.service.serviceImpl;

import com.redis.example.redis.domain.Customer;
import com.redis.example.redis.repository.CustomerRepository;
import com.redis.example.redis.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Long countTheCustomer() {
        return customerRepository.couCustomer();
    }

    @Override
    public void deleteCustomer(String msisdn) {
        customerRepository.deleteById(msisdn);
    }

    @Override
    public void deleteAllCustomer() {
        customerRepository.deleteAll();
    }

    @Override
    public Optional<Customer> getCustomerById(String msisdn) {
        return customerRepository.findById(msisdn);
    }

}
