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
                    System.out.print("Enter a number: ");
                    double sqrtInput = scanner.nextDouble();
                    result = Math.sqrt(sqrtInput);
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factorialInput = scanner.nextInt();
                    result = factorial(factorialInput);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnInput = scanner.nextDouble();
                    result = Math.log(lnInput);
                    break;
                case 4:
                    System.out.print("Enter base (x): ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent (y): ");
                    double exponent = scanner.nextDouble();
                    result = Math.pow(base, exponent);
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

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
