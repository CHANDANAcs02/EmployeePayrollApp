import java.util.Scanner;

/**
 * UC6 Main Application
 *
 * Demonstrates input validation using
 * RegEx and custom exceptions.
 */
public class UseCase6InputValidationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ValidationService validationService = new ValidationService();

        try {

            // Employee ID
            System.out.print("Enter Employee ID (EMP-0001): ");
            String empId = scanner.nextLine();
            validationService.validateEmployeeId(empId);

            // Email
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            validationService.validateEmail(email);

            // Phone Number
            System.out.print("Enter Phone Number: ");
            String phone = scanner.nextLine();
            validationService.validatePhone(phone);

            // Password
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            validationService.validatePassword(password);

            // If all validations pass
            System.out.println("\n==================================");
            System.out.println("All inputs are valid.");
            System.out.println("Employee Registration Successful!");
            System.out.println("==================================");

        }

        catch (ValidationException e) {

            // Displays user-friendly error message
            System.out.println("\nValidation Error: " + e.getMessage());

        }

        finally {

            scanner.close();

        }
    }
}