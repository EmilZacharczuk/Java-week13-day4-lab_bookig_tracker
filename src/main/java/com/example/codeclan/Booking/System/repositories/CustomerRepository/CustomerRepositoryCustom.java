package com.example.codeclan.Booking.System.repositories.CustomerRepository;

import com.example.codeclan.Booking.System.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomerByCourseId(Long courseId);
}
