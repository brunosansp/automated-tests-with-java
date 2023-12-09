package br.com.brunosan.business;

import br.com.brunosan.service.CourseService;
import br.com.brunosan.service.stubs.CourseServiceStub;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseBusinessTest {
    
    @Test
    @DisplayName("User test that contains related course")
    void testCoursesRelatedToSpring_When_UsingAStub() {
        // Given / Arrange
        CourseService stubService = new CourseServiceStub();
        CourseBusiness filteredCourses = new CourseBusiness(stubService);
        // When / Act
        List<String> studentCourses = filteredCourses.retrieveCoursesRelatedToSpring("Bruno");
        // Then / Assert
        assertEquals(4, studentCourses.size());
    }
    
    @Test
    @DisplayName("User test that does not contain related course")
    void testCoursesRelatedToSpring_When_FooBarStudent() {
        // Given / Arrange
        CourseServiceStub stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);
        // When / Act
        List<String> courses = business.retrieveCoursesRelatedToSpring("Foo Bar");
        // Then / Assert
        assertEquals(0, courses.size());
    }
}