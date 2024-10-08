package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3zI  reason: invalid class name and case insensitive filesystem */
public final class C258573zI extends C258533zE {
    public ListenableFuture A00;
    public ScheduledFuture A01;

    public final String A07() {
        ListenableFuture listenableFuture = this.A00;
        ScheduledFuture scheduledFuture = this.A01;
        if (listenableFuture == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C273654mx.A00(754));
        sb.append(listenableFuture);
        sb.append("]");
        String obj = sb.toString();
        if (scheduledFuture == null) {
            return obj;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay > 0) {
            return 002.A0s(obj, ", remaining delay=[", " ms]", delay);
        }
        return obj;
    }

    public final void A08() {
        A0B(this.A00);
        ScheduledFuture scheduledFuture = this.A01;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.A00 = null;
        this.A01 = null;
    }
}
