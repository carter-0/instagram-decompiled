package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.41m  reason: invalid class name and case insensitive filesystem */
public final class C2593841m implements RunnableFuture, ScheduledFuture {
    public final Handler A00;
    public final FutureTask A01;

    public final boolean cancel(boolean z) {
        return this.A01.cancel(z);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.A01.get(j, timeUnit);
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final boolean isCancelled() {
        return this.A01.isCancelled();
    }

    public final boolean isDone() {
        return this.A01.isDone();
    }

    public final void run() {
        this.A01.run();
    }

    public C2593841m(Handler handler, Object obj, Runnable runnable) {
        this.A00 = handler;
        this.A01 = new FutureTask(runnable, obj);
    }

    public C2593841m(Handler handler, Callable callable) {
        this.A00 = handler;
        this.A01 = new FutureTask(callable);
    }

    public final Object get() {
        return this.A01.get();
    }
}
