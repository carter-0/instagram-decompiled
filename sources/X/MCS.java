package X;

public final class MCS implements 02o {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public MCS(Object obj, String str, String str2, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00a1;
                case 1: goto L_0x0051;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 33
            boolean r0 = X.ME6.A02(r3, r8)
            if (r0 == 0) goto L_0x002b
            r4 = r8
            X.ME6 r4 = (X.ME6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001b:
            java.lang.Object r1 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r3) goto L_0x007d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002b:
            X.ME6 r4 = new X.ME6
            r4.<init>(r6, r8, r3)
            goto L_0x001b
        L_0x0031:
            X.0eS.A00(r1)
            java.lang.Object r2 = r6.A01
            X.02o r2 = (X.02o) r2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = r6.A03
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0046
            if (r1 != 0) goto L_0x0048
        L_0x0046:
            java.lang.String r1 = r6.A02
        L_0x0048:
            r4.A00 = r3
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r5) goto L_0x00bd
            return r5
        L_0x0051:
            r3 = 27
            boolean r0 = X.ME6.A02(r3, r8)
            if (r0 == 0) goto L_0x0077
            r4 = r8
            X.ME6 r4 = (X.ME6) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0077
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0067:
            java.lang.Object r1 = r4.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0081
            if (r0 == r3) goto L_0x007d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0077:
            X.ME6 r4 = new X.ME6
            r4.<init>(r6, r8, r3)
            goto L_0x0067
        L_0x007d:
            X.0eS.A00(r1)
            goto L_0x00bd
        L_0x0081:
            X.0eS.A00(r1)
            java.lang.Object r2 = r6.A01
            X.02o r2 = (X.02o) r2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r0 = r6.A03
            java.lang.Object r1 = r7.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x0096
            if (r1 != 0) goto L_0x0098
        L_0x0096:
            java.lang.String r1 = r6.A02
        L_0x0098:
            r4.A00 = r3
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r5) goto L_0x00bd
            return r5
        L_0x00a1:
            com.facebook.mantle.ig.IGMantle r7 = (com.facebook.mantle.ig.IGMantle) r7
            java.lang.String r4 = r6.A03
            java.lang.String r1 = r6.A02
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.RegularImmutableMap.A02
            X.0qQ.A07(r0)
            com.google.common.util.concurrent.ListenableFuture r3 = r7.runMantleWithConfigStr(r4, r1, r0)
            java.lang.Object r2 = r6.A01
            r0 = 1
            X.LcQ r1 = new X.LcQ
            r1.<init>(r4, r2, r0)
            X.1Lf r0 = X.1Lf.A01
            X.C255183ti.A04(r1, r3, r0)
        L_0x00bd:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCS.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
