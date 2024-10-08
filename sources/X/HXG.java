package X;

public abstract class HXG {
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x022c, code lost:
        if (r31.length() == 0) goto L_0x022e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, X.C62320sa r43, X.C62320sa r44, int r45, int r46, boolean r47) {
        /*
            r28 = r44
            r27 = r47
            r29 = r43
            r8 = r40
            r30 = r42
            r31 = r41
            r1 = -207663249(0xfffffffff39f4f6f, float:-2.5243723E31)
            r0 = r39
            r0.ExV(r1)
            r38 = r46
            r11 = r46 & 1
            r7 = r45
            if (r11 == 0) goto L_0x031c
            r3 = r45 | 6
        L_0x001e:
            r10 = r46 & 2
            if (r10 == 0) goto L_0x030f
            r3 = r3 | 48
        L_0x0024:
            r9 = r46 & 4
            if (r9 == 0) goto L_0x0304
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x002a:
            r6 = r46 & 8
            if (r6 == 0) goto L_0x02f7
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r2 = r46 & 16
            if (r2 == 0) goto L_0x02ea
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r5 = r46 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x0046
            r1 = r45 & r1
            if (r1 != 0) goto L_0x0047
            r1 = r28
            int r1 = X.G9t.A0J(r0, r1)
        L_0x0046:
            r3 = r3 | r1
        L_0x0047:
            r1 = 74899(0x12493, float:1.04956E-40)
            r4 = r3 & r1
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r1) goto L_0x0078
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0078
            r0.Evl()
        L_0x005a:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0077
            X.J9c r0 = new X.J9c
            r32 = r8
            r33 = r31
            r34 = r30
            r35 = r29
            r36 = r28
            r37 = r7
            r39 = r27
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39)
            r1.A06 = r0
        L_0x0077:
            return
        L_0x0078:
            r26 = 0
            if (r11 == 0) goto L_0x007e
            r31 = r26
        L_0x007e:
            if (r10 == 0) goto L_0x0082
            r30 = r26
        L_0x0082:
            if (r9 == 0) goto L_0x0086
            r8 = r26
        L_0x0086:
            if (r6 == 0) goto L_0x008a
            X.Ipy r29 = X.C58317Ipy.A00
        L_0x008a:
            r6 = 0
            r1 = r27
            boolean r27 = X.C51966G9m.A1Q(r2, r1)
            if (r5 == 0) goto L_0x0095
            X.Ipz r28 = X.C58318Ipz.A00
        L_0x0095:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00a3
            r2 = 1106539678(0x41f4749e, float:30.556942)
            java.lang.String r1 = "com.instagram.compose.igds.components.banner.IgdsBanner (IgdsBanner.kt:39)"
            X.0fL.A01(r2, r1)
        L_0x00a3:
            r25 = 1094713344(0x41400000, float:12.0)
            r24 = 1109393408(0x42200000, float:40.0)
            if (r31 == 0) goto L_0x00af
            int r1 = r31.length()
            if (r1 != 0) goto L_0x00be
        L_0x00af:
            if (r30 == 0) goto L_0x00b7
            int r1 = r30.length()
            if (r1 != 0) goto L_0x00be
        L_0x00b7:
            java.lang.String r0 = "Banner must have a body text or action text."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00be:
            X.5a0 r23 = X.C287275Zs.A02
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r11 = X.C51966G9m.A0T(r13)
            X.5Zr r12 = X.C287215Zl.A02
            r22 = 6
            r2 = r23
            r1 = r22
            X.5RD r10 = X.C291495hO.A02(r2, r0, r12, r1)
            int r5 = X.C287425a7.A00(r0)
            r4 = r0
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r9 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r0, r11)
            X.0sa r21 = X.C287485aD.A00
            r1 = r21
            X.C51973G9u.A0z(r0, r4, r1)
            X.0sL r15 = X.C287485aD.A03
            X.0sL r20 = X.C51969G9p.A0w(r0, r10, r9, r15)
            X.0sL r14 = X.C287485aD.A02
            boolean r1 = r4.A0K
            if (r1 != 0) goto L_0x00fa
            boolean r1 = X.C51972G9s.A1Q(r0, r5)
            if (r1 != 0) goto L_0x00fd
        L_0x00fa:
            X.C51971G9r.A13(r0, r14, r5)
        L_0x00fd:
            X.0sL r19 = X.C51966G9m.A1K(r0, r2)
            r5 = 0
            X.C56618I4t.A00(r0)
            androidx.compose.foundation.layout.FillElement r1 = X.C287205Zk.A00
            androidx.compose.ui.Modifier r2 = r13.Ezh(r1)
            r1 = 0
            if (r8 == 0) goto L_0x0110
            r1 = 1098907648(0x41800000, float:16.0)
        L_0x0110:
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r2, r1, r5, r5, r5)
            X.5RD r10 = X.C51968G9o.A0W(r0)
            int r9 = X.C287425a7.A00(r0)
            X.5RM r11 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r0, r1)
            r1 = r21
            X.C51973G9u.A0z(r0, r4, r1)
            X.C287595aO.A00(r0, r10, r15)
            r10 = r20
            boolean r1 = X.C51965G9l.A1Y(r0, r4, r11, r10)
            if (r1 != 0) goto L_0x013a
            boolean r1 = X.C51972G9s.A1Q(r0, r9)
            if (r1 != 0) goto L_0x013d
        L_0x013a:
            X.C51971G9r.A13(r0, r14, r9)
        L_0x013d:
            r1 = r19
            X.C287595aO.A00(r0, r2, r1)
            X.6FX r18 = X.AnonymousClass6FX.A00
            r1 = 1663854870(0x632c6916, float:3.1804122E21)
            r0.ExS(r1)
            if (r8 == 0) goto L_0x02e6
            int r2 = r8.intValue()
            int r1 = r3 >> 6
            X.2DO r41 = X.C51966G9m.A0Y(r0, r1, r2)
            long r46 = X.C51966G9m.A0G(r0)
            r1 = r25
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A09(r13, r5, r1)
            r1 = 1110441984(0x42300000, float:44.0)
            androidx.compose.ui.Modifier r9 = X.C287205Zk.A0C(r2, r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            long r16 = X.C51966G9m.A0F(r0)
            X.5ZQ r1 = X.AnonymousClass5ZN.A00
            r11 = r9
            r10 = r2
            r9 = r1
            r1 = r16
            androidx.compose.ui.Modifier r40 = X.C304816Fi.A03(r11, r9, r10, r1)
            X.5bR r42 = X.C288075bK.A06
            r44 = 24624(0x6030, float:3.4506E-41)
            r17 = 1109393408(0x42200000, float:40.0)
            r43 = r26
            r45 = r6
            X.C288165bT.A06(r39, r40, r41, r42, r43, r44, r45, r46)
        L_0x0184:
            X.C286565Wx.A0L(r4, r6)
            if (r8 != 0) goto L_0x018b
            X.5Zr r12 = X.C287215Zl.A00
        L_0x018b:
            r16 = 1
            r1 = r18
            androidx.compose.ui.Modifier r2 = r1.A00(r13)
            r1 = r25
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A09(r2, r5, r1)
            r9 = r23
            r2 = r22
            X.5RD r11 = X.C291495hO.A02(r9, r0, r12, r2)
            int r10 = X.C287425a7.A00(r0)
            X.5RM r9 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r0, r1)
            r1 = r21
            X.C51973G9u.A0z(r0, r4, r1)
            X.C287595aO.A00(r0, r11, r15)
            r1 = r20
            boolean r1 = X.C51965G9l.A1Y(r0, r4, r9, r1)
            if (r1 != 0) goto L_0x01c3
            boolean r1 = X.C51972G9s.A1Q(r0, r10)
            if (r1 != 0) goto L_0x01c6
        L_0x01c3:
            X.C51971G9r.A13(r0, r14, r10)
        L_0x01c6:
            r1 = r19
            X.C287595aO.A00(r0, r2, r1)
            r1 = -1922763423(0xffffffff8d64f561, float:-7.055329E-31)
            r0.ExS(r1)
            if (r31 == 0) goto L_0x01fd
            int r1 = r31.length()
            if (r1 == 0) goto L_0x01fd
            r43 = 3
            if (r8 == 0) goto L_0x01df
            r43 = 5
        L_0x01df:
            long r45 = X.C51966G9m.A0H(r0)
            X.5Z4 r41 = X.C51966G9m.A0b(r0)
            r2 = 1109393408(0x42200000, float:40.0)
            if (r8 == 0) goto L_0x01ed
            r2 = 1094713344(0x41400000, float:12.0)
        L_0x01ed:
            r1 = 1109393408(0x42200000, float:40.0)
            if (r27 == 0) goto L_0x01f2
            r1 = 0
        L_0x01f2:
            androidx.compose.ui.Modifier r40 = X.C287195Zj.A0B(r13, r2, r5, r1, r5)
            r44 = r3 & 14
            r42 = r31
            X.AnonymousClass5ZZ.A0H(r39, r40, r41, r42, r43, r44, r45)
        L_0x01fd:
            X.C286565Wx.A0L(r4, r6)
            r1 = -1922741032(0xffffffff8d654cd8, float:-7.065857E-31)
            r0.ExS(r1)
            if (r30 == 0) goto L_0x02e4
            boolean r1 = X.00l.A0W(r30)
            if (r1 != 0) goto L_0x02e4
            r43 = 3
            if (r8 == 0) goto L_0x0214
            r43 = 5
        L_0x0214:
            long r45 = X.C51966G9m.A0N(r0)
            X.5Z4 r41 = X.C51966G9m.A0f(r0)
            if (r8 != 0) goto L_0x0220
            r25 = 1109393408(0x42200000, float:40.0)
        L_0x0220:
            if (r27 == 0) goto L_0x0224
            r24 = 0
        L_0x0224:
            if (r31 == 0) goto L_0x022e
            int r1 = r31.length()
            r9 = 1082130432(0x40800000, float:4.0)
            if (r1 != 0) goto L_0x022f
        L_0x022e:
            r9 = 0
        L_0x022f:
            r2 = r24
            r1 = r25
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r13, r1, r9, r2, r5)
            r1 = -1922715693(0xffffffff8d65afd3, float:-7.0777714E-31)
            boolean r1 = X.C51974G9v.A1a(r0, r1, r3)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x0248
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x0254
        L_0x0248:
            r2 = 36
            X.Wvs r5 = new X.Wvs
            r1 = r29
            r5.<init>(r1, r2)
            r0.FLL(r5)
        L_0x0254:
            X.0sa r9 = X.C51965G9l.A0y(r4, r5, r6)
            r5 = r16
            r2 = r26
            androidx.compose.ui.Modifier r40 = X.C287635aW.A05(r10, r2, r2, r9, r5)
            int r1 = r3 >> 3
            r44 = r1 & 14
            r5 = 0
            r42 = r30
            X.AnonymousClass5ZZ.A0H(r39, r40, r41, r42, r43, r44, r45)
        L_0x026a:
            X.C286565Wx.A0L(r4, r6)
            r0.ASN()
            r1 = 1663933367(0x632d9bb7, float:3.2025072E21)
            r0.ExS(r1)
            if (r27 == 0) goto L_0x02cd
            r1 = 2131239026(0x7f082072, float:1.8094347E38)
            X.2DO r14 = X.C287975bA.A00(r0, r1, r6)
            long r19 = X.C51966G9m.A0L(r0)
            X.5Zp r2 = X.C287215Zl.A05
            r1 = r18
            androidx.compose.ui.Modifier r2 = r1.AB1(r2, r13)
            r1 = r17
            androidx.compose.ui.Modifier r9 = X.C287205Zk.A0C(r2, r1)
            r1 = 1663945425(0x632dcad1, float:3.2059012E21)
            r0.ExS(r1)
            r1 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r1
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r1) goto L_0x029f
            r5 = 1
        L_0x029f:
            java.lang.Object r3 = r0.ECw()
            if (r5 != 0) goto L_0x02a9
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r3 != r1) goto L_0x02b5
        L_0x02a9:
            r2 = 37
            X.Wvs r3 = new X.Wvs
            r1 = r28
            r3.<init>(r1, r2)
            r0.FLL(r3)
        L_0x02b5:
            X.0sa r5 = X.C51965G9l.A0y(r4, r3, r6)
            r3 = r16
            r2 = r26
            androidx.compose.ui.Modifier r13 = X.C287635aW.A05(r9, r2, r2, r5, r3)
            X.5bR r15 = X.C288075bK.A06
            r17 = 24624(0x6030, float:3.4506E-41)
            r12 = r0
            r16 = r2
            r18 = r6
            X.C288165bT.A06(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x02cd:
            X.C286565Wx.A0L(r4, r6)
            r0.ASN()
            X.C56618I4t.A00(r0)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x005a
            r1 = 1564550830(0x5d4126ae, float:8.6987519E17)
            X.0fL.A00(r1)
            goto L_0x005a
        L_0x02e4:
            r5 = 0
            goto L_0x026a
        L_0x02e6:
            r17 = 1109393408(0x42200000, float:40.0)
            goto L_0x0184
        L_0x02ea:
            r1 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0036
            r1 = r27
            int r1 = X.G9t.A0c(r0, r1)
            r3 = r3 | r1
            goto L_0x0036
        L_0x02f7:
            r1 = r7 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0030
            r1 = r29
            int r1 = X.G9t.A0H(r0, r1)
            r3 = r3 | r1
            goto L_0x0030
        L_0x0304:
            r1 = r7 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x002a
            int r1 = X.G9t.A0Q(r0, r8)
            r3 = r3 | r1
            goto L_0x002a
        L_0x030f:
            r1 = r45 & 48
            if (r1 != 0) goto L_0x0024
            r1 = r30
            int r1 = X.G9t.A0P(r0, r1)
            r3 = r3 | r1
            goto L_0x0024
        L_0x031c:
            r1 = r45 & 6
            if (r1 != 0) goto L_0x032a
            r1 = r31
            int r3 = X.G9t.A0O(r0, r1)
            r3 = r3 | r45
            goto L_0x001e
        L_0x032a:
            r3 = r7
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HXG.A00(X.5Wy, java.lang.Integer, java.lang.String, java.lang.String, X.0sa, X.0sa, int, int, boolean):void");
    }
}
