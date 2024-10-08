package X;

public final class Q13 {
    public final AnonymousClass1C7 A00 = AnonymousClass1C7.A00();

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0062, code lost:
        r2 = r2 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(java.lang.String r7, int r8, byte[] r9) {
        /*
            r6 = this;
            r5 = 162760(0x27bc8, float:2.28075E-40)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            int r3 = r5 + r8
            int r3 = r3 - r0
            java.util.Locale r2 = java.util.Locale.US
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = X.C51968G9o.A1Z(r0, r3)
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = "bytes=%d-%d"
            java.lang.String r2 = X.Pxe.A12(r2, r0, r1)
            X.1Pq r1 = X.Pxf.A0S()
            r1.A02 = r7
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r1.A01(r0)
            java.lang.String r0 = "Range"
            r1.A03(r0, r2)
            X.1QS r2 = r1.A00()
            X.1QT r1 = new X.1QT
            r1.<init>()
            X.1CE r0 = X.1CE.A08
            r1.A04 = r0
            X.1Fe r0 = X.1Fe.A02
            r1.A03 = r0
            X.1QX r1 = X.Pxf.A0R(r2, r1)
            X.1C7 r0 = r6.A00
            X.2ZL r4 = r0.A01(r1)
            X.0qQ.A07(r4)
            X.1Qb r0 = r4.A00()
            if (r0 == 0) goto L_0x009e
            java.io.InputStream r3 = r0.AjD()
            r2 = 0
            r0 = 162760(0x27bc8, float:2.28075E-40)
        L_0x005b:
            int r1 = r3.read(r9, r2, r0)     // Catch:{ all -> 0x0097 }
            r0 = -1
            if (r1 == r0) goto L_0x0068
            int r2 = r2 + r1
            int r0 = r5 - r2
            if (r0 <= 0) goto L_0x0068
            goto L_0x005b
        L_0x0068:
            r3.close()
            java.lang.String r0 = "content-range"
            X.1Fn r3 = r4.A01(r0)
            if (r3 == 0) goto L_0x008f
            java.lang.String r2 = r3.A01
            X.0qQ.A06(r2)
            r1 = 47
            r0 = 0
            int r0 = X.00l.A04(r2, r1, r0)
            java.lang.String r1 = r3.A01
            X.0qQ.A06(r1)
            int r0 = r0 + 1
            java.lang.String r0 = X.C66580MXl.A0z(r1, r0)
            int r0 = java.lang.Integer.parseInt(r0)
            return r0
        L_0x008f:
            java.lang.String r0 = "no content-range header"
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q13.A00(java.lang.String, int, byte[]):int");
    }
}
