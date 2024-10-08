package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.transientanalysis.InstagramTransientNetworkDataCollector;

/* renamed from: X.OtQ  reason: case insensitive filesystem */
public final class C71940OtQ implements C61110lV {
    public final /* synthetic */ QuickPerformanceLogger A00;

    public C71940OtQ(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(1117833225);
        this.A00.markerEnd(11862018, 2);
        AnonymousClass0fD.A0A(615419078, A03);
    }

    public final void onAppForegrounded() {
        int i;
        int A03 = AnonymousClass0fD.A03(-785497900);
        if (((InstagramTransientNetworkDataCollector) InstagramTransientNetworkDataCollector.instance$delegate.getValue())._isTracingActive.get()) {
            i = -1600489670;
        } else {
            this.A00.markerStart(11862018, false);
            i = 979243461;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
