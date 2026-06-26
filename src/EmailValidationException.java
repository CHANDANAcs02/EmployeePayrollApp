/**
 * Thrown when an invalid email address is entered.
 *
 * This class extends ValidationException,
 * making it part of the validation exception hierarchy.
 */
public class EmailValidationException extends ValidationException {

    /**
     * Constructor to pass the error message.
     */
    public EmailValidationException(String message) {
        super(message);
    }
}