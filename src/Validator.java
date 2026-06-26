public class Validator {

    // Validate Email
    public static void validateEmail(String email) throws ValidationException {

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (!email.matches(emailRegex)) {
            throw new ValidationException("Invalid Email Format");
        }
    }

    // Validate Phone Number
    public static void validatePhone(String phone) throws ValidationException {

        String phoneRegex = "^[6789][0-9]{9}$";

        if (!phone.matches(phoneRegex)) {
            throw new ValidationException("Invalid Phone Number");
        }
    }

    // Validate Employee ID
    public static void validateEmpId(String empId) throws ValidationException {

        String empIdRegex = "^EMP-[0-9]{4}$";

        if (!empId.matches(empIdRegex)) {
            throw new ValidationException("Invalid Employee ID Format");
        }
    }
}