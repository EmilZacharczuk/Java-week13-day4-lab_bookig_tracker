package com.example.codeclan.Booking.System.models;


import javax.persistence.*;

@Entity
@Table(name="bookings")
public class Booking {

    @Column
    private String date;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "course_id", nullable= false)
    private Course course;


    public Booking() {

    }

    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.customer = customer;
        this.course = course;


    }

    public String getDate() {
        return date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
