package X;

import android.content.BroadcastReceiver;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class S2V {
    public boolean A00 = false;
    public final Intent A01;
    public final BroadcastReceiver.PendingResult A02;
    public final ScheduledFuture A03;

    public final synchronized void A00() {
        if (!this.A00) {
            this.A02.finish();
            this.A03.cancel(false);
            this.A00 = true;
        }
    }

    public S2V(BroadcastReceiver.PendingResult pendingResult, Intent intent, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = intent;
        this.A02 = pendingResult;
        this.A03 = scheduledExecutorService.schedule(new THI(intent, this), 9000, TimeUnit.MILLISECONDS);
    }
}
