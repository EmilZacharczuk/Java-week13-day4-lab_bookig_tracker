package com.example.codeclan.Booking.System.controllers;

import com.example.codeclan.Booking.System.models.Booking;
import com.example.codeclan.Booking.System.models.Course;
import com.example.codeclan.Booking.System.repositories.BookingRepository.BookingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/bookings")
public class BookingController {

    @Autowired
    BookingsRepository bookingsRepository;

    @RequestMapping(value = "date/{date}")
    public List<Booking> getAllCoursesByRating (@PathVariable String date) {
        return bookingsRepository.getBookingsByDate(date);
    }

}
