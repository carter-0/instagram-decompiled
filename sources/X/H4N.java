package X;

public final class H4N extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public H4N(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        if (r1.length() != 0) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x010b;
                case 1: goto L_0x00f0;
                case 2: goto L_0x0024;
                case 3: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.H4N.super.onFail(r7)
            return
        L_0x0009:
            r0 = 732152194(0x2ba3c182, float:1.1635556E-12)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r6.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r6.A02
            X.Glc r0 = (X.C53290Glc) r0
            int r1 = r0.A01
            java.lang.String r0 = "fail"
            X.C59689JTv.A0F(r2, r0, r1)
            r0 = -122149075(0xfffffffff8b8272d, float:-2.9880538E34)
            goto L_0x0115
        L_0x0024:
            r0 = 1489404532(0x58c68274, float:1.74610875E15)
            int r4 = X.AnonymousClass7TG.A0D(r7, r0)
            java.lang.Object r5 = r6.A03
            X.Cw3 r5 = (X.C45423Cw3) r5
            if (r5 != 0) goto L_0x0046
            java.lang.Object r3 = r6.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r6.A02
            X.1Xj r2 = (X.1Xj) r2
            boolean r0 = X.C51968G9o.A1X(r3, r2)
            if (r0 == 0) goto L_0x00ea
            X.3Yl r1 = X.C243363Yl.LIKED
            X.3Yl r0 = X.C243363Yl.NOT_LIKED
        L_0x0043:
            X.C54994HaR.A00(r3, r1, r0, r2)
        L_0x0046:
            boolean r0 = r7 instanceof X.C268674do
            if (r0 == 0) goto L_0x0072
            if (r5 == 0) goto L_0x0072
            java.lang.Object r3 = r6.A04
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r6.A02
            X.1Xj r2 = (X.1Xj) r2
            boolean r0 = X.C51968G9o.A1X(r3, r2)
            if (r0 == 0) goto L_0x00e4
            X.3Yl r1 = X.C243363Yl.LIKED
            X.3Yl r0 = X.C243363Yl.NOT_LIKED
        L_0x005e:
            X.C54994HaR.A00(r3, r1, r0, r2)
            X.0q2 r1 = X.0q2.A00(r3)
            java.lang.String r0 = r5.A03
            java.lang.Object r0 = r1.A03(r0)
            if (r5 != r0) goto L_0x0072
            java.lang.String r0 = r5.A03
            r1.A0B(r0)
        L_0x0072:
            java.lang.Object r0 = r6.A01
            X.JPO r0 = (X.JPO) r0
            if (r0 == 0) goto L_0x007b
            r0.onFail(r7)
        L_0x007b:
            java.lang.Object r5 = r7.A00()
            X.Gyr r5 = (X.C54068Gyr) r5
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = ""
            if (r5 == 0) goto L_0x0095
            int r0 = r5.mStatusCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0096
        L_0x0095:
            r1 = r2
        L_0x0096:
            java.lang.String r0 = "error_code"
            r3.put(r0, r1)
            if (r5 == 0) goto L_0x00e1
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x00d7
            java.lang.String r1 = "like_si_blocked"
        L_0x00a3:
            java.lang.String r0 = "error_key"
            r3.put(r0, r1)
            if (r5 == 0) goto L_0x00b4
            java.lang.String r0 = r5.getErrorMessage()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r2 = r5.getErrorMessage()
        L_0x00b4:
            java.lang.String r0 = "error_message"
            r3.put(r0, r2)
            java.lang.Object r0 = r6.A02
            java.lang.String r1 = X.C51966G9m.A1E(r0)
            java.lang.String r0 = "m_pk"
            r3.put(r0, r1)
            X.1Yd r2 = X.HWC.A00()
            java.lang.String r1 = "latest_like_error"
            X.ODK r0 = new X.ODK
            r0.<init>(r1, r3)
            X.1Yc r2 = (X.C64901Yc) r2
            r2.A00 = r0
            r0 = 135513335(0x813c4f7, float:4.4467734E-34)
            goto L_0x0115
        L_0x00d7:
            java.lang.String r1 = r5.A00
            if (r1 == 0) goto L_0x00e1
            int r0 = r1.length()
            if (r0 != 0) goto L_0x00a3
        L_0x00e1:
            java.lang.String r1 = "like_client_error"
            goto L_0x00a3
        L_0x00e4:
            X.3Yl r1 = X.C243363Yl.NOT_LIKED
            X.3Yl r0 = X.C243363Yl.LIKED
            goto L_0x005e
        L_0x00ea:
            X.3Yl r1 = X.C243363Yl.NOT_LIKED
            X.3Yl r0 = X.C243363Yl.LIKED
            goto L_0x0043
        L_0x00f0:
            r0 = 927985635(0x374fefe3, float:1.2394014E-5)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r6.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r6.A02
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r1 = r6.A01
            X.JQc r1 = (X.C59608JQc) r1
            r0 = 0
            X.I7G.A07(r1, r3, r2, r0)
            r0 = -192958796(0xfffffffff47faeb4, float:-8.1029E31)
            goto L_0x0115
        L_0x010b:
            r0 = 1670053094(0x638afce6, float:5.127748E21)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 686698706(0x28ee30d2, float:2.644448E-14)
        L_0x0115:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4N.onFail(X.4dm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x013b, code lost:
        X.C41845B3m.A0v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0142, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x00c3;
                case 2: goto L_0x006e;
                case 3: goto L_0x0038;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 1726897581(0x66ee5dad, float:5.6282562E23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1111390522(0x423e793a, float:47.618385)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r11.A04
            X.HK5 r1 = (X.HK5) r1
            java.lang.Object r4 = r11.A03
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r11.A01
            com.instagram.common.session.UserSession r1 = r1.A01
            X.1OC r2 = X.C55017Hao.A00(r1, r4)
            r1 = 22
            X.H51.A00(r2, r3, r4, r1)
            X.1ES.A03(r2)
            r1 = -1243143683(0xffffffffb5e721fd, float:-1.7220733E-6)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 420946423(0x191721f7, float:7.813376E-24)
        L_0x0034:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0038:
            r0 = -619372366(0xffffffffdb1520b2, float:-4.197572E16)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1997630108(0xffffffff88ee9564, float:-1.43592255E-33)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r11.A03
            X.1Xj r3 = (X.1Xj) r3
            X.1Xy r2 = r3.A0C
            r1 = 0
            r2.EXJ(r1)
            java.lang.Object r1 = r11.A04
            X.0lg r1 = (X.0lg) r1
            r3.AE7(r1)
            java.lang.Object r2 = r11.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r11.A02
            X.Glc r1 = (X.C53290Glc) r1
            int r1 = r1.A05
            X.C59689JTv.A07(r2, r1)
            r1 = 1831499364(0x6d2a7664, float:3.2972236E27)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 164585834(0x9cf616a, float:4.9925045E-33)
            goto L_0x0034
        L_0x006e:
            r0 = 1397832674(0x53513be2, float:8.9865283E11)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Gyr r12 = (X.C54068Gyr) r12
            r1 = 764161072(0x2d8c2c30, float:1.593578E-11)
            int r5 = X.AnonymousClass7TG.A0D(r12, r1)
            java.lang.Object r6 = r11.A03
            X.Cw3 r6 = (X.C45423Cw3) r6
            if (r6 == 0) goto L_0x00ac
            java.lang.Object r1 = r11.A04
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.0q2 r2 = X.0q2.A00(r1)
            java.lang.String r1 = r6.A03
            java.lang.Object r1 = r2.A03(r1)
            if (r6 != r1) goto L_0x00ac
            java.lang.String r1 = r6.A03
            r2.A0B(r1)
            java.util.Map r4 = r2.A00
            java.lang.String r3 = r6.A03
            java.lang.String r2 = r6.A02
            java.lang.String r1 = "like"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00c0
            X.3Yl r1 = X.C243363Yl.LIKED
        L_0x00a9:
            r4.put(r3, r1)
        L_0x00ac:
            java.lang.Object r1 = r11.A01
            X.JPO r1 = (X.JPO) r1
            if (r1 == 0) goto L_0x00b5
            r1.DoR(r12)
        L_0x00b5:
            r1 = 663651593(0x278e8509, float:3.9557154E-15)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 958880083(0x39275953, float:1.5959637E-4)
            goto L_0x0034
        L_0x00c0:
            X.3Yl r1 = X.C243363Yl.NOT_LIKED
            goto L_0x00a9
        L_0x00c3:
            r0 = -1810371826(0xffffffff9417eb0e, float:-7.669908E-27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.GyY r12 = (X.C54049GyY) r12
            r1 = 1768783347(0x696d7df3, float:1.7944387E25)
            int r3 = X.AnonymousClass7TG.A0D(r12, r1)
            X.JRW r2 = r12.A00
            if (r2 == 0) goto L_0x013b
            java.lang.Object r6 = r11.A03
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r10 = r11.A02
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r5 = r11.A01
            X.JQc r5 = (X.C59608JQc) r5
            X.GoW r2 = (X.C53438GoW) r2
            java.lang.String r1 = r2.A00
            X.HMF r4 = X.I7G.A00(r1)
            java.util.List r8 = r2.A03
            java.util.List r9 = r2.A02
            java.lang.String r7 = r2.A01
            X.I7G.A05(r4, r5, r6, r7, r8, r9, r10)
            r1 = 318903379(0x13021453, float:1.6418327E-27)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1141412300(0x440891cc, float:546.2781)
            goto L_0x0034
        L_0x00ff:
            r0 = 1797879525(0x6b2976e5, float:2.0486993E26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.GyY r12 = (X.C54049GyY) r12
            r1 = 306362002(0x1242b692, float:6.144064E-28)
            int r3 = X.AnonymousClass7TG.A0D(r12, r1)
            X.JRW r2 = r12.A00
            if (r2 == 0) goto L_0x013b
            java.lang.Object r6 = r11.A03
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r10 = r11.A02
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r5 = r11.A01
            X.JQc r5 = (X.C59608JQc) r5
            X.GoW r2 = (X.C53438GoW) r2
            java.lang.String r1 = r2.A00
            X.HMF r4 = X.I7G.A00(r1)
            java.util.List r8 = r2.A03
            java.util.List r9 = r2.A02
            java.lang.String r7 = r2.A01
            X.I7G.A05(r4, r5, r6, r7, r8, r9, r10)
            r1 = 1297249105(0x4d527351, float:2.20673296E8)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = -304154363(0xffffffffeddef905, float:-8.62584E27)
            goto L_0x0034
        L_0x013b:
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H4N.onSuccess(java.lang.Object):void");
    }
}
