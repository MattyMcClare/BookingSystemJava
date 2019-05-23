package com.codeclan.bookingsystem.bookingsystem.projections;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookingForCourse", types = Course.class)
public interface EmbedBookingForCourse {
//    String getName();
    String getTown();
    int getRating();
    List<Booking> getBookings();
}
