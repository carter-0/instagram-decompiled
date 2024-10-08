package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.6L8  reason: invalid class name */
public final class AnonymousClass6L8 {
    public static final Map A04 = 0Yt.A06(new 0eP[]{new 0eP("partially_enter_viewport", 1), new 0eP("fully_enter_viewport", 1), new 0eP("document_fetch_start", 1), new 0eP("document_fetch_success", 1), new 0eP("document_fetch_fail", 1), new 0eP("assets_fetch_start", 1), new 0eP("assets_fetch_success", 1), new 0eP("assets_fetch_fail", 1)});
    public final C379599Un A00;
    public final QuickPerformanceLogger A01;
    public final C379619Up A02;
    public final ExecutorService A03;

    public static final void A00(AnonymousClass6L8 r5, String str, String str2) {
        AnonymousClass6L8 r1 = r5;
        A01(r1, new C379609Uo(r1, str, str2, r5.A01.currentMonotonicTimestampNanos()));
    }

    public static final void A01(AnonymousClass6L8 r1, C62320sa r2) {
        ExecutorService executorService = r1.A03;
        if (executorService.isTerminated() || executorService.isShutdown()) {
            0wb.A03("ShowreelNativePerformanceLogger", "Trying to log, but executor is terminated or shutdown");
        } else {
            executorService.execute(new B7B(r2));
        }
    }

    public final void A02() {
        A01(this, new C377289Lg(this, this.A01.currentMonotonicTimestampNanos(), 1));
    }

    public final void A03() {
        A01(this, new C377289Lg(this, this.A01.currentMonotonicTimestampNanos(), 2));
    }

    public AnonymousClass6L8(C379599Un r1, QuickPerformanceLogger quickPerformanceLogger, C379619Up r3, ExecutorService executorService) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = quickPerformanceLogger;
        this.A03 = executorService;
    }
}
