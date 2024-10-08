package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;

/* renamed from: X.4wl  reason: invalid class name and case insensitive filesystem */
public final class C278364wl extends 0zn {
    public C278374wm A00;

    public final 0Xc getListenerMarkers() {
        int[] iArr = this.A00.A01;
        return new 0Xc(Arrays.copyOf(iArr, iArr.length), (int[]) null);
    }

    public final String getName() {
        return "touch_responsiveness_interesting_trace_marker";
    }

    public final void onMarkerStart(0XY r6) {
        C278374wm r1 = this.A00;
        0qQ.A0B(r6, 0);
        QuickPerformanceLogger quickPerformanceLogger = r1.A05;
        if (quickPerformanceLogger != null) {
            C278374wm.A06.A09((long) r6.BHz(), Long.valueOf(quickPerformanceLogger.currentMonotonicTimestamp()));
        }
    }

    public final void onMarkerStop(0XY r9) {
        C278374wm r7 = this.A00;
        0qQ.A0B(r9, 0);
        QuickPerformanceLogger quickPerformanceLogger = r7.A05;
        if (quickPerformanceLogger != null) {
            int BHz = r9.BHz();
            01c r3 = C278374wm.A06;
            long j = (long) BHz;
            Number number = (Number) r3.A05(j);
            if (number != null) {
                r3.A08(j);
                if (quickPerformanceLogger.currentMonotonicTimestamp() - number.longValue() >= r7.A00) {
                    for (int markerAnnotate : r7.A02) {
                        quickPerformanceLogger.markerAnnotate(markerAnnotate, "interesting_trace", true);
                    }
                }
            }
        }
    }

    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        C278374wm r1 = this.A00;
        0qQ.A0B(quickPerformanceLogger, 0);
        r1.A05 = quickPerformanceLogger;
    }
}
