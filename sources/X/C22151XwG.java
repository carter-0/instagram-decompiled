package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.XwG  reason: case insensitive filesystem */
public final class C22151XwG implements YA7 {
    public Y9G A00;
    public C22158XwN A01;
    public ScheduledFuture A02;

    public final synchronized void DR7(Object obj, ScheduledExecutorService scheduledExecutorService, int i) {
        if (i == 7) {
            this.A02 = scheduledExecutorService.scheduleAtFixedRate(new C22377Y1f(this), 5, 2, TimeUnit.SECONDS);
        }
    }

    public final boolean Esn(int i, Object obj) {
        return i == 7;
    }
}
