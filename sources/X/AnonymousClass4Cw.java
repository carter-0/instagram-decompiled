package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.4Cw  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4Cw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ 1AA A01;
    public final /* synthetic */ LightweightQuickPerformanceLogger A02;

    public /* synthetic */ AnonymousClass4Cw(1AA r1, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i) {
        this.A01 = r1;
        this.A02 = lightweightQuickPerformanceLogger;
        this.A00 = i;
    }

    public final void run() {
        1AA r0 = this.A01;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
        int i = this.A00;
        r0.A0C();
        lightweightQuickPerformanceLogger.markerPoint(13644804, i, "scheduled_cpp_manager_created");
    }
}
