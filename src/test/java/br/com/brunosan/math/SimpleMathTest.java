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
    
    @Test
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