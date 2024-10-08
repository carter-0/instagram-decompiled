package X;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1v8  reason: invalid class name */
public final class AnonymousClass1v8 {
    public static final long A00 = TimeUnit.DAYS.toMillis(1);
    public static final long A01 = TimeUnit.HOURS.toMillis(1);
    public static final AtomicInteger A02 = new AtomicInteger(0);

    public static synchronized long A00() {
        long currentTimeMillis;
        synchronized (AnonymousClass1v8.class) {
            currentTimeMillis = System.currentTimeMillis();
        }
        return currentTimeMillis;
    }
}
