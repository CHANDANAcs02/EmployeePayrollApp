/**
 * Payslip represents the monthly salary statement of an employee.
 *
 * OOP Concepts:
 * - Aggregation : Payslip HAS-A Employee
 * - Composition : Payslip HAS-A SalaryComponents
 */
public class Payslip {

    // Aggregation - Employee object already exists
    private Employee employee;

    // Composition - SalaryComponents belongs to Payslip
    private SalaryComponents components;

    // Salary month
    private String month;

    /**
     * Constructor to initialize a payslip.
     */
    public Payslip(Employee employee,
                   SalaryComponents components,
                   String month) {

        this.employee = employee;
        this.components = components;
        this.month = month;
    }

    /**
     * Formats the payslip into a readable form.
     * This avoids printing details manually in main().
     */
    @Override
    public String toString() {

        return "\n=========== PAYSLIP ===========\n"
                + "Month           : " + month + "\n"
                + "Employee ID     : " + employee.getEmpId() + "\n"
                + "Employee Name   : " + employee.getName() + "\n\n"

                + "-------- Earnings --------\n"
                + "Basic Salary    : " + components.basicSalary + "\n"
                + "HRA             : " + components.hra + "\n"
                + "DA              : " + components.da + "\n"
                + "Allowances      : " + components.allowances + "\n\n"

                + "------- Deductions -------\n"
                + "PF              : " + components.pf + "\n"
                + "Tax             : " + components.tax + "\n\n"

                + "Net Pay         : " + components.netPay + "\n"
                + "===============================\n";
    }
}