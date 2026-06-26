import java.util.ArrayList;
import java.util.List;

/**
 * UC5 Main Application
 *
 * Demonstrates Dashboard interface,
 * Factory Pattern and Stream API.
 */
public class UseCase5DashboardApp {

    public static void main(String[] args) {

        // Create employee
        UserAccount account = new UserAccount("chandana", "1234");

        Employee employee = new Employee(
                "EMP1001",
                "Chandana",
                "chandana@gmail.com",
                "9876543210",
                50000,
                account
        );

        PayrollService payrollService = new PayrollService();

        // Store all payslips
        List<Payslip> payslips = new ArrayList<>();

        // January
        SalaryComponents jan = new SalaryComponents(30000,8000,5000,2000);
        payslips.add(payrollService.generatePayslip(employee, jan, "January"));

        // February
        SalaryComponents feb = new SalaryComponents(30000,8000,5000,2500);
        payslips.add(payrollService.generatePayslip(employee, feb, "February"));

        // March
        SalaryComponents mar = new SalaryComponents(30000,8000,5000,3000);
        payslips.add(payrollService.generatePayslip(employee, mar, "March"));

        // April
        SalaryComponents apr = new SalaryComponents(30000,8000,5000,3500);
        payslips.add(payrollService.generatePayslip(employee, apr, "April"));

        // Dashboard Service
        DashboardService dashboardService = new DashboardService();

        // Runtime type checking
        Dashboard dashboard =
                dashboardService.getDashboard(employee, payslips);

        System.out.println("Dashboard Class : "
                + dashboard.getClass().getSimpleName());

        // Display dashboard
        dashboard.displayDashboard();

        // Refresh dashboard
        dashboard.refreshDashboard();
    }
}