package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6on  reason: invalid class name and case insensitive filesystem */
public final class C318346on implements Runnable {
    public final long A00;
    public final C65041a9 A01;
    public final ConcurrentLinkedQueue A02;
    public final Future A03;
    public final ScheduledExecutorService A04;
    public final ThreadFactory A05;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1a9] */
    public C318346on(ThreadFactory threadFactory, TimeUnit timeUnit, long j) {
        long j2;
        ScheduledFuture<?> scheduledFuture;
        if (timeUnit != null) {
            j2 = timeUnit.toNanos(j);
        } else {
            j2 = 0;
        }
        this.A00 = j2;
        this.A02 = new ConcurrentLinkedQueue();
        this.A01 = new Object();
        this.A05 = threadFactory;
        ScheduledExecutorService scheduledExecutorService = null;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, C318326ol.A05);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.A04 = scheduledExecutorService;
        this.A03 = scheduledFuture;
    }

    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.A02;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                C318336om r3 = (C318336om) it.next();
                if (r3.A00 > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(r3)) {
                    this.A01.ED6(r3);
                }
            }
        }
    }
}
