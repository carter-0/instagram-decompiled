package X;

import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class XU1 {
    public Xm6 A00;
    public Set A01;
    public ScheduledExecutorService A02;
    public AnonymousClass0eK A03;
    public AnonymousClass0eK A04;
    public AnonymousClass0eK A05;

    public final void A00(int i, Object obj) {
        if (this.A00 == null) {
            this.A00 = (Xm6) this.A04.get();
        }
        if (DebugHeadConfigurations.isMemoryMetricsDebuggingEnabled || 1AW.A06(0Tu.A05, 18296350227759358L)) {
            ScheduledExecutorService scheduledExecutorService = this.A02;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = (ScheduledExecutorService) this.A05.get();
                this.A02 = scheduledExecutorService;
            }
            scheduledExecutorService.schedule(new Y3C(this, obj, i), 0, TimeUnit.SECONDS);
        }
    }
}
