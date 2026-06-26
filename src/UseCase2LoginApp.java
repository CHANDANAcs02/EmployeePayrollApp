import java.util.Scanner;

public class UseCase2LoginApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AuthenticationService authService = new AuthenticationService();

        System.out.println("===== Employee Login =====");

        System.out.print("Username: ");
        String username = scanner.nextLine();

        System.out.print("Password: ");
        String password = scanner.nextLine();

        Session session = authService.login(username, password);

        if (session != null && session.isActive()) {

            System.out.println("\nWelcome " + session.getUser().getRole());
            System.out.println("Login Time : " + session.getLoginTime());

        } else {

            System.out.println("Login Failed!");
        }

        scanner.close();
    }
}