package X;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class TSb extends AbstractExecutorService implements C74588Pxb {
    public final TBS A00;
    public final String A01 = "SerialExecutor";
    public final BlockingQueue A02;
    public final Executor A03;
    public final AtomicInteger A04;
    public final AtomicInteger A05;
    public volatile int A06;

    public final synchronized void execute(Runnable runnable) {
        Throwable th;
        if (runnable != null) {
            BlockingQueue blockingQueue = this.A02;
            if (blockingQueue.offer(runnable)) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.A04;
                int i = atomicInteger.get();
                if (size > i) {
                    atomicInteger.compareAndSet(i, size);
                }
                A00(this);
            } else {
                th = new RejectedExecutionException(002.A0b(this.A01, " queue is full, size=", blockingQueue.size()));
            }
        } else {
            th = AnonymousClass7TE.A11("runnable parameter is null");
        }
        throw th;
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public TSb(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.A03 = executor;
        this.A06 = 1;
        this.A02 = linkedBlockingQueue;
        this.A00 = new TBS(this);
        this.A05 = new AtomicInteger(0);
        this.A04 = new AtomicInteger(0);
    }

    public static void A00(TSb tSb) {
        int i;
        AtomicInteger atomicInteger = tSb.A05;
        do {
            i = atomicInteger.get();
            if (i >= tSb.A06) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, i + 1));
        tSb.A03.execute(tSb.A00);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw C66580MXl.A11();
    }

    public final void shutdown() {
        throw C66580MXl.A11();
    }

    public final List shutdownNow() {
        throw C66580MXl.A11();
    }
}
