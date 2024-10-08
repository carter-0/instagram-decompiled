package X;

import android.content.Context;
import android.view.Choreographer;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.concurrent.TimeUnit;

public final class WH2 implements AnonymousClass2nZ {
    public static final long A07 = TimeUnit.MINUTES.toNanos(1);
    public double A00;
    public double A01;
    public long A02;
    public boolean A03 = false;
    public final double A04;
    public final VUe A05;
    public final AnonymousClass0KJ A06;

    public final void APC() {
        if (this.A03) {
            this.A03 = false;
            this.A06.APC();
            VUe vUe = this.A05;
            double min = Math.min(this.A01, 3600.0d);
            double min2 = Math.min(this.A00, 1000.0d);
            long millis = TimeUnit.NANOSECONDS.toMillis(Math.min(this.A02, A07));
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = vUe.A00;
            MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(15990796);
            withMarker.annotate("1_frame_drop", min);
            withMarker.annotate("4_frame_drop", min2);
            withMarker.annotate("total_time_spent", millis);
            withMarker.annotate("tracker_version", "frame_based");
            double[] dArr = vUe.A02;
            if (dArr != null) {
                withMarker.annotate("supported_refresh_rates", dArr);
            }
            withMarker.annotate(C273654mx.A00(403), (String) null);
            withMarker.markerEditingCompleted();
            lightweightQuickPerformanceLogger.markerEnd(15990796, 2);
            this.A01 = 0.0d;
            this.A00 = 0.0d;
            this.A02 = 0;
        }
    }

    public final void ARH() {
        if (!this.A03) {
            this.A03 = true;
            this.A06.ARH();
            VUe vUe = this.A05;
            vUe.A00.markerStart(15990796, "module", vUe.A01);
        }
    }

    public WH2(Context context, VUe vUe) {
        this.A05 = vUe;
        this.A06 = new WH5(Choreographer.getInstance(), new WH1(this));
        AnonymousClass0KL r0 = AnonymousClass0KL.A01;
        if (r0 == null) {
            r0 = new AnonymousClass0KL();
            AnonymousClass0KL.A01 = r0;
        }
        this.A04 = (double) r0.A00(context);
        this.A01 = 0.0d;
        this.A00 = 0.0d;
        this.A02 = 0;
    }
}
