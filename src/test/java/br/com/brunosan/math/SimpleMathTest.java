package br.com.brunosan.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {
    
    @Test
    @DisplayName("Test sum 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIdAddedByTwo_ShouldReturnEightDotTwo() {
        // use tecnique GWT or AAA
        // Given or Arrange
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;
        
        // When or Act
        Double actual = math.sum(firstNumber, secondNumber);
        
        // Then or Assert
        assertEquals(
            expected, actual, () -> "In the testSum(), "
                + firstNumber + "+" + secondNumber
                + " did not produce expected result " + expected + "!"
        );
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }
    
    @Test
    @DisplayName("Test subtraction 6 - 2 = 4")
    void testSubtraction() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6D;
        double secondNumber = 2D;
        
        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 4D;
        
        assertEquals(expected, actual);
        
        double unexpected = 8D;
        assertNotEquals(unexpected, actual);
        assertNotNull(actual);
    }
    
    @Test
    @DisplayName("Test multiplication 2 * 5 = 10")
    void testMultiplication() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 2D;
        double secondNumber = 5D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 10D;
        
        assertEquals(expected, actual);
        double unexpected = 8D;
        assertNotEquals(unexpected, actual);
        assertNotNull(actual);
    }
    
    @Test
    @DisplayName("Test division 8 / 2 = 4")
    void testDivision() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 8D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        Double expected = 4D;
        Double unexpected = 3D;
        
        assertEquals(expected, actual);
        assertNotNull(actual);
        assertNotEquals(unexpected, actual);
    }
    
    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    void testDivision_When_NumberIsDividedByZero_ShouldThrowArithmeticException() {
        fail();
    }
    
    @Test
    @DisplayName("Test division (9 + 9)/2 = 9")
    void testMean() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 9D;
        double secondNumber = 9D;
        Double actual = math.mean(firstNumber, secondNumber);
        Double expected = 9D;
        Double unexpected = 10D;
        
        assertNotNull(actual);
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }
    
    @Test
    @DisplayName("Test squareRoot of 100 = 10")
    void testSquareRoot() {
        SimpleMath math = new SimpleMath();
        double number = 100D;
        Double actual = math.squareRoot(number);
        Double expected = 10D;
        Double unexpected = 5D;
        
        assertNotNull(actual);
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }
}