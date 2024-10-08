package X;

public final class FTO implements 2IR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FTO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
        C277014uI r2;
        C308276Tl r1;
        0sm r0;
        switch (this.A00) {
            case 0:
                r2 = (C277014uI) this.A02;
                r1 = DbS.A0P();
                r0 = "";
                break;
            case 1:
                r2 = (C277014uI) this.A02;
                r1 = DbS.A0P();
                r0 = 0Yt.A0E();
                break;
            case 2:
                return;
            default:
                C46430Der.A0C((C46430Der) this.A02);
                return;
        }
        r1.A01(r0);
        DbS.A1R(r1.A00(), r2, this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0157, code lost:
        if (X.0oI.A0I(r1.getPackageManager(), "com.facebook.lite") != false) goto L_0x0159;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r26) {
        /*
            r25 = this;
            r2 = r25
            r4 = r26
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0191;
                case 1: goto L_0x0188;
                case 2: goto L_0x0131;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.3ls r4 = (X.C250673ls) r4
            java.lang.Object r3 = r2.A02
            X.Der r3 = (X.C46430Der) r3
            boolean r0 = r3.A0W
            if (r0 != 0) goto L_0x0036
            r1 = 1
            r3.A0W = r1
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0021
            if (r4 != 0) goto L_0x0037
            X.C46430Der.A0C(r3)
        L_0x0021:
            X.0eM r0 = r3.A0t
            java.lang.Object r0 = r0.getValue()
            X.F2V r0 = (X.F2V) r0
            java.lang.Object r2 = r2.A01
            java.util.concurrent.ConcurrentHashMap r1 = r0.A02
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0036
            r1.remove(r2)
        L_0x0036:
            return
        L_0x0037:
            X.DuK r0 = r3.A0I
            r15 = 0
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "perfLogger"
        L_0x003e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0046:
            X.34p r0 = r0.A00
            r0.A02()
            boolean r0 = r4 instanceof X.C43687C5j
            if (r0 == 0) goto L_0x0127
            com.instagram.common.session.UserSession r6 = X.C46430Der.A03(r3)
            r12 = r4
            X.3lr r12 = (X.C250663lr) r12
            java.lang.Class<X.C5i> r11 = X.C43686C5i.class
            r0 = 1935(0x78f, float:2.712E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
            r9 = -1988999570(0xffffffff8972466e, float:-2.9162806E-33)
            X.3lr r0 = r12.A05(r11, r10, r9)
            java.lang.Class<X.C5y> r8 = X.C43702C5y.class
            r7 = 715754235(0x2aa98afb, float:3.0116868E-13)
            X.3lr r0 = r0.A01(r8, r7)
            X.C5y r0 = (X.C43702C5y) r0
            X.0qQ.A07(r0)
            X.CTS r5 = new X.CTS
            r5.<init>(r6, r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            com.instagram.common.session.UserSession r13 = X.C46430Der.A03(r3)
            X.3lr r0 = r12.A05(r11, r10, r9)
            X.3lr r6 = r0.A01(r8, r7)
            X.C5y r6 = (X.C43702C5y) r6
            X.0qQ.A07(r6)
            X.CTS r0 = new X.CTS
            r0.<init>(r13, r6)
            java.util.List r20 = r0.getItems()
            X.3lr r0 = r12.A05(r11, r10, r9)
            X.3lr r6 = r0.A01(r8, r7)
            java.lang.String r0 = "next_max_id"
            java.lang.String r17 = r6.A0C(r0)
            r22 = 0
            X.9P5 r13 = new X.9P5
            r16 = r15
            r18 = r15
            r19 = r15
            r21 = r15
            r23 = r22
            r24 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x00b5:
            boolean r0 = r4 instanceof X.C8O
            if (r0 == 0) goto L_0x0113
            com.instagram.common.session.UserSession r6 = X.C46430Der.A03(r3)
            X.C8O r4 = (X.C8O) r4
            X.C5h r0 = r4.A0E()
            java.lang.Class<X.C5q> r9 = X.C43694C5q.class
            r8 = 840623695(0x321ae64f, float:9.016346E-9)
            X.3lr r0 = r0.A01(r9, r8)
            X.C5q r0 = (X.C43694C5q) r0
            X.0qQ.A07(r0)
            X.CTR r5 = new X.CTR
            r5.<init>(r6, r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A0C
            com.instagram.common.session.UserSession r7 = X.C46430Der.A03(r3)
            X.C5h r0 = r4.A0E()
            X.3lr r6 = r0.A01(r9, r8)
            X.C5q r6 = (X.C43694C5q) r6
            X.0qQ.A07(r6)
            X.CTR r0 = new X.CTR
            r0.<init>(r7, r6)
            java.util.List r20 = r0.getItems()
            X.C5h r0 = r4.A0E()
            X.3lr r4 = r0.A01(r9, r8)
            java.lang.String r0 = "next_max_id"
            java.lang.String r17 = r4.A0C(r0)
            r22 = 0
            X.9P5 r13 = new X.9P5
            r16 = r15
            r18 = r15
            r19 = r15
            r21 = r15
            r23 = r22
            r24 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x0113:
            java.lang.String r1 = ""
            X.C46430Der.A0H(r3, r1)
            if (r5 == 0) goto L_0x011d
            X.C46430Der.A0G(r3, r5, r1)
        L_0x011d:
            if (r13 == 0) goto L_0x0021
            X.F05 r0 = r3.A0F
            if (r0 != 0) goto L_0x012a
            java.lang.String r0 = "followListFragmentQueryManager"
            goto L_0x003e
        L_0x0127:
            r5 = r15
            r13 = r15
            goto L_0x00b5
        L_0x012a:
            X.7g1 r0 = r0.A03
            r0.A9y(r13, r1)
            goto L_0x0021
        L_0x0131:
            java.util.List r4 = (java.util.List) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Object r5 = r2.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.0wX r0 = r5.A03
            android.content.Context r1 = r0.A06()
            boolean r6 = X.AnonymousClass7TE.A1b(r4)
            r10 = 1
            boolean r0 = X.0oI.A0B(r1)
            if (r0 != 0) goto L_0x0159
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r0 = "com.facebook.lite"
            boolean r0 = X.0oI.A0I(r1, r0)
            r4 = 0
            if (r0 == 0) goto L_0x015a
        L_0x0159:
            r4 = 1
        L_0x015a:
            r0 = 36325974396188083(0x810e48000135b3, double:3.036030708882997E-306)
            boolean r3 = X.AnonymousClass3EM.A07(r5, r0)
            r0 = 36325974396319157(0x810e48000335b5, double:3.036030708965889E-306)
            boolean r0 = X.AnonymousClass3EM.A07(r5, r0)
            if (r4 != 0) goto L_0x0170
            if (r3 != 0) goto L_0x0174
        L_0x0170:
            if (r0 == 0) goto L_0x0036
            if (r6 != 0) goto L_0x0036
        L_0x0174:
            X.1wM r6 = X.1wB.A00(r5)
            java.lang.String r9 = "fx_company_identity_switcher_linking_cache"
            java.lang.Object r7 = r2.A01
            com.facebook.common.callercontext.CallerContext r7 = (com.facebook.common.callercontext.CallerContext) r7
            X.Fov r8 = new X.Fov
            r8.<init>(r5)
            r11 = r10
            r6.A0K(r7, r8, r9, r10, r11)
            return
        L_0x0188:
            java.lang.Object r3 = r2.A02
            X.4uI r3 = (X.C277014uI) r3
            X.6Tl r0 = X.DbU.A0T(r4)
            goto L_0x01a0
        L_0x0191:
            java.lang.Object r3 = r2.A02
            X.4uI r3 = (X.C277014uI) r3
            X.6Tl r0 = X.DbS.A0P()
            if (r26 != 0) goto L_0x019d
            java.lang.String r4 = ""
        L_0x019d:
            r0.A01(r4)
        L_0x01a0:
            X.6Tm r1 = r0.A00()
            java.lang.Object r0 = r2.A01
            X.DbS.A1R(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTO.onSuccess(java.lang.Object):void");
    }
}
