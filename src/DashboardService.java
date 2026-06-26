import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * DashboardService prepares dashboard data.
 *
 * It processes payslips using Collections,
 * Stream API and Comparator.
 */
public class DashboardService {

    /**
     * Returns the latest three payslips.
     */
    public List<Payslip> getRecentPayslips(List<Payslip> payslips) {

        return payslips.stream()
                .sorted(Comparator.comparing(Payslip::getMonth).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    /**
     * Calculates Year-To-Date earnings.
     */
    public double calculateYTDEarnings(List<Payslip> payslips) {

        return payslips.stream()
                .mapToDouble(Payslip::getNetPay)
                .sum();
    }

    /**
     * Creates a dashboard for the employee.
     */
    public Dashboard getDashboard(Employee employee,
                                  List<Payslip> payslips) {

        return DashboardFactory.createDashboard(employee, payslips);
    }
}