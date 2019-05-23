package com.codeclan.bookingsystem.bookingsystem.modelsTest;

import com.codeclan.bookingsystem.bookingsystem.models.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("John", "Edinburgh", 25);
    }

    @Test
    public void hasName() {
        assertEquals("John", customer.getName());
    }

    @Test
    public void hasTown() {
        assertEquals("Edinburgh", customer.getTown());
    }

    @Test
    public void hasAge() {
        assertEquals(25,  customer.getAge());
    }

    @Test
    public void setName() {
        customer.setName("James");
        assertEquals("James", customer.getName());
    }

    @Test
    public void setTown() {
        customer.setTown("Glasgow");
        assertEquals("Glasgow", customer.getTown());
    }

    @Test
    public void setAge() {
        customer.setAge(30); 
        assertEquals(30, customer.getAge());
    }
}
