package X;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6oY  reason: invalid class name and case insensitive filesystem */
public final class C318196oY extends C318206oZ {
    public static final C318216oa A02 = new C318216oa("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    public static final ScheduledExecutorService A03;
    public final ThreadFactory A00;
    public final AtomicReference A01;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        A03 = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public C318196oY() {
        C318216oa r4 = A02;
        AtomicReference atomicReference = new AtomicReference();
        this.A01 = atomicReference;
        this.A00 = r4;
        boolean z = C318226ob.A02;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, r4);
        if (z) {
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        }
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }
}
