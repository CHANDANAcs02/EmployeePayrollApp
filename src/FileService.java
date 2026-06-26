import java.io.FileWriter;
import java.io.IOException;

/**
 * FileService handles saving payslip data into files.
 *
 * This class keeps file operations separate from
 * the Payslip class.
 */
public class FileService {

    /**
     * Saves the payslip as a text file.
     *
     * A unique filename is created using the
     * employee ID and current timestamp.
     */
    public String savePayslipAsText(Payslip payslip) throws IOException {

        String fileName = "Payslip_"
                + System.currentTimeMillis()
                + ".txt";

        FileWriter writer = new FileWriter(fileName);

        writer.write(payslip.toString());

        writer.close();

        return fileName;
    }

    /**
     * Saves the payslip as a PDF file.
     *
     * Note:
     * This is a simple demonstration.
     * The content is plain text stored in a file
     * with a .pdf extension.
     */
    public String savePayslipAsPdf(Payslip payslip) throws IOException {

        String fileName = "Payslip_"
                + System.currentTimeMillis()
                + ".pdf";

        FileWriter writer = new FileWriter(fileName);

        writer.write(payslip.toString());

        writer.close();

        return fileName;
    }
}