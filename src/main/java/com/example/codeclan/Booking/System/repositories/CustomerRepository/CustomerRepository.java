package com.example.codeclan.Booking.System.repositories.CustomerRepository;

import com.example.codeclan.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
