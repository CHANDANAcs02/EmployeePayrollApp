/**
 * Thrown when the entered password does not
 * satisfy the required strength rules.
 *
 * This class extends ValidationException,
 * making it part of the validation exception hierarchy.
 */
public class PasswordValidationException extends ValidationException {

    /**
     * Constructor to pass the error message.
     */
    public PasswordValidationException(String message) {
        super(message);
    }
}