package X;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class R27 extends TO8 implements ScheduledExecutorService {
    public final ScheduledExecutorService A00;
    public final /* synthetic */ C635813i A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public R27(C635813i r1, ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.A01 = r1;
        this.A00 = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.A00.schedule(A02(runnable), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.A00.scheduleAtFixedRate(A02(runnable), j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.A00.scheduleWithFixedDelay(A02(runnable), j, j2, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.A00.schedule(A01(callable), j, timeUnit);
    }
}
