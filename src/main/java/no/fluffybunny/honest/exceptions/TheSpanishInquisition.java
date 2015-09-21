package no.fluffybunny.honest.exceptions;

/**
 * Throw this deep down in the code. Nobody expects it. Bonus points if you
 * wrap a checked exception.
 */
public class TheSpanishInquisition extends RuntimeException {
    /**
     * @param message List your main weapons
     */
    public TheSpanishInquisition(final String message) {
        super(message);
    }

    /**
     * @param sourceException everybody likes surprises
     */
    public TheSpanishInquisition(final Throwable sourceException) {
        super(sourceException);
    }
}
