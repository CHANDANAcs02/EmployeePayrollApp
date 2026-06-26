/**
 * Thrown when an invalid phone number is entered.
 *
 * This class extends ValidationException,
 * making it part of the validation exception hierarchy.
 */
public class PhoneValidationException extends ValidationException {

    /**
     * Constructor to pass the error message.
     */
    public PhoneValidationException(String message) {
        super(message);
    }
}