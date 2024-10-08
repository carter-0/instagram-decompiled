package X;

import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Qvs  reason: case insensitive filesystem */
public final class C8496Qvs extends RR0 implements ExecutorService {
    public static final ThreadLocal A01 = new ThreadLocal();
    public final ThreadPoolExecutor A00;

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.A00.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        Deque deque = (Deque) A01.get();
        if (deque == null || deque.size() > 1) {
            this.A00.execute(new TDS(runnable));
            return;
        }
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
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

    public C8496Qvs() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new TOM(defaultThreadFactory));
        this.A00 = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
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
