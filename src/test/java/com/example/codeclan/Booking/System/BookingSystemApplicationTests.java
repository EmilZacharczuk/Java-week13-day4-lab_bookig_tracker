package com.example.codeclan.Booking.System;

import com.example.codeclan.Booking.System.models.Booking;
import com.example.codeclan.Booking.System.models.Course;
import com.example.codeclan.Booking.System.models.Customer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSystemApplicationTests {

	Customer customer;
	Booking booking;
	Course course;

	@Before
	public void before() {
		course = new Course("Maths", "Edinburgh", 5);
		customer = new Customer("John", "Fraser", 12);
		booking = new Booking("11/09/2018",customer,course);

	}
	@Test
	public void contextLoads() {
	}

	@Test
	public void customerCanAddBooking() {
		customer.addBooking(booking);
		assertEquals(1, customer.getBookings().size());
	}
	@Test
	public void courseCanAddBooking() {
		course.addBooking(booking);
		assertEquals(1, course.getBookings().size());
	}


}
