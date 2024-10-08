package X;

import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: X.3Ls  reason: invalid class name and case insensitive filesystem */
public final class C240653Ls implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ C240643Lr A00;

    public C240653Ls(C240643Lr r1) {
        this.A00 = r1;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        AnonymousClass591 r1 = this.A00.A00;
        if (r1 != null) {
            FrameMetrics frameMetrics2 = frameMetrics;
            0qQ.A0A(frameMetrics2);
            0qQ.A0B(frameMetrics2, 0);
            C292615jF r6 = new C292615jF(frameMetrics2.getMetric(0), frameMetrics2.getMetric(1), frameMetrics2.getMetric(2), frameMetrics2.getMetric(3), frameMetrics2.getMetric(4), frameMetrics2.getMetric(5), frameMetrics2.getMetric(6), frameMetrics2.getMetric(7), frameMetrics2.getMetric(8));
            r1.A00++;
            r1.A03.A01(r6);
            float f = (float) r6.A0B;
            float f2 = r1.A04;
            if (f > f2) {
                int min = Math.min((int) ((f / f2) - 1.0f), 100);
                r1.A02 += min;
                if (min >= 4) {
                    r1.A05.A01(r6);
                    r1.A01 += min / 4;
                }
            }
        }
    }
}
