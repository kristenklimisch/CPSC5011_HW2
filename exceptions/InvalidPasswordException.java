/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package exceptions;

/**
 * The InvalidPasswordException class extends the Java Exception class.
 * It displays a message stating that the supplied password is invalid.
 *
 * @author Kristen Klimisch
 * @version 1.0
 */
public class InvalidPasswordException extends Exception {
    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super("The supplied password is invalid.");
    }
}
