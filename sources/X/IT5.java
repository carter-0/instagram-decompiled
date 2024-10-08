package X;

public final class IT5 implements C270594gz {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public IT5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ed, code lost:
        if (r3 != null) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A8S(X.C254523sc r10, X.AnonymousClass4DU r11, java.lang.String r12) {
        /*
            r9 = this;
            int r1 = r9.A00
            r0 = 2
            X.0qQ.A0B(r10, r0)
            if (r1 == 0) goto L_0x00f1
            java.lang.Object r5 = r9.A03
            X.GEX r5 = (X.GEX) r5
            java.lang.Object r4 = r9.A01
            X.9Ie r4 = (X.C376489Ie) r4
            java.lang.Object r3 = r4.A03
            X.4bN r3 = (X.C267324bN) r3
            X.GEX.A01(r3, r10, r5)
            java.lang.Object r2 = r9.A02
            X.1PW r2 = (X.1PW) r2
            int r0 = r2.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x00ab
            boolean r6 = r5.A0B
            if (r6 == 0) goto L_0x00ed
            if (r3 == 0) goto L_0x00ab
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x0037
            java.util.List r0 = r0.A3S()
            if (r0 == 0) goto L_0x0037
            r10.A7h = r0
        L_0x0037:
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x00ab
            if (r1 == 0) goto L_0x00ab
            int r7 = r1.intValue()
            int r8 = r7 + -1
            if (r8 < 0) goto L_0x0077
            X.HJk r1 = r5.A06
            int r0 = r1.A0A()
            if (r8 >= r0) goto L_0x0077
            X.4bN r0 = r1.A0E(r8)
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0077
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj r0 = r0.AiG()
            if (r0 == 0) goto L_0x0077
            java.util.List r1 = r0.Afw()
            if (r1 == 0) goto L_0x0077
            X.4jn r0 = X.C271914jn.A00
            java.util.ArrayList r0 = r0.A01(r1)
            if (r6 == 0) goto L_0x006d
            r10.A7m = r0
        L_0x006d:
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A2o = r0
        L_0x0077:
            if (r7 < 0) goto L_0x00ab
            X.HJk r1 = r5.A06
            int r0 = r1.A0A()
            if (r7 >= r0) goto L_0x00ab
            X.4bN r0 = r1.A0E(r7)
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x00ab
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj r0 = r0.AiG()
            if (r0 == 0) goto L_0x00ab
            java.util.List r1 = r0.Afw()
            if (r1 == 0) goto L_0x00ab
            X.4jn r0 = X.C271914jn.A00
            java.util.ArrayList r0 = r0.A01(r1)
            if (r6 == 0) goto L_0x00a1
            r10.A7l = r0
        L_0x00a1:
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.A2n = r0
        L_0x00ab:
            com.instagram.common.session.UserSession r1 = r5.A01
            X.G9w.A1M(r1, r10)
            X.3OA r0 = r3.A06()
            r10.A0K(r1, r0)
            X.C51965G9l.A1T(r1, r10)
            X.3OA r0 = r3.A06()
            java.lang.String r0 = r0.A0f
            if (r0 == 0) goto L_0x00c4
            r10.A5W = r0
        L_0x00c4:
            int r0 = r2.A02
            r10.A0P = r0
            int r0 = r2.A03
            r10.A0G = r0
            X.3OA r0 = r3.A06()
            java.lang.String r0 = r0.A0c
            if (r0 == 0) goto L_0x00d6
            r10.A5X = r0
        L_0x00d6:
            boolean r0 = r4.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A1z = r0
            java.lang.Object r0 = r4.A00
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = X.AnonymousClass93b.A01(r0)
        L_0x00e8:
            r10.A4z = r0
        L_0x00ea:
            return
        L_0x00eb:
            r0 = 0
            goto L_0x00e8
        L_0x00ed:
            if (r3 == 0) goto L_0x00ab
            goto L_0x0037
        L_0x00f1:
            java.lang.Object r4 = r9.A03
            X.GXT r4 = (X.GXT) r4
            java.lang.Object r0 = r9.A02
            X.9Ig r0 = (X.C376509Ig) r0
            java.lang.Object r3 = r0.A04
            r0 = r3
            X.2vm r0 = (X.C233472vm) r0
            if (r0 == 0) goto L_0x013e
            int r0 = r0.A09()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0108:
            com.instagram.common.session.UserSession r1 = r4.A00
            java.lang.Object r0 = r9.A01
            X.3OA r0 = (X.AnonymousClass3OA) r0
            r10.A0K(r1, r0)
            if (r2 == 0) goto L_0x0119
            int r0 = r2.intValue()
            r10.A0B = r0
        L_0x0119:
            X.2vl r3 = (X.C233462vl) r3
            if (r3 == 0) goto L_0x013b
            java.lang.String r0 = r3.A08
        L_0x011f:
            r10.A77 = r0
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x00ea
            X.3VK r3 = X.AnonymousClass3VI.A00(r1)
            X.4DU r2 = r4.A01
            java.lang.Integer r1 = r3.A01(r2)
            java.lang.Integer r0 = r3.A02(r2)
            X.G9t.A1O(r2, r10, r3)
            r10.A2v = r1
            r10.A2w = r0
            return
        L_0x013b:
            java.lang.String r0 = ""
            goto L_0x011f
        L_0x013e:
            r2 = 0
            goto L_0x0108
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IT5.A8S(X.3sc, X.4DU, java.lang.String):void");
    }
}
