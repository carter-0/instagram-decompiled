package X;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.0nl  reason: invalid class name and case insensitive filesystem */
public final class C61560nl {
    public static C61560nl A01;
    public final ScheduledThreadPoolExecutor A00 = new ScheduledThreadPoolExecutor(3);

    public static synchronized C61560nl A00() {
        C61560nl r0;
        synchronized (C61560nl.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C61560nl();
                A01 = r0;
            }
        }
        return r0;
    }
}
