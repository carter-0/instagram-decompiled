package X;

import java.util.concurrent.CancellationException;

public final class PzT extends CancellationException {
    public PzT() {
        super("The Modifier.Node was detached");
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(PzV.A00);
        return this;
    }
}
