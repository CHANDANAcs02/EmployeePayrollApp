import java.util.HashMap;

public class AuthenticationService {

    private HashMap<String, User> users = new HashMap<>();

    public AuthenticationService() {

        users.put("emp1", new RegularEmployee("emp1", "Emp@1234"));
        users.put("manager1", new Manager("manager1", "Mng@1234"));
    }

    public Session login(String username, String password) {

        User user = users.get(username);

        if (user != null && user.authenticate(username, password)) {

            System.out.println("\nLogin Successful!");
            return new Session(user);
        }

        System.out.println("\nInvalid Username or Password!");
        return null;
    }
}