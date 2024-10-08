package X;

import androidx.media3.common.util.Util;

/* renamed from: X.XvQ  reason: case insensitive filesystem */
public final class C22100XvQ implements YA3 {
    public final int A00;
    public final C21505XdL A01;
    public final C11389SRd A02 = new C11389SRd();

    public final void DiN() {
        this.A02.A0Q(Util.A07, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r13 == -9223372036854775807L) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        return new X.Xn1(r13, r15 + r0, -2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        return X.Xn1.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Xn1 EKq(X.C13910TlA r26, long r27) {
        /*
            r25 = this;
            r4 = r26
            long r15 = r4.Bdl()
            r2 = 112800(0x1b8a0, double:5.57306E-319)
            long r0 = r4.getLength()
            long r0 = r0 - r15
            long r2 = java.lang.Math.min(r2, r0)
            int r1 = (int) r2
            r8 = r25
            X.SRd r3 = r8.A02
            r3.A0M(r1)
            byte[] r0 = r3.A02
            r11 = 0
            r4.E2F(r0, r11, r1)
            int r7 = r3.A00
            r0 = -1
            r20 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -1
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0030:
            int r6 = r3.A00
            int r2 = r3.A01
            int r6 = r6 - r2
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 < r9) goto L_0x008c
            byte[] r10 = r3.A02
        L_0x003b:
            if (r2 >= r7) goto L_0x0046
            byte r9 = r10[r2]
            r6 = 71
            if (r9 == r6) goto L_0x0046
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0046:
            int r6 = r2 + 188
            if (r6 > r7) goto L_0x008c
            int r0 = r8.A00
            long r0 = X.XUH.A00(r3, r2, r0)
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r9 == 0) goto L_0x007a
            X.XdL r9 = r8.A01
            long r18 = r9.A02(r0)
            int r0 = (r18 > r27 ? 1 : (r18 == r27 ? 0 : -1))
            if (r0 <= 0) goto L_0x006e
            int r0 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x007f
            r22 = -1
            X.Xn1 r12 = new X.Xn1
            r17 = r12
            r20 = r15
            r17.<init>(r18, r20, r22)
            return r12
        L_0x006e:
            r4 = 100000(0x186a0, double:4.94066E-319)
            long r4 = r4 + r18
            int r0 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            long r4 = (long) r2
            if (r0 > 0) goto L_0x007f
            r13 = r18
        L_0x007a:
            r3.A0O(r6)
            long r0 = (long) r6
            goto L_0x0030
        L_0x007f:
            long r15 = r15 + r4
            X.Xn1 r12 = new X.Xn1
            r19 = r12
            r22 = r15
            r24 = r11
            r19.<init>(r20, r22, r24)
            return r12
        L_0x008c:
            int r2 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x0099
            long r15 = r15 + r0
            r17 = -2
            X.Xn1 r12 = new X.Xn1
            r12.<init>(r13, r15, r17)
            return r12
        L_0x0099:
            X.Xn1 r12 = X.Xn1.A03
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22100XvQ.EKq(X.TlA, long):X.Xn1");
    }

    public C22100XvQ(C21505XdL xdL, int i) {
        this.A00 = i;
        this.A01 = xdL;
    }
}
