package com.codeclan.bookingsystem.bookingsystem.projections;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedCourseAndCustomerForBooking", types = Booking.class)
public interface EmbedCourseAndCustomerForBooking {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
