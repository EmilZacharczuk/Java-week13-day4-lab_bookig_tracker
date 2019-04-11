package com.example.codeclan.Booking.System.repositories.CourseRepository;

import com.example.codeclan.Booking.System.models.Course;
import com.example.codeclan.Booking.System.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CoursesRepositoryImpl  implements CoursesRepositoryCustom {

    @Autowired
    EntityManager entityManager;
    @Transactional
    public List<Course> getCoursesByCustomer(Long customerID){
        List<Course> result = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.customer.id", customerID));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }
}
