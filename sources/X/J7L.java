package X;

public final class J7L extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J7L(Object obj, int i, boolean z, boolean z2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            int r0 = r6.A00
            r1 = r25
            if (r0 == 0) goto L_0x012b
            X.5Wy r0 = X.C51966G9m.A0R(r7, r1)
            r1 = 1570971324(0x5da31ebc, float:1.46925485E18)
            boolean r1 = X.C51967G9n.A1U(r0, r1)
            if (r1 == 0) goto L_0x001f
            r2 = 876033941(0x34373795, float:1.7063424E-7)
            java.lang.String r1 = "com.instagram.profilecard.ui.ProfileCardContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ProfileCardContent.kt:258)"
            X.0fL.A01(r2, r1)
        L_0x001f:
            java.lang.Object r1 = r6.A01
            X.GnU r1 = (X.C53397GnU) r1
            com.instagram.common.typedurl.ImageUrl r1 = r1.A03
            r5 = 1
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = r1.getUrl()
            if (r1 == 0) goto L_0x0034
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            boolean r4 = r6.A02
            boolean r1 = r6.A03
            r10 = 0
            r2 = -1120056474(0xffffffffbd3d4b66, float:-0.046214484)
            boolean r2 = X.C51967G9n.A1U(r0, r2)
            if (r2 == 0) goto L_0x004b
            r3 = 490433287(0x1d3b6b07, float:2.4804576E-21)
            java.lang.String r2 = "com.instagram.profilecard.ui.getOptionMenuItems (ProfileCardContent.kt:747)"
            X.0fL.A01(r3, r2)
        L_0x004b:
            r15 = 1
            if (r4 == 0) goto L_0x00f8
            r2 = -1512483477(0xffffffffa5d9556b, float:-3.770138E-16)
            r0.ExS(r2)
            r19 = 2
            r2 = 2131969905(0x7f134771, float:1.9576746E38)
            java.lang.String r9 = X.C304346Dc.A00(r0, r2)
            r7 = 0
            r2 = 2131238943(0x7f08201f, float:1.8094179E38)
            X.2DO r8 = X.C287975bA.A00(r0, r2, r10)
            X.Gln r6 = new X.Gln
            r11 = r10
            r12 = r10
            r13 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2 = 2131969902(0x7f13476e, float:1.957674E38)
            java.lang.String r14 = X.C304346Dc.A00(r0, r2)
            r2 = 2131238638(0x7f081eee, float:1.809356E38)
            X.2DO r13 = X.C287975bA.A00(r0, r2, r10)
            X.Gln r11 = new X.Gln
            r12 = r7
            r16 = r10
            r17 = r10
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.Gln[] r2 = new X.C53301Gln[]{r6, r11}
            java.util.ArrayList r3 = X.0sr.A1M(r2)
            r2 = 643967901(0x26622b9d, float:7.846861E-16)
            r0.ExS(r2)
            if (r5 == 0) goto L_0x00b5
            r2 = 2131969915(0x7f13477b, float:1.9576766E38)
            java.lang.String r18 = X.C304346Dc.A00(r0, r2)
            r2 = 2131237910(0x7f081c16, float:1.8092084E38)
            X.2DO r17 = X.C287975bA.A00(r0, r2, r10)
            X.Gln r15 = new X.Gln
            r16 = r7
            r20 = r10
            r21 = r10
            r22 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r3.add(r15)
        L_0x00b5:
            X.5Wx r2 = X.C51965G9l.A0H(r0, r10)
            if (r1 == 0) goto L_0x00d8
            r1 = 2131969904(0x7f134770, float:1.9576744E38)
            java.lang.String r14 = X.C288035bG.A00(r0, r1)
            r1 = 2131238275(0x7f081d83, float:1.8092824E38)
            X.2DO r13 = X.C287975bA.A00(r0, r1, r10)
            r15 = 3
            X.Gln r11 = new X.Gln
            r16 = r10
            r17 = r10
            r18 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r3.add(r11)
        L_0x00d8:
            X.62P r1 = X.AnonymousClass62Q.A00(r3)
            boolean r0 = X.C51967G9n.A1b(r2, r10)
            if (r0 == 0) goto L_0x00e8
            r0 = -1511393305(0xffffffffa5e9f7e7, float:-4.0587042E-16)
        L_0x00e5:
            X.0fL.A00(r0)
        L_0x00e8:
            boolean r0 = X.C51967G9n.A1b(r2, r10)
            if (r0 == 0) goto L_0x00f4
            r0 = 557780770(0x213f0f22, float:6.4733345E-19)
            X.0fL.A00(r0)
        L_0x00f4:
            X.C286565Wx.A0L(r2, r10)
            return r1
        L_0x00f8:
            r1 = -1511048766(0xffffffffa5ef39c2, float:-4.149903E-16)
            r0.ExS(r1)
            r1 = 2131972171(0x7f13504b, float:1.9581342E38)
            java.lang.String r4 = X.C304346Dc.A00(r0, r1)
            r2 = 0
            r1 = 2131238715(0x7f081f3b, float:1.8093717E38)
            X.2DO r3 = X.C287975bA.A00(r0, r1, r10)
            r5 = 4
            X.Gln r1 = new X.Gln
            r6 = r10
            r7 = r10
            r8 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            X.Gln[] r1 = new X.C53301Gln[]{r1}
            X.62O r1 = X.AnonymousClass62Q.A04(r1)
            r2 = r0
            X.5Wx r2 = (X.C286565Wx) r2
            boolean r0 = X.C51967G9n.A1b(r2, r10)
            if (r0 == 0) goto L_0x00e8
            r0 = -455159953(0xffffffffe4decf6f, float:-3.2880995E22)
            goto L_0x00e5
        L_0x012b:
            X.5Wy r7 = (X.C286575Wy) r7
            int r1 = X.C51968G9o.A0B(r1)
            r0 = 2
            if (r1 != r0) goto L_0x0140
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0140
            r7.Evl()
        L_0x013d:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0140:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x014e
            r1 = 282175669(0x10d1a8b5, float:8.26959E-29)
            java.lang.String r0 = "com.instagram.compose.startup.TixuUnitPrewarmer.setCompactViewLoadingShimmer.<anonymous> (TixuUnitPrewarmer.kt:100)"
            X.0fL.A01(r1, r0)
        L_0x014e:
            java.lang.Object r5 = r6.A01
            X.0lg r5 = (X.0lg) r5
            r4 = 0
            r3 = -159987103(0xfffffffff676ca61, float:-1.2513767E33)
            boolean r2 = r6.A02
            boolean r1 = r6.A03
            X.J71 r0 = new X.J71
            r0.<init>(r2, r1, r4)
            X.5PJ r1 = X.AnonymousClass5PI.A01(r7, r0, r3)
            java.lang.String r0 = "tischu_loading"
            X.C286885Ye.A02(r7, r5, r0, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x013d
            r0 = -1425762923(0xffffffffab049595, float:-4.710341E-13)
            X.0fL.A00(r0)
            goto L_0x013d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J7L.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
