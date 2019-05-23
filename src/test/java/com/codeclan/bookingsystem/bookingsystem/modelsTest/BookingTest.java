package com.codeclan.bookingsystem.bookingsystem.modelsTest;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;

    @Before
    public void setUp() {
        booking = new Booking("2019-05-23");
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
}
