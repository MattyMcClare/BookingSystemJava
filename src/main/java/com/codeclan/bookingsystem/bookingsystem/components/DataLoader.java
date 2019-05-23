package com.codeclan.bookingsystem.bookingsystem.components;

import com.codeclan.bookingsystem.bookingsystem.models.Booking;
import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import com.codeclan.bookingsystem.bookingsystem.repositories.BookingRepository.BookingRepository;
import com.codeclan.bookingsystem.bookingsystem.repositories.CourseRepository.CourseRepository;
import com.codeclan.bookingsystem.bookingsystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("John", "Edinburgh", 25);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("James", "Glasgow", 30);
        customerRepository.save(customer2);

        Course course1 = new Course("Java", "Leith", 3);
        courseRepository.save(course1);

        Course course2 = new Course("Python", "Dunfermline", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("2019-12-25", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("2019-12-25", course1, customer2);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("2019-08-13", course2, customer1);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("2019-02-21", course2, customer2);
        bookingRepository.save(booking4);
    }
}
