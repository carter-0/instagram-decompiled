package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.PRi  reason: case insensitive filesystem */
public final class C72975PRi implements C228242l4 {
    public static final O39 A02 = new Object();
    public 0rq A00;
    public final String A01;

    public final void AJE(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        0qQ.A0B(lightweightQuickPerformanceLogger, 0);
        0rq r0 = this.A00;
        if (r0 != null) {
            r0.A01(lightweightQuickPerformanceLogger);
        }
    }

    public final void D8V() {
        this.A00 = null;
    }

    public final void CwG(boolean z) {
        this.A00 = new 0rq();
    }

    public final String getDestination() {
        return this.A01;
    }

    public C72975PRi(String str) {
        this.A01 = str;
    }
}
