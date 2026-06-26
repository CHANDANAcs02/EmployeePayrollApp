/**
 * Dashboard interface defines the common behavior
 * for all dashboard types.
 *
 * Any dashboard created in the future must
 * implement this interface.
 */
public interface Dashboard {

    /**
     * Displays dashboard information.
     */
    void displayDashboard();

    /**
     * Refreshes the dashboard with the latest data.
     */
    void refreshDashboard();
}