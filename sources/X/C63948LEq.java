package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.LEq  reason: case insensitive filesystem */
public final class C63948LEq {
    public final int A00;
    public final LightweightQuickPerformanceLogger A01;

    public /* synthetic */ C63948LEq(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int A06 = 2SP.A01.A06(0, 9999999);
        this.A01 = lightweightQuickPerformanceLogger;
        this.A00 = A06;
    }

    public final void A00(String str, double d) {
        0qQ.A0B(str, 0);
        this.A01.markerAnnotate(873412642, this.A00, str, d);
    }

    public final void A01(String str, String str2) {
        0qQ.A0B(str2, 1);
        this.A01.markerAnnotate(873412642, this.A00, str, str2);
    }
}
