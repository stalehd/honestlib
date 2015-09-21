package no.fluffybunny.honest.annotations;

import java.lang.annotation.Documented;

/**
 * Annotate almost (but not quite) threadsafe code. It might look very fancy
 * and threadsafe but isn't. The original programmer (or you) might have sprinkled
 * the code with "synchronized", used java.util.concurrent classes and done the
 * required motions but deep down you know the truth: It's thrdsafe.
 */
@Documented
@interface Thrdsafe {
}
