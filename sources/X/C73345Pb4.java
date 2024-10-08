package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;

/* renamed from: X.Pb4  reason: case insensitive filesystem */
public final class C73345Pb4 implements Runnable {
    public final C278884xg A00;
    public final C70911ORg A01;
    public volatile boolean A02;
    public final /* synthetic */ ODD A03;

    public C73345Pb4(C278884xg r1, C70911ORg oRg, ODD odd) {
        this.A03 = odd;
        this.A01 = oRg;
        this.A00 = r1;
    }

    public final void run() {
        long j;
        if (!this.A02) {
            AnonymousClass0eK r0 = C69716Nqc.A00().A06;
            if (r0 != null) {
                r0.get();
            }
            synchronized (N1P.A02) {
                j = N1P.A01;
                N1P.A01 = j + 1;
            }
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                qPLInstance.markerStart(875314331);
                qPLInstance.markerAnnotate(875314331, "run_count", j);
            }
            0qQ.A07(C69716Nqc.A00().A09.getValue());
            throw AnonymousClass7TE.A11("getRefresher");
        }
    }
}
