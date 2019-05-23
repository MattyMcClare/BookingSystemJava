package com.codeclan.bookingsystem.bookingsystem.repositories.BookingRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.projections.EmbedCourseAndCustomerForBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedCourseAndCustomerForBooking.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
