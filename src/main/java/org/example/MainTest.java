package org.example;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Math.sqrt(16), 0.001);
        assertEquals(5.0, Math.sqrt(25), 0.001);
        assertEquals(0.0, Math.sqrt(0), 0.001);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Main.factorial(0));
        assertEquals(1, Main.factorial(1));
        assertEquals(120, Main.factorial(5));
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(0.0, Math.log(1), 0.001);
        assertEquals(1.609, Math.log(5), 0.001);
        assertEquals(Double.NEGATIVE_INFINITY, Math.log(0), 0.001);
    }

    @Test
    public void testPowerFunction() {
        assertEquals(16.0, Math.pow(2, 4), 0.001);
        assertEquals(8.0, Math.pow(2, 3), 0.001);
        assertEquals(1.0, Math.pow(10, 0), 0.001);
    }
}
