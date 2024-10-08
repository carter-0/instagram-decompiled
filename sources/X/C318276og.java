package X;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6og  reason: invalid class name and case insensitive filesystem */
public class C318276og extends C318286oh implements C65051aA {
    public final ScheduledExecutorService A00;
    public volatile boolean A01;

    public final XDF A02(AnonymousClass1aB r5, Runnable runnable, TimeUnit timeUnit, long j) {
        Future future;
        1aP.A01(runnable, "run is null");
        XDF xdf = new XDF(r5, runnable);
        if (r5 != null && !r5.A7i(xdf)) {
            return xdf;
        }
        if (j <= 0) {
            try {
                future = this.A00.submit(xdf);
            } catch (RejectedExecutionException e) {
                if (r5 != null) {
                    r5.ED6(xdf);
                }
                C318176oW.A01(e);
                return xdf;
            }
        } else {
            future = this.A00.schedule(xdf, j, timeUnit);
        }
        xdf.A00(future);
        return xdf;
    }

    public final void dispose() {
        if (!this.A01) {
            this.A01 = true;
            this.A00.shutdownNow();
        }
    }

    public C318276og(ThreadFactory threadFactory) {
        boolean z = C318226ob.A02;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        if (z) {
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        }
        this.A00 = scheduledThreadPoolExecutor;
    }
}
