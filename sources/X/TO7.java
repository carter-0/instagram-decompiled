package X;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class TO7 implements ExecutorService {
    public static final long A01 = TimeUnit.SECONDS.toMillis(10);
    public static volatile int A02;
    public final ExecutorService A00;

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.A00.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.A00.execute(runnable);
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.A00.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.A00.invokeAny(collection, j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.A00.isShutdown();
    }

    public final boolean isTerminated() {
        return this.A00.isTerminated();
    }

    public final void shutdown() {
        this.A00.shutdown();
    }

    public final List shutdownNow() {
        return this.A00.shutdownNow();
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.A00.submit(runnable, obj);
    }

    public final String toString() {
        return this.A00.toString();
    }

    public TO7(ExecutorService executorService) {
        this.A00 = executorService;
    }

    public final List invokeAll(Collection collection) {
        return this.A00.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.A00.invokeAny(collection);
    }

    public final Future submit(Runnable runnable) {
        return this.A00.submit(runnable);
    }

    public final Future submit(Callable callable) {
        return this.A00.submit(callable);
    }
}
