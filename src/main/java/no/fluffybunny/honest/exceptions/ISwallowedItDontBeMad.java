package no.fluffybunny.honest.exceptions;

/**
 * Throw this exception whenever you feel the urge to swallow the original exception.
 * The poor bastard that will have to debug your code based on this exception is going
 * to be very very pleased.
 *
 * This is also a very useful class to get rid of embarrassing exceptions.
 */
public class ISwallowedItDontBeMad extends Exception {
    /**
     * @param theOriginal The exception to get rid of
     */
    public ISwallowedItDontBeMad(final Throwable theOriginal) {
        // Well - what did you expect?
    }
}
