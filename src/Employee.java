import java.io.FileWriter;
import java.io.IOException;

public class Employee {

    private String empId;
    private String name;
    private String email;
    private String phone;
    private double salary;

    private UserAccount userAccount;

    public Employee(String empId,
                    String name,
                    String email,
                    String phone,
                    double salary,
                    UserAccount userAccount) {

        this.empId = empId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.userAccount = userAccount;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void saveEmployee() {

        try {

            FileWriter writer = new FileWriter("employee_data.txt", true);

            writer.write(toString());
            writer.write(System.lineSeparator());

            writer.close();

        } catch (IOException e) {

            System.out.println("Error while saving employee data.");
        }
    }

    @Override
    public String toString() {

        return "Employee ID : " + empId +
                "\nName : " + name +
                "\nEmail : " + email +
                "\nPhone : " + phone +
                "\nSalary : " + salary +
                "\nUsername : " + userAccount.getUsername();
    }
}