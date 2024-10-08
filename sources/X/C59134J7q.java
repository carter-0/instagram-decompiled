package X;

/* renamed from: X.J7q  reason: case insensitive filesystem */
public final class C59134J7q extends 0Yg implements 0sL {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59134J7q(long j, Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0070, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0191, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0196, code lost:
        r4.Evl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
        /*
            r17 = this;
            r3 = r17
            r4 = r18
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x011a;
                case 1: goto L_0x00d5;
                default: goto L_0x0009;
            }
        L_0x0009:
            r9 = 0
            X.0qQ.A0B(r4, r9)
            X.Nj3 r0 = X.C69302Nj3.DeviceOnboarded
            if (r4 != r0) goto L_0x009b
            java.lang.Object r10 = r3.A02
            android.app.Activity r10 = (android.app.Activity) r10
            long r7 = r3.A01
            java.lang.Object r4 = r3.A04
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r3.A03
            X.Mex r3 = (X.C66913Mex) r3
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0071
            X.0qQ.A0B(r4, r9)
            X.AnonymousClass65D.A00(r4)
            r5 = 300(0x12c, double:1.48E-321)
            long r1 = X.AnonymousClass7TG.A0I()
            long r1 = r1 - r7
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0071
            java.lang.String r0 = "OTC_NOTIFICATION_EXPIRED"
            r3.A0B(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A0A(r0)
            X.0qQ.A0B(r10, r9)
            r3 = 1
            X.8ab r5 = X.DbS.A0X(r10)
            r0 = 2131961674(0x7f13274a, float:1.9560052E38)
            r5.A09(r0)
            r0 = 2131961672(0x7f132748, float:1.9560048E38)
            r5.A08(r0)
            r1 = 2131961673(0x7f132749, float:1.956005E38)
            X.I8d r0 = X.C56697I8d.A00
            r5.A0I(r0, r1)
            r2 = 2131961671(0x7f132747, float:1.9560046E38)
            r1 = 2
            X.I8y r0 = new X.I8y
            r0.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r4)
            r5.A0G(r0, r2)
        L_0x0068:
            r5.A0r(r3)
            X.DbT.A1V(r5)
        L_0x006e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0071:
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            r3.A0A(r15)
            X.65E r0 = X.AnonymousClass65D.A00(r4)
            boolean r0 = r0.A01()
            X.OW5 r9 = X.C69900Nu2.A00(r4)
            if (r0 == 0) goto L_0x0094
            X.Njy r12 = X.C69358Njy.OTC_DISPLAY_CODE_INTRO_V2
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            X.NiX r13 = X.C69271NiX.DIALOG
        L_0x008a:
            r16 = 0
            android.os.Bundle r11 = X.AnonymousClass7TE.A0a()
            r9.A01(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x006e
        L_0x0094:
            X.Njy r12 = X.C69358Njy.OTC_DISPLAY_CODE_INTRO
            java.lang.Integer r14 = X.AnonymousClass05K.A0j
            X.NiX r13 = X.C69271NiX.BOTTOM_SHEET
            goto L_0x008a
        L_0x009b:
            java.lang.Object r1 = r3.A03
            X.Mex r1 = (X.C66913Mex) r1
            java.lang.String r0 = "OTC_NOTIFICATION_INVALID_DEVICE"
            r1.A0B(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0A(r0)
            java.lang.Object r4 = r3.A02
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r3.A04
            X.8ab r5 = X.DbS.A0X(r4)
            r0 = 2131961678(0x7f13274e, float:1.956006E38)
            r5.A09(r0)
            r0 = 2131961695(0x7f13275f, float:1.9560094E38)
            r5.A08(r0)
            r1 = 2131961673(0x7f132749, float:1.956005E38)
            X.I8e r0 = X.C56698I8e.A00
            r5.A0I(r0, r1)
            r2 = 2131961671(0x7f132747, float:1.9560046E38)
            r1 = 3
            X.I8y r0 = new X.I8y
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3)
            r5.A0G(r0, r2)
            r3 = 1
            goto L_0x0068
        L_0x00d5:
            X.5Wy r4 = (X.C286575Wy) r4
            int r1 = X.C51968G9o.A0B(r19)
            r0 = 2
            if (r1 != r0) goto L_0x00e4
            boolean r0 = r4.Bwn()
            if (r0 != 0) goto L_0x0196
        L_0x00e4:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00f2
            r1 = -679845016(0xffffffffd77a6368, float:-2.75304854E14)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedpills.BasePill.<anonymous> (Pills.kt:199)"
            X.0fL.A01(r1, r0)
        L_0x00f2:
            r11 = 0
            X.5Z4 r2 = X.C51966G9m.A0h(r4)
            r0 = 760906423(0x2d5a82b7, float:1.242089E-11)
            long r6 = r3.A01
            java.lang.Object r8 = r3.A02
            java.lang.Object r9 = r3.A04
            java.lang.Object r10 = r3.A03
            X.J7q r5 = new X.J7q
            r5.<init>(r6, r8, r9, r10, r11)
            X.5PJ r1 = X.AnonymousClass5PI.A01(r4, r5, r0)
            r0 = 48
            X.AnonymousClass5ZZ.A0w(r4, r2, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x006e
            r0 = -1648354041(0xffffffff9dc01d07, float:-5.085199E-21)
            goto L_0x0191
        L_0x011a:
            X.5Wy r4 = (X.C286575Wy) r4
            int r1 = X.C51968G9o.A0B(r19)
            r0 = 2
            if (r1 != r0) goto L_0x0129
            boolean r0 = r4.Bwn()
            if (r0 != 0) goto L_0x0196
        L_0x0129:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0137
            r1 = -845851967(0xffffffffcd9552c1, float:-3.13153568E8)
            java.lang.String r0 = "com.instagram.compose.igds.components.segmentedpills.BasePill.<anonymous>.<anonymous> (Pills.kt:200)"
            X.0fL.A01(r1, r0)
        L_0x0137:
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            long r5 = r3.A01
            java.lang.Object r1 = r3.A02
            X.5ZR r1 = (X.AnonymousClass5ZR) r1
            androidx.compose.ui.Modifier r0 = X.C304766Fd.A01(r0, r1, r5)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass6FZ.A01(r0, r1)
            java.lang.Object r0 = r3.A04
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Modifier r2 = r1.Ezh(r0)
            X.5a0 r1 = X.C287275Zs.A02
            X.5Zp r0 = X.C287215Zl.A04
            java.lang.Object r6 = r3.A03
            X.0sK r6 = (X.0sK) r6
            X.5RD r1 = X.C287395a4.A00(r1, r4, r0)
            int r5 = X.C287425a7.A00(r4)
            r3 = r4
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r4, r2)
            X.C51973G9u.A0y(r4, r3)
            X.C51971G9r.A12(r4, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x017c
            boolean r0 = X.C51972G9s.A1Q(r4, r5)
            if (r0 != 0) goto L_0x017f
        L_0x017c:
            X.C51971G9r.A13(r4, r1, r5)
        L_0x017f:
            X.C51965G9l.A18(r4, r2)
            X.6FX r1 = X.AnonymousClass6FX.A00
            r0 = 6
            X.C51967G9n.A1M(r1, r4, r6, r0)
            boolean r0 = X.C51967G9n.A1R(r4)
            if (r0 == 0) goto L_0x006e
            r0 = -727595908(0xffffffffd4a1c47c, float:-5.5582896E12)
        L_0x0191:
            X.0fL.A00(r0)
            goto L_0x006e
        L_0x0196:
            r4.Evl()
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59134J7q.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
