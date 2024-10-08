package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3vU  reason: invalid class name and case insensitive filesystem */
public final class C256263vU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ 1wH A02;
    public final /* synthetic */ Map A03;

    public C256263vU(1wH r1, Map map, int i, long j) {
        this.A02 = r1;
        this.A00 = i;
        this.A03 = map;
        this.A01 = j;
    }

    public final void run() {
        1wH r1 = this.A02;
        int i = this.A00;
        Map map = this.A03;
        long j = this.A01;
        if (1wH.A01(r1) && i != -1) {
            Map map2 = r1.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map2.containsKey(valueOf)) {
                QuickPerformanceLogger quickPerformanceLogger = r1.A01;
                int A002 = C256313vZ.A00(r1.A03);
                quickPerformanceLogger.markerStart(A002, i, j, TimeUnit.NANOSECONDS);
                r1.A00.postDelayed(new C256323va(r1, i), 10000);
                C256333vb.A00(quickPerformanceLogger, map, A002, i);
                map2.put(valueOf, new HashSet());
            }
        }
    }
}
