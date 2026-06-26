import java.util.Scanner;

public class EmployeeRegistrationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("===== Employee Registration =====");

            System.out.print("Enter Employee ID (EMP-0001): ");
            String empId = scanner.nextLine();

            Validator.validateEmpId(empId);

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            Validator.validateEmail(email);

            System.out.print("Enter Phone Number: ");
            String phone = scanner.nextLine();

            Validator.validatePhone(phone);

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Create Username: ");
            String username = scanner.nextLine();

            System.out.print("Create Password: ");
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

            employee.saveEmployee();

            System.out.println("\nEmployee Registered Successfully!\n");

            System.out.println(employee);

        } catch (ValidationException e) {

            System.out.println(e.getMessage());

        } catch (Exception e) {

            System.out.println("Something went wrong.");
        }

        scanner.close();
    }
}