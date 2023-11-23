package br.com.brunosan.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class SimpleMathTest {
    
    @Test
    void testSum() {
        SimpleMath math = new SimpleMath();
        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;
        
        assertEquals(
            expected, actual, () -> "In the testSum(), "
                + firstNumber + "+" + secondNumber
                + " did not produce expected result " + expected + "!"
        );
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }
    
    @Test
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
    void testMultiplication() {
    }
    
    @Test
    void testDivision() {
    }
    
    @Test
    void testMean() {
    }
    
    @Test
    void testSquareRoot() {
    }
}