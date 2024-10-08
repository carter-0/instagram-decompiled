package X;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6ol  reason: invalid class name and case insensitive filesystem */
public final class C318326ol extends C318206oZ {
    public static final long A02 = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    public static final C318346on A03;
    public static final C318336om A04;
    public static final C318216oa A05;
    public static final C318216oa A06;
    public static final TimeUnit A07 = TimeUnit.SECONDS;
    public final ThreadFactory A00 = A06;
    public final AtomicReference A01;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.6om, X.6og] */
    static {
        ? r0 = new C318276og(new C318216oa("RxCachedThreadSchedulerShutdown", 5, false));
        r0.A00 = 0;
        A04 = r0;
        r0.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        C318216oa r4 = new C318216oa("RxCachedThreadScheduler", max, false);
        A06 = r4;
        A05 = new C318216oa("RxCachedWorkerPoolEvictor", max, false);
        C318346on r1 = new C318346on(r4, (TimeUnit) null, 0);
        A03 = r1;
        r1.A01.dispose();
        Future future = r1.A03;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = r1.A04;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C318326ol() {
        C318346on r5 = A03;
        this.A01 = new AtomicReference(r5);
        long j = A02;
        C318346on r2 = new C318346on(this.A00, A07, j);
        if (!1FH.A00(r5, r2, this.A01)) {
            r2.A01.dispose();
            Future future = r2.A03;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = r2.A04;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }
}
