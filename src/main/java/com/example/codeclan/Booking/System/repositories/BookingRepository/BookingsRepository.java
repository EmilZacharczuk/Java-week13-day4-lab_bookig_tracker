package com.example.codeclan.Booking.System.repositories.BookingRepository;

import com.example.codeclan.Booking.System.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingsRepository extends JpaRepository<Booking, Long> {
}
