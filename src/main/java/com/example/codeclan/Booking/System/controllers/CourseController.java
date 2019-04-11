package com.example.codeclan.Booking.System.controllers;

import com.example.codeclan.Booking.System.models.Course;
import com.example.codeclan.Booking.System.repositories.CourseRepository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value= "/courses")
public class CourseController {

    @Autowired
    CoursesRepository coursesRepository;

    @RequestMapping(value = "rating/{rating}")
    public List<Course> getAllCoursesByRating (@PathVariable int rating) {
        return coursesRepository.findCoursesByRating(rating);
    }
}
