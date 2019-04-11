package com.example.codeclan.Booking.System.controllers;

import com.example.codeclan.Booking.System.repositories.BookingRepository.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/bookings")
public class BookingController {

    @Autowired
    BookingsRepository bookingsRepository;

}
