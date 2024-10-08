package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.To9  reason: case insensitive filesystem */
public final class C14007To9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C277344ux A01;

    public C14007To9(C277344ux r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        QuickPerformanceLogger quickPerformanceLogger = this.A01.A05;
        quickPerformanceLogger.markerEnd(566762171, this.A00, 2, quickPerformanceLogger.currentMonotonicTimestampNanos(), TimeUnit.NANOSECONDS);
    }
}
