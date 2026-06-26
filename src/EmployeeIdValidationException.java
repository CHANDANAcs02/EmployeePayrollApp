/**
 * Thrown when the entered Employee ID
 * does not match the required format.
 *
 * This class extends ValidationException,
 * making it part of the validation exception hierarchy.
 */
public class EmployeeIdValidationException extends ValidationException {

    /**
     * Constructor to pass the error message.
     */
    public EmployeeIdValidationException(String message) {
        super(message);
    }
}