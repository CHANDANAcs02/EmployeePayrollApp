/**
 * DownloadToken represents a temporary token
 * used to validate payslip downloads.
 *
 * The token expires after a fixed time.
 */
public class DownloadToken {

    // Time when the token was created
    private long createdTime;

    // Token validity period (1 minute)
    private long expiryMillis;

    /**
     * Creates a new download token.
     */
    public DownloadToken() {

        createdTime = System.currentTimeMillis();
        expiryMillis = 60 * 1000; // 1 minute
    }

    /**
     * Checks whether the download token
     * has expired.
     *
     * @return true if expired, otherwise false
     */
    public boolean isExpired() {

        long currentTime = System.currentTimeMillis();

        return (currentTime - createdTime) > expiryMillis;
    }
}