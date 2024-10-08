package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class SHY {
    public Runnable A00;
    public ScheduledFuture A01;
    public boolean A02 = false;
    public final C13712Tfa A03;
    public final ScheduledExecutorService A04;

    public static synchronized void A00(SHY shy) {
        ScheduledFuture scheduledFuture;
        synchronized (shy) {
            if (shy.A02 && ((scheduledFuture = shy.A01) == null || scheduledFuture.isDone() || shy.A01.isCancelled())) {
                shy.A01 = shy.A04.schedule(new TC4(shy), 500, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final synchronized void A01(boolean z) {
        this.A02 = z;
        if (z) {
            A00(this);
        } else {
            ScheduledFuture scheduledFuture = this.A01;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.A01 = null;
            }
        }
    }

    public SHY(C13712Tfa tfa, ScheduledExecutorService scheduledExecutorService) {
        this.A04 = scheduledExecutorService;
        this.A03 = tfa;
    }
}
