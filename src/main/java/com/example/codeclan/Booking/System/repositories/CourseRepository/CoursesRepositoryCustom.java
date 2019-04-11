package com.example.codeclan.Booking.System.repositories.CourseRepository;

import com.example.codeclan.Booking.System.models.Course;

import java.util.List;

public interface CoursesRepositoryCustom {
    public List<Course> getCoursesByCustomer(Long customerID);

}
