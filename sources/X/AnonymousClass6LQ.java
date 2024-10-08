package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.6LQ  reason: invalid class name */
public final class AnonymousClass6LQ {
    public boolean A00;
    public final QuickPerformanceLogger A01;
    public final AnonymousClass6Q8 A02;
    public final ExecutorService A03;

    public AnonymousClass6LQ(QuickPerformanceLogger quickPerformanceLogger, AnonymousClass6Q8 r3) {
        0qQ.A0B(r3, 2);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        0qQ.A07(newSingleThreadExecutor);
        this.A01 = quickPerformanceLogger;
        this.A02 = r3;
        this.A03 = newSingleThreadExecutor;
    }
}
