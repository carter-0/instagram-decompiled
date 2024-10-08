package X;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: X.5oN  reason: invalid class name and case insensitive filesystem */
public final class C295525oN {
    public static C295525oN A01;
    public static final RootTelemetryConfiguration A02 = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public RootTelemetryConfiguration A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.5oN, java.lang.Object] */
    public static synchronized C295525oN A00() {
        C295525oN r0;
        synchronized (C295525oN.class) {
            C295525oN r02 = A01;
            r0 = r02;
            if (r02 == null) {
                ? obj = new Object();
                A01 = obj;
                r0 = obj;
            }
        }
        return r0;
    }
}
