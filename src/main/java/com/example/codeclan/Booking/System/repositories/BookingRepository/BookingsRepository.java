package com.example.codeclan.Booking.System.repositories.BookingRepository;

import com.example.codeclan.Booking.System.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingsRepository extends JpaRepository<Booking, Long> {

    public List<Booking> getBookingsByDate(String date);
}
