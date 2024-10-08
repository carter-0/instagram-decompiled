package X;

import androidx.compose.ui.Modifier;

public abstract class I6W {
    public static final void A03(C286575Wy r28, C54672HOd hOd, INA ina, C53314Gm0 gm0, C62320sa r32, C62320sa r33, C62320sa r34, C62320sa r35, C62320sa r36, C62320sa r37, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        C62320sa r10 = r32;
        C62320sa r9 = r33;
        boolean A1U = AnonymousClass7TF.A1U(0, r10, r9);
        C62320sa r8 = r34;
        C62320sa r7 = r35;
        C62320sa r6 = r36;
        AnonymousClass7TG.A0w(2, r8, r7, r6);
        C54672HOd hOd2 = hOd;
        INA ina2 = ina;
        C62320sa r5 = r37;
        C51973G9u.A0u(5, r5, ina2, hOd2);
        C286575Wy r13 = r28;
        r13.ExV(-338412363);
        int i5 = i;
        int i6 = 4;
        if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r13, r10) | i;
        } else {
            i3 = i5;
        }
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r13, r9);
        }
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r13, r8);
        }
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r13, r7);
        }
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r13, r6);
        }
        if ((196608 & i) == 0) {
            i3 |= G9t.A0J(r13, r5);
        }
        boolean z3 = z;
        if ((1572864 & i) == 0) {
            i3 |= G9t.A0e(r13, z3);
        }
        boolean z4 = z2;
        if ((12582912 & i) == 0) {
            i3 |= G9t.A0f(r13, z4);
        }
        C53314Gm0 gm02 = gm0;
        if ((i & 100663296) == 0) {
            i3 |= G9t.A0M(r13, gm02);
        }
        if ((i & 805306368) == 0) {
            i3 |= G9t.A0N(r13, ina2);
        }
        int i7 = i2;
        if ((i2 & 6) == 0) {
            if (!r13.AGu(hOd2)) {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i7;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && r13.Bwn()) {
            r13.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1404270882, "com.instagram.schools.management.ui.SchoolSettingsComposeView (SchoolSettingsComposeView.kt:42)");
            }
            if (C51975G9x.A1T(r13, new JCC(r9, gm02, r6, ina2, r5, hOd, r8, r10, r7, A1U ? 1 : 0, z3, z4), -1977208077)) {
                0fL.A00(1681178201);
            }
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            boolean z5 = z3;
            boolean z6 = z4;
            C62320sa r17 = r8;
            C62320sa r18 = r7;
            C62320sa r15 = r10;
            C62320sa r16 = r9;
            INA ina3 = ina2;
            C53314Gm0 gm03 = gm02;
            ASQ.A06 = new C59257JCj(hOd2, ina3, gm03, r15, r16, r17, r18, r6, r5, i5, i7, 0, z5, z6);
        }
    }

    public static final void A00(C286575Wy r2, int i) {
        r2.ExV(-194942983);
        if (i != 0 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(258343100, "com.instagram.schools.management.ui.EmptyView (SchoolSettingsComposeView.kt:63)");
            }
            if (0fL.A02()) {
                0fL.A00(1504098401);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 9);
        }
    }

    public static final void A01(C286575Wy r3, int i) {
        r3.ExV(-633079981);
        if (i != 0 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2127912371, "com.instagram.schools.management.ui.SeparatorLineWide (SchoolSettingsComposeView.kt:202)");
            }
            C51969G9p.A14(r3, C287205Zk.A08(C51969G9p.A0U(), 6.0f), C51966G9m.A0C(r3));
            if (0fL.A02()) {
                0fL.A00(-627372096);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: X.GVB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: X.GVB} */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        if (r11 == r7) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014b, code lost:
        r18 = new X.GVB(5, r4, r9, r29, r30, r25);
        r5.FLL(r18);
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0161, code lost:
        r13 = X.C287635aW.A05(r12, (X.C287625aV) null, (java.lang.String) null, X.C51965G9l.A0y(r2, r11, false), true);
        r14 = r13;
        X.C52636GaA.A0K(r5, r14, X.C57124IPn.A00, r10.A04, r15);
        r13 = X.C51973G9u.A1P(r5, 2140748131, r6);
        r11 = r5.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0180, code lost:
        if (r13 != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0182, code lost:
        if (r11 != r7) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0184, code lost:
        r11 = X.C58681Ivq.A00(r5, r27, 39);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018c, code lost:
        r18 = r5;
        X.I37.A01(r18, X.C287635aW.A05(r12, (X.C287625aV) null, (java.lang.String) null, X.C51965G9l.A0y(r2, r11, false), true), r10.A00, r10.A01, 0, 0);
        r13 = X.C51973G9u.A1O(r5, 2140753596, r6);
        r11 = r5.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01b0, code lost:
        if (r13 != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b2, code lost:
        if (r11 != r7) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01b4, code lost:
        r11 = X.C58681Ivq.A00(r5, r28, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01bc, code lost:
        X.C52636GaA.A0I(r18, X.C287635aW.A05(r12, (X.C287625aV) null, (java.lang.String) null, X.C51965G9l.A0y(r2, r11, false), true), (X.C59489JLn) null, X.C288035bG.A00(r5, 2131972123), 130044, X.C51966G9m.A09(r5));
        r5.ASN();
        r12 = X.C51967G9n.A1Z(r5, r9, 646958455) | X.AnonymousClass7TF.A1S(r17, com.facebook.common.dextricks.DalvikConstants.FB4A_LINEAR_ALLOC_BUFFER_SIZE);
        r8 = r5.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ee, code lost:
        if (r12 != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01f0, code lost:
        if (r8 != r7) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01f2, code lost:
        r8 = X.C58691Iw0.A00(r5, r9, r30, 24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01fa, code lost:
        r14 = X.C51965G9l.A0y(r2, r8, false);
        r12 = X.C51967G9n.A1Z(r5, r9, 646964724);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0209, code lost:
        if (r17 == 8388608) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x020b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x020c, code lost:
        r12 = r12 | r0;
        r0 = r5.ECw();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0211, code lost:
        if (r12 != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0213, code lost:
        if (r0 != r7) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0215, code lost:
        r0 = X.C58691Iw0.A00(r5, r9, r30, 25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x021d, code lost:
        X.C55128Hcc.A00(r5, r4, r26, r14, X.C51965G9l.A0y(r2, r0, false), (r6 >> 9) & 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0230, code lost:
        if (X.0fL.A02() == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0232, code lost:
        X.0fL.A00(-1086587382);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r29, X.C54672HOd r30, X.INA r31, X.C53314Gm0 r32, X.C62320sa r33, X.C62320sa r34, X.C62320sa r35, X.C62320sa r36, int r37, boolean r38) {
        /*
            r0 = -723915523(0xffffffffd4d9ecfd, float:-7.4878713E12)
            r5 = r29
            r5.ExV(r0)
            r3 = r37
            r0 = r37 & 6
            r29 = r33
            if (r0 != 0) goto L_0x024d
            r0 = r29
            int r6 = X.C41848B3p.A01(r5, r0)
            r6 = r6 | r37
        L_0x0018:
            r0 = r37 & 48
            r28 = r34
            if (r0 != 0) goto L_0x0025
            r0 = r28
            int r0 = X.G9t.A0F(r5, r0)
            r6 = r6 | r0
        L_0x0025:
            r0 = r3 & 384(0x180, float:5.38E-43)
            r27 = r35
            if (r0 != 0) goto L_0x0032
            r0 = r27
            int r0 = X.G9t.A0G(r5, r0)
            r6 = r6 | r0
        L_0x0032:
            r0 = r3 & 3072(0xc00, float:4.305E-42)
            r26 = r36
            if (r0 != 0) goto L_0x003f
            r0 = r26
            int r0 = X.G9t.A0H(r5, r0)
            r6 = r6 | r0
        L_0x003f:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            r25 = r38
            if (r0 != 0) goto L_0x004c
            r0 = r25
            int r0 = X.G9t.A0c(r5, r0)
            r6 = r6 | r0
        L_0x004c:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r37 & r0
            r10 = r32
            if (r0 != 0) goto L_0x0059
            int r0 = X.G9t.A0J(r5, r10)
            r6 = r6 | r0
        L_0x0059:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r37 & r0
            r9 = r31
            if (r0 != 0) goto L_0x0066
            int r0 = X.G9t.A0K(r5, r9)
            r6 = r6 | r0
        L_0x0066:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r37 & r0
            if (r0 != 0) goto L_0x0073
            r0 = r30
            int r0 = X.G9t.A0V(r5, r0)
            r6 = r6 | r0
        L_0x0073:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r1 = r6 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x00a3
            boolean r0 = r5.Bwn()
            if (r0 == 0) goto L_0x00a3
            r5.Evl()
        L_0x0086:
            X.5Xd r0 = r5.ASQ()
            if (r0 == 0) goto L_0x00a2
            r14 = 1
            X.JBF r5 = new X.JBF
            r11 = r9
            r12 = r29
            r13 = r3
            r15 = r25
            r6 = r26
            r7 = r28
            r8 = r30
            r9 = r27
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A06 = r5
        L_0x00a2:
            return
        L_0x00a3:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b1
            r1 = -832169699(0xffffffffce66191d, float:-9.6510138E8)
            java.lang.String r0 = "com.instagram.schools.management.ui.UpperSettingsSection (SchoolSettingsComposeView.kt:110)"
            X.0fL.A01(r1, r0)
        L_0x00b1:
            r0 = 646912833(0x268f1b41, float:9.930005E-16)
            java.lang.Object r4 = X.C51967G9n.A0m(r5, r0)
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r4 != r7) goto L_0x00c4
            X.Hj9 r4 = new X.Hj9
            r4.<init>()
            r5.FLL(r4)
        L_0x00c4:
            X.Hj9 r4 = (X.C55527Hj9) r4
            r2 = r5
            X.5Wx r2 = (X.C286565Wx) r2
            r1 = 0
            X.C286565Wx.A0L(r2, r1)
            com.instagram.schools.management.data.SchoolAddress r13 = r10.A02
            java.lang.String r14 = r13.A02
            int r8 = r14.length()
            r0 = 1
            if (r8 != 0) goto L_0x023a
            r8 = -1420453064(0xffffffffab559b38, float:-7.588821E-13)
            r5.ExS(r8)
            r12 = 2131972707(0x7f135263, float:1.958243E38)
            java.lang.String r11 = r13.A00
            java.lang.String r8 = r13.A01
            java.lang.Object[] r8 = new java.lang.Object[]{r11, r8}
        L_0x00e9:
            java.lang.String r15 = X.C288035bG.A01(r5, r8, r12)
            X.C286565Wx.A0L(r2, r1)
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
            X.5RD r11 = X.C51969G9p.A0Z(r5, r1)
            int r14 = X.C287425a7.A00(r5)
            X.5RM r8 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r13 = X.C287435a8.A01(r5, r12)
            X.C51973G9u.A0y(r5, r2)
            X.C51971G9r.A12(r5, r11, r8)
            X.0sL r11 = X.C287485aD.A02
            boolean r8 = r2.A0K
            if (r8 != 0) goto L_0x0114
            boolean r8 = X.C51972G9s.A1Q(r5, r14)
            if (r8 != 0) goto L_0x0117
        L_0x0114:
            X.C51971G9r.A13(r5, r11, r14)
        L_0x0117:
            X.C51965G9l.A18(r5, r13)
            r8 = 2131972719(0x7f13526f, float:1.9582454E38)
            java.lang.String r8 = X.C288035bG.A00(r5, r8)
            X.C55130Hce.A00(r8, r5, r1)
            r8 = 0
            r11 = 2140732516(0x7f98fc64, float:NaN)
            boolean r13 = X.C51974G9v.A1X(r5, r11, r6)
            boolean r11 = X.C51974G9v.A1W(r6)
            boolean r14 = X.C51973G9u.A1T(r5, r4, r9, r13, r11)
            r11 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r6 & r11
            r16 = 8388608(0x800000, float:1.17549435E-38)
            r13 = r17
            r11 = r16
            boolean r11 = X.AnonymousClass7TF.A1S(r13, r11)
            r14 = r14 | r11
            java.lang.Object r11 = r5.ECw()
            if (r14 != 0) goto L_0x014b
            if (r11 != r7) goto L_0x0161
        L_0x014b:
            r19 = 5
            X.GVB r11 = new X.GVB
            r18 = r11
            r20 = r4
            r21 = r9
            r22 = r29
            r23 = r30
            r24 = r25
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r5.FLL(r11)
        L_0x0161:
            X.0sa r11 = X.C51965G9l.A0y(r2, r11, r1)
            androidx.compose.ui.Modifier r13 = X.C287635aW.A05(r12, r8, r8, r11, r0)
            java.lang.String r11 = r10.A04
            r18 = r11
            X.IPn r11 = X.C57124IPn.A00
            r14 = r13
            r13 = r18
            X.C52636GaA.A0K(r5, r14, r11, r13, r15)
            r11 = 2140748131(0x7f993963, float:NaN)
            boolean r13 = X.C51973G9u.A1P(r5, r11, r6)
            java.lang.Object r11 = r5.ECw()
            if (r13 != 0) goto L_0x0184
            if (r11 != r7) goto L_0x018c
        L_0x0184:
            r13 = 39
            r11 = r27
            X.Ivq r11 = X.C58681Ivq.A00(r5, r11, r13)
        L_0x018c:
            X.0sa r11 = X.C51965G9l.A0y(r2, r11, r1)
            androidx.compose.ui.Modifier r19 = X.C287635aW.A05(r12, r8, r8, r11, r0)
            int r13 = r10.A00
            int r11 = r10.A01
            r18 = r5
            r20 = r13
            r21 = r11
            r22 = r1
            r23 = r1
            X.I37.A01(r18, r19, r20, r21, r22, r23)
            r11 = 2140753596(0x7f994ebc, float:NaN)
            boolean r13 = X.C51973G9u.A1O(r5, r11, r6)
            java.lang.Object r11 = r5.ECw()
            if (r13 != 0) goto L_0x01b4
            if (r11 != r7) goto L_0x01bc
        L_0x01b4:
            r13 = 40
            r11 = r28
            X.Ivq r11 = X.C58681Ivq.A00(r5, r11, r13)
        L_0x01bc:
            X.0sa r11 = X.C51965G9l.A0y(r2, r11, r1)
            androidx.compose.ui.Modifier r19 = X.C287635aW.A05(r12, r8, r8, r11, r0)
            r11 = 2131972123(0x7f13501b, float:1.9581245E38)
            java.lang.String r21 = X.C288035bG.A00(r5, r11)
            long r23 = X.C51966G9m.A09(r5)
            r22 = 130044(0x1fbfc, float:1.8223E-40)
            r20 = r8
            X.C52636GaA.A0I(r18, r19, r20, r21, r22, r23)
            r5.ASN()
            r8 = 646958455(0x268fcd77, float:9.97831E-16)
            boolean r12 = X.C51967G9n.A1Z(r5, r9, r8)
            r11 = r17
            r8 = r16
            boolean r8 = X.AnonymousClass7TF.A1S(r11, r8)
            r12 = r12 | r8
            java.lang.Object r8 = r5.ECw()
            if (r12 != 0) goto L_0x01f2
            if (r8 != r7) goto L_0x01fa
        L_0x01f2:
            r11 = 24
            r8 = r30
            X.Iw0 r8 = X.C58691Iw0.A00(r5, r9, r8, r11)
        L_0x01fa:
            X.0sa r14 = X.C51965G9l.A0y(r2, r8, r1)
            r8 = 646964724(0x268fe5f4, float:9.984947E-16)
            boolean r12 = X.C51967G9n.A1Z(r5, r9, r8)
            r11 = r17
            r8 = r16
            if (r11 == r8) goto L_0x020c
            r0 = 0
        L_0x020c:
            r12 = r12 | r0
            java.lang.Object r0 = r5.ECw()
            if (r12 != 0) goto L_0x0215
            if (r0 != r7) goto L_0x021d
        L_0x0215:
            r7 = 25
            r0 = r30
            X.Iw0 r0 = X.C58691Iw0.A00(r5, r9, r0, r7)
        L_0x021d:
            X.0sa r15 = X.C51965G9l.A0y(r2, r0, r1)
            int r0 = r6 >> 9
            r16 = r0 & 14
            r11 = r5
            r12 = r4
            r13 = r26
            X.C55128Hcc.A00(r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0086
            r0 = -1086587382(0xffffffffbf3bfe0a, float:-0.7343451)
            X.0fL.A00(r0)
            goto L_0x0086
        L_0x023a:
            r8 = -1420346424(0xffffffffab573bc8, float:-7.6466307E-13)
            r5.ExS(r8)
            r12 = 2131972708(0x7f135264, float:1.9582431E38)
            java.lang.String r11 = r13.A00
            java.lang.String r8 = r13.A01
            java.lang.Object[] r8 = new java.lang.Object[]{r11, r8, r14}
            goto L_0x00e9
        L_0x024d:
            r6 = r3
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6W.A02(X.5Wy, X.HOd, X.INA, X.Gm0, X.0sa, X.0sa, X.0sa, X.0sa, int, boolean):void");
    }

    public static final void A04(C286575Wy r21, C54672HOd hOd, INA ina, C53314Gm0 gm0, C62320sa r25, C62320sa r26, C62320sa r27, C62320sa r28, C62320sa r29, C62320sa r30, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        C286575Wy r12 = r21;
        r12.ExV(442223513);
        int i5 = i;
        int i6 = 4;
        C62320sa r15 = r25;
        if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r12, r15) | i;
        } else {
            i3 = i5;
        }
        C62320sa r11 = r26;
        if ((i & 48) == 0) {
            i3 |= G9t.A0F(r12, r11);
        }
        C62320sa r10 = r27;
        if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r12, r10);
        }
        C62320sa r9 = r28;
        if ((i5 & 3072) == 0) {
            i3 |= G9t.A0H(r12, r9);
        }
        C62320sa r8 = r29;
        if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r12, r8);
        }
        C62320sa r7 = r30;
        if ((196608 & i) == 0) {
            i3 |= G9t.A0J(r12, r7);
        }
        boolean z3 = z;
        if ((1572864 & i) == 0) {
            i3 |= G9t.A0e(r12, z3);
        }
        boolean z4 = z2;
        if ((12582912 & i) == 0) {
            i3 |= G9t.A0f(r12, z4);
        }
        C53314Gm0 gm02 = gm0;
        if ((100663296 & i) == 0) {
            i3 |= G9t.A0M(r12, gm02);
        }
        int i7 = 805306368 & i;
        INA ina2 = ina;
        if (i7 == 0) {
            i3 |= G9t.A0N(r12, ina2);
        }
        int i8 = i2;
        int i9 = i2 & 6;
        C54672HOd hOd2 = hOd;
        if (i9 == 0) {
            if (!r12.AGu(hOd2)) {
                i6 = 2;
            }
            i4 = i8 | i6;
        } else {
            i4 = i8;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2 && r12.Bwn()) {
            r12.Evl();
        } else {
            if (0fL.A02()) {
                0fL.A01(1661243185, "com.instagram.schools.management.ui.SettingsView (SchoolSettingsComposeView.kt:78)");
            }
            C285245Qk r0 = Modifier.A00;
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r12, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r12);
            C286565Wx r2 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r12, r0);
            C51973G9u.A0y(r12, r2);
            C51971G9r.A12(r12, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A01);
            int i10 = i3 >> 9;
            C286575Wy r20 = r12;
            C54672HOd hOd3 = hOd2;
            INA ina3 = ina2;
            C53314Gm0 gm03 = gm02;
            C62320sa r24 = r15;
            C62320sa r252 = r11;
            C62320sa r262 = r10;
            C62320sa r272 = r7;
            A02(r20, hOd3, ina3, gm03, r24, r252, r262, r272, C51972G9s.A04(i3 >> 6, C51971G9r.A04(i3)) | (458752 & i10) | (3670016 & i10) | ((i4 << 21) & 29360128), z3);
            A01(r12, 0);
            C53314Gm0 gm04 = gm02;
            C62320sa r22 = r9;
            C62320sa r23 = r8;
            A05(r20, gm04, r22, r23, C51969G9p.A04(i3 >> 15, C51965G9l.A01(i10)), z4);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-518326);
            }
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            C54672HOd hOd4 = hOd2;
            INA ina4 = ina2;
            C53314Gm0 gm05 = gm02;
            ASQ.A06 = new C59257JCj(hOd4, ina4, gm05, r15, r11, r10, r9, r8, r7, i5, i8, 1, z3, z4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        if (r0.size() <= 1) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r14, X.C53314Gm0 r15, X.C62320sa r16, X.C62320sa r17, int r18, boolean r19) {
        /*
            r0 = 612806938(0x2486b11a, float:5.841326E-17)
            r14.ExV(r0)
            r11 = r18
            r0 = r18 & 6
            r9 = r16
            if (r0 != 0) goto L_0x0137
            int r7 = X.C41848B3p.A01(r14, r9)
            r7 = r7 | r18
        L_0x0014:
            r0 = r18 & 48
            r10 = r17
            if (r0 != 0) goto L_0x001f
            int r0 = X.G9t.A0F(r14, r10)
            r7 = r7 | r0
        L_0x001f:
            r0 = r11 & 384(0x180, float:5.38E-43)
            r13 = r19
            if (r0 != 0) goto L_0x002a
            int r0 = X.G9t.A0a(r14, r13)
            r7 = r7 | r0
        L_0x002a:
            r0 = r11 & 3072(0xc00, float:4.305E-42)
            r8 = r15
            if (r0 != 0) goto L_0x0034
            int r0 = X.G9t.A0H(r14, r15)
            r7 = r7 | r0
        L_0x0034:
            r1 = r7 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0053
            boolean r0 = r14.Bwn()
            if (r0 == 0) goto L_0x0053
            r14.Evl()
        L_0x0043:
            X.5Xd r0 = r14.ASQ()
            if (r0 == 0) goto L_0x0052
            r12 = 9
            X.J8U r7 = new X.J8U
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r0.A06 = r7
        L_0x0052:
            return
        L_0x0053:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0061
            r1 = -1875954987(0xffffffff902f32d5, float:-3.4551824E-29)
            java.lang.String r0 = "com.instagram.schools.management.ui.LowerSettingsSection (SchoolSettingsComposeView.kt:176)"
            X.0fL.A01(r1, r0)
        L_0x0061:
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            X.5Zx r1 = X.C287275Zs.A07
            X.5Zr r0 = X.C287215Zl.A02
            r4 = 0
            X.5RD r1 = X.C291495hO.A02(r1, r14, r0, r4)
            int r5 = X.C287425a7.A00(r14)
            r3 = r14
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r14, r6)
            X.C51973G9u.A0y(r14, r3)
            X.C51971G9r.A12(r14, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x008d
            boolean r0 = X.C51972G9s.A1Q(r14, r5)
            if (r0 != 0) goto L_0x0090
        L_0x008d:
            X.C51971G9r.A13(r14, r1, r5)
        L_0x0090:
            X.C51965G9l.A18(r14, r2)
            X.62P r0 = r15.A06
            r5 = 1
            if (r0 == 0) goto L_0x009f
            int r0 = r0.size()
            r1 = 1
            if (r0 > r5) goto L_0x00a0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            r0 = -1795824088(0xffffffff94f5e628, float:-2.4829459E-26)
            r14.ExS(r0)
            if (r1 != 0) goto L_0x00aa
            if (r19 == 0) goto L_0x00b4
        L_0x00aa:
            r0 = 2131969721(0x7f1346b9, float:1.9576373E38)
            java.lang.String r0 = X.C288035bG.A00(r14, r0)
            X.C55130Hce.A00(r0, r14, r4)
        L_0x00b4:
            X.C286565Wx.A0L(r3, r4)
            r0 = -1795819689(0xffffffff94f5f757, float:-2.4836236E-26)
            r14.ExS(r0)
            if (r1 == 0) goto L_0x00eb
            r2 = 0
            r0 = -1795816992(0xffffffff94f601e0, float:-2.4840392E-26)
            boolean r0 = X.C51973G9u.A1N(r14, r0, r7)
            java.lang.Object r1 = r14.ECw()
            if (r0 != 0) goto L_0x00d1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x00d7
        L_0x00d1:
            r0 = 36
            X.Ivq r1 = X.C58681Ivq.A00(r14, r9, r0)
        L_0x00d7:
            X.0sa r0 = X.C51965G9l.A0y(r3, r1, r4)
            androidx.compose.ui.Modifier r2 = X.C287635aW.A05(r6, r2, r2, r0, r5)
            r0 = 2131961431(0x7f132657, float:1.9559559E38)
            java.lang.String r1 = X.C288035bG.A00(r14, r0)
            X.IPn r0 = X.C57124IPn.A00
            X.C52636GaA.A0E(r14, r2, r0, r1)
        L_0x00eb:
            X.C286565Wx.A0L(r3, r4)
            r0 = -1795811841(0xffffffff94f615ff, float:-2.4848328E-26)
            r14.ExS(r0)
            if (r19 == 0) goto L_0x0129
            r2 = 0
            r0 = -1795809020(0xffffffff94f62104, float:-2.4852675E-26)
            r14.ExS(r0)
            boolean r0 = X.C51972G9s.A1M(r7)
            java.lang.Object r1 = r14.ECw()
            if (r0 != 0) goto L_0x010b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0115
        L_0x010b:
            r0 = 37
            X.Ivq r1 = new X.Ivq
            r1.<init>(r10, r0)
            r14.FLL(r1)
        L_0x0115:
            X.0sa r0 = X.C51965G9l.A0y(r3, r1, r4)
            androidx.compose.ui.Modifier r2 = X.C287635aW.A05(r6, r2, r2, r0, r5)
            r0 = 2131976881(0x7f1362b1, float:1.9590895E38)
            java.lang.String r1 = X.C288035bG.A00(r14, r0)
            X.IPn r0 = X.C57124IPn.A00
            X.C52636GaA.A0E(r14, r2, r0, r1)
        L_0x0129:
            boolean r0 = X.C51971G9r.A1S(r14, r3, r4)
            if (r0 == 0) goto L_0x0043
            r0 = 1173289980(0x45eefbfc, float:7647.498)
            X.0fL.A00(r0)
            goto L_0x0043
        L_0x0137:
            r7 = r11
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6W.A05(X.5Wy, X.Gm0, X.0sa, X.0sa, int, boolean):void");
    }
}
