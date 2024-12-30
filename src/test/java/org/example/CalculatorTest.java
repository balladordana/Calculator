package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
