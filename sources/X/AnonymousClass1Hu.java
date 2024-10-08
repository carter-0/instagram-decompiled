package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.1Hu  reason: invalid class name */
public final class AnonymousClass1Hu {
    public Handler A00;
    public HandlerThread A01;
    public AnonymousClass9BT A02;
    public final 14y A03;
    public volatile QuickPerformanceLogger A04;

    public AnonymousClass1Hu() {
        0wb r2 = 0wb.A01;
        14y r1 = 14y.A05;
        if (r1 == null) {
            r1 = new 14y(r2);
            14y.A05 = r1;
        }
        if (!r1.A03) {
            r1.A00 = r2;
            r1.A03 = true;
        }
        this.A03 = r1;
    }
}
