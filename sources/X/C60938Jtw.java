package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.Jtw  reason: case insensitive filesystem */
public final class C60938Jtw extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02 = 603995461;
    public final int A03;
    public final QuickPerformanceLogger A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60938Jtw) {
                C60938Jtw jtw = (C60938Jtw) obj;
                if (!(0qQ.A0K(this.A04, jtw.A04) && this.A02 == jtw.A02 && this.A03 == jtw.A03 && this.A00 == jtw.A00 && this.A01 == jtw.A01 && this.A05 == jtw.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, (((((((AnonymousClass7TE.A0K(this.A04) + this.A02) * 31) + this.A03) * 31) + this.A00) * 31) + this.A01) * 31);
    }

    public C60938Jtw(QuickPerformanceLogger quickPerformanceLogger, int i, int i2, int i3, boolean z) {
        this.A04 = quickPerformanceLogger;
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = z;
    }
}
