package com.example.codeclan.Booking.System.repositories.CourseRepository;

import com.example.codeclan.Booking.System.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursesRepository extends JpaRepository<Course, Long> {

    List<Course> findCoursesByRating(int rating);
}
