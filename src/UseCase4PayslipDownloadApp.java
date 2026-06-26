import java.io.IOException;

/**
 * UC4 Main Application
 *
 * Demonstrates cloning, comparison and downloading
 * of a payslip.
 */

public class UseCase4PayslipDownloadApp {

    public static void main(String[] args) {

        // Create Employee
        UserAccount account = new UserAccount("chandana", "1234");

        Employee employee = new Employee(
                "EMP-1001",
                "Chandana",
                "chandana@gmail.com",
                "9876543210",
                50000,
                account
        );

        // Create Salary Components
        SalaryComponents components =
                new SalaryComponents(30000, 8000, 5000, 2000);

        // Generate Payslip
        PayrollService payrollService = new PayrollService();

        Payslip originalPayslip =
                payrollService.generatePayslip(employee,
                        components,
                        "June 2026");

        // Create a cloned copy of the payslip
        Payslip clonedPayslip = (Payslip) originalPayslip.clone();

        // Compare original and cloned objects
        System.out.println("Payslips Equal : "
                + originalPayslip.equals(clonedPayslip));

        System.out.println("HashCodes : "
                + originalPayslip.hashCode()
                + " | "
                + clonedPayslip.hashCode());

        // Create download token
        DownloadToken token = new DownloadToken();

        if (!token.isExpired()) {

            FileService fileService = new FileService();

            try {

                String txtFile =
                        fileService.savePayslipAsText(clonedPayslip);

                String pdfFile =
                        fileService.savePayslipAsPdf(clonedPayslip);

                System.out.println("\nPayslip downloaded successfully!");

                System.out.println("Text File : " + txtFile);

                System.out.println("PDF File  : " + pdfFile);

            } catch (IOException e) {

                System.out.println("Error while saving payslip.");
            }

        } else {

            System.out.println("Download Token Expired!");

        }

        // Display Payslip
        System.out.println(clonedPayslip);
    }
}