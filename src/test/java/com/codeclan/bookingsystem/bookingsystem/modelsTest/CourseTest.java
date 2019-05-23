package com.codeclan.bookingsystem.bookingsystem.modelsTest;

import com.codeclan.bookingsystem.bookingsystem.models.Course;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CourseTest {
    Course course;

    @Before
    public void setUp(){
        course = new Course("John", "Edinburgh", 5);
    }

    @Test
    public void hasName() {
        assertEquals("John", course.getName());
    }

    @Test
    public void hasTown() {
        assertEquals("Edinburgh", course.getTown());
    }

    @Test
    public void hasRating() {
        assertEquals(5,  course.getRating());
    }

    @Test
    public void setName() {
        course.setName("James");
        assertEquals("James", course.getName());
    }

    @Test
    public void setTown() {
        course.setTown("Glasgow");
        assertEquals("Glasgow", course.getTown());
    }

    @Test
    public void setRating() {
        course.setRating(3);
        assertEquals(3, course.getRating());
    }
}
