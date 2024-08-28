package com.example.BookstoreAPI.service;

import com.example.BookstoreAPI.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public Customer registerCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public Customer registerCustomerForm(String name, String email) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customers.add(customer);
        return customer;
    }
}
