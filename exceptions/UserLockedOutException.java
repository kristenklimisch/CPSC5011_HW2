/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package exceptions;

/**
 * The UserLockedOutException class extends the Java Exception class.
 * It displays a message stating the user has been locked out due to
 * too many incorrect password attempts
 *
 * @author Kristen Klimisch
 * @version 1.0
 */
public class UserLockedOutException  extends Exception {
    private static final long serialVersionUID = 1L;

    public UserLockedOutException () {
        super("The user has been locked out due to too " +
                "many incorrect password attempts.");
    }
}

