package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.CancellationException;

/* renamed from: X.6MM  reason: invalid class name */
public final class AnonymousClass6MM implements Runnable {
    public int A00;
    public long A01;
    public long A02;
    public boolean A03;
    public long A04;
    public C262204Co A05;
    public final int A06;
    public final long A07;
    public final Handler A08 = new Handler(Looper.getMainLooper());
    public final 0sP A09;
    public final long A0A;
    public final long A0B;
    public final C3034568w A0C;
    public final C262224Cq A0D;

    public AnonymousClass6MM(C3034568w r3, 0sP r4, C262224Cq r5, int i, long j, long j2, long j3) {
        0qQ.A0B(r3, 1);
        this.A0C = r3;
        this.A0D = r5;
        this.A0A = j;
        this.A0B = j2;
        this.A07 = j3;
        this.A06 = i;
        this.A09 = r4;
    }

    public final void A00() {
        this.A03 = true;
        this.A08.removeCallbacks(this);
        C262204Co r4 = this.A05;
        if (r4 != null) {
            this.A01 = SystemClock.uptimeMillis() - this.A04;
            r4.AG7((CancellationException) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r7 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0010
            r1 = 1757694281(0x68c44949, float:7.4154856E24)
            java.lang.String r0 = "ResponsiveAndIdleDetector.run"
            X.0fS.A01(r0, r1)
        L_0x0010:
            boolean r0 = r9.A03     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0015
            goto L_0x007e
        L_0x0015:
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x008b }
            long r0 = r9.A02     // Catch:{ all -> 0x008b }
            long r3 = r3 - r0
            long r1 = r9.A0B     // Catch:{ all -> 0x008b }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            int r5 = r9.A00     // Catch:{ all -> 0x008b }
            long r3 = (long) r5     // Catch:{ all -> 0x008b }
            long r1 = r9.A0A     // Catch:{ all -> 0x008b }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x003b
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x008b }
            r9.A02 = r0     // Catch:{ all -> 0x008b }
            int r0 = r5 + 1
            r9.A00 = r0     // Catch:{ all -> 0x008b }
            android.os.Handler r0 = r9.A08     // Catch:{ all -> 0x008b }
            r0.post(r9)     // Catch:{ all -> 0x008b }
            goto L_0x0074
        L_0x003b:
            X.68w r6 = r9.A0C     // Catch:{ all -> 0x008b }
            int r0 = r9.A00     // Catch:{ all -> 0x008b }
            long r4 = (long) r0     // Catch:{ all -> 0x008b }
            long r2 = r9.A0A     // Catch:{ all -> 0x008b }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 > 0) goto L_0x0048
            r0 = 1
        L_0x0048:
            com.facebook.quicklog.QuickPerformanceLogger r3 = r6.A03     // Catch:{ all -> 0x008b }
            int r2 = r6.A01     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = "responsive! Waiting for delay..."
        L_0x0050:
            r0 = 220138478(0xd1f0bee, float:4.9010018E-31)
            r3.markerPoint(r0, r2, r1)     // Catch:{ all -> 0x008b }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x008b }
            r9.A04 = r0     // Catch:{ all -> 0x008b }
            X.4Cq r3 = r9.A0D     // Catch:{ all -> 0x008b }
            r1 = 0
            r0 = 49
            X.9Ju r2 = new X.9Ju     // Catch:{ all -> 0x008b }
            r2.<init>(r9, r1, r0)     // Catch:{ all -> 0x008b }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x008b }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x008b }
            X.1Er r0 = X.1Eo.A03(r0, r1, r2, r3)     // Catch:{ all -> 0x008b }
            r9.A05 = r0     // Catch:{ all -> 0x008b }
            goto L_0x0074
        L_0x0071:
            java.lang.String r1 = "not_responsive (hit max pings). Waiting for delay..."
            goto L_0x0050
        L_0x0074:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x008a
            r0 = -2143604360(0xffffffff803b3178, float:-5.43604E-39)
            goto L_0x0087
        L_0x007e:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x008a
            r0 = -1453054475(0xffffffffa96425f5, float:-5.0659092E-14)
        L_0x0087:
            X.0fS.A00(r0)
        L_0x008a:
            return
        L_0x008b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r7)
            if (r0 == 0) goto L_0x0098
            r0 = 829283886(0x316dde2e, float:3.4614334E-9)
            X.0fS.A00(r0)
        L_0x0098:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MM.run():void");
    }
}
