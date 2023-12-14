package br.com.brunosan.business;

import br.com.brunosan.service.CourseService;
import br.com.brunosan.service.stubs.CourseServiceStub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseBusinessStubTest {
    
    @Test
    void testCoursesRelatedToSpring_When_UsingAStub() {
        
        // Given / Arrange
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);
        
        // When / Act
        var filteredCourses = business.retrieveCoursesRelatedToSpring("Bruno");
        
        // Then / Assert
        assertEquals(4, filteredCourses.size());
    }
    
    @Test
    void testCoursesRelatedToSpring_When_UsingAFooBarStudent() {
        
        // Given / Arrange
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);
        
        // When / Act
        var filteredCourses = business.retrieveCoursesRelatedToSpring("Foo Bar");
        
        // Then / Assert
        assertEquals(0, filteredCourses.size());
    }
    
}
