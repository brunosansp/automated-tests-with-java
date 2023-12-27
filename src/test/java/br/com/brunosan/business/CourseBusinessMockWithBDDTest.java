package br.com.brunosan.business;

import br.com.brunosan.service.CourseService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.mockito.Mockito.mock;


class CourseBusinessMockWithBDDTest {
    
    public static final String AGILE_COURSE = "Agile Desmistificado com Scrum, XP, Kanban e Trello";
    public static final String ARCHITECTURE_COURSE = "Arquitetura de Microsserviços do 0 com ASP.NET, .NET 6 e C#";
    public static final String REST_SPRING_COURSE = "REST API's RESTFul do 0 à AWS com Spring Boot 3 Java e Docker";
    CourseService mockService;
    CourseBusiness business;
    List<String> courses;
    
    @BeforeEach
    void setup() {
        
        // Given / Arrange
        mockService = mock(CourseService.class);
        business = new CourseBusiness(mockService);
        
        courses = Arrays.asList(
            "REST API's RESTFul do 0 à Azure com ASP.NET Core 5 e Docker",
            AGILE_COURSE,
            "Spotify Engineering Culture Desmistificado",
            REST_SPRING_COURSE,
            "Docker do Zero à Maestria - Contêinerização Desmistificada",
            "Docker para Amazon AWS Implante Apps Java e .NET com Travis CI",
            "Microsserviços do 0 com Spring Cloud, Spring Boot e Docker",
            ARCHITECTURE_COURSE,
            "REST API's RESTFul do 0 à AWS com Spring Boot 3 Kotlin e Docker",
            "Kotlin para DEV's Java: Aprenda a Linguagem Padrão do Android",
            "Microsserviços do 0 com Spring Cloud, Kotlin e Docker"
        );
    }
    
    @Test
    void testCoursesRelatedToSpring_When_UsingAMock() {
        
        // Given / Arrange
        given(mockService.retrieveCourses("Bruno"))
            .willReturn(courses);
        
        // When / Act
        var filteredCourses =
            business.retrieveCoursesRelatedToSpring("Bruno");
        
        // Then / Assert
        assertThat(filteredCourses.size(), is(4));
    }
    
    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Delete Courses not Related to Spring Using Mockito sould call Method deleteCourse")
    @Test
    void testDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_Should_CallMethod_deleteCourse() {
        
        // Given / Arrange
        given(mockService.retrieveCourses("Bruno"))
            .willReturn(courses);
        
        // When / Act
        business.deleteCoursesNotRelatedToSpring("Bruno");
        
        // Then / Assert
        // verify(mockService)
        //    .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        // verify(mockService, times(1))
        //    .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        // verify(mockService, atLeast(1))
        //    .deleteCourse("Agile Desmistificado com Scrum, XP, Kanban e Trello");
        verify(mockService, atLeastOnce())
            .deleteCourse(AGILE_COURSE);
        verify(mockService)
            .deleteCourse(ARCHITECTURE_COURSE);
        verify(mockService, never())
            .deleteCourse(REST_SPRING_COURSE);
    }
    
    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Delete Courses not Related to Spring Using Mockito sould call Method deleteCourse V2")
    @Test
    void testDeleteCoursesNotRelatedToSpring_UsingMockitoVerify_Should_CallMethod_deleteCourseV2() {
        
        // Given / Arrange
        given(mockService.retrieveCourses("Bruno"))
            .willReturn(courses);
        
        // When / Act
        business.deleteCoursesNotRelatedToSpring("Bruno");
        
        // Then / Assert
        then(mockService).should().deleteCourse(AGILE_COURSE);
        then(mockService).should().deleteCourse(ARCHITECTURE_COURSE);
        then(mockService).should(never()).deleteCourse(REST_SPRING_COURSE);
    }
    
    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Delete Courses not Related to Spring Using Mockito sould call Method deleteCourse V2")
    @Test
    void testDeleteCoursesNotRelatedToSpring_CapturingArguments_Should_CallMethod_deleteCourse() {
        
        // Given / Arrange
        courses = Arrays.asList(
            AGILE_COURSE,
            REST_SPRING_COURSE
        );
        
        given(mockService.retrieveCourses("Bruno"))
            .willReturn(courses);
        
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        
        // When / Act
        business.deleteCoursesNotRelatedToSpring("Bruno");
        
        // Then / Assert
        then(mockService).should().deleteCourse(argumentCaptor.capture());
        assertThat(argumentCaptor.getValue(), is(AGILE_COURSE));
        
        then(mockService).should(never()).deleteCourse(REST_SPRING_COURSE);
    }
    
    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @DisplayName("Delete Courses not Related to Spring Using Mockito sould call Method deleteCourse V2")
    @Test
    void testDeleteCoursesNotRelatedToSpring_CapturingArguments_Should_CallMethod_deleteCourseV2() {
        
        // Given / Arrange
        given(mockService.retrieveCourses("Bruno"))
            .willReturn(courses);
        
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        
        // When / Act
        business.deleteCoursesNotRelatedToSpring("Bruno");
        
        // Then / Assert
        then(mockService).should(times(7)).deleteCourse(argumentCaptor.capture());
        assertThat(argumentCaptor.getAllValues().size(), is(7));
    }
}