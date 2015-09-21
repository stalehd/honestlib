package no.fluffybunny.honest.annotations;
import java.lang.annotation.Documented;

/**
 * Use whenever necessary. There's always that section of code, class or interface nobody should
 * touch. Ever. Hum along when adding the annotation.
 */
@Documented
@interface UCantTouchThis {
	String why();
}