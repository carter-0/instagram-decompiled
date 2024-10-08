package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;

public abstract class I5D {
    public static final void A03(C286575Wy r24, C53048Ghg ghg, int i) {
        int i2;
        C53048Ghg ghg2 = ghg;
        0qQ.A0B(ghg2, 0);
        C286575Wy r9 = r24;
        r9.ExV(-1533472757);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r9, ghg2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1700426513, "com.instagram.wonderwall.ui.compose.screens.WallPostPreviewScreen (WallPostPreviewScreen.kt:72)");
            }
            C53385GnH gnH = (C53385GnH) G9w.A0g(r9, ghg2.A0B, 0);
            WallPostItem wallPostItem = (WallPostItem) gnH.A02;
            WallPostInfo BeB = wallPostItem.BeB();
            C56462Hyu.A00(r9, AnonymousClass5PI.A01(r9, new J8X(6, wallPostItem, ghg2, BeB, gnH, new AnonymousClass5aS()), 369167257), 6);
            r9.ExS(1810293211);
            if (gnH.A08) {
                Modifier A00 = JJP.A00(C51969G9p.A0U(), C287655aY.A00, 0);
                AnonymousClass5RD A002 = C287675aa.A00(C287215Zl.A06, false);
                int A003 = C287425a7.A00(r9);
                C286565Wx r11 = (C286565Wx) r9;
                AnonymousClass5RM A04 = C286565Wx.A04(r11);
                Modifier A01 = C287435a8.A01(r9, A00);
                C51973G9u.A0y(r9, r11);
                C51971G9r.A12(r9, A002, A04);
                0sL r1 = C287485aD.A02;
                if (r11.A0K || !C51972G9s.A1Q(r9, A003)) {
                    C51971G9r.A13(r9, r1, A003);
                }
                C51965G9l.A18(r9, A01);
                C285975Tl r3 = (C285975Tl) gnH.A05;
                boolean z = gnH.A0B;
                boolean z2 = gnH.A06;
                boolean A1R = AnonymousClass7TF.A1R(r3.A01.A00.length());
                boolean z3 = gnH.A09;
                boolean z4 = gnH.A0A;
                WallText wallText = (WallText) gnH.A04;
                r9.ExS(2130459775);
                int i4 = i2 & 14;
                boolean A1S = AnonymousClass7TF.A1S(i4, 4);
                Object ECw = r9.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = C59098J6g.A01(ghg2, 9);
                    r9.FLL(ECw);
                }
                0sP A0z = C51965G9l.A0z(r11, ECw);
                boolean A1R2 = C51972G9s.A1R(r9, 2130462555, i4, 4);
                Object ECw2 = r9.ECw();
                if (A1R2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = C59098J6g.A01(ghg2, 10);
                    r9.FLL(ECw2);
                }
                0sP A0z2 = C51965G9l.A0z(r11, ECw2);
                boolean A1R3 = C51972G9s.A1R(r9, 2130465316, i4, 4);
                Object ECw3 = r9.ECw();
                if (A1R3 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = C58704IwD.A00(r9, ghg2, 13);
                }
                C62320sa A0y = C51965G9l.A0y(r11, ECw3, false);
                boolean A1R4 = C51972G9s.A1R(r9, 2130468219, i4, 4);
                Object ECw4 = r9.ECw();
                if (A1R4 || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = C58704IwD.A00(r9, ghg2, 14);
                }
                boolean z5 = z2;
                boolean z6 = z3;
                boolean z7 = z4;
                C286575Wy r13 = r9;
                C285975Tl r14 = r3;
                A00(r13, r14, wallText, A0y, C51965G9l.A0y(r11, ECw4, false), A0z, A0z2, 0, 0, z, z5, A1R, z6, z7);
                r9.ASN();
            }
            C286565Wx A0H = C51965G9l.A0H(r9, false);
            C55817Hnx hnx = (C55817Hnx) gnH.A01;
            r9.ExS(1810322467);
            if (hnx != null) {
                I6X.A04(r9, hnx, 8);
            }
            C286565Wx.A0L(A0H, false);
            if (BeB.A05 == HMM.DELETING) {
                HXV.A00(r9, C304346Dc.A00(r9, 2131976781), 0, 0);
            }
            if (0fL.A02()) {
                0fL.A00(1062596727);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, ghg2, i3, 19);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v64, resolved type: X.MGG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: X.MGG} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01bb, code lost:
        if (r3 == r5) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01bd, code lost:
        r16 = new X.MGG(r6, r8, r13, (X.AnonymousClass4D7) null, 5, r41);
        r1.FLL(r16);
        r16 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d3, code lost:
        X.C51968G9o.A1E(r1, r7, r3, r9);
        r4 = r6.getValue();
        r1.ExS(866386492);
        r3 = r1.AGu(r6) | X.C51973G9u.A1L(r0);
        r0 = r1.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ed, code lost:
        if (r3 != false) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ef, code lost:
        if (r0 != r5) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f1, code lost:
        r0 = new X.MHB(r14, r6, (X.AnonymousClass4D7) null, 45);
        r1.FLL(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01fb, code lost:
        X.C286565Wx.A0I(r7);
        X.C286645Xf.A04(r1, r4, (X.0sL) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0207, code lost:
        if (X.0fL.A02() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0209, code lost:
        X.0fL.A00(1716182648);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r45, X.C285975Tl r46, com.instagram.wonderwall.model.WallText r47, X.C62320sa r48, X.C62320sa r49, X.0sP r50, X.0sP r51, int r52, int r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58) {
        /*
            r0 = 1145874849(0x444ca9a1, float:818.65045)
            r1 = r45
            r1.ExV(r0)
            r2 = r52
            r0 = r52 & 6
            if (r0 != 0) goto L_0x0215
            r0 = r46
            int r0 = X.G9t.A0O(r1, r0)
            r0 = r0 | r52
        L_0x0016:
            r3 = r52 & 48
            r41 = r54
            if (r3 != 0) goto L_0x0023
            r3 = r41
            int r3 = X.G9t.A0Z(r1, r3)
            r0 = r0 | r3
        L_0x0023:
            r3 = r2 & 384(0x180, float:5.38E-43)
            r42 = r55
            if (r3 != 0) goto L_0x0030
            r3 = r42
            int r3 = X.G9t.A0a(r1, r3)
            r0 = r0 | r3
        L_0x0030:
            r3 = r2 & 3072(0xc00, float:4.305E-42)
            r43 = r56
            if (r3 != 0) goto L_0x003d
            r3 = r43
            int r3 = X.G9t.A0b(r1, r3)
            r0 = r0 | r3
        L_0x003d:
            r3 = r2 & 24576(0x6000, float:3.4438E-41)
            r44 = r57
            if (r3 != 0) goto L_0x004a
            r3 = r44
            int r3 = X.G9t.A0c(r1, r3)
            r0 = r0 | r3
        L_0x004a:
            r3 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 & r52
            r45 = r58
            if (r3 != 0) goto L_0x0059
            r3 = r45
            int r3 = X.G9t.A0d(r1, r3)
            r0 = r0 | r3
        L_0x0059:
            r3 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 & r52
            r38 = r47
            if (r3 != 0) goto L_0x0068
            r3 = r38
            int r3 = X.G9t.A0U(r1, r3)
            r0 = r0 | r3
        L_0x0068:
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r52 & r3
            r15 = r50
            if (r3 != 0) goto L_0x0075
            int r3 = X.G9t.A0L(r1, r15)
            r0 = r0 | r3
        L_0x0075:
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r52 & r3
            r14 = r51
            if (r3 != 0) goto L_0x0082
            int r3 = X.G9t.A0M(r1, r14)
            r0 = r0 | r3
        L_0x0082:
            r16 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r52 & r16
            r39 = r48
            if (r3 != 0) goto L_0x0091
            r3 = r39
            int r3 = X.G9t.A0N(r1, r3)
            r0 = r0 | r3
        L_0x0091:
            r36 = r53
            r3 = r53 & 6
            r40 = r49
            if (r3 != 0) goto L_0x0211
            r3 = r40
            int r3 = X.C41848B3p.A01(r1, r3)
            r5 = r53 | r3
        L_0x00a1:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r0 & r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r3) goto L_0x00e1
            r4 = r5 & 3
            r3 = 2
            if (r4 != r3) goto L_0x00e1
            boolean r3 = r1.Bwn()
            if (r3 == 0) goto L_0x00e1
            r1.Evl()
        L_0x00b9:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x00e0
            X.JCI r0 = new X.JCI
            r28 = r0
            r29 = r46
            r30 = r38
            r31 = r39
            r32 = r40
            r33 = r15
            r34 = r14
            r35 = r2
            r37 = r41
            r38 = r42
            r39 = r43
            r40 = r44
            r41 = r45
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1.A06 = r0
        L_0x00e0:
            return
        L_0x00e1:
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x00ef
            r4 = -677927194(0xffffffffd797a6e6, float:-3.33486158E14)
            java.lang.String r3 = "com.instagram.wonderwall.ui.compose.screens.WallPostReplyEditor (WallPostPreviewScreen.kt:168)"
            X.0fL.A01(r4, r3)
        L_0x00ef:
            r3 = 866342637(0x33a356ed, float:7.606091E-8)
            java.lang.Object r3 = X.C51967G9n.A0m(r1, r3)
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            java.lang.Object r8 = X.C51972G9s.A0k(r1, r3, r5)
            X.I1b r8 = (X.C56547I1b) r8
            r7 = r1
            X.5Wx r7 = (X.C286565Wx) r7
            r10 = 0
            X.C286565Wx.A0L(r7, r10)
            X.4bM r3 = X.AnonymousClass5YA.A0A
            java.lang.Object r13 = r1.AJO(r3)
            boolean r3 = X.I2A.A02(r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            X.5Oz r6 = X.C287175Zh.A00(r1, r3)
            X.5Z4 r11 = X.C51966G9m.A0g(r1)
            X.4bM r3 = X.C304856Fm.A00
            java.lang.Object r3 = r1.AJO(r3)
            X.5RW r3 = (X.AnonymousClass5RW) r3
            long r3 = r3.A00
            r26 = 0
            r12 = 0
            r23 = 6291454(0x5ffffe, float:8.816205E-39)
            X.5Z4 r9 = new X.5Z4
            r17 = r9
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r10
            r22 = r10
            r24 = r3
            r28 = r26
            r30 = r26
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28, r30)
            X.5Z4 r22 = r11.A0D(r9)
            long r3 = X.C51966G9m.A0H(r1)
            X.6Fe r9 = new X.6Fe
            r9.<init>(r3)
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r20 = X.C51970G9q.A0U(r3, r8)
            r3 = 866350481(0x33a37591, float:7.611664E-8)
            r1.ExS(r3)
            boolean r4 = X.C51974G9v.A1V(r0)
            java.lang.Object r3 = r1.ECw()
            if (r4 != 0) goto L_0x0167
            if (r3 != r5) goto L_0x0170
        L_0x0167:
            r3 = 11
            X.J6g r3 = X.C59098J6g.A01(r15, r3)
            r1.FLL(r3)
        L_0x0170:
            X.0sP r25 = X.C51965G9l.A0z(r7, r3)
            r28 = 3
            r29 = 1
            r4 = 625478340(0x25480ac4, float:1.7350882E-16)
            X.JHL r3 = new X.JHL
            r37 = r3
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)
            X.5PJ r27 = X.AnonymousClass5PI.A01(r1, r3, r4)
            r30 = r0 & 14
            r30 = r30 | r16
            r31 = 196614(0x30006, float:2.75515E-40)
            r32 = 14808(0x39d8, float:2.075E-41)
            r17 = r12
            r24 = r12
            r26 = r12
            r33 = r10
            r34 = r10
            r35 = r10
            r16 = r12
            r19 = r1
            r21 = r9
            r23 = r46
            X.I5J.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r41)
            r3 = 866377796(0x33a3e044, float:7.631073E-8)
            boolean r3 = X.C51974G9v.A1Y(r1, r3, r0)
            boolean r4 = X.C51972G9s.A1X(r1, r6, r13, r3)
            java.lang.Object r3 = r1.ECw()
            if (r4 != 0) goto L_0x01bd
            if (r3 != r5) goto L_0x01d3
        L_0x01bd:
            r21 = 5
            X.MGG r3 = new X.MGG
            r16 = r3
            r17 = r6
            r18 = r8
            r19 = r13
            r20 = r12
            r22 = r41
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r1.FLL(r3)
        L_0x01d3:
            X.C51968G9o.A1E(r1, r7, r3, r9)
            java.lang.Object r4 = r6.getValue()
            r3 = 866386492(0x33a4023c, float:7.6372515E-8)
            r1.ExS(r3)
            boolean r0 = X.C51973G9u.A1L(r0)
            boolean r3 = r1.AGu(r6)
            r3 = r3 | r0
            java.lang.Object r0 = r1.ECw()
            if (r3 != 0) goto L_0x01f1
            if (r0 != r5) goto L_0x01fb
        L_0x01f1:
            r3 = 45
            X.MHB r0 = new X.MHB
            r0.<init>(r14, r6, r12, r3)
            r1.FLL(r0)
        L_0x01fb:
            X.0sL r0 = (X.0sL) r0
            X.C286565Wx.A0I(r7)
            X.C286645Xf.A04(r1, r4, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b9
            r0 = 1716182648(0x664ade78, float:2.3950546E23)
            X.0fL.A00(r0)
            goto L_0x00b9
        L_0x0211:
            r5 = r36
            goto L_0x00a1
        L_0x0215:
            r0 = r2
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5D.A00(X.5Wy, X.5Tl, com.instagram.wonderwall.model.WallText, X.0sa, X.0sa, X.0sP, X.0sP, int, int, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static final void A01(C286575Wy r11, WallText wallText, C62320sa r13, int i, boolean z) {
        int i2;
        r11.ExV(1748811470);
        int i3 = i;
        int i4 = i & 6;
        boolean z2 = z;
        if (i4 == 0) {
            i2 = G9t.A0Y(r11, z) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 48) == 0) {
            i2 |= G9t.A0P(r11, wallText);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, r13);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1021752458, "com.instagram.wonderwall.ui.compose.screens.ReplyAudience (WallPostPreviewScreen.kt:294)");
            }
            C285245Qk A0K = C51965G9l.A0K(r11, 159501566);
            Modifier A01 = C287195Zj.A01(A0K);
            if (z) {
                boolean A1P = C51973G9u.A1P(r11, 1097061809, i2);
                Object ECw = r11.ECw();
                if (A1P || ECw == AnonymousClass5XT.A00) {
                    ECw = C58704IwD.A00(r11, r13, 10);
                }
                C51965G9l.A1X(r11, false);
                A01 = A01.Ezh(C287635aW.A06(A0K, (C62320sa) ECw));
            }
            C286565Wx A0H = C51965G9l.A0H(r11, false);
            AnonymousClass5RD A0V = C51968G9o.A0V(r11);
            int A00 = C287425a7.A00(r11);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r11, A01);
            C51973G9u.A0y(r11, A0H);
            C51971G9r.A12(r11, A0V, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A012);
            C51970G9q.A14(r11, C287195Zj.A0B(C287205Zk.A0C(A0K, 14.0f), 0.0f, 0.0f, 4.0f, 0.0f), C287975bA.A00(r11, R.drawable.instagram_direct_pano_outline_16, 0));
            AnonymousClass5ZZ.A0r(r11, C51966G9m.A0f(r11), I6X.A02(r11, wallText), C51966G9m.A0M(r11));
            r11.ExS(1097078000);
            if (z) {
                C51970G9q.A14(r11, C287195Zj.A0B(C287205Zk.A0C(A0K, 14.0f), 4.0f, 0.0f, 0.0f, 0.0f), C287975bA.A00(r11, R.drawable.instagram_chevron_down_pano_outline_24, 0));
            }
            if (C51971G9r.A1S(r11, A0H, false)) {
                0fL.A00(-121570497);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG4(i3, 19, wallText, r13, z2);
        }
    }

    public static final void A02(C286575Wy r33, WallText wallText, C62320sa r35, C62320sa r36, 0sL r37, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2;
        long j;
        C286575Wy r0 = r33;
        r0.ExV(-950402948);
        int i3 = i;
        boolean z6 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r0, z6) | i;
        } else {
            i2 = i3;
        }
        boolean z7 = z2;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r0, z7);
        }
        boolean z8 = z3;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0a(r0, z8);
        }
        boolean z9 = z4;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0b(r0, z9);
        }
        boolean z10 = z5;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0c(r0, z10);
        }
        WallText wallText2 = wallText;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0T(r0, wallText2);
        }
        0sL r40 = r37;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r0, r40);
        }
        C62320sa r42 = r35;
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0L(r0, r42);
        }
        C62320sa r41 = r36;
        if ((100663296 & i) == 0) {
            i2 |= G9t.A0M(r0, r41);
        }
        if ((38347923 & i2) != 38347922 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-743931102, "com.instagram.wonderwall.ui.compose.screens.WallPostReplyDecorationBox (WallPostPreviewScreen.kt:223)");
            }
            C285245Qk A0K = C51965G9l.A0K(r0, 596748148);
            FillElement fillElement = C287205Zk.A02;
            Modifier Ezh = A0K.Ezh(fillElement);
            if (z6) {
                Ezh = Ezh.Ezh(G9t.A0p(r0, A0K));
            }
            C286565Wx r2 = (C286565Wx) r0;
            C286565Wx.A0L(r2, false);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r0, C287215Zl.A00, 48);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r0, Ezh);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r0, r2, r8);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A04, r7);
            0sL r6 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r6, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            r0.ExS(1704720895);
            if (z9) {
                A01(r0, wallText2, r42, C51965G9l.A02(i2 >> 12) | ((i2 >> 15) & 896), z10);
            }
            C286565Wx.A0L(r2, false);
            Modifier Ezh2 = C287205Zk.A08(A0K, 64.0f).Ezh(fillElement);
            long j2 = AnonymousClass5RV.A00;
            AnonymousClass5S2 r18 = AnonymousClass5S0.A00;
            Modifier A07 = C287195Zj.A07(C304766Fd.A01(C56169Hty.A01(Ezh2, r18, 16.0f, j2, j2, true), r18, C51966G9m.A08(r0)), 12.0f);
            C287245Zp r13 = C287215Zl.A04;
            AnonymousClass5RD A002 = C287395a4.A00(C287275Zs.A04, r0, r13);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r2);
            Modifier A012 = C287435a8.A01(r0, A07);
            C51973G9u.A0z(r0, r2, r8);
            C287595aO.A00(r0, A002, r7);
            if (C51965G9l.A1Y(r0, r2, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r6, A003);
            }
            C287595aO.A00(r0, A012, A1K);
            AnonymousClass6FX r12 = AnonymousClass6FX.A00;
            Modifier A004 = r12.A00(A0K);
            FillElement fillElement2 = C287205Zk.A00;
            Modifier A0H = G9w.A0H(A004.Ezh(fillElement2));
            Modifier modifier = A0H;
            Modifier A013 = C304766Fd.A01(modifier, r18, AnonymousClass5aQ.A00(r0).A0C);
            AnonymousClass5RD A022 = C287395a4.A02(C287275Zs.A01, r0, r13, 48);
            int A005 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r2);
            Modifier A014 = C287435a8.A01(r0, A013);
            C51973G9u.A0z(r0, r2, r8);
            C287595aO.A00(r0, A022, r7);
            if (C51965G9l.A1Y(r0, r2, A043, A0w) || !C51972G9s.A1Q(r0, A005)) {
                C51971G9r.A13(r0, r6, A005);
            }
            C287595aO.A00(r0, A014, A1K);
            Modifier A09 = C287195Zj.A09(r12.A00(A0K).Ezh(fillElement2), 12.0f, 0.0f);
            AnonymousClass5RD A006 = C287675aa.A00(C287215Zl.A0B, false);
            int A007 = C287425a7.A00(r0);
            AnonymousClass5RM A044 = C286565Wx.A04(r2);
            Modifier A015 = C287435a8.A01(r0, A09);
            C51973G9u.A0z(r0, r2, r8);
            C287595aO.A00(r0, A006, r7);
            if (C51965G9l.A1Y(r0, r2, A044, A0w) || !C51972G9s.A1Q(r0, A007)) {
                C51971G9r.A13(r0, r6, A007);
            }
            C287595aO.A00(r0, A015, A1K);
            r0.ExS(1053965038);
            if (z7) {
                C286575Wy r27 = r0;
                AnonymousClass5ZZ.A0B(r27, (Modifier) null, C51966G9m.A0g(r0), C304346Dc.A00(r0, 2131976774), 0, 0, 1, 0, 384, 12282, C51966G9m.A0M(r0));
            }
            C286565Wx.A0L(r2, false);
            C51972G9s.A11(r0, r40, i2 >> 18);
            AnonymousClass2DO A008 = C287975bA.A00(r0, R.drawable.instagram_direct_pano_outline_24, 0);
            long j3 = AnonymousClass5aQ.A00(r0).A0U;
            Modifier A0H2 = G9w.A0H(C287205Zk.A0D(C287195Zj.A07(A0K, 4.0f), 52.0f));
            if (z8) {
                j = C51967G9n.A0a(r0, 674711613).A03;
                C286565Wx.A0L(r2, false);
            } else {
                j = C51967G9n.A0a(r0, 674713573).A04;
                C286565Wx.A0L(r2, false);
            }
            Modifier A023 = C287195Zj.A02(C304766Fd.A01(A0H2, r18, j));
            r0.ExS(674717996);
            boolean A1L = C51973G9u.A1L(i2);
            Object ECw = r0.ECw();
            if (A1L || ECw == AnonymousClass5XT.A00) {
                ECw = C58704IwD.A01(r41, 15);
                r0.FLL(ECw);
            }
            C288165bT.A05(r0, C52638GaC.A00(r0, A023, (C287625aV) null, (String) null, (C62320sa) null, C51965G9l.A0y(r2, ECw, false), 0.0f, 0.0f, 0.0f, 0.0f, 254, z8), A008, j3);
            r0.ASN();
            if (C51971G9r.A1R(r0)) {
                0fL.A00(-1011366370);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBA(wallText2, r42, r41, r40, i3, z6, z7, z8, z9, z10);
        }
    }
}
