package br.com.brunosan.business;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;

import static org.mockito.BDDMockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ListBDDTest {
    
    @Test
    void testMockingList_When_SizeIsCalled_ShouldReturn10() {
        
        // Given / Arrange
        List<?> list = mock(List.class);
        given(list.size()).willReturn(10);
        
        // When / Act & Then / Assert
        assertThat(list.size(), is(10));
    }
    
    @Test
    void testMockingList_When_SizeIsCalled_ShouldReturnMultipleValues() {
        
        // Given / Arrange
        List<?> list = mock(List.class);
        given(list.size()).willReturn(10).willReturn(20);
        
        // When / Act & Then / Assert
        assertThat(list.size(), is(10));
        assertThat(list.size(), is(20));
    }
    
    @Test
    void testMocckingList_When_GetIsCalled_ShouldReturnXogum() {
        
        // Given / Arrange
        var list = mock(List.class);
        given(list.get(0)).willReturn("Xogum");
        
        // When / Act & Then / Assert
        assertThat(list.get(0), is("Xogum"));
        assertNull(list.get(1));
    }
    
    @Test
    void testMocckingList_When_GetIsCalledWithArgumentMatcher_ShouldReturnXogum() {
        
        // Given / Arrange
        var list = mock(List.class);
        
        // If you are using argument
        // matchers, all arguments
        // have to be provided by matchers.
        given(list.get(anyInt())).willReturn("Xogum");
        
        // When / Act & Then / Assert
        assertThat(list.get(anyInt()), is("Xogum"));
    }
    
    @Test
    void testMockingList_When_ThrowsAnException() {
        // Given / Arrange
        var list = mock(List.class);
        
        // If you are using argument
        // matchers, all arguments
        // have to be provided by matchers.
        given(list.get(anyInt())).willThrow(new RuntimeException("Foo Bar!!"));
        
        // When / Act & Then / Assert
        assertThrows(RuntimeException.class, () -> {
            list.get(anyInt());
        }, () -> "Should have throw an RuntimeException");
    }
}
