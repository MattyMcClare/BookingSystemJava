package com.codeclan.bookingsystem.bookingsystem.repositories.CourseRepository;

import com.codeclan.bookingsystem.bookingsystem.models.Course;
import com.codeclan.bookingsystem.bookingsystem.projections.EmbedBookingForCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedBookingForCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long> {
}
