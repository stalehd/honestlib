package no.fluffybunny.honest.annotations;
import java.lang.annotation.Documented;

/**
 * Annotate just to have a friendly reminder that this might not be the best
 * place to do major changes. Or any changes at all.
 */
@Documented 
@interface HereBeDragons {
	String description();
}