package X;

/* renamed from: X.4hp  reason: invalid class name and case insensitive filesystem */
public abstract class C271054hp {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080 A[Catch:{ IOException -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088 A[Catch:{ IOException -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[Catch:{ IOException -> 0x00bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.util.List r12) {
        /*
            r11 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x00bf }
            r3.<init>()     // Catch:{ IOException -> 0x00bf }
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x00bf }
            X.17W r2 = r0.A0A(r3)     // Catch:{ IOException -> 0x00bf }
            r2.A0b()     // Catch:{ IOException -> 0x00bf }
            java.util.Iterator r10 = r12.iterator()     // Catch:{ IOException -> 0x00bf }
        L_0x0013:
            boolean r0 = r10.hasNext()     // Catch:{ IOException -> 0x00bf }
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r8 = r10.next()     // Catch:{ IOException -> 0x00bf }
            X.1Xg r8 = (X.1Xg) r8     // Catch:{ IOException -> 0x00bf }
            java.lang.Integer r9 = r8.A08     // Catch:{ IOException -> 0x00bf }
            X.1Xn r7 = r8.A05     // Catch:{ IOException -> 0x00bf }
            X.1Xj r1 = X.1Xi.A02(r7)     // Catch:{ IOException -> 0x00bf }
            r6 = 41
            if (r1 == 0) goto L_0x0035
            r0 = 1
            X.1Xy r1 = r1.A0C     // Catch:{ IOException -> 0x00bf }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x00bf }
            r1.Eqv(r0)     // Catch:{ IOException -> 0x00bf }
        L_0x0035:
            r2.A0c()     // Catch:{ IOException -> 0x00bf }
            X.1UQ r0 = r8.A06     // Catch:{ IOException -> 0x00bf }
            int r5 = r0.ordinal()     // Catch:{ IOException -> 0x00bf }
            r4 = 43
            if (r5 == r6) goto L_0x005c
            if (r5 == r4) goto L_0x0045
            goto L_0x0075
        L_0x0045:
            X.1Xj r0 = X.1Xi.A02(r7)     // Catch:{ IOException -> 0x00bf }
            if (r0 == 0) goto L_0x0073
            com.google.common.collect.ImmutableList r0 = r0.A1D()     // Catch:{ IOException -> 0x00bf }
            java.lang.Object r0 = X.00k.A0J(r0)     // Catch:{ IOException -> 0x00bf }
            X.1Xj r0 = (X.1Xj) r0     // Catch:{ IOException -> 0x00bf }
            if (r0 == 0) goto L_0x0073
            java.lang.String r1 = r0.getId()     // Catch:{ IOException -> 0x00bf }
            goto L_0x0077
        L_0x005c:
            X.Gz1 r0 = r8.A01()     // Catch:{ IOException -> 0x00bf }
            java.util.List r0 = r0.A0B     // Catch:{ IOException -> 0x00bf }
            java.lang.Object r0 = X.00k.A0J(r0)     // Catch:{ IOException -> 0x00bf }
            X.Hpk r0 = (X.C55923Hpk) r0     // Catch:{ IOException -> 0x00bf }
            if (r0 == 0) goto L_0x0073
            X.1Xj r0 = r0.A00()     // Catch:{ IOException -> 0x00bf }
            java.lang.String r1 = r0.getId()     // Catch:{ IOException -> 0x00bf }
            goto L_0x0077
        L_0x0073:
            r1 = r11
            goto L_0x0077
        L_0x0075:
            java.lang.String r1 = r8.A09     // Catch:{ IOException -> 0x00bf }
        L_0x0077:
            java.lang.String r0 = "id"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x00bf }
            java.lang.String r1 = "type"
            if (r9 == 0) goto L_0x0088
            int r0 = r9.intValue()     // Catch:{ IOException -> 0x00bf }
        L_0x0084:
            r2.A0P(r1, r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x008a
        L_0x0088:
            r0 = 0
            goto L_0x0084
        L_0x008a:
            java.lang.String r1 = "multi_ads_type"
            if (r5 == r6) goto L_0x00a6
            if (r5 != r4) goto L_0x00af
            X.1Xj r0 = X.1Xi.A02(r7)     // Catch:{ IOException -> 0x00bf }
            if (r0 == 0) goto L_0x00af
            X.1Xy r0 = r0.A0C     // Catch:{ IOException -> 0x00bf }
            X.DUb r0 = r0.BUS()     // Catch:{ IOException -> 0x00bf }
            if (r0 == 0) goto L_0x00af
            int r0 = r0.BUX()     // Catch:{ IOException -> 0x00bf }
            r2.A0P(r1, r0)     // Catch:{ IOException -> 0x00bf }
            goto L_0x00af
        L_0x00a6:
            X.Gz1 r0 = r8.A01()     // Catch:{ IOException -> 0x00bf }
            int r0 = r0.A00     // Catch:{ IOException -> 0x00bf }
            r2.A0P(r1, r0)     // Catch:{ IOException -> 0x00bf }
        L_0x00af:
            r2.A0Z()     // Catch:{ IOException -> 0x00bf }
            goto L_0x0013
        L_0x00b4:
            r2.A0Y()     // Catch:{ IOException -> 0x00bf }
            r2.close()     // Catch:{ IOException -> 0x00bf }
            java.lang.String r11 = r3.toString()     // Catch:{ IOException -> 0x00bf }
            return r11
        L_0x00bf:
            r2 = move-exception
            java.lang.String r1 = "ViewStateUtil"
            r0 = 4349(0x10fd, float:6.094E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0KC.A0F(r1, r0, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C271054hp.A00(java.util.List):java.lang.String");
    }
}
