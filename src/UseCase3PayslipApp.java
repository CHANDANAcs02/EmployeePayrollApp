import java.util.Scanner;

/**
 * UC3 Main Application
 *
 * Reads employee and salary details from the user,
 * generates a monthly payslip and displays it.
 */
public class UseCase3PayslipApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Employee Payslip Generation ==========\n");

        // Employee Details
        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        // User Account Details
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        UserAccount account = new UserAccount(username, password);

        Employee employee = new Employee(
                empId,
                name,
                email,
                phone,
                salary,
                account
        );

        // Salary Components
        System.out.print("\nEnter Basic Salary: ");
        double basic = scanner.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = scanner.nextDouble();

        System.out.print("Enter DA: ");
        double da = scanner.nextDouble();

        System.out.print("Enter Allowances: ");
        double allowances = scanner.nextDouble();
        scanner.nextLine();

        // Payslip Month
        System.out.print("Enter Salary Month: ");
        String month = scanner.nextLine();

        SalaryComponents components =
                new SalaryComponents(basic, hra, da, allowances);

        PayrollService payrollService = new PayrollService();

        Payslip payslip =
                payrollService.generatePayslip(employee, components, month);

        // Display Payslip
        System.out.println(payslip);

        scanner.close();
    }
}