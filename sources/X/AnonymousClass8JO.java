package X;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.8JO  reason: invalid class name */
public abstract class AnonymousClass8JO {
    public static final Object A00 = new Object();
    public static volatile ScheduledExecutorService A01;

    public static final ScheduledExecutorService A00() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = A01;
        if (scheduledExecutorService2 != null) {
            return scheduledExecutorService2;
        }
        synchronized (A00) {
            scheduledExecutorService = A01;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = new AnonymousClass8JP(AnonymousClass12W.A00);
                A01 = scheduledExecutorService;
            }
        }
        return scheduledExecutorService;
    }
}
