package X;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.6SI  reason: invalid class name */
public final class AnonymousClass6SI extends AnonymousClass6S5 {
    public final long A00;
    public volatile C307996Sh A01;

    public final C307996Sh A01() {
        RunnableFuture runnableFuture;
        synchronized (this) {
            runnableFuture = this.A00;
        }
        if (runnableFuture == null || runnableFuture.isDone()) {
            return (C307996Sh) A00();
        }
        return this.A01;
    }

    public AnonymousClass6SI(C307996Sh r1, Callable callable, long j) {
        super(callable);
        this.A01 = r1;
        this.A00 = j;
    }
}
