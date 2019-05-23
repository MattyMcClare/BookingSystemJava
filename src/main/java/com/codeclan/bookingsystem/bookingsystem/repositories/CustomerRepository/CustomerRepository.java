package com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import com.codeclan.bookingsystem.bookingsystem.projections.EmbedBookingForCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedBookingForCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> findCustomersByCourseName(String name);
}
