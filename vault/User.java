package vault;

public class User {
    private String userName;
    private String vaultPassword;

    /**
     * Constructor: Create a new User with the
     * user name and password provided.
     * @param userName
     * @param vaultPassword
     */
    public User(String userName, String vaultPassword) {
        this.userName = userName;
        this.vaultPassword = vaultPassword;
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
