package X;

import android.view.FrameMetrics;
import android.view.Window;
import java.util.concurrent.TimeUnit;

public final class WCP implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ WH3 A00;

    public WCP(WH3 wh3) {
        this.A00 = wh3;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(11) - frameMetrics.getMetric(10);
        if (metric > 0) {
            WH3 wh3 = this.A00;
            wh3.A05 += TimeUnit.NANOSECONDS.toMillis(metric);
            wh3.A01 += Math.min(((double) metric) / 1.6666666E7d, 1000.0d);
        }
        WH3 wh32 = this.A00;
        if (metric >= 66666664) {
            wh32.A00 += Math.min(((double) metric) / 6.6666664E7d, 1000.0d);
        }
        wh32.A02 += i;
    }
}
