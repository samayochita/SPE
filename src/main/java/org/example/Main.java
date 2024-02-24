package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^y)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    result = squareRootOperation(scanner);
                    break;
                case 2:
                    result = factorialOperation(scanner);
                    break;
                case 3:
                    result = naturalLogarithmOperation(scanner);
                    break;
                case 4:
                    result = powerFunctionOperation(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the calculator. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println("Result: " + result);
        }
    }

    public static double squareRootOperation(Scanner scanner) {
        System.out.print("Enter a number: ");
        double sqrtInput = scanner.nextDouble();
        return Math.sqrt(sqrtInput);
    }

    public static double factorialOperation(Scanner scanner) {
        System.out.print("Enter a number: ");
        int factorialInput = scanner.nextInt();
        return factorial(factorialInput);
    }

    public static double naturalLogarithmOperation(Scanner scanner) {
        System.out.print("Enter a number: ");
        double lnInput = scanner.nextDouble();
        return Math.log(lnInput);
    }

    public static double powerFunctionOperation(Scanner scanner) {
        System.out.print("Enter base (x): ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent (y): ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
