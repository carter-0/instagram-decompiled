package X;

import android.content.Context;
import android.view.WindowManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2nl  reason: invalid class name and case insensitive filesystem */
public abstract class C229622nl {
    public static final long A00 = TimeUnit.SECONDS.toNanos(1);
    public static final AtomicInteger A01 = new AtomicInteger(-1);

    public static final int A00(Context context) {
        double A002;
        AtomicInteger atomicInteger = A01;
        int i = atomicInteger.get();
        if (i != -1) {
            return i;
        }
        Object systemService = context.getSystemService("window");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        double refreshRate = (double) ((WindowManager) systemService).getDefaultDisplay().getRefreshRate();
        if (refreshRate < 0.0d) {
            A002 = 60.0d;
        } else {
            A002 = C229632nm.A00(refreshRate, 30.0d, 240.0d);
        }
        int A003 = AnonymousClass1GB.A00(((double) A00) / A002);
        atomicInteger.compareAndSet(-1, A003);
        return A003;
    }
}
