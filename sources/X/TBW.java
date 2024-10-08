package X;

import java.util.concurrent.ScheduledFuture;

public final class TBW implements Runnable {
    public final /* synthetic */ AnonymousClass6UG A00;

    public TBW(AnonymousClass6UG r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass6UG r3 = this.A00;
        synchronized (r3) {
            if (r3.A03) {
                C276164sm r2 = r3.A01;
                if (r2 != null) {
                    r3.A03 = false;
                    r3.A08.A06();
                    ScheduledFuture scheduledFuture = r3.A02;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        r3.A02 = null;
                    }
                    r3.A01(r2);
                } else {
                    AnonymousClass6UG.A00(r3, new Q0M(AnonymousClass05K.A01));
                }
            }
        }
    }
}
