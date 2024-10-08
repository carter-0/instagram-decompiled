package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.LaX  reason: case insensitive filesystem */
public final class C64355LaX implements B2N {
    public final /* synthetic */ C64164LRf A00;

    public C64355LaX(C64164LRf lRf) {
        this.A00 = lRf;
    }

    public final void DjR(C352728Ep r4) {
        QuickPerformanceLogger quickPerformanceLogger = this.A00.A0G;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(603995461, "effect_download_end");
            quickPerformanceLogger.markerPoint(603995461, "effect_load_start");
        }
    }

    public final void Doe(String str) {
        C64164LRf lRf = this.A00;
        C62977KpT.A00(lRf, AnonymousClass05K.A01);
        QuickPerformanceLogger quickPerformanceLogger = lRf.A0G;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(603995461, "effect_load_end");
        }
    }

    public final void onFailure(Throwable th) {
        C62977KpT.A00(this.A00, AnonymousClass05K.A0C);
    }
}
