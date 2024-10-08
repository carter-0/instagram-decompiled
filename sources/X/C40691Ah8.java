package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.Ah8  reason: case insensitive filesystem */
public final class C40691Ah8 implements C228242l4 {
    public 0rq A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public C40691Ah8(String str) {
        0qQ.A0B(str, 1);
        this.A03 = str;
    }

    public final void AJE(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        0qQ.A0B(lightweightQuickPerformanceLogger, 0);
        0rq r0 = this.A00;
        if (r0 != null) {
            r0.A01(lightweightQuickPerformanceLogger);
        }
    }

    public final void CwG(boolean z) {
        this.A01 = true;
        this.A02 = z;
        if (z) {
            this.A00 = new 0rq();
        }
    }

    public final void D8V() {
        if (this.A02) {
            this.A01 = false;
        }
        0rq r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
    }

    public final String getDestination() {
        return this.A03;
    }
}
