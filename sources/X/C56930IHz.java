package X;

/* renamed from: X.IHz  reason: case insensitive filesystem */
public final class C56930IHz implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C56930IHz(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0185, code lost:
        if (r0 != null) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0187, code lost:
        r5 = r0.getOptionalStringField(14, X.C66579MXk.A00(1163));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a9, code lost:
        if (r0 == null) goto L_0x0193;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x01d7;
                case 1: goto L_0x0022;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r14.A01
            X.Dfk r3 = (X.C46481Dfk) r3
            X.4Cq r2 = r3.A01
            boolean r1 = r14.A02
            r0 = 48
            X.Dba.A1S(r3, r2, r0, r1)
            X.0eM r0 = r3.A01
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            X.02m r2 = (X.02m) r2
            r1 = 834877734(0x31c33926, float:5.681744E-9)
            r0 = 2
            r2.markerEnd(r1, r0)
        L_0x0021:
            return
        L_0x0022:
            X.3lr r3 = X.C41845B3m.A0U(r15)
            if (r3 == 0) goto L_0x0021
            java.lang.Class<com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl$XdtThemePreview> r2 = com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl.XdtThemePreview.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 1568985831(0x5d84d2e7, float:1.19637077E18)
            r0 = 412(0x19c, float:5.77E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.3lr r11 = r3.A03(r2, r0, r1)
            com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl$XdtThemePreview r11 = (com.instagram.direct.request.graphql.IGGetThemePreviewResponseImpl.XdtThemePreview) r11
            if (r11 == 0) goto L_0x0021
            java.lang.Object r10 = r14.A01
            X.HqV r10 = (X.C55964HqV) r10
            boolean r9 = r14.A02
            java.lang.Class<com.instagram.direct.request.graphql.ThreadThemeImpl> r8 = com.instagram.direct.request.graphql.ThreadThemeImpl.class
            r7 = -158150994(0xfffffffff692ceae, float:-1.4888033E33)
            r6 = 2
            X.3lr r4 = r11.reinterpretRequired(r6, r8, r7)
            com.instagram.direct.request.graphql.ThreadThemeImpl r4 = (com.instagram.direct.request.graphql.ThreadThemeImpl) r4
            r5 = 0
            if (r4 == 0) goto L_0x00db
            r0 = 4631(0x1217, float:6.49E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r4.A07(r0)
            r0 = 4632(0x1218, float:6.491E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r4.A08(r0)
            r0 = 4633(0x1219, float:6.492E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r4.A09(r0)
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x008a
            if (r9 != 0) goto L_0x008a
            com.google.common.collect.ImmutableList r0 = r11.A0E()
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x01d4
            X.3lr r4 = r0.A01(r8, r7)
            if (r4 == 0) goto L_0x01d4
        L_0x008a:
            r0 = 833(0x341, float:1.167E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r13 = r4.A0D(r0)
        L_0x0094:
            if (r3 == 0) goto L_0x00db
            int r0 = r3.length()
            if (r0 == 0) goto L_0x00db
            if (r2 == 0) goto L_0x00db
            int r0 = r2.length()
            if (r0 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00db
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00db
            if (r13 == 0) goto L_0x00db
            int r0 = r13.length()
            if (r0 == 0) goto L_0x00db
            X.7Cg r4 = r10.A01
            r12 = 35
            java.lang.String r0 = X.002.A0D(r3, r12)
            int r3 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = X.002.A0D(r2, r12)
            int r2 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = X.002.A0D(r1, r12)
            int r1 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = X.002.A0D(r13, r12)
            int r0 = android.graphics.Color.parseColor(r0)
            r4.ESW(r3, r2, r1, r0)
        L_0x00db:
            boolean r3 = r10.A02
            if (r3 == 0) goto L_0x01ac
            if (r9 != 0) goto L_0x01ac
            com.google.common.collect.ImmutableList r0 = r11.A0E()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x0173
            X.3lr r12 = r0.A01(r8, r7)
            if (r12 == 0) goto L_0x0173
            java.lang.Class<com.instagram.direct.request.graphql.ThreadThemeImpl$ThreadBackgroundAsset> r4 = com.instagram.direct.request.graphql.ThreadThemeImpl.ThreadBackgroundAsset.class
            r2 = -1908335913(0xffffffff8e411ad7, float:-2.380201E-30)
            r1 = 15
            r0 = 4101(0x1005, float:5.747E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r2 = r12.getOptionalTreeField(r1, r0, r4, r2)
            if (r2 == 0) goto L_0x0173
            r1 = 1
            r0 = 289(0x121, float:4.05E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C41847B3o.A1A(r2, r0, r1)
        L_0x0113:
            if (r0 == 0) goto L_0x016f
            X.1Sw.A00()
            android.net.Uri r0 = X.DbT.A09(r0)
            X.2iB r12 = new X.2iB
            r12.<init>(r0, r5)
            X.1TS r4 = X.C226722hk.A01()
            android.content.Context r0 = r10.A00
            android.content.res.Resources r2 = X.AnonymousClass7TF.A0A(r0)
            X.1U1 r1 = X.1U1.A0b
            r0 = 0
            X.2hl r2 = r4.A02(r2, r1, r12, r0)
            X.1Tq r0 = X.C226722hk.A00()
            android.graphics.drawable.Drawable r1 = r0.ALv()
            X.2hm r1 = (X.C226742hm) r1
            X.2hl r0 = r1.BGF()
            if (r0 == 0) goto L_0x014f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x014f
            X.1Tq r0 = X.C226722hk.A00()
            r0.ECf(r1)
        L_0x014f:
            X.Ih0 r0 = new X.Ih0
            r0.<init>(r1, r2)
            r1.EiD(r0)
            java.lang.Runnable r0 = r1.BlC()
            if (r0 == 0) goto L_0x0160
            r0.run()
        L_0x0160:
            X.IHm r0 = new X.IHm
            r0.<init>(r1)
            r1.Eqj(r0)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            X.7Cg r0 = r10.A01
            r0.EPw(r1)
        L_0x016f:
            if (r3 == 0) goto L_0x01a3
            if (r9 != 0) goto L_0x01a3
        L_0x0173:
            com.google.common.collect.ImmutableList r0 = r11.A0E()
            if (r0 == 0) goto L_0x0193
            java.lang.Object r0 = X.00k.A0J(r0)
            X.3lr r0 = (X.C250663lr) r0
            if (r0 == 0) goto L_0x0193
            X.3lr r0 = r0.A01(r8, r7)
            if (r0 == 0) goto L_0x0193
        L_0x0187:
            r2 = 14
            r1 = 1163(0x48b, float:1.63E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            java.lang.String r5 = r0.getOptionalStringField(r2, r1)
        L_0x0193:
            X.7Cg r1 = r10.A01
            r0 = 35
            java.lang.String r0 = X.002.A0D(r5, r0)
            int r0 = android.graphics.Color.parseColor(r0)
            r1.setBackgroundColor(r0)
            return
        L_0x01a3:
            X.3lr r0 = r11.reinterpretRequired(r6, r8, r7)
            com.instagram.direct.request.graphql.ThreadThemeImpl r0 = (com.instagram.direct.request.graphql.ThreadThemeImpl) r0
            if (r0 == 0) goto L_0x0193
            goto L_0x0187
        L_0x01ac:
            X.3lr r12 = r11.reinterpretRequired(r6, r8, r7)
            com.instagram.direct.request.graphql.ThreadThemeImpl r12 = (com.instagram.direct.request.graphql.ThreadThemeImpl) r12
            if (r12 == 0) goto L_0x016f
            java.lang.Class<com.instagram.direct.request.graphql.ThreadThemeImpl$ThreadBackgroundAsset> r4 = com.instagram.direct.request.graphql.ThreadThemeImpl.ThreadBackgroundAsset.class
            r2 = -1908335913(0xffffffff8e411ad7, float:-2.380201E-30)
            r1 = 15
            r0 = 4101(0x1005, float:5.747E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r2 = r12.getOptionalTreeField(r1, r0, r4, r2)
            if (r2 == 0) goto L_0x016f
            r1 = 1
            r0 = 289(0x121, float:4.05E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C41847B3o.A1A(r2, r0, r1)
            goto L_0x0113
        L_0x01d4:
            r13 = r5
            goto L_0x0094
        L_0x01d7:
            java.lang.Object r7 = r14.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.7wl r0 = X.C347397wk.A00(r7)
            if (r15 == 0) goto L_0x021d
            X.3lr r6 = X.C41845B3m.A0U(r15)
        L_0x01e5:
            boolean r5 = r14.A02
            if (r6 == 0) goto L_0x020e
            X.05G r4 = r0.A01
        L_0x01eb:
            java.lang.Object r3 = r4.getValue()
            java.lang.Class<X.BeI> r2 = X.C42537BeI.class
            r0 = 4247(0x1097, float:5.951E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1800118107(0xffffffff94b460a5, float:-1.8213475E-26)
            X.3lr r1 = r6.A05(r2, r1, r0)
            X.BeI r1 = (X.C42537BeI) r1
            X.0qQ.A07(r1)
            X.DGv r0 = new X.DGv
            r0.<init>(r1, r5)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x01eb
        L_0x020e:
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r7)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.LfZ r0 = new X.LfZ
            r0.<init>(r1)
            r2.A00(r0)
            return
        L_0x021d:
            r6 = 0
            goto L_0x01e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56930IHz.invoke(X.3JD):void");
    }
}
