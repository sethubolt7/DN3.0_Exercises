package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.service.CustomerService;
import com.example.BookstoreAPI.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer registerCustomer(@RequestBody Customer customer) {
        return customerService.registerCustomer(customer);
    }

    @PostMapping("/register")
    public Customer registerCustomerForm(@RequestParam String name, @RequestParam String email) {
        return customerService.registerCustomerForm(name, email);
    }
}
