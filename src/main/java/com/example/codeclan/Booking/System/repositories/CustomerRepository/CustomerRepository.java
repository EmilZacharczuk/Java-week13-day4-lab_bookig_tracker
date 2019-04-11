package com.example.codeclan.Booking.System.repositories.CustomerRepository;

import com.example.codeclan.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom{
    List<Customer> findCustomerByCourseId(Long courseId);
    List<Customer> findCustomerForAGivenCourse(Long courseId, String town);
    List<Customer> findCustomerAgeLimitCourseTown(int age, Long courseId, String town);
}
