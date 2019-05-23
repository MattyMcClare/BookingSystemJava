package com.codeclan.bookingsystem.bookingsystem.projections;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookingForCustomer", types = Customer.class)
public interface EmbedBookingForCustomer {
//    String getName();
    String getTown();
    int getAge();
    List<Booking> getBookings();
}
