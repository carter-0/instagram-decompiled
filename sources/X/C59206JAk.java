package X;

/* renamed from: X.JAk  reason: case insensitive filesystem */
public final class C59206JAk extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59206JAk(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(2);
        this.A00 = i;
        this.A04 = obj;
        this.A08 = obj2;
        this.A06 = obj3;
        this.A07 = obj4;
        this.A05 = obj5;
        this.A01 = obj6;
        this.A03 = obj7;
        this.A02 = obj8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        if (r9 == false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
        /*
            r26 = this;
            r5 = r26
            r11 = r27
            int r0 = r5.A00
            if (r0 == 0) goto L_0x00a6
            boolean r9 = X.AnonymousClass7TE.A1a(r11)
            if (r9 == 0) goto L_0x00a2
            r0 = 2131957554(0x7f131732, float:1.9551695E38)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x0015:
            java.lang.Object r4 = r5.A04
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            androidx.fragment.app.FragmentActivity r13 = r4.getActivity()
            java.lang.Object r3 = r5.A08
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r5.A06
            X.1Xj r2 = (X.1Xj) r2
            r15 = 0
            r0 = 0
            java.lang.String r17 = X.I7G.A03(r13, r3, r2, r0)
            X.8ae r14 = X.C358278ae.RED
            java.lang.Object r7 = r5.A07
            java.lang.Object r6 = r5.A05
            X.0Tu r8 = X.DbS.A0J(r3, r0)
            r0 = 36325360216126373(0x810db9000533a5, double:3.035642298938867E-306)
            boolean r0 = X.182.A06(r8, r3, r0)
            if (r0 == 0) goto L_0x0044
            r25 = 1
            if (r9 != 0) goto L_0x0046
        L_0x0044:
            r25 = 0
        L_0x0046:
            r0 = 1
            X.I8R r8 = new X.I8R
            r18 = r8
            r19 = r0
            r20 = r4
            r21 = r7
            r22 = r3
            r23 = r2
            r24 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r9 = r5.A01
            android.content.DialogInterface$OnClickListener r9 = (android.content.DialogInterface.OnClickListener) r9
            java.lang.Object r11 = r5.A03
            android.content.DialogInterface$OnDismissListener r11 = (android.content.DialogInterface.OnDismissListener) r11
            java.lang.String r1 = r2.getId()
            if (r1 == 0) goto L_0x01e7
            X.1OC r22 = X.LSW.A03(r3, r1)
            java.lang.Object r1 = r5.A02
            X.1P0 r1 = (X.1P0) r1
            X.2MU r6 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09
            android.app.Application r5 = X.DbY.A05(r4)
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r20 = r6.A00(r5, r3)
            X.I8S r10 = new X.I8S
            r18 = r10
            r19 = r4
            r21 = r1
            r23 = r3
            r24 = r2
            r25 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            X.I9M r12 = X.C56659I6o.A00(r1, r3, r2, r0)
            r18 = 2131957555(0x7f131733, float:1.9551697E38)
            r19 = 2131957531(0x7f13171b, float:1.9551649E38)
            r20 = 2131954722(0x7f130c22, float:1.9545951E38)
            X.C56659I6o.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x009f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00a2:
            r16 = 0
            goto L_0x0015
        L_0x00a6:
            X.5Wy r11 = (X.C286575Wy) r11
            int r1 = X.C51968G9o.A0B(r28)
            r0 = 2
            if (r1 != r0) goto L_0x00b9
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x00b9
            r11.Evl()
            goto L_0x009f
        L_0x00b9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00c7
            r1 = 645625610(0x267b770a, float:8.7244447E-16)
            java.lang.String r0 = "com.instagram.feed.tifu.ui.Tifu1x1Unit.<anonymous> (Tifu1x1Unit.kt:50)"
            X.0fL.A01(r1, r0)
        L_0x00c7:
            java.lang.Object r13 = r5.A07
            X.5vX r13 = (X.AnonymousClass5vX) r13
            java.lang.Object r12 = r5.A05
            java.lang.Object r10 = r5.A08
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.Object r9 = r5.A04
            X.0sL r9 = (X.0sL) r9
            java.lang.Object r8 = r5.A02
            X.0sP r8 = (X.0sP) r8
            java.lang.Object r7 = r5.A03
            X.0sP r7 = (X.0sP) r7
            java.lang.Object r0 = r5.A01
            r21 = r0
            java.lang.Object r0 = r5.A06
            r20 = r0
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            X.5Zx r1 = X.C287275Zs.A07
            X.5Zr r0 = X.C287215Zl.A02
            r5 = 0
            X.5RD r15 = X.C291495hO.A02(r1, r11, r0, r5)
            int r14 = X.C287425a7.A00(r11)
            r4 = r11
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r2 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r11, r6)
            X.0sa r0 = X.C287485aD.A00
            X.C51973G9u.A0z(r11, r4, r0)
            X.0sL r1 = X.C287485aD.A03
            X.0sL r19 = X.C51969G9p.A0w(r11, r15, r2, r1)
            X.0sL r15 = X.C287485aD.A02
            boolean r2 = r4.A0K
            if (r2 != 0) goto L_0x0116
            boolean r2 = X.C51972G9s.A1Q(r11, r14)
            if (r2 != 0) goto L_0x0119
        L_0x0116:
            X.C51971G9r.A13(r11, r15, r14)
        L_0x0119:
            X.0sL r18 = X.C51966G9m.A1K(r11, r3)
            r14 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r2 = X.C51967G9n.A0G(r6, r14)
            androidx.compose.ui.Modifier r2 = X.C51966G9m.A0V(r2)
            X.5RD r17 = X.C51971G9r.A0S(r11, r14)
            int r3 = X.C287425a7.A00(r11)
            X.5RM r16 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r11, r2)
            X.C51973G9u.A0z(r11, r4, r0)
            r0 = r17
            X.C287595aO.A00(r11, r0, r1)
            r1 = r16
            r0 = r19
            boolean r0 = X.C51965G9l.A1Y(r11, r4, r1, r0)
            if (r0 != 0) goto L_0x014f
            boolean r0 = X.C51972G9s.A1Q(r11, r3)
            if (r0 != 0) goto L_0x0152
        L_0x014f:
            X.C51971G9r.A13(r11, r15, r3)
        L_0x0152:
            r0 = r18
            X.C287595aO.A00(r11, r2, r0)
            r0 = 283246002(0x10e1fdb2, float:8.913773E-29)
            r11.ExS(r0)
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x01d6
            r0 = 283247923(0x10e20533, float:8.914929E-29)
            r11.ExS(r0)
            X.62P r0 = r13.A06
            java.lang.Object r13 = X.00k.A0J(r0)
            X.9J3 r13 = (X.AnonymousClass9J3) r13
            if (r13 == 0) goto L_0x01c5
            r0 = 1394613064(0x53201b48, float:6.8765247E11)
            boolean r1 = X.G9t.A1Z(r11, r12, r13, r0)
            java.lang.Object r0 = r11.ECw()
            if (r1 != 0) goto L_0x0182
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x018c
        L_0x0182:
            r1 = 9
            X.Inq r0 = new X.Inq
            r0.<init>(r1, r12, r13)
            r11.FLL(r0)
        L_0x018c:
            androidx.compose.ui.Modifier r0 = X.C51969G9p.A0V(r4, r6, r0)
            androidx.compose.ui.Modifier r14 = X.G9w.A0E(r11, r0)
            java.lang.String r0 = r13.A03
            r15 = r10
            r16 = r0
            r17 = r8
            r18 = r7
            r19 = r9
            androidx.compose.ui.Modifier r1 = X.AnonymousClass6CM.A00(r14, r15, r16, r17, r18, r19)
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x01ad
            r0 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r6 = X.C51967G9n.A0H(r6, r0)
        L_0x01ad:
            androidx.compose.ui.Modifier r6 = r1.Ezh(r6)
            r3 = -526569148(0xffffffffe09d3144, float:-9.0615274E19)
            r2 = 28
            r1 = r21
            r0 = r20
            X.JG3 r0 = X.JG3.A00(r1, r0, r13, r2)
            X.5PJ r0 = X.AnonymousClass5PI.A01(r11, r0, r3)
        L_0x01c2:
            X.C304846Fl.A02(r11, r6, r0)
        L_0x01c5:
            X.C286565Wx.A0L(r4, r5)
            boolean r0 = X.C51973G9u.A1R(r11, r4)
            if (r0 == 0) goto L_0x009f
            r0 = 264638048(0xfc60e60, float:1.9529844E-29)
            X.0fL.A00(r0)
            goto L_0x009f
        L_0x01d6:
            r0 = 285248725(0x11008cd5, float:1.0140817E-28)
            r11.ExS(r0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A09(r6, r14, r14)
            androidx.compose.ui.Modifier r6 = X.G9w.A0E(r11, r0)
            X.0sL r0 = X.C55339Hg7.A00
            goto L_0x01c2
        L_0x01e7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59206JAk.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
