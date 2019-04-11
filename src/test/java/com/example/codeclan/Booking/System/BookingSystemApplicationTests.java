package com.example.codeclan.Booking.System;

import com.example.codeclan.Booking.System.models.Booking;
import com.example.codeclan.Booking.System.models.Course;
import com.example.codeclan.Booking.System.models.Customer;
import com.example.codeclan.Booking.System.repositories.BookingRepository.BookingsRepository;
import com.example.codeclan.Booking.System.repositories.CourseRepository.CoursesRepository;
import com.example.codeclan.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

	@Autowired

	CoursesRepository coursesRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingsRepository bookingsRepository;

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
	@Test
	public void canFindCourseByRating() {
		List<Course> result = coursesRepository.findCoursesByRating(5);
		assertEquals(3, result.size());
	}
	@Test
	public void canFindAllCustomersByCourseId() {
		List<Customer> result = customerRepository.findCustomerByCourseId(2L);
		assertEquals(2, result.size());
	}
	@Test
	public void canFindAllCoursesByCustomerId() {
		List<Course> result = coursesRepository.getCoursesByCustomer(3L);
		assertEquals(2, result.size());
	}

	@Test
	public void canFindBookingByDate(){
		List<Booking> result = bookingsRepository.getBookingsByDate("11/12/2018");
		assertEquals(1,result.size());
	}
}
