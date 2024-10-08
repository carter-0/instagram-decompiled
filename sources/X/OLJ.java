package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.ConcurrentHashMap;

public final class OLJ {
    public final C276954uB A00;
    public final C276934u9 A01;
    public final C276904u6 A02 = C276904u6.A05.A00();
    public final QuickPerformanceLogger A03;
    public final ConcurrentHashMap A04;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.4uB, java.lang.Object] */
    public OLJ(QuickPerformanceLogger quickPerformanceLogger, O25 o25) {
        0qQ.A0B(quickPerformanceLogger, 1);
        this.A03 = quickPerformanceLogger;
        this.A01 = new Om4(o25);
        this.A00 = new Object();
        this.A04 = new ConcurrentHashMap();
    }

    public final C14533Txt A00(int i) {
        int i2;
        int i3;
        int i4;
        C276954uB r4 = this.A00;
        r4.now();
        long now = r4.now();
        2Hy r2 = 2Hy.A04;
        long A002 = HSB.A00(now, r2.A03.get(), r2.A02.get());
        synchronized (this) {
            ConcurrentHashMap concurrentHashMap = this.A04;
            i2 = i;
            Integer valueOf = Integer.valueOf(i2);
            Integer num = (Integer) concurrentHashMap.get(valueOf);
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            i4 = i3 + 1;
            C66581MXm.A1S(valueOf, concurrentHashMap, i4);
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A03;
        C276904u6 r6 = this.A02;
        C14533Txt txt = new C14533Txt(r4, this.A01, r6, quickPerformanceLogger, "Remote Presence", i2, i4, r4.now(), A002, true, false);
        r6.A00(txt);
        return txt;
    }
}
