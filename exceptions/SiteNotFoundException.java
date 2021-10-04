/*
Kristen Klimisch
CPSC 5011, Seattle University
This is free and unencumbered software released into the public domain.
 */
package exceptions;

/**
 * The SiteNotFoundException class extends the Java Exception class.
 * It displays a message stating that the user has no password
 * associated with this site.
 *
 * @author Kristen Klimisch
 * @version 1.0
 */
public class SiteNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public SiteNotFoundException() {
        super("The user has no password associated " +
                "with this site.");
    }
}

