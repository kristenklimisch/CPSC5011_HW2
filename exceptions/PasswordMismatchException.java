/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package exceptions;

/**
 * The PasswordMismatchException class extends the Java Exception class.
 * It displays a message stating that the password supplied does not
 * match the user's vault password.
 *
 * @author Kristen Klimisch
 * @version 1.0
 */
public class PasswordMismatchException extends Exception {
    private static final long serialVersionUID = 1L;

    public PasswordMismatchException() {
        super("The password supplied does not match " +
                "the user's vault password");
    }
}
