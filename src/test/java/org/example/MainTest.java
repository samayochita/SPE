package org.example;

import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class MainTest {

    @Test
    public void testSquareRootOperation() {
        double epsilon = 1e-6;
        double input = 25;
        double expected = 5.0;
        double result = Main.squareRootOperation(createScannerWithInput(String.valueOf(input)));
        assertEquals(result, expected, epsilon);
    }

    @Test
    public void testFactorialOperation() {
        int input = 5;
        double expected = 120.0;
        double result = Main.factorialOperation(createScannerWithInput(String.valueOf(input)));
        assertEquals(result, expected);
    }

    @Test
    public void testNaturalLogarithmOperation() {
        double input = 10;
        double expected = 2.302585;
        double epsilon = 1e-6;
        double result = Main.naturalLogarithmOperation(createScannerWithInput(String.valueOf(input)));
        assertEquals(result, expected, epsilon);
    }

    @Test
    public void testPowerFunctionOperation() {
        double base = 2;
        double exponent = 3;
        double expected = 8.0;
        double result = Main.powerFunctionOperation(createScannerWithInput(base + "\n" + exponent));
        assertEquals(result, expected);
    }


    @Test
    public void testExitOption() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Mock user input for exit option
        ByteArrayInputStream inputStream = new ByteArrayInputStream("5\n".getBytes());
        System.setIn(inputStream);

        Main.main(new String[]{});

        assertEquals(outputStream.toString().trim(), "Exiting the calculator. Goodbye!");
    }

    private Scanner createScannerWithInput(String input) {
        return new Scanner(new ByteArrayInputStream(input.getBytes()));
    }
}
