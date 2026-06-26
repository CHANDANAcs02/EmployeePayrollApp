/**
 * ValidationService contains all input validation methods.
 *
 * It uses Regular Expressions (RegEx) to validate
 * employee details before they are accepted.
 */
public class ValidationService {

    // Regular Expression patterns
    private static final String EMAIL_PATTERN =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    private static final String PHONE_PATTERN =
            "^[6-9][0-9]{9}$";

    private static final String PASSWORD_PATTERN =
            "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    private static final String EMPLOYEE_ID_PATTERN =
            "^EMP-[0-9]{4}$";

    /**
     * Removes unwanted spaces from the input.
     */
    public String sanitize(String input) {

        return input.trim();
    }

    /**
     * Validates email format.
     */
    public void validateEmail(String email)
            throws EmailValidationException {

        email = sanitize(email);

        if (!email.matches(EMAIL_PATTERN)) {

            throw new EmailValidationException(
                    "Invalid Email Format!"
            );
        }
    }

    /**
     * Validates phone number.
     */
    public void validatePhone(String phone)
            throws PhoneValidationException {

        phone = sanitize(phone);

        if (!phone.matches(PHONE_PATTERN)) {

            throw new PhoneValidationException(
                    "Invalid Phone Number!"
            );
        }
    }

    /**
     * Validates password strength.
     */
    public void validatePassword(String password)
            throws PasswordValidationException {

        password = sanitize(password);

        if (!password.matches(PASSWORD_PATTERN)) {

            throw new PasswordValidationException(
                    "Password must contain at least 8 characters, one uppercase letter and one digit."
            );
        }
    }

    /**
     * Validates Employee ID format.
     */
    public void validateEmployeeId(String empId)
            throws EmployeeIdValidationException {

        empId = sanitize(empId);

        if (!empId.matches(EMPLOYEE_ID_PATTERN)) {

            throw new EmployeeIdValidationException(
                    "Employee ID must be in the format EMP-0001."
            );
        }
    }
}