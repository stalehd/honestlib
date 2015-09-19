package no.fluffybunny.honest.exceptions;

/**
 * Throw this exception when you've reached something that strictly isn't an
 * illegal state but you can't be arsed to fix it or haven't got the time.
 */
public class ForSomeWeirdReasonThisIsntAllowedException 
	extends IllegalStateException {
}