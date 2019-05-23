package com.codeclan.bookingsystem.bookingsystem.modelsTest;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Customer customer;
    Course course;

    @Before
    public void setUp() {
        customer = new Customer("John", "Edinburgh", 25);
        course = new Course("Java", "Edinburgh", 4);
        booking = new Booking("2019-05-23", course, customer);
    }

    @Test
    public void hasDate() {
        assertEquals("2019-05-23", booking.getDate());
    }

    @Test
    public void setDate() {
        booking.setDate("2019-05-24");
        assertEquals("2019-05-24", booking.getDate());
    }

    @Test
    public void hasCustomer(){
        assertEquals(customer, booking.getCustomer());
    }

    @Test
    public void hasCourse() {
        assertEquals(course, booking.getCourse());
    }
}
