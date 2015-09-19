package no.fluffybunny.honest.exceptions;

/**
 * Throw this if you don't know what to do next. Something is wrong, you can't
 * do anything about it but maybe the caller can. This is a hot potato that
 * will probably be handled by the default exception handler.
 */
public class IDontKnowWhatYouAreGoingToDoWithThisButIForSureDontKnowException
	extends RuntimeException {

}