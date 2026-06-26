import java.util.List;

/**
 * DashboardFactory creates dashboard objects.
 *
 * This keeps object creation separate from the
 * main application.
 */
public class DashboardFactory {

    /**
     * Creates and returns an Employee Dashboard.
     */
    public static Dashboard createDashboard(Employee employee,
                                            List<Payslip> payslips) {

        return new EmployeeDashboard(employee, payslips);
    }
}