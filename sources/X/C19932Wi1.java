package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wi1  reason: case insensitive filesystem */
public final /* synthetic */ class C19932Wi1 implements Runnable {
    public final /* synthetic */ WH3 A00;

    public /* synthetic */ C19932Wi1(WH3 wh3) {
        this.A00 = wh3;
    }

    public final void run() {
        WH3 wh3 = this.A00;
        long min = Math.min(wh3.A05, WH3.A0A);
        if (min < 0) {
            min = 0;
        }
        double min2 = Math.min(wh3.A01, 10000.0d);
        double min3 = Math.min(wh3.A00, 10000.0d);
        long min4 = Math.min(TimeUnit.NANOSECONDS.toMillis(wh3.A03 - wh3.A04), WH3.A0B);
        if (min4 < 0) {
            min4 = 0;
        }
        VUe vUe = wh3.A08;
        int i = wh3.A02;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = vUe.A00;
        MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(15990796);
        withMarker.annotate("1_frame_drop", min2);
        withMarker.annotate("4_frame_drop", min3);
        withMarker.annotate("total_time_spent", min4);
        withMarker.annotate("tracker_version", "frame_metrics");
        double[] dArr = vUe.A02;
        if (dArr != null) {
            withMarker.annotate("supported_refresh_rates", dArr);
        }
        withMarker.annotate("total_stall_time", min);
        withMarker.annotate("drop_count", i);
        withMarker.annotate(C273654mx.A00(403), (String) null);
        withMarker.markerEditingCompleted();
        lightweightQuickPerformanceLogger.markerEnd(15990796, 2);
        wh3.A05 = 0;
        wh3.A01 = 0.0d;
        wh3.A00 = 0.0d;
        wh3.A02 = 0;
        wh3.A04 = 0;
        wh3.A03 = 0;
    }
}
