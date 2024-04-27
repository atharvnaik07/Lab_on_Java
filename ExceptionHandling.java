package practical;

import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            // Perform division and display the result
            double result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handle arithmetic exception (division by zero)
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
    // Method to perform division and throw an exception for division by zero
    private static double divideNumbers(double num1, double num2) {
        if (num2 == 0) {
            // Throw an exception for division by zero
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
