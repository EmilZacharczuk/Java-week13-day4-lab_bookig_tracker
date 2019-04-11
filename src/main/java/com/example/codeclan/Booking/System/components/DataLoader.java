package com.example.codeclan.Booking.System.components;

import com.example.codeclan.Booking.System.models.Booking;
import com.example.codeclan.Booking.System.models.Course;
import com.example.codeclan.Booking.System.models.Customer;
import com.example.codeclan.Booking.System.repositories.BookingRepository.BookingsRepository;
import com.example.codeclan.Booking.System.repositories.CourseRepository.CoursesRepository;
import com.example.codeclan.Booking.System.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.print.Book;

@Component
public class DataLoader  implements ApplicationRunner {
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CoursesRepository coursesRepository;

    @Autowired
    BookingsRepository bookingsRepository;

    public void run(ApplicationArguments args){
        Course course = new Course("Maths", "Edinburgh", 5);
        coursesRepository.save(course);

        Customer customer = new Customer("John", "Fraser", 12);
        customerRepository.save(customer);

        Booking booking = new Booking("11/09/2018",customer,course);
        bookingsRepository.save(booking);

        Customer customer1 = new Customer("Jerry", "White", 12);
        customerRepository.save(customer1);

        Customer customer3 = new Customer("John", "Black", 16);
        customerRepository.save(customer3);

        Course course1 = new Course("English", "Edinburgh", 5);
        coursesRepository.save(course1);

        Course course2 = new Course("English", "Edinburgh", 5);
        coursesRepository.save(course2);

        Course course3 = new Course("French", "Edinburgh", 3);
        coursesRepository.save(course3);

        Booking booking2 = new Booking("11/09/2018",customer,course1);
        bookingsRepository.save(booking2);

        Booking booking3 = new Booking("11/12/2018",customer3,course2);
        bookingsRepository.save(booking3);

        Booking booking4 = new Booking("11/09/2018",customer3,course1);
        bookingsRepository.save(booking4);

    }
}
