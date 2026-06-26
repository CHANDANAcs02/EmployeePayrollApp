import java.util.Comparator;
import java.util.List;

/**
 * EmployeeDashboard implements the Dashboard interface.
 *
 * It displays employee payroll details, recent payslips
 * and Year-To-Date earnings.
 */
public class EmployeeDashboard implements Dashboard {

    // Employee whose dashboard is displayed
    private Employee employee;

    // List of employee payslips
    private List<Payslip> payslips;

    /**
     * Constructor to initialize dashboard.
     */
    public EmployeeDashboard(Employee employee, List<Payslip> payslips) {

        this.employee = employee;
        this.payslips = payslips;
    }

    /**
     * Displays dashboard information.
     */
    @Override
    public void displayDashboard() {

        System.out.println("\n========== EMPLOYEE DASHBOARD ==========");

        System.out.println("Employee ID   : " + employee.getEmpId());
        System.out.println("Employee Name : " + employee.getName());

        // Runtime type checking
        System.out.println("Dashboard Type : " + getClass().getSimpleName());

        System.out.println("\n----- Recent Payslips -----");

        // Display latest 3 payslips
        payslips.stream()
                .sorted(Comparator.comparing(Payslip::hashCode).reversed())
                .limit(3)
                .forEach(System.out::println);

        // Calculate total earnings using Stream API
        double totalEarnings = payslips.stream()
                .mapToDouble(p -> p.getNetPay())
                .sum();

        System.out.println("----------------------------------------");
        System.out.println("YTD Earnings : " + totalEarnings);
        System.out.println("========================================");
    }

    /**
     * Refreshes dashboard data.
     */
    @Override
    public void refreshDashboard() {

        System.out.println("\nRefreshing dashboard...");

        displayDashboard();
    }
}