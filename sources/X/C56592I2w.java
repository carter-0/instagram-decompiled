package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I2w  reason: case insensitive filesystem */
public abstract class C56592I2w {
    public static final void A01(C286575Wy r31, Modifier modifier, AnonymousClass0iw r33, C55647Hl6 hl6, C47183Dry dry, String str, C62320sa r37, C62320sa r38, C62320sa r39, C62320sa r40, 0sP r41, 0sP r42, 0sK r43, 0sK r44, int i, int i2, boolean z) {
        int i3;
        int i4;
        0sK r5 = r43;
        0sP r7 = r41;
        AnonymousClass7TF.A1H(r7, r5);
        0sP r6 = r42;
        0sK r4 = r44;
        C62320sa r11 = r37;
        C62320sa r10 = r38;
        C62320sa r9 = r39;
        C51974G9v.A1S(r4, r6, r11, r10, r9);
        C62320sa r8 = r40;
        C55647Hl6 hl62 = hl6;
        C47183Dry dry2 = dry;
        C51973G9u.A0t(7, r8, hl62, dry2);
        AnonymousClass0iw r30 = r33;
        String str2 = str;
        DbW.A1P(str2, 11, r30);
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier2, 13);
        C286575Wy r13 = r31;
        r13.ExV(-2012034089);
        int i5 = i;
        int i6 = 4;
        if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r13, r7) | i;
        } else {
            i3 = i5;
        }
        int i7 = 32;
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r13, r5);
        }
        int i8 = 256;
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r13, r4);
        }
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r13, r6);
        }
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r13, r11);
        }
        if ((196608 & i) == 0) {
            i3 |= G9t.A0J(r13, r10);
        }
        if ((1572864 & i) == 0) {
            i3 |= G9t.A0K(r13, r9);
        }
        if ((12582912 & i) == 0) {
            i3 |= G9t.A0L(r13, r8);
        }
        if ((100663296 & i) == 0) {
            i3 |= G9t.A0W(r13, hl62);
        }
        if ((805306368 & i) == 0) {
            i3 |= G9t.A0N(r13, dry2);
        }
        int i9 = i2;
        boolean z2 = z;
        if ((i2 & 6) == 0) {
            if (!r13.AGv(z2)) {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i9;
        }
        if ((i2 & 48) == 0) {
            if (!r13.AGu(str2)) {
                i7 = 16;
            }
            i4 |= i7;
        }
        if ((i9 & 384) == 0) {
            if (!r13.AGw(r30)) {
                i8 = 128;
            }
            i4 |= i8;
        }
        if ((i9 & 3072) == 0) {
            i4 |= C51971G9r.A07(r13, modifier2);
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 1171) == 1170 && r13.Bwn()) {
            r13.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(-1529772567, "com.instagram.opal.impl.ui.OpalTabContent (OpalTabContent.kt:97)");
            }
            C55079Hbo.A00(r13, modifier2, hl62, AnonymousClass5PI.A01(r13, new C59443JJs(r30, dry2, str2, r11, r10, r9, r8, r7, r6, r5, r4, z2), 1821913988), ((i3 >> 24) & 14) | 384 | ((i4 >> 6) & 112), 0);
            if (0fL.A02()) {
                0fL.A00(229081247);
            }
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            boolean z3 = z2;
            0sP r132 = r7;
            0sK r14 = r5;
            0sK r15 = r4;
            0sP r16 = r6;
            C62320sa r17 = r11;
            ASQ.A06 = new JDA(r132, r14, r15, r16, r17, r10, r9, r8, dry2, hl62, r30, modifier2, str2, i5, i9, 0, z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029f, code lost:
        r0.ASN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02e6, code lost:
        X.C286565Wx.A0L(r1, false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r46, androidx.compose.ui.Modifier r47, X.C61064Jw2 r48, X.AnonymousClass0iw r49, X.HLK r50, java.lang.String r51, X.C62320sa r52, X.C62320sa r53, X.C62320sa r54, X.C62320sa r55, X.0sP r56, X.0sP r57, X.0sK r58, X.0sK r59, int r60, int r61, boolean r62) {
        /*
            r1 = -696412087(0xffffffffd67d9849, float:-6.9707625E13)
            r0 = r46
            r0.ExV(r1)
            r2 = r60
            r1 = r60 & 6
            r3 = 4
            r38 = r56
            if (r1 != 0) goto L_0x02fa
            r1 = r38
            int r14 = X.C41848B3p.A01(r0, r1)
            r14 = r14 | r60
        L_0x0019:
            r1 = r60 & 48
            r5 = 32
            r37 = r58
            if (r1 != 0) goto L_0x0028
            r1 = r37
            int r1 = X.G9t.A0F(r0, r1)
            r14 = r14 | r1
        L_0x0028:
            r1 = r2 & 384(0x180, float:5.38E-43)
            r4 = 128(0x80, float:1.794E-43)
            r36 = r59
            if (r1 != 0) goto L_0x0037
            r1 = r36
            int r1 = X.G9t.A0G(r0, r1)
            r14 = r14 | r1
        L_0x0037:
            r1 = r2 & 3072(0xc00, float:4.305E-42)
            r21 = r57
            if (r1 != 0) goto L_0x0044
            r1 = r21
            int r1 = X.G9t.A0H(r0, r1)
            r14 = r14 | r1
        L_0x0044:
            r1 = r2 & 24576(0x6000, float:3.4438E-41)
            r42 = r52
            if (r1 != 0) goto L_0x0051
            r1 = r42
            int r1 = X.G9t.A0I(r0, r1)
            r14 = r14 | r1
        L_0x0051:
            r1 = 196608(0x30000, float:2.75506E-40)
            r1 = r60 & r1
            r41 = r53
            if (r1 != 0) goto L_0x0060
            r1 = r41
            int r1 = X.G9t.A0J(r0, r1)
            r14 = r14 | r1
        L_0x0060:
            r1 = 1572864(0x180000, float:2.204052E-39)
            r1 = r60 & r1
            r40 = r54
            if (r1 != 0) goto L_0x006f
            r1 = r40
            int r1 = X.G9t.A0K(r0, r1)
            r14 = r14 | r1
        L_0x006f:
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r60 & r1
            r39 = r55
            if (r1 != 0) goto L_0x007e
            r1 = r39
            int r1 = X.G9t.A0L(r0, r1)
            r14 = r14 | r1
        L_0x007e:
            r1 = 100663296(0x6000000, float:2.4074124E-35)
            r1 = r60 & r1
            r46 = r48
            if (r1 != 0) goto L_0x008d
            r1 = r46
            int r1 = X.G9t.A0M(r0, r1)
            r14 = r14 | r1
        L_0x008d:
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r60 & r1
            r44 = r50
            if (r1 != 0) goto L_0x009c
            r1 = r44
            int r1 = X.G9t.A0X(r0, r1)
            r14 = r14 | r1
        L_0x009c:
            r9 = r61
            r1 = r61 & 6
            r35 = r62
            if (r1 != 0) goto L_0x02f7
            r1 = r35
            boolean r1 = r0.AGv(r1)
            if (r1 != 0) goto L_0x00ad
            r3 = 2
        L_0x00ad:
            r3 = r3 | r61
        L_0x00af:
            r1 = r61 & 48
            r43 = r51
            if (r1 != 0) goto L_0x00c0
            r1 = r43
            boolean r1 = r0.AGu(r1)
            if (r1 != 0) goto L_0x00bf
            r5 = 16
        L_0x00bf:
            r3 = r3 | r5
        L_0x00c0:
            r1 = r9 & 384(0x180, float:5.38E-43)
            r45 = r49
            if (r1 != 0) goto L_0x00d1
            r1 = r45
            boolean r1 = r0.AGw(r1)
            if (r1 == 0) goto L_0x00d0
            r4 = 256(0x100, float:3.59E-43)
        L_0x00d0:
            r3 = r3 | r4
        L_0x00d1:
            r1 = r9 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x00dc
            r1 = r47
            int r1 = X.G9t.A0R(r0, r1)
            r3 = r3 | r1
        L_0x00dc:
            r4 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r4 & r14
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r1) goto L_0x0124
            r4 = r3 & 1171(0x493, float:1.641E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r4 != r1) goto L_0x0124
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0124
            r0.Evl()
        L_0x00f4:
            X.5Xd r0 = r0.ASQ()
            if (r0 == 0) goto L_0x0123
            r22 = 1
            X.JDA r6 = new X.JDA
            r10 = r21
            r11 = r42
            r12 = r41
            r13 = r40
            r14 = r39
            r15 = r46
            r16 = r44
            r17 = r45
            r18 = r47
            r19 = r43
            r20 = r2
            r21 = r9
            r23 = r35
            r7 = r38
            r8 = r37
            r9 = r36
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0.A06 = r6
        L_0x0123:
            return
        L_0x0124:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0132
            r4 = -365617124(0xffffffffea35201c, float:-5.47418E25)
            java.lang.String r1 = "com.instagram.opal.impl.ui.OpalTabContentGrid (OpalTabContent.kt:139)"
            X.0fL.A01(r4, r1)
        L_0x0132:
            r1 = r46
            java.lang.Object r1 = r1.A00
            boolean r34 = X.G9w.A1b(r1)
            X.4bM r1 = X.C286955Yl.A00
            r0.AJO(r1)
            r1 = 622178796(0x2515b1ec, float:1.2983972E-16)
            java.lang.Object r1 = X.C51967G9n.A0m(r0, r1)
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r1 != r6) goto L_0x0151
            java.lang.Boolean r1 = X.AnonymousClass7TE.A0v()
            r0.FLL(r1)
        L_0x0151:
            boolean r25 = X.AnonymousClass7TE.A1a(r1)
            r1 = r0
            X.5Wx r1 = (X.C286565Wx) r1
            r4 = 0
            X.C286565Wx.A0L(r1, r4)
            X.4bM r5 = X.AnonymousClass5YA.A05
            java.lang.Object r18 = r0.AJO(r5)
            r5 = 622181632(0x2515bd00, float:1.2987726E-16)
            java.lang.Object r8 = X.C51967G9n.A0m(r0, r5)
            if (r8 != r6) goto L_0x0180
            X.6Fg r8 = X.C304786Ff.A00
            long r5 = X.AnonymousClass5RW.A07
            X.5RW r7 = X.C51965G9l.A0N(r5)
            long r5 = X.C291445hJ.A02
            java.util.List r5 = X.G9t.A1D(r7, r5)
            X.Gey r8 = r8.A03(r5)
            r0.FLL(r8)
        L_0x0180:
            X.C286565Wx.A0L(r1, r4)
            X.5RD r10 = X.C51966G9m.A0a(r4)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r5 = X.C286565Wx.A04(r1)
            r6 = r47
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r6)
            X.0sa r7 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r1, r7)
            X.0sL r6 = X.C287485aD.A03
            X.0sL r13 = X.C51969G9p.A0w(r0, r10, r5, r6)
            X.0sL r5 = X.C287485aD.A02
            boolean r10 = r1.A0K
            if (r10 != 0) goto L_0x01ac
            boolean r10 = X.C51972G9s.A1Q(r0, r12)
            if (r10 != 0) goto L_0x01af
        L_0x01ac:
            X.C51971G9r.A13(r0, r5, r12)
        L_0x01af:
            X.0sL r10 = X.C51966G9m.A1K(r0, r11)
            r29 = 0
            r11 = 300(0x12c, float:4.2E-43)
            X.GQC r12 = X.GQC.A00(r11, r4)
            r11 = 0
            X.GeF r26 = X.I74.A00(r12, r11)
            X.Hte r27 = X.C56152Hte.A00
            r12 = -1972412245(0xffffffff8a6f60ab, float:-1.1525613E-32)
            r24 = 1
            X.JHW r11 = new X.JHW
            r15 = r11
            r16 = r46
            r17 = r44
            r19 = r36
            r20 = r37
            r22 = r38
            r23 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            X.5PJ r31 = X.AnonymousClass5PI.A01(r0, r11, r12)
            java.lang.String r30 = "opal_grid_visibility"
            r32 = 221568(0x36180, float:3.10483E-40)
            r33 = 2
            r28 = r0
            X.C56663I6s.A07(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r8 = -2049507934(0xffffffff85d6fda2, float:-2.0217633E-35)
            r0.ExS(r8)
            if (r34 != 0) goto L_0x02e9
            r8 = r46
            java.lang.Object r8 = r8.A01
            X.KhB r8 = (X.C62520KhB) r8
            int r8 = r8.ordinal()
            switch(r8) {
                case 0: goto L_0x0206;
                case 1: goto L_0x0249;
                case 2: goto L_0x02aa;
                case 3: goto L_0x0206;
                case 4: goto L_0x02a3;
                case 5: goto L_0x02a3;
                default: goto L_0x01fe;
            }
        L_0x01fe:
            r2 = -2049507258(0xffffffff85d70046, float:-2.0218603E-35)
            X.Wub r0 = X.C51972G9s.A0v(r0, r1, r2)
            throw r0
        L_0x0206:
            r3 = 890934203(0x351a93bb, float:5.7584447E-7)
            X.5Qk r12 = X.C51965G9l.A0K(r0, r3)
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0U(r12)
            androidx.compose.ui.Modifier r8 = X.C287195Zj.A01(r3)
            androidx.compose.ui.Alignment r11 = X.C287215Zl.A09
            X.5RD r15 = X.C287675aa.A00(r11, r4)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r3 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r0, r8)
            X.C51973G9u.A0z(r0, r1, r7)
            X.C287595aO.A00(r0, r15, r6)
            boolean r3 = X.C51965G9l.A1Y(r0, r1, r3, r13)
            if (r3 != 0) goto L_0x0239
            boolean r3 = X.C51972G9s.A1Q(r0, r14)
            if (r3 != 0) goto L_0x023c
        L_0x0239:
            X.C51971G9r.A13(r0, r5, r14)
        L_0x023c:
            X.C287595aO.A00(r0, r8, r10)
            X.5dj r3 = X.C289515dj.A00
            androidx.compose.ui.Modifier r3 = r3.AAz(r11, r12)
            X.GQD.A00(r0, r3)
            goto L_0x029f
        L_0x0249:
            r3 = 889818420(0x35098d34, float:5.1241955E-7)
            X.5Qk r15 = X.C51965G9l.A0K(r0, r3)
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0U(r15)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A01(r3)
            androidx.compose.ui.Alignment r8 = X.C287215Zl.A09
            X.5RD r14 = X.C287675aa.A00(r8, r4)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r3 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r11)
            X.C51973G9u.A0z(r0, r1, r7)
            X.C287595aO.A00(r0, r14, r6)
            boolean r3 = X.C51965G9l.A1Y(r0, r1, r3, r13)
            if (r3 != 0) goto L_0x027c
            boolean r3 = X.C51972G9s.A1Q(r0, r12)
            if (r3 != 0) goto L_0x027f
        L_0x027c:
            X.C51971G9r.A13(r0, r5, r12)
        L_0x027f:
            X.C287595aO.A00(r0, r11, r10)
            X.5dj r5 = X.C289515dj.A00
            r3 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r13 = X.C304346Dc.A00(r0, r3)
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A06(r15)
            androidx.compose.ui.Modifier r11 = r5.AAz(r8, r3)
            long r14 = X.C51966G9m.A0H(r0)
            X.5Z4 r12 = X.C51966G9m.A0g(r0)
            r10 = r0
            X.AnonymousClass5ZZ.A0X(r10, r11, r12, r13, r14)
        L_0x029f:
            r0.ASN()
            goto L_0x02e6
        L_0x02a3:
            r3 = 891231462(0x351f1ce6, float:5.927417E-7)
            r0.ExS(r3)
            goto L_0x02e6
        L_0x02aa:
            r5 = 890347931(0x3511a19b, float:5.4251876E-7)
            r0.ExS(r5)
            androidx.compose.ui.Modifier r11 = X.C51968G9o.A0O()
            r7 = 100663296(0x6000000, float:2.4074124E-35)
            int r6 = r14 >> 12
            r5 = r6 & 14
            r7 = r7 | r5
            r5 = r6 & 112(0x70, float:1.57E-43)
            r7 = r7 | r5
            int r7 = X.C51969G9p.A04(r6, r7)
            r6 = 57344(0xe000, float:8.0356E-41)
            int r5 = r14 >> 15
            r6 = r6 & r5
            r7 = r7 | r6
            r5 = 458752(0x70000, float:6.42848E-40)
            int r3 = r3 << 15
            r5 = r5 & r3
            int r19 = X.C51973G9u.A04(r7, r5, r3)
            r10 = r0
            r12 = r45
            r13 = r44
            r14 = r43
            r15 = r42
            r16 = r41
            r17 = r40
            r18 = r39
            r20 = r35
            A02(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x02e6:
            X.C286565Wx.A0L(r1, r4)
        L_0x02e9:
            boolean r1 = X.C51971G9r.A1S(r0, r1, r4)
            if (r1 == 0) goto L_0x00f4
            r1 = 330044141(0x13ac12ed, float:4.3437566E-27)
            X.0fL.A00(r1)
            goto L_0x00f4
        L_0x02f7:
            r3 = r9
            goto L_0x00af
        L_0x02fa:
            r14 = r2
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56592I2w.A00(X.5Wy, androidx.compose.ui.Modifier, X.Jw2, X.0iw, X.HLK, java.lang.String, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sK, X.0sK, int, int, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v89, resolved type: com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: X.IoS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.IoS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X.IoS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: X.IoS} */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ac, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0215, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x026c, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x026e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r41, androidx.compose.ui.Modifier r42, X.AnonymousClass0iw r43, X.HLK r44, java.lang.String r45, X.C62320sa r46, X.C62320sa r47, X.C62320sa r48, X.C62320sa r49, int r50, boolean r51) {
        /*
            r0 = -989964147(0xffffffffc4fe588d, float:-2034.7672)
            r8 = r41
            r8.ExV(r0)
            r7 = r50
            r0 = r50 & 6
            r39 = r46
            if (r0 != 0) goto L_0x02bd
            r0 = r39
            int r6 = X.C41848B3p.A01(r8, r0)
            r6 = r6 | r50
        L_0x0018:
            r0 = r50 & 48
            r38 = r47
            if (r0 != 0) goto L_0x0025
            r0 = r38
            int r0 = X.G9t.A0F(r8, r0)
            r6 = r6 | r0
        L_0x0025:
            r0 = r7 & 384(0x180, float:5.38E-43)
            r37 = r48
            if (r0 != 0) goto L_0x0032
            r0 = r37
            int r0 = X.G9t.A0G(r8, r0)
            r6 = r6 | r0
        L_0x0032:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            r36 = r49
            if (r0 != 0) goto L_0x003f
            r0 = r36
            int r0 = X.G9t.A0H(r8, r0)
            r6 = r6 | r0
        L_0x003f:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            r41 = r44
            if (r0 != 0) goto L_0x004c
            r0 = r41
            int r0 = X.G9t.A0S(r8, r0)
            r6 = r6 | r0
        L_0x004c:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r50 & r0
            r25 = r51
            if (r0 != 0) goto L_0x005b
            r0 = r25
            int r0 = X.G9t.A0d(r8, r0)
            r6 = r6 | r0
        L_0x005b:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r50 & r0
            r40 = r45
            if (r0 != 0) goto L_0x006a
            r0 = r40
            int r0 = X.G9t.A0U(r8, r0)
            r6 = r6 | r0
        L_0x006a:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r50 & r0
            r27 = r43
            if (r0 != 0) goto L_0x0079
            r0 = r27
            int r0 = X.G9t.A0L(r8, r0)
            r6 = r6 | r0
        L_0x0079:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r50 & r0
            if (r0 != 0) goto L_0x0086
            r0 = r42
            int r0 = X.G9t.A0W(r8, r0)
            r6 = r6 | r0
        L_0x0086:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r1 = r6 & r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r1 != r0) goto L_0x00be
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x00be
            r8.Evl()
        L_0x0099:
            X.5Xd r1 = r8.ASQ()
            if (r1 == 0) goto L_0x00bd
            r18 = 1
            X.JBq r0 = new X.JBq
            r8 = r0
            r9 = r39
            r10 = r38
            r11 = r37
            r12 = r36
            r13 = r41
            r14 = r27
            r15 = r42
            r16 = r40
            r17 = r7
            r19 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.A06 = r0
        L_0x00bd:
            return
        L_0x00be:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00cc
            r1 = 1321282029(0x4ec129ed, float:1.62037517E9)
            java.lang.String r0 = "com.instagram.opal.impl.ui.OpalTabEmptyContent (OpalTabContent.kt:355)"
            X.0fL.A01(r1, r0)
        L_0x00cc:
            com.instagram.common.session.UserSession r24 = X.C51968G9o.A0h(r8)
            r13 = 1098907648(0x41800000, float:16.0)
            r1 = 0
            r0 = r42
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A09(r0, r13, r1)
            X.5Zx r2 = X.C287275Zs.A07
            X.5Zr r0 = X.C287215Zl.A02
            r5 = 0
            X.5RD r2 = X.C291495hO.A02(r2, r8, r0, r5)
            int r9 = X.C287425a7.A00(r8)
            r4 = r8
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r0 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r8, r3)
            X.C51973G9u.A0y(r8, r4)
            X.C51971G9r.A12(r8, r2, r0)
            X.0sL r2 = X.C287485aD.A02
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0103
            boolean r0 = X.C51972G9s.A1Q(r8, r9)
            if (r0 != 0) goto L_0x0106
        L_0x0103:
            X.C51971G9r.A13(r8, r2, r9)
        L_0x0106:
            X.C51965G9l.A18(r8, r3)
            X.6Et r12 = X.C304676Et.A00
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r0 = 100
            if (r51 == 0) goto L_0x0113
            r0 = 65
        L_0x0113:
            float r0 = (float) r0
            r34 = 0
            androidx.compose.ui.Modifier r3 = X.C287195Zj.A0B(r2, r1, r0, r1, r1)
            r0 = 1117782016(0x42a00000, float:80.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0C(r3, r0)
            X.5Zr r11 = X.C287215Zl.A00
            androidx.compose.ui.Modifier r14 = r12.AB0(r11, r0)
            int r3 = r41.ordinal()
            if (r3 == r5) goto L_0x02b8
            r0 = 1
            if (r3 != r0) goto L_0x02c0
            r0 = 2131237627(0x7f081afb, float:1.809151E38)
        L_0x0132:
            r23 = 0
            X.2DO r10 = X.C287975bA.A00(r8, r0, r5)
            long r15 = X.C51966G9m.A0G(r8)
            X.5bV r9 = X.C51968G9o.A0R(r15)
            r0 = 48
            X.AnonymousClass6G3.A02(r8, r14, r9, r10, r0)
            r22 = 3670016(0x380000, float:5.142788E-39)
            r21 = 458752(0x70000, float:6.42848E-40)
            r20 = 57344(0xe000, float:8.0356E-41)
            if (r51 == 0) goto L_0x0290
            r0 = -1230556992(0xffffffffb6a730c0, float:-4.982663E-6)
            r8.ExS(r0)
            r0 = 2131968859(0x7f13435b, float:1.9574624E38)
            if (r3 == r5) goto L_0x015c
            r0 = 2131968857(0x7f134359, float:1.957462E38)
        L_0x015c:
            java.lang.String r19 = X.C304346Dc.A00(r8, r0)
            X.6CA r3 = X.AnonymousClass6CA.A00
            r0 = 3
            X.GQy r18 = r3.A03(r8, r0, r5, r5)
            androidx.compose.ui.Modifier r14 = X.C51966G9m.A0T(r2)
            r0 = 1103101952(0x41c00000, float:24.0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A0B(r14, r1, r0, r1, r13)
            androidx.compose.ui.Modifier r17 = r12.AB0(r11, r0)
            r0 = 930135422(0x3770bd7e, float:1.4349234E-5)
            r8.ExS(r0)
            r16 = r6 & r20
            boolean r2 = X.C51972G9s.A1K(r16)
            boolean r0 = X.C51973G9u.A1G(r6)
            r2 = r2 | r0
            boolean r0 = X.C51973G9u.A1H(r6)
            r2 = r2 | r0
            r10 = r6 & r21
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = X.AnonymousClass7TF.A1S(r10, r0)
            r2 = r2 | r0
            r9 = r6 & r22
            r3 = 1048576(0x100000, float:1.469368E-39)
            boolean r15 = X.AnonymousClass7TF.A1S(r9, r3)
            r1 = r27
            r0 = r24
            boolean r1 = X.C51973G9u.A1T(r8, r0, r1, r2, r15)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x01ae
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x01c4
        L_0x01ae:
            X.IoS r0 = new X.IoS
            r26 = r0
            r28 = r24
            r29 = r41
            r30 = r40
            r31 = r39
            r32 = r38
            r33 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r8.FLL(r0)
        L_0x01c4:
            X.0sa r15 = X.C51965G9l.A0y(r4, r0, r5)
            r2 = r18
            r1 = r19
            r0 = r17
            X.AnonymousClass6CE.A03(r8, r0, r2, r1, r15)
            r0 = 2131968831(0x7f13433f, float:1.9574568E38)
            java.lang.String r1 = X.C304346Dc.A00(r8, r0)
            X.6CB r0 = X.AnonymousClass6CA.A01(r8)
            r2 = 1090519040(0x41000000, float:8.0)
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A0B(r14, r13, r2, r13, r13)
            androidx.compose.ui.Modifier r11 = r12.AB0(r11, r2)
            r2 = 930181292(0x377170ac, float:1.4390953E-5)
            r8.ExS(r2)
            boolean r2 = X.C51972G9s.A1K(r16)
            boolean r12 = X.C51973G9u.A1I(r6)
            r12 = r12 | r2
            boolean r2 = X.C51973G9u.A1J(r6)
            r12 = r12 | r2
            r2 = 131072(0x20000, float:1.83671E-40)
            boolean r2 = X.AnonymousClass7TF.A1S(r10, r2)
            r12 = r12 | r2
            boolean r9 = X.AnonymousClass7TF.A1S(r9, r3)
            r3 = r27
            r2 = r24
            boolean r3 = X.C51973G9u.A1T(r8, r2, r3, r12, r9)
            java.lang.Object r2 = r8.ECw()
            if (r3 != 0) goto L_0x0217
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r2 != r3) goto L_0x022e
        L_0x0217:
            r19 = 1
            X.IoS r2 = new X.IoS
            r12 = r2
            r13 = r27
            r14 = r24
            r15 = r41
            r16 = r40
            r17 = r37
            r18 = r36
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r8.FLL(r2)
        L_0x022e:
            X.0sa r2 = X.C51965G9l.A0y(r4, r2, r5)
            X.AnonymousClass6CE.A03(r8, r11, r0, r1, r2)
        L_0x0235:
            X.C286565Wx.A0L(r4, r5)
            r8.ASN()
            X.0gF r3 = X.C60340gF.A00
            r0 = -1400493064(0xffffffffac862bf8, float:-3.8133906E-12)
            r8.ExS(r0)
            r0 = r6 & r20
            boolean r5 = X.C51972G9s.A1K(r0)
            r1 = r6 & r21
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = X.AnonymousClass7TF.A1S(r1, r0)
            r5 = r5 | r0
            r6 = r6 & r22
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r6 != r0) goto L_0x025a
            r23 = 1
        L_0x025a:
            r2 = r27
            r1 = r23
            r0 = r24
            boolean r1 = X.C51973G9u.A1T(r8, r0, r2, r5, r1)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x026e
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0282
        L_0x026e:
            com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1 r0 = new com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1
            r29 = r0
            r30 = r2
            r31 = r24
            r32 = r41
            r33 = r40
            r35 = r25
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r8.FLL(r0)
        L_0x0282:
            boolean r0 = X.C51972G9s.A1S(r8, r4, r0, r3)
            if (r0 == 0) goto L_0x0099
            r0 = 1365672999(0x51668427, float:6.1878727E10)
            X.0fL.A00(r0)
            goto L_0x0099
        L_0x0290:
            r0 = -1227995183(0xffffffffb6ce47d1, float:-6.147639E-6)
            r8.ExS(r0)
            r0 = 2131968873(0x7f134369, float:1.9574653E38)
            if (r3 == r5) goto L_0x029e
            r0 = 2131968872(0x7f134368, float:1.957465E38)
        L_0x029e:
            java.lang.String r14 = X.C304346Dc.A00(r8, r0)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A0B(r2, r1, r13, r1, r1)
            androidx.compose.ui.Modifier r12 = r12.AB0(r11, r0)
            long r15 = X.C51966G9m.A0H(r8)
            X.5Z4 r13 = X.C51965G9l.A0S(r8)
            r11 = r8
            X.AnonymousClass5ZZ.A0X(r11, r12, r13, r14, r15)
            goto L_0x0235
        L_0x02b8:
            r0 = 2131237526(0x7f081a96, float:1.8091305E38)
            goto L_0x0132
        L_0x02bd:
            r6 = r7
            goto L_0x0018
        L_0x02c0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56592I2w.A02(X.5Wy, androidx.compose.ui.Modifier, X.0iw, X.HLK, java.lang.String, X.0sa, X.0sa, X.0sa, X.0sa, int, boolean):void");
    }
}
