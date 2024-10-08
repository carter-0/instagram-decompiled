package X;

/* renamed from: X.9N0  reason: invalid class name */
public final class AnonymousClass9N0 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9N0(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A05 = str;
        this.A03 = obj4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
        if (X.AnonymousClass7FK.A04(r5, r4, r1, r2) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b7, code lost:
        if (X.AnonymousClass7FK.A04(r5, r4, r1, r2) == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bd, code lost:
        return java.lang.Boolean.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00be, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0124, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x00e7;
                case 1: goto L_0x00c0;
                case 2: goto L_0x0094;
                case 3: goto L_0x006e;
                case 4: goto L_0x0052;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r2 = r9.A05
            java.lang.Object r1 = r9.A01
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            X.52O r8 = new X.52O
            r8.<init>(r2, r0)
            java.lang.Object r7 = r9.A04
            X.3aP r7 = (X.C243953aP) r7
            com.instagram.common.session.UserSession r6 = r7.A08
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r6)
            java.lang.Class<X.3KA> r5 = X.AnonymousClass3KA.class
            r0.A01(r8, r5)
            X.1Xj r4 = r7.A09
            java.lang.Object r3 = r9.A02
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r1 = r9.A03
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            X.52P r2 = new X.52P
            r2.<init>(r6, r4, r0, r3)
            boolean r0 = r7.A0O
            if (r0 == 0) goto L_0x0045
            boolean r0 = X.C271174i4.A02(r6)
            if (r0 == 0) goto L_0x0045
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r6)
            r0.A01(r2, r5)
        L_0x0045:
            r1 = 23
            X.Iw4 r0 = new X.Iw4
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r7, (java.lang.Object) r8)
            X.3dj r1 = new X.3dj
            r1.<init>(r0)
            return r1
        L_0x0052:
            java.lang.Object r0 = r9.A04
            X.334 r0 = (X.AnonymousClass334) r0
            X.4DU r6 = r0.A04
            X.07Z r3 = r0.A00
            java.lang.Object r2 = r9.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r4 = r9.A03
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r5 = r9.A02
            X.311 r5 = (X.AnonymousClass311) r5
            java.lang.String r7 = r9.A05
            X.3XU r1 = new X.3XU
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x006e:
            java.lang.Object r5 = r9.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r9.A02
            X.3su r4 = (X.C254703su) r4
            java.lang.Object r3 = r9.A01
            X.9HC r3 = (X.AnonymousClass9HC) r3
            java.lang.String r2 = r9.A05
            java.lang.Object r1 = r9.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r2.length()
            r6 = 1
            if (r0 <= 0) goto L_0x00be
            boolean r0 = X.AnonymousClass7FK.A00(r5, r3, r4, r1)
            if (r0 == 0) goto L_0x00be
            boolean r0 = X.AnonymousClass7FK.A04(r5, r4, r1, r2)
            if (r0 == 0) goto L_0x00be
            goto L_0x00b9
        L_0x0094:
            java.lang.Object r5 = r9.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r9.A02
            X.3su r4 = (X.C254703su) r4
            java.lang.Object r3 = r9.A01
            X.9HC r3 = (X.AnonymousClass9HC) r3
            java.lang.String r2 = r9.A05
            java.lang.Object r1 = r9.A03
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r0 = r2.length()
            r6 = 1
            if (r0 <= 0) goto L_0x00be
            boolean r0 = X.AnonymousClass7FK.A00(r5, r3, r4, r1)
            if (r0 == 0) goto L_0x00be
            boolean r0 = X.AnonymousClass7FK.A04(r5, r4, r1, r2)
            if (r0 != 0) goto L_0x00be
        L_0x00b9:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            return r1
        L_0x00be:
            r6 = 0
            goto L_0x00b9
        L_0x00c0:
            java.lang.Object r3 = r9.A04
            X.7NJ r3 = (X.AnonymousClass7NJ) r3
            java.lang.Object r1 = r9.A03
            java.lang.String r5 = r9.A05
            X.7NM r4 = r3.A02
            r0 = 29
            X.9Lu r2 = new X.9Lu
            r2.<init>(r0, r1, r3)
            r0 = 200(0xc8, double:9.9E-322)
            r4.A00(r5, r2, r0)
            java.lang.Object r3 = r9.A01
            java.lang.Object r1 = r9.A02
            r0 = 28
            X.9Lu r2 = new X.9Lu
            r2.<init>(r0, r3, r1)
            r0 = 500(0x1f4, double:2.47E-321)
            r4.A00(r5, r2, r0)
            goto L_0x0122
        L_0x00e7:
            java.lang.Object r6 = r9.A01
            X.0sK r6 = (X.0sK) r6
            java.lang.String r5 = r9.A05
            java.lang.Object r0 = r9.A02
            X.5vK r0 = (X.C299515vK) r0
            java.lang.String r4 = r0.getId()
            java.lang.Object r0 = r9.A03
            X.6D8 r0 = (X.AnonymousClass6D8) r0
            if (r0 == 0) goto L_0x0127
            X.4gU r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
        L_0x0107:
            java.lang.Object r0 = r9.A04
            X.6D9 r0 = (X.AnonymousClass6D9) r0
            if (r0 == 0) goto L_0x0125
            X.5Oz r0 = r0.A0A
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
        L_0x0119:
            r1 = 0
            X.MfE r0 = new X.MfE
            r0.<init>((int) r2, (boolean) r3, (int) r1)
            r6.invoke(r5, r4, r0)
        L_0x0122:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0125:
            r2 = 0
            goto L_0x0119
        L_0x0127:
            r3 = 1
            goto L_0x0107
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9N0.invoke():java.lang.Object");
    }
}
