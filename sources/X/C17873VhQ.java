package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.VhQ  reason: case insensitive filesystem */
public final class C17873VhQ {
    public static int A04;
    public String A00;
    public String A01;
    public final int A02;
    public final QuickPerformanceLogger A03;

    public final void A00(int i) {
        if (this.A01 == null || this.A00 == null) {
            throw new IllegalStateException("Must call onCreate() before using logger");
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A03;
        int i2 = this.A02;
        quickPerformanceLogger.markerStart(i, i2);
        quickPerformanceLogger.markerAnnotate(i, i2, "surface", this.A01);
        quickPerformanceLogger.markerAnnotate(i, i2, "renderer", this.A00);
    }

    public C17873VhQ(QuickPerformanceLogger quickPerformanceLogger) {
        int i = A04;
        A04 = i + 1;
        this.A02 = i;
        this.A03 = quickPerformanceLogger;
    }
}
