package X;

import android.os.Handler;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.To6  reason: case insensitive filesystem */
public final class C14004To6 {
    public int A00;
    public boolean A01;
    public final Handler A02;
    public final QuickPerformanceLogger A03;
    public final AnonymousClass2Yx A04;

    public C14004To6(Handler handler, QuickPerformanceLogger quickPerformanceLogger, AnonymousClass2Yx r4) {
        boolean A1Y = C51970G9q.A1Y(quickPerformanceLogger);
        this.A02 = handler;
        this.A03 = quickPerformanceLogger;
        this.A04 = r4;
        this.A00 = A1Y ? 1 : 0;
    }
}
