/**
 * Payslip represents the monthly salary statement of an employee.
 *
 * OOP Concepts:
 * - Aggregation : Payslip HAS-A Employee
 * - Composition : Payslip HAS-A SalaryComponents
 * - Immutability : Payslip should not be modified after creation
 * - Cloning : Create a safe copy for printing/downloading
 */
public final class Payslip implements Cloneable {

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
     * Creates a copy of the payslip.
     * The original object remains unchanged.
     */
    @Override
    public Object clone() {

        return new Payslip(employee, components, month);
    }

    /**
     * Checks whether two payslips belong to the same
     * employee and month.
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Payslip other = (Payslip) obj;

        return employee.getEmpId().equals(other.employee.getEmpId())
                && month.equals(other.month);
    }

    /**
     * Generates a hash code consistent with equals().
     */
    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + employee.getEmpId().hashCode();
        result = 31 * result + month.hashCode();

        return result;
    }

    /**
     * Formats the payslip into a readable form.
     * This avoids printing details manually in main().
     */
    /**
     * Returns the employee's net pay.
     */
    public double getNetPay() {
        return components.netPay;
    }
    /**
     * Returns the salary month.
     */
    public String getMonth() {
        return month;
    }
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