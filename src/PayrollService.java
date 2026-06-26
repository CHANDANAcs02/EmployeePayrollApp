/**
 * PayrollService contains all salary calculation logic.
 *
 * This class keeps the business logic separate from the
 * user interface (main method).
 */
public class PayrollService {

    /**
     * Generates a payslip after calculating salary details.
     */
    public Payslip generatePayslip(Employee employee,
                                   SalaryComponents components,
                                   String month) {

        // Calculate Gross Salary
        double grossSalary = components.basicSalary
                + components.hra
                + components.da
                + components.allowances;

        // Calculate PF (12% of Basic Salary)
        components.pf = components.basicSalary * 0.12;

        // Calculate Tax (10% of Gross Salary)
        components.tax = grossSalary * 0.10;

        // Calculate Net Salary
        components.netPay = grossSalary
                - components.pf
                - components.tax;

        // Return completed payslip
        return new Payslip(employee, components, month);
    }
}