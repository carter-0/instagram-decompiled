package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class R23 extends C7266Q1q implements ListenableFuture, ScheduledFuture {
    public final ScheduledFuture A00;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.A00.getDelay(timeUnit);
    }

    public R23(ListenableFuture listenableFuture, ScheduledFuture scheduledFuture) {
        super(listenableFuture);
        this.A00 = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.A00.cancel(z);
        }
        return cancel;
    }
}
