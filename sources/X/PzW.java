package X;

import java.util.concurrent.CancellationException;

public final class PzW extends CancellationException {
    public PzW() {
        super("Pointer input was reset");
    }

    public final Throwable fillInStackTrace() {
        setStackTrace(C7217Pzl.A00);
        return this;
    }
}
