package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.TSl  reason: case insensitive filesystem */
public final class C13270TSl extends FutureTask implements ListenableFuture {
    public final C3722590c A00 = new Object();

    public final void addListener(Runnable runnable, Executor executor) {
        this.A00.A02(runnable, executor);
    }

    public final void done() {
        this.A00.A01();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.90c] */
    public C13270TSl(Callable callable) {
        super(callable);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (nanos > 2147483647999999999L) {
            j = Math.min(nanos, 2147483647999999999L);
            timeUnit = TimeUnit.NANOSECONDS;
        }
        return super.get(j, timeUnit);
    }
}
