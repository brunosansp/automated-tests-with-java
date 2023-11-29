package br.com.brunosan.math;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {
    
    private SimpleMath math;
    
    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }
    
    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }
    
    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Running @BeforeEach method!");
    }
    
    @AfterEach
    void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }
    
    @Test
    @DisplayName("Test sum 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIdAddedByTwo_ShouldReturnEightDotTwo() {
        System.out.println("Test sum 6.2 + 2 = 8.2");
        
        // use tecnique GWT or AAA
        // Given or Arrange
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
        System.out.println("Test subtraction 6 - 2 = 4");
        
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
        System.out.println("Test multiplication 2 * 5 = 10");
        
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
        System.out.println("Test division 8 / 2 = 4");
        
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
    @Disabled
    @Test
    @DisplayName("Test division by zero")
    void testDivision_When_NumberIsDividedByZero_ShouldThrowArithmeticException() {
        System.out.println("Test division by zero");
        fail();
    }
    
    @Test
    @DisplayName("Test division (9 + 9)/2 = 9")
    void testMean() {
        System.out.println("Test division (9 + 9)/2 = 9");
        
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
        System.out.println("Test squareRoot of 100 = 10");
        
        double number = 100D;
        Double actual = math.squareRoot(number);
        Double expected = 10D;
        Double unexpected = 5D;
        
        assertNotNull(actual);
        assertEquals(expected, actual);
        assertNotEquals(unexpected, actual);
    }
    
    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Disabled("TODO: We need still work on it!") // ignora o teste
    @Test
    @DisplayName("Display Name")
    void testABCD_When_XYZ_Should() {
        System.out.println("Test BDD");
        // Given / Arrange
        // When / Act
        // Then / Assert
    }
}