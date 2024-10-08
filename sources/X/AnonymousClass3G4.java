package X;

import com.instagram.realtime.requeststream.PulsarScheduler;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.3G4  reason: invalid class name */
public final class AnonymousClass3G4 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ PulsarScheduler A01;
    public final /* synthetic */ ScheduledExecutorService A02;

    public AnonymousClass3G4(PulsarScheduler pulsarScheduler, ScheduledExecutorService scheduledExecutorService, long j) {
        this.A01 = pulsarScheduler;
        this.A02 = scheduledExecutorService;
        this.A00 = j;
    }

    public final void run() {
        PulsarScheduler.access$000(this.A01, this.A02, this.A00);
    }
}
