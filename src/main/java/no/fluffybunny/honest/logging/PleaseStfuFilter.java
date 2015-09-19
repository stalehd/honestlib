package no.fluffybunny.honest.logging;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

/**
 * Use this filter to silence annoying logging components.
 */
public class PleaseStfuFilter implements Filter {
	private final String noisyBuggerName;

	public PleaseStfuFilter(final String noisyBuggerName) {
		this.noisyBuggerName = noisyBuggerName;
	}

	@Override
	public boolean isLoggable(final LogRecord logRecord) {
		if (logRecord.getLoggerName().indexOf(noisyBuggerName) >= 0) {
			return false;
		}
		return true;
	}
}
