/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package exceptions;

/**
 * The UserNotFoundException class extends the Java Exception class.
 * It displays a message stating that there is no such user in the vault.
 *
 * @author Kristen Klimisch
 * @version 1.0
 */
public class UserNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public UserNotFoundException() {
        super("There is no such user in the vault.");
    }
}

