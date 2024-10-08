package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.Mnt  reason: case insensitive filesystem */
public final class C67438Mnt implements C228242l4 {
    public 0rq A00;

    public final void AJE(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        0qQ.A0B(lightweightQuickPerformanceLogger, 0);
        0rq r0 = this.A00;
        if (r0 != null) {
            r0.A01(lightweightQuickPerformanceLogger);
        }
    }

    public final void CwG(boolean z) {
        if (z) {
            this.A00 = new 0rq();
        }
    }

    public final void D8V() {
        0rq r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
    }

    public final String getDestination() {
        return "explore_popular";
    }
}
