package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Avh  reason: case insensitive filesystem */
public final class C41539Avh extends CancellationException {
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C41539Avh() {
        super("Mutation interrupted");
    }
}
