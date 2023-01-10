package com.rx2u.rxservice.services;

import com.rx2u.rxservice.models.Customer;
import com.rx2u.rxservice.respositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        List<Customer> ls = new ArrayList<>();
        Iterable<Customer> customers = customerRepository.findAll();
        customers.forEach(ls::add);
        return ls;
    }
}
