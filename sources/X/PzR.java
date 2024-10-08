package X;

import java.util.concurrent.CancellationException;

public abstract class PzR extends CancellationException {
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
