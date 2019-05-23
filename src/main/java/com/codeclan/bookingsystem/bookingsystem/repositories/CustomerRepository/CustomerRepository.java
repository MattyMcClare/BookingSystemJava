package com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import com.codeclan.bookingsystem.bookingsystem.projections.EmbedBookingForCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedBookingForCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
