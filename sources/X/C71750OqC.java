package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.OqC  reason: case insensitive filesystem */
public final class C71750OqC implements C74436Pur {
    public static final C71750OqC A00 = new Object();

    public final String BdN() {
        return "pushability_healthcheck";
    }

    public final Object E4V(N31 n31) {
        0qQ.A0B(n31, 0);
        try {
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                qPLInstance.markerEnd(875301323, 2);
            }
        } catch (Throwable unused) {
        }
        return n31;
    }

    public final boolean Esm(N31 n31) {
        0qQ.A0B(n31, 0);
        Long l = n31.A04.A00;
        if (l == null || l.longValue() != 52) {
            return false;
        }
        return true;
    }
}
