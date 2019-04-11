package com.example.codeclan.Booking.System.controllers;

import com.example.codeclan.Booking.System.models.Customer;
import com.example.codeclan.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping(value="/course/{id}")
    public List<Customer> getAllCustomerByCourseId(@PathVariable Long id) {
        return customerRepository.findCustomerByCourseId(id);
    }
}
