package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.4sO  reason: invalid class name and case insensitive filesystem */
public final class C276044sO implements 2Kw {
    public final /* synthetic */ 1xi A00;
    public final /* synthetic */ QuickPerformanceLogger A01;

    public C276044sO(1xi r1, QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = r1;
        this.A01 = quickPerformanceLogger;
    }

    public final void invoke(Throwable th) {
        0KC.A0C("PushabilityChecker", "check pushability failed");
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerAnnotate(875301323, "error_message", th.getMessage());
            quickPerformanceLogger.markerEnd(875301323, 3);
        }
    }
}
