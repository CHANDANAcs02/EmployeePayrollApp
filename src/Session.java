import java.time.LocalDateTime;

public class Session {

    private User user;
    private LocalDateTime loginTime;
    private boolean active;

    public Session(User user) {
        this.user = user;
        this.loginTime = LocalDateTime.now();
        this.active = true;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getLoginTime() {
        return loginTime;
    }

    public boolean isActive() {
        return active;
    }

    public void logout() {
        active = false;
    }
}