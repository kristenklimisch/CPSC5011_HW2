/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package exceptions;

/**
 * The DuplicateUserException class extends the Java Exception class.
 * It displays a message stating that the username is already in the vault.
 *
 * @author Kristen Klimisch
 * @version 1.0
 */
public class DuplicateUserException extends Exception {
    private static final long serialVersionUID = 1L;

    public DuplicateUserException() {
        super("The username is already in the vault.");
    }
}
