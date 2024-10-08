package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class Q2S implements ListenableFuture {
    public final AnonymousClass5AE A00 = new Q2U(this);
    public final WeakReference A01;

    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        Q2R q2r = (Q2R) this.A01.get();
        boolean cancel = this.A00.cancel(z);
        if (cancel && q2r != null) {
            q2r.A02 = null;
            q2r.A00 = null;
            q2r.A01.A06((Object) null);
        }
        return cancel;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.A00.isCancelled();
    }

    public final boolean isDone() {
        return this.A00.isDone();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public Q2S(Q2R q2r) {
        this.A01 = C51965G9l.A0v(q2r);
    }

    public final Object get() {
        return this.A00.get();
    }
}
