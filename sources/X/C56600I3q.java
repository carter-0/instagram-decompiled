package X;

/* renamed from: X.I3q  reason: case insensitive filesystem */
public abstract class C56600I3q {
    public static final long A00 = AnonymousClass5Z7.A00(-0.32f, 4294967296L);

    public static final void A00(C286575Wy r5, C390759rn r6, 0sP r7, int i, int i2) {
        int i3;
        0qQ.A0B(r7, 1);
        r5.ExV(1760624365);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r5, r6) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r5, r7);
        }
        if ((i3 & 19) != 18 || !r5.Bwn()) {
            if (i4 != 0) {
                r6 = C390759rn.None;
            }
            if (0fL.A02()) {
                0fL.A01(1573067588, "com.instagram.creation.capture.quickcapture.sundial.overlay.ui.PostCaptureOverlay (OverlayComposables.kt:47)");
            }
            if (r6 != C390759rn.None) {
                if (r6 == C390759rn.AssetHubCutoutTextSticker) {
                    A01(r5, r7, (i3 >> 3) & 14, 2, false);
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            if (0fL.A02()) {
                0fL.A00(-1268541785);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(r7, r6, i2, i, 26);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: X.Iwr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: X.Iwr} */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0145, code lost:
        if (r3 == X.AnonymousClass5XT.A00) goto L_0x0147;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r60, X.0sP r61, int r62, int r63, boolean r64) {
        /*
            r11 = r64
            r12 = 0
            r0 = r61
            X.0qQ.A0B(r0, r12)
            r1 = -1351109689(0xffffffffaf77b3c7, float:-2.2528389E-10)
            r0 = r60
            r0.ExV(r1)
            r59 = r63
            r1 = r63 & 1
            r21 = 2
            r58 = r62
            if (r1 == 0) goto L_0x0219
            r3 = r62 | 6
        L_0x001c:
            r4 = r63 & 2
            if (r4 == 0) goto L_0x020e
            r3 = r3 | 48
        L_0x0022:
            r2 = r3 & 19
            r1 = 18
            if (r2 != r1) goto L_0x0047
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0047
            r0.Evl()
        L_0x0031:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0046
            r60 = 3
            X.J7n r0 = new X.J7n
            r56 = r0
            r57 = r61
            r61 = r11
            r56.<init>(r57, r58, r59, r60, r61)
            r1.A06 = r0
        L_0x0046:
            return
        L_0x0047:
            boolean r11 = X.C51966G9m.A1R(r4, r11)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0059
            r2 = 1262931093(0x4b46cc95, float:1.3028501E7)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.sundial.overlay.ui.FloatingGhostAddTextOverlay (OverlayComposables.kt:58)"
            X.0fL.A01(r2, r1)
        L_0x0059:
            r1 = r21
            float[] r1 = new float[r1]
            r1 = {1092616192, 1092616192} // fill-array
            r10 = 0
            android.graphics.DashPathEffect r2 = new android.graphics.DashPathEffect
            r2.<init>(r1, r10)
            X.IFz r1 = new X.IFz
            r1.<init>(r2)
            r22 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 1082130432(0x40800000, float:4.0)
            X.5tg r20 = new X.5tg
            r4 = r20
            r5 = r1
            r8 = r12
            r9 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r19 = X.C287645aX.A01(r0, r1)
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            float r18 = X.C287645aX.A01(r0, r1)
            r1 = 2131165504(0x7f070140, float:1.7945227E38)
            float r4 = X.C287645aX.A01(r0, r1)
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            long r34 = X.AnonymousClass5Z7.A00(r4, r1)
            r1 = 2131955467(0x7f130f0b, float:1.9547462E38)
            java.lang.String r17 = X.C304346Dc.A00(r0, r1)
            long r13 = X.C51966G9m.A0I(r0)
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            if (r11 == 0) goto L_0x0206
            androidx.compose.ui.Modifier r6 = X.C51966G9m.A0U(r1)
        L_0x00ac:
            X.5RD r4 = X.C51968G9o.A0X(r0)
            int r9 = X.C287425a7.A00(r0)
            r5 = r0
            X.5Wx r5 = (X.C286565Wx) r5
            X.5RM r2 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r0, r6)
            X.0sa r7 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r5, r7)
            X.0sL r6 = X.C287485aD.A03
            X.0sL r16 = X.C51969G9p.A0w(r0, r4, r2, r6)
            X.0sL r4 = X.C287485aD.A02
            boolean r2 = r5.A0K
            if (r2 != 0) goto L_0x00d6
            boolean r2 = X.C51972G9s.A1Q(r0, r9)
            if (r2 != 0) goto L_0x00d9
        L_0x00d6:
            X.C51971G9r.A13(r0, r4, r9)
        L_0x00d9:
            X.0sL r15 = X.C51966G9m.A1K(r0, r8)
            r2 = 0
            if (r11 == 0) goto L_0x00e2
            r2 = 1124073472(0x43000000, float:128.0)
        L_0x00e2:
            androidx.compose.ui.Modifier r8 = X.C56164Htt.A00(r1, r10, r2)
            androidx.compose.ui.Alignment r2 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r37 = X.C287205Zk.A02(r2, r8)
            X.5aV r38 = X.C51965G9l.A0R(r12)
            r8 = 555513875(0x211c7813, float:5.3013773E-19)
            boolean r3 = X.C51974G9v.A1X(r0, r8, r3)
            java.lang.Object r8 = r0.ECw()
            if (r3 != 0) goto L_0x0101
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r8 != r3) goto L_0x010d
        L_0x0101:
            r9 = 21
            X.MMR r8 = new X.MMR
            r3 = r61
            r8.<init>(r3, r9)
            r0.FLL(r8)
        L_0x010d:
            X.0sa r41 = X.C51965G9l.A0y(r5, r8, r12)
            r46 = 191(0xbf, float:2.68E-43)
            r36 = r0
            r39 = r22
            r40 = r22
            r42 = r10
            r43 = r10
            r44 = r10
            r45 = r10
            r47 = r12
            androidx.compose.ui.Modifier r9 = X.C52638GaC.A00(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r3 = 555518570(0x211c8a6a, float:5.3038045E-19)
            r0.ExS(r3)
            r3 = r19
            boolean r10 = r0.AGr(r3)
            boolean r8 = r0.AGt(r13)
            r3 = r20
            boolean r8 = X.C51968G9o.A1T(r0, r3, r10, r8)
            java.lang.Object r3 = r0.ECw()
            if (r8 != 0) goto L_0x0147
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r3 != r8) goto L_0x0159
        L_0x0147:
            r26 = 1
            X.Iwr r3 = new X.Iwr
            r25 = r19
            r27 = r13
            r23 = r3
            r24 = r20
            r23.<init>(r24, r25, r26, r27)
            r0.FLL(r3)
        L_0x0159:
            X.0sP r3 = X.C51965G9l.A0z(r5, r3)
            androidx.compose.ui.Modifier r8 = X.C289575dp.A00(r9, r3)
            r3 = 1053609165(0x3ecccccd, float:0.4)
            androidx.compose.ui.Modifier r8 = X.HRF.A00(r8, r3)
            X.5RD r9 = X.C287675aa.A00(r2, r12)
            int r3 = X.C287425a7.A00(r0)
            X.5RM r2 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r0, r8)
            X.C51973G9u.A0z(r0, r5, r7)
            X.C287595aO.A00(r0, r9, r6)
            r6 = r16
            boolean r2 = X.C51965G9l.A1Y(r0, r5, r2, r6)
            if (r2 != 0) goto L_0x018c
            boolean r2 = X.C51972G9s.A1Q(r0, r3)
            if (r2 != 0) goto L_0x018f
        L_0x018c:
            X.C51971G9r.A13(r0, r4, r3)
        L_0x018f:
            X.C287595aO.A00(r0, r8, r15)
            r2 = r18
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A07(r1, r2)
            r38 = 0
            X.5Z4 r24 = X.AnonymousClass5Z4.A03
            X.4dT r25 = X.C268454dQ.A00
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r0)
            long r2 = r2.A14
            r28 = 3
            X.5ZD r26 = X.AnonymousClass5ZD.A01
            long r36 = A00
            r10 = 1
            r7 = 1099431936(0x41880000, float:17.0)
            r8 = 1077936128(0x40400000, float:3.0)
            X.5tg r23 = new X.5tg
            r5 = r23
            r6 = r22
            r9 = r21
            r5.<init>(r6, r7, r8, r9, r10)
            r31 = 16727896(0xff3f58, float:2.3440775E-38)
            r27 = r6
            r29 = r12
            r30 = r12
            r32 = r2
            X.5Z4 r3 = X.AnonymousClass5Z4.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r34, r36, r38)
            r2 = r17
            X.AnonymousClass5ZZ.A06(r0, r4, r3, r2)
            r2 = r18
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A07(r1, r2)
            long r50 = X.C51966G9m.A0I(r0)
            r49 = 16744280(0xff7f58, float:2.3463734E-38)
            r41 = r6
            r42 = r24
            r43 = r25
            r44 = r26
            r45 = r6
            r46 = r28
            r48 = r12
            r52 = r34
            r54 = r36
            r56 = r38
            X.5Z4 r3 = X.AnonymousClass5Z4.A00(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r52, r54, r56)
            r2 = r17
            X.AnonymousClass5ZZ.A06(r0, r1, r3, r2)
            boolean r1 = X.C51971G9r.A1R(r0)
            if (r1 == 0) goto L_0x0031
            r1 = -41733281(0xfffffffffd83335f, float:-2.179945E37)
            X.0fL.A00(r1)
            goto L_0x0031
        L_0x0206:
            androidx.compose.ui.Alignment r2 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A02(r2, r1)
            goto L_0x00ac
        L_0x020e:
            r1 = r62 & 48
            if (r1 != 0) goto L_0x0022
            int r1 = X.G9t.A0Z(r0, r11)
            r3 = r3 | r1
            goto L_0x0022
        L_0x0219:
            r1 = r62 & 6
            if (r1 != 0) goto L_0x0227
            r1 = r61
            int r3 = X.C41848B3p.A01(r0, r1)
            r3 = r3 | r62
            goto L_0x001c
        L_0x0227:
            r3 = r58
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56600I3q.A01(X.5Wy, X.0sP, int, int, boolean):void");
    }
}
