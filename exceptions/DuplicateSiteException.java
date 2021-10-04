/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package exceptions;

/**
 * The DuplicateSiteException class extends the Java Exception class.
 * It displays a message stating that there is already a site stored for this user.
 *
 * @author Kristen Klimisch
 * @version 1.0
 */
public class DuplicateSiteException extends Exception {
    private static final long serialVersionUID = 1L;

    public DuplicateSiteException() {
        super("There is already a site stored for this user.");
    }
}
