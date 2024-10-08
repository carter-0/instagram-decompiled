package X;

import android.os.Handler;

public final class LFC {
    public MU4 A00;
    public final 0wR A01;
    public final 0wR A02;
    public final boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4.equals(r1) != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.LFH r4) {
        /*
            r3 = this;
            boolean r0 = r3.A03
            r2 = 1
            X.0wR r1 = r3.A01
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x001a
            java.lang.Object r1 = r1.A01
            X.0qQ.A0A(r1)
            X.LFH r1 = (X.LFH) r1
        L_0x0012:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            return r2
        L_0x001c:
            java.lang.Object r1 = r1.A01
            X.LFH r1 = (X.LFH) r1
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x001a
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LFC.A00(X.LFH):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r1 > 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r3 > 0) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LFC(X.MU4 r8, java.lang.Long r9, java.lang.Long r10, boolean r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.A00 = r8
            r7.A03 = r11
            r0 = 0
            android.os.Handler r6 = X.AnonymousClass7TF.A0D()
            X.Ljq r5 = new X.Ljq
            r5.<init>(r7, r0)
            if (r9 == 0) goto L_0x0045
            long r1 = r9.longValue()
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
        L_0x001d:
            X.0wR r0 = new X.0wR
            r0.<init>(r6, r5, r1)
            r7.A01 = r0
            r0 = 1
            android.os.Handler r6 = X.AnonymousClass7TF.A0D()
            X.Ljq r5 = new X.Ljq
            r5.<init>(r7, r0)
            if (r10 == 0) goto L_0x0042
            long r3 = r10.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
        L_0x003a:
            X.0wR r0 = new X.0wR
            r0.<init>(r6, r5, r3)
            r7.A02 = r0
            return
        L_0x0042:
            r3 = 200(0xc8, double:9.9E-322)
            goto L_0x003a
        L_0x0045:
            r1 = 200(0xc8, double:9.9E-322)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LFC.<init>(X.MU4, java.lang.Long, java.lang.Long, boolean):void");
    }

    public final boolean A01(LFH lfh) {
        boolean z = !A00(lfh);
        if (z) {
            this.A01.A01(lfh);
            this.A02.A01(lfh);
        }
        0qQ.A0B(lfh, 0);
        if (lfh.A03 || lfh.A04) {
            0wR r2 = this.A01;
            if (r2.A02) {
                Handler handler = r2.A05;
                Runnable runnable = r2.A07;
                handler.removeCallbacks(runnable);
                runnable.run();
            }
            0wR r22 = this.A02;
            if (r22.A02) {
                Handler handler2 = r22.A05;
                Runnable runnable2 = r22.A07;
                handler2.removeCallbacks(runnable2);
                runnable2.run();
            }
        }
        return z;
    }
}
