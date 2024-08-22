package com.example.BookstoreAPI.controller;


import com.example.BookstoreAPI.entity.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private List<Customer> customerList = new ArrayList<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody Customer customer) {
        customerList.add(customer);
        return customer;
    }

    @PostMapping("/form")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomerFromForm(@RequestParam String name,
                                           @RequestParam String email,
                                           @RequestParam String address) {
        Customer customer = new Customer(null, name, email, address);
        customerList.add(customer);
        return customer;
    }
}

