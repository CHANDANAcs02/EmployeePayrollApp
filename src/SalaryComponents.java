/**
 * SalaryComponents class stores all salary-related details.
 *
 * This class demonstrates COMPOSITION.
 * A Payslip owns its SalaryComponents, so they are created
 * and used together.
 */
public class SalaryComponents {

    // Earnings
    double basicSalary;
    double hra;
    double da;
    double allowances;

    // Deductions
    double pf;
    double tax;

    // Final amount received
    double netPay;

    /**
     * Constructor initializes only the earning components.
     * Deductions and net pay will be calculated later
     * in PayrollService.
     */
    public SalaryComponents(double basicSalary,
                            double hra,
                            double da,
                            double allowances) {

        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da;
        this.allowances = allowances;
    }
}