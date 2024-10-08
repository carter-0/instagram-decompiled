package X;

import java.util.concurrent.ScheduledExecutorService;

public final class PUK implements Runnable {
    public final /* synthetic */ OZN A00;

    public PUK(OZN ozn) {
        this.A00 = ozn;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void run() {
        OZN ozn = this.A00;
        ScheduledExecutorService scheduledExecutorService = OZN.A08;
        synchronized (ozn.A06) {
            try {
                ozn.A04.unbindService(ozn.A05);
            } catch (IllegalArgumentException e) {
                e.getMessage();
            }
            ozn.A02 = false;
            ozn.A01 = new Object();
        }
    }
}
