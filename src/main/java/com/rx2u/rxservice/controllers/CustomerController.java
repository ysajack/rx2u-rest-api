package com.rx2u.rxservice.controllers;

import com.rx2u.rxservice.models.Customer;
import com.rx2u.rxservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getCustomers")
    public List<Customer> getCustomers() {
        return customerService.getAllCustomers();
    }
}
