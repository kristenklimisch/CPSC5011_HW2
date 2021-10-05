package vault;

public class User {
    private String userName;
    private String vaultPassword;
    int failedLogins;  // counter for number of successive failed login attempts by a user

    /**
     * Constructor: Create a new User with the
     * user name and password provided.
     * Initialize the counter of failed logins to 0.
     * @param userName
     * @param vaultPassword
     */
    public User(String userName, String vaultPassword) {
        this.userName = userName;
        this.vaultPassword = vaultPassword;
        failedLogins = 0;
    }

    /**
     * Get method for the user's username.
     * @return the user's username as a String.
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Get method for user's password.
     * @return the user's password as a String.
     */
    public String getVaultPassword() {
        return vaultPassword;
    }
}
