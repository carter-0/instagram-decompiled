package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.9Ol  reason: invalid class name and case insensitive filesystem */
public final class C378089Ol extends CancellationException {
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C378089Ol() {
        super("Mutation interrupted");
    }
}
