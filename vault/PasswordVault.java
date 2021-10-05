/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package vault;

import encrypt.CaesarCipher;
import exceptions.*;
import java.util.*;

/**
 * To add: Statement about what class does
 */

public class PasswordVault implements Vault {

    private Map <User, sitePasswords> userVault;

    /**
     * Default constructor for PasswordVault object.
     * Create a new HashMap to which the key-value pairs
     * of users and their site passwords can be added.
     */
    public PasswordVault() {
      userVault = new HashMap<>();
    }

    /**
     * Constructor for PasswordVault object that accepts a CaesarCipher
     * object as an input parameter.
     * @param e The CaesarCipher object.
     */
    public PasswordVault(CaesarCipher e) {

    }

    /**
     * Uses a regex to validate that the names provided for usernames and site
     * names are strings of at least 6 and at most 12 lower-case characters.
     * @param name the name provided for the username or site name.
     * @return true if the name meets the stated criteria, else returns false.
     */
    public boolean validateName(String name) {
        return name.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]).{6,15}$");
    }

    /**
     * Uses a regex to validate that the password provided meets the stated
     * password vault criteria:
     *    ~Be between 6 and 15 characters long
     *    ~Contain at least one letter (can be upper or lowercase) and one digit (0-9)
     *    ~Contain at least one special character from the set !@#$%^&
     * @param password
     * @return true if the password meets the stated criteria, else returns false.
     */
    public boolean validatePassword(String password) {
        return password.matches("^(?=.*[a-z]).{6,12}$");
    }

    /**
     * Add a new user to the vault (with no site passwords). For example, a
     * username and password is supplied, and the system does no verification
     * or checking except that the username and password must be in correct
     * formats, and the username cannot already be in the vault.
     *
     * @param username The username to be added
     * @param password The password to be associated with this user
     * @throws InvalidUsernameException The supplied username is invalid
     * @throws InvalidPasswordException The supplied password is invalid
     * @throws DuplicateUserException   The username is already in the vault
     */
    public void addNewUser(String username, String password)
            throws exceptions.InvalidUsernameException,
            exceptions.InvalidPasswordException,
            exceptions.DuplicateUserException {

        // Check if the username provided meets the stated criteria.
        // If it doesn't, throw the invalid username exception.
        if (!validateName(username)) {
            throw new InvalidUsernameException();
        }

        // Check if password provided meets the stated criteria.
        // If it doesn't, throw the invalid password exception.
        if (!validatePassword(password) ) {
            throw new InvalidPasswordException();
        }

        // Check for duplicate users if the number of users in the vault is greater than 0.
        // If there are no users in the vault, there is no need to check for duplicate
        // users.
        if (userVault.size() > 0 ) {

            // Check through each user in the vault and see if the username
            // is already in the vault. If the username is already in the vault.
            // throw the duplicate user exception.
            for (User user : userVault.keySet()){
                if (user.getUserName().equals(username)) {
                    throw new exceptions.DuplicateUserException();
                }
            }
        }
        userVault.put(new User(username, password), new sitePasswords());
    }

    /**
     * Adds a new site to the vault for the user, generates, stores, and
     * returns a password for that site. For example, if a user is creating
     * an account at the site "amazon" for the first time, he/she calls the
     * vault with the site name, and the site makes up a password for the
     * user/site, returns the (plain text password to the user, and stores
     * the (encrypted) password -- all stored passwords in the vault.
     *
     * @param username The username requesting the new site password
     * @param password Password for the username
     * @param sitename Name of the site for which the user is requesting a password
     * @return 		   A new (plaintext) password for the requested site
     * @throws DuplicateSiteException    There is already a site stored for this
     *                                   user
     * @throws UserNotFoundException     There is no such user in the vault
     * @throws UserLockedOutException    The user has been locked out due to too
     *                                   many incorrect password attempts
     * @throws PasswordMismatchException The password supplied does not match the
     *                                   user's vault password
     * @throws InvalidSiteException      The site name supplied is invalid
     */
    public String addNewSite(String username, String password, String sitename)
            throws 	exceptions.DuplicateSiteException,
            exceptions.UserNotFoundException,
            exceptions.UserLockedOutException,
            exceptions.PasswordMismatchException,
            exceptions.InvalidSiteException {
        // placeholder statements until can write code
        String h = "hello";
        return h;

    }

    /**
     * Generate, store, and return an updated password for a site associated
     * with the user. For example, the user wants to change his/her password on
     * "amazon," and the system generates a new password, stores an encrypted
     * version for the user, and returns the plaintext version.
     *
     * @param username The username requesting the new site password
     * @param password Password for the username
     * @param sitename Name of the site for which the user is requesting a password
     * @return An updated (plaintext) password for the requested site
     * @throws SiteNotFoundException     The user has no password associated with
     *                                   this site
     * @throws UserNotFoundException     There is no such user in the vault
     * @throws UserLockedOutException    The user has been locked out due to too
     *                                   many incorrect password attempts
     * @throws PasswordMismatchException The password supplied does not match the
     *                                   user's vault password
     */
    public String updateSitePassword(String username, String password, String sitename)
            throws 	exceptions.SiteNotFoundException,
            exceptions.UserNotFoundException,
            exceptions.UserLockedOutException,
            exceptions.PasswordMismatchException {

        // placeholder statements until can write code
        String h = "hello";
        return h;
    }

    /**
     * Retrieve the (plaintext) password for the user for the requested site.
     * For example, the user supplies the name of a site, and if she has a
     * stored password for the site, it is returned in plain text.
     *
     * @param username The username requesting the site password
     * @param password Password for the username
     * @param sitename Name of the site for which the user is requesting a password
     * @return The (plaintext) password for the requested site
     * @throws SiteNotFoundException     The user has no password associated with
     *                                   this site
     * @throws UserNotFoundException     There is no such user in the vault
     * @throws UserLockedOutException    The user has been locked out due to too
     *                                   many incorrect password attempts
     * @throws PasswordMismatchException The password supplied does not match the
     *                                   user's vault password
     */
    public String retrieveSitePassword(String username, String password, String sitename)
            throws 	exceptions.SiteNotFoundException,
            exceptions.UserNotFoundException,
            exceptions.UserLockedOutException,
            exceptions.PasswordMismatchException {

        // placeholder statements until can write code
        String h = "hello";
        return h;
    }

    // For testing, print the contents of the vault.
    public void print() {
        for (User user: userVault.keySet()) {
            String username = user.getUserName();
            String password = user.getVaultPassword();
            System.out.println(username + " " + password);
        }
    }
}

