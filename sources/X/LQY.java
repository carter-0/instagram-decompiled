package X;

import java.util.Map;
import java.util.Set;

public final class LQY {
    public static final Set A05 = 0sc.A07(new C62676Kkc[]{C62676Kkc.LOCAL_COMMENT, C62676Kkc.COMMENT, C62676Kkc.REACTION, C62676Kkc.VIEWER_STAT});
    public L3E A00;
    public C262204Co A01;
    public final boolean A02;
    public final int A03;
    public final Map A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r1 < 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.L3E r8, X.LQY r9, X.C62676Kkc r10) {
        /*
            java.util.Map r5 = r8.A01
            java.lang.Number r0 = X.C51966G9m.A14(r10, r5)
            long r6 = X.JTS.A06(r0)
            java.util.Map r0 = r9.A04
            java.lang.Number r0 = X.C51966G9m.A14(r10, r0)
            r3 = 0
            if (r0 == 0) goto L_0x001f
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0021
        L_0x001c:
            X.0sn r4 = X.0sn.A00
            return r4
        L_0x001f:
            r1 = 0
        L_0x0021:
            long r6 = r6 + r1
            long r1 = android.os.SystemClock.uptimeMillis()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.put(r10, r0)
            java.util.List r0 = r8.A00
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0054
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Jww r0 = (X.C61085Jww) r0
            X.Kkc r0 = r0.A01
            if (r0 != r10) goto L_0x003f
            r3.add(r1)
            goto L_0x003f
        L_0x0054:
            int r0 = r9.A03
            java.util.List r4 = X.00k.A0d(r3, r0)
            java.util.List r0 = r8.A00
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0064:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Jww r0 = (X.C61085Jww) r0
            X.Kkc r0 = r0.A01
            if (r0 == r10) goto L_0x0064
            r3.add(r1)
            goto L_0x0064
        L_0x0079:
            java.util.List r1 = X.0u4.A01(r3)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r8.A00 = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LQY.A00(X.L3E, X.LQY, X.Kkc):java.util.List");
    }

    public LQY(long j, long j2, long j3, boolean z, int i) {
        this.A02 = z;
        this.A03 = i;
        this.A04 = JTS.A0p(C62676Kkc.VIEWER_STAT, Long.valueOf(j3), AnonymousClass7TF.A0y(C62676Kkc.COMMENT, j), AnonymousClass7TF.A0y(C62676Kkc.REACTION, j2));
    }
}
