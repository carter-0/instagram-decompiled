package X;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class Ni2 extends C318286oh {
    public final C65041a9 A00 = new Object();
    public final ScheduledExecutorService A01;
    public volatile boolean A02;

    public final C65051aA A01(Runnable runnable, TimeUnit timeUnit, long j) {
        Future future;
        if (this.A02) {
            return AnonymousClass6F8.INSTANCE;
        }
        1aP.A01(runnable, "run is null");
        C65041a9 r0 = this.A00;
        XDF xdf = new XDF(r0, runnable);
        r0.A7i(xdf);
        if (j <= 0) {
            try {
                future = this.A01.submit(xdf);
            } catch (RejectedExecutionException e) {
                dispose();
                C318176oW.A01(e);
                return AnonymousClass6F8.INSTANCE;
            }
        } else {
            future = this.A01.schedule(xdf, j, timeUnit);
        }
        xdf.A00(future);
        return xdf;
    }

    public final void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A00.dispose();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1a9] */
    public Ni2(ScheduledExecutorService scheduledExecutorService) {
        this.A01 = scheduledExecutorService;
    }
}
