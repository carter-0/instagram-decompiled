package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

public final class S7W {
    public final LightweightQuickPerformanceLogger A00;

    public S7W(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        0qQ.A0B(lightweightQuickPerformanceLogger, 1);
        this.A00 = lightweightQuickPerformanceLogger;
    }

    public final void A00(1QS r4, String str) {
        0qQ.A0B(r4, 0);
        if (SRB.A0k) {
            this.A00.markerPoint(677319650, r4.hashCode(), str);
        }
        this.A00.markerPoint(926483817, r4.hashCode(), str);
    }

    public final void A01(1QS r4, String str, int i) {
        0qQ.A0B(r4, 0);
        if (SRB.A0k) {
            this.A00.markerAnnotate(677319650, r4.hashCode(), str, i);
        }
        this.A00.markerAnnotate(926483817, r4.hashCode(), str, i);
    }

    public final void A02(1QS r7, String str, long j) {
        0qQ.A0B(r7, 0);
        String str2 = str;
        long j2 = j;
        if (SRB.A0k) {
            this.A00.markerAnnotate(677319650, r7.hashCode(), str2, j2);
        }
        this.A00.markerAnnotate(926483817, r7.hashCode(), str2, j2);
    }

    public final void A03(1QS r8, String str, long j, TimeUnit timeUnit) {
        0qQ.A0B(r8, 0);
        long j2 = j;
        if (j != -1 && j != 0) {
            String str2 = str;
            TimeUnit timeUnit2 = timeUnit;
            if (SRB.A0k) {
                this.A00.markerPoint(677319650, r8.hashCode(), str2, j2, timeUnit2);
            }
            this.A00.markerPoint(926483817, r8.hashCode(), str2, j2, timeUnit2);
        }
    }

    public final void A04(1QS r4, String str, String str2) {
        0qQ.A0B(r4, 0);
        if (SRB.A0k) {
            this.A00.markerAnnotate(677319650, r4.hashCode(), str, str2);
        }
        this.A00.markerAnnotate(926483817, r4.hashCode(), str, str2);
    }

    public final void A05(1QS r4, String str, boolean z) {
        0qQ.A0B(r4, 0);
        if (SRB.A0k) {
            this.A00.markerAnnotate(677319650, r4.hashCode(), str, z);
        }
        this.A00.markerAnnotate(926483817, r4.hashCode(), str, z);
    }

    public final void A06(1QS r4, short s) {
        if (SRB.A0k) {
            this.A00.markerEnd(677319650, r4.hashCode(), s);
        }
        this.A00.markerEnd(926483817, r4.hashCode(), s);
    }
}
