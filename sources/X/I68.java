package X;

import androidx.compose.foundation.layout.IntrinsicWidthElement;
import androidx.compose.ui.Modifier;

public abstract class I68 {
    public static final C56127HtF A00;
    public static final C56020HrS A01 = new C56020HrS(true, true);

    static {
        long j = AnonymousClass5RW.A09;
        long j2 = AnonymousClass5RW.A01;
        A00 = new C56127HtF(j, j2, j2, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j2 & 63)], AnonymousClass5RW.A03(j2), AnonymousClass5RW.A02(j2), AnonymousClass5RW.A01(j2), 0.38f), C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j2 & 63)], AnonymousClass5RW.A03(j2), AnonymousClass5RW.A02(j2), AnonymousClass5RW.A01(j2), 0.38f));
    }

    public static final void A00(C56127HtF htF, C286575Wy r13, Modifier modifier, C59529JNb jNb, C62320sa r16, 0sP r17, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r11 = r13;
        r13.ExV(1447189339);
        int i4 = i2;
        C59529JNb jNb2 = jNb;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r13, jNb) | i;
        } else {
            i3 = i5;
        }
        C62320sa r5 = r16;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r13, r5);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r13, modifier);
        }
        C56127HtF htF2 = htF;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r13, htF);
        }
        0sP r8 = r17;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0I(r13, r8);
        }
        if ((i3 & 9363) != 9362 || !r13.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(177812523, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:121)");
            }
            I5L.A01(r11, jNb2, A01, r5, AnonymousClass5PI.A01(r11, JG3.A00(htF, modifier2, r8, 0), 795909757), (i3 & 14) | 3456 | (i3 & 112), 0);
            if (0fL.A02()) {
                0fL.A00(2010443670);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59195J9z(jNb2, r5, htF2, modifier2, r8, i5, i4, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C56127HtF r33, X.C286575Wy r34, androidx.compose.ui.Modifier r35, java.lang.String r36, X.C62320sa r37, X.0sK r38, int r39, int r40, boolean r41) {
        /*
            r18 = r38
            r19 = r35
            r0 = 791018367(0x2f25fb7f, float:1.5096012E-10)
            r1 = r34
            r1.ExV(r0)
            r35 = r40
            r0 = r40 & 1
            r38 = r36
            r2 = r39
            if (r0 == 0) goto L_0x01ef
            r0 = r39 | 6
        L_0x0018:
            r4 = r40 & 2
            r3 = r41
            if (r4 == 0) goto L_0x01e4
            r0 = r0 | 48
        L_0x0020:
            r4 = r40 & 4
            r6 = r33
            if (r4 == 0) goto L_0x01d9
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r9 = r40 & 8
            if (r9 == 0) goto L_0x01cc
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r8 = r40 & 16
            if (r8 == 0) goto L_0x01bf
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r5 = r40 & 32
            r7 = 131072(0x20000, float:1.83671E-40)
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x0046
            r4 = r39 & r4
            if (r4 != 0) goto L_0x0047
            r4 = r37
            int r4 = X.G9t.A0J(r1, r4)
        L_0x0046:
            r0 = r0 | r4
        L_0x0047:
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r0
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r4) goto L_0x0079
            boolean r4 = r1.Bwn()
            if (r4 == 0) goto L_0x0079
            r1.Evl()
        L_0x0059:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x0078
            r36 = 1
            X.JAl r0 = new X.JAl
            r28 = r0
            r29 = r6
            r30 = r19
            r31 = r18
            r32 = r37
            r33 = r38
            r34 = r2
            r37 = r3
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1.A06 = r0
        L_0x0078:
            return
        L_0x0079:
            if (r9 == 0) goto L_0x007d
            X.5Qk r19 = androidx.compose.ui.Modifier.A00
        L_0x007d:
            r17 = 0
            if (r8 == 0) goto L_0x0083
            r18 = r17
        L_0x0083:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0091
            r5 = -1033209719(0xffffffffc26a7889, float:-58.61771)
            java.lang.String r4 = "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:181)"
            X.0fL.A01(r5, r4)
        L_0x0091:
            X.5Zp r9 = X.C55416HhM.A03
            r4 = 1094713344(0x41400000, float:12.0)
            X.6Fc r8 = X.C287275Zs.A01(r4)
            boolean r5 = X.C51972G9s.A1L(r0)
            r4 = 458752(0x70000, float:6.42848E-40)
            boolean r4 = X.C51972G9s.A1P(r4, r0, r7)
            r5 = r5 | r4
            java.lang.Object r10 = r1.ECw()
            if (r5 != 0) goto L_0x00ae
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r10 != r4) goto L_0x00b5
        L_0x00ae:
            r5 = 1
            r4 = r37
            X.GA1 r10 = X.GA1.A00(r1, r4, r5, r3)
        L_0x00b5:
            X.0sa r10 = (X.C62320sa) r10
            r7 = r19
            r5 = r38
            r4 = r17
            androidx.compose.ui.Modifier r4 = X.C287635aW.A05(r7, r4, r5, r10, r3)
            androidx.compose.ui.Modifier r10 = X.C51966G9m.A0V(r4)
            r7 = 1121976320(0x42e00000, float:112.0)
            r5 = 1133248512(0x438c0000, float:280.0)
            r4 = 1111490560(0x42400000, float:48.0)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A0I(r10, r7, r4, r5, r4)
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A05(r4)
            X.5RD r8 = X.C287395a4.A00(r8, r1, r9)
            r15 = 0
            int r7 = X.C287425a7.A00(r1)
            r9 = r1
            X.5Wx r9 = (X.C286565Wx) r9
            X.5RM r4 = X.C286565Wx.A04(r9)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r1, r5)
            X.0sa r11 = X.C287485aD.A00
            X.C51973G9u.A0z(r1, r9, r11)
            X.0sL r10 = X.C287485aD.A03
            X.0sL r12 = X.C51969G9p.A0w(r1, r8, r4, r10)
            X.0sL r8 = X.C287485aD.A02
            boolean r4 = r9.A0K
            if (r4 != 0) goto L_0x00fe
            boolean r4 = X.C51972G9s.A1Q(r1, r7)
            if (r4 != 0) goto L_0x0101
        L_0x00fe:
            X.C51971G9r.A13(r1, r8, r7)
        L_0x0101:
            X.0sL r7 = X.C51966G9m.A1K(r1, r5)
            X.6FX r16 = X.AnonymousClass6FX.A00
            if (r18 != 0) goto L_0x0164
            r4 = 554568909(0x210e0ccd, float:4.8128413E-19)
            r1.ExS(r4)
        L_0x010f:
            X.C286565Wx.A0L(r9, r15)
            if (r41 == 0) goto L_0x0161
            long r4 = r6.A04
        L_0x0116:
            r24 = 5
            long r29 = X.C55416HhM.A00
            X.5ZD r23 = X.C55416HhM.A04
            long r33 = X.C55416HhM.A02
            long r31 = X.C55416HhM.A01
            r26 = 16613240(0xfd7f78, float:2.3280108E-38)
            X.5Z4 r20 = new X.5Z4
            r22 = r17
            r25 = r15
            r27 = r4
            r21 = r17
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r29, r31, r33)
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r27 = 1
            r4 = r16
            androidx.compose.ui.Modifier r22 = r4.A00(r5)
            r4 = 1572864(0x180000, float:2.204052E-39)
            r29 = r0 & 14
            r29 = r29 | r4
            r30 = 440(0x1b8, float:6.17E-43)
            r21 = r1
            r23 = r20
            r24 = r38
            r25 = r17
            r26 = r15
            r28 = r15
            r31 = r15
            X.C291525hS.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x0059
            r0 = -1904348516(0xffffffff8e7df29c, float:-3.130147E-30)
            X.0fL.A00(r0)
            goto L_0x0059
        L_0x0161:
            long r4 = r6.A02
            goto L_0x0116
        L_0x0164:
            r4 = 554568910(0x210e0cce, float:4.812842E-19)
            X.5Qk r5 = X.C51965G9l.A0K(r1, r4)
            r22 = 1103101952(0x41c00000, float:24.0)
            r23 = 2143289344(0x7fc00000, float:NaN)
            X.0sP r21 = X.C287655aY.A00
            androidx.compose.foundation.layout.SizeElement r4 = new androidx.compose.foundation.layout.SizeElement
            r24 = r22
            r25 = r22
            r26 = r15
            r20 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26)
            androidx.compose.ui.Modifier r4 = r5.Ezh(r4)
            X.5RD r14 = X.C51966G9m.A0a(r15)
            int r13 = X.C287425a7.A00(r1)
            X.5RM r5 = X.C286565Wx.A04(r9)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r1, r4)
            X.C51973G9u.A0z(r1, r9, r11)
            X.C287595aO.A00(r1, r14, r10)
            boolean r5 = X.C51965G9l.A1Y(r1, r9, r5, r12)
            if (r5 != 0) goto L_0x01a4
            boolean r5 = X.C51972G9s.A1Q(r1, r13)
            if (r5 != 0) goto L_0x01a7
        L_0x01a4:
            X.C51971G9r.A13(r1, r8, r13)
        L_0x01a7:
            X.C287595aO.A00(r1, r4, r7)
            if (r41 == 0) goto L_0x01bc
            long r4 = r6.A03
        L_0x01ae:
            X.5RW r5 = X.C51965G9l.A0N(r4)
            r4 = r18
            X.C51967G9n.A1M(r5, r1, r4, r15)
            r1.ASN()
            goto L_0x010f
        L_0x01bc:
            long r4 = r6.A01
            goto L_0x01ae
        L_0x01bf:
            r4 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0034
            r4 = r18
            int r4 = X.G9t.A0I(r1, r4)
            r0 = r0 | r4
            goto L_0x0034
        L_0x01cc:
            r4 = r2 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x002e
            r4 = r19
            int r4 = X.G9t.A0R(r1, r4)
            r0 = r0 | r4
            goto L_0x002e
        L_0x01d9:
            r4 = r2 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0028
            int r4 = X.G9t.A0Q(r1, r6)
            r0 = r0 | r4
            goto L_0x0028
        L_0x01e4:
            r4 = r39 & 48
            if (r4 != 0) goto L_0x0020
            int r4 = X.G9t.A0Z(r1, r3)
            r0 = r0 | r4
            goto L_0x0020
        L_0x01ef:
            r0 = r39 & 6
            if (r0 != 0) goto L_0x01fd
            r0 = r38
            int r0 = X.G9t.A0O(r1, r0)
            r0 = r0 | r39
            goto L_0x0018
        L_0x01fd:
            r0 = r2
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I68.A01(X.HtF, X.5Wy, androidx.compose.ui.Modifier, java.lang.String, X.0sa, X.0sK, int, int, boolean):void");
    }

    public static final void A02(C56127HtF htF, C286575Wy r17, Modifier modifier, 0sK r19, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r2 = r17;
        r2.ExV(-921259293);
        int i4 = i2;
        C56127HtF htF2 = htF;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r2, htF2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r2, modifier2);
        }
        0sK r13 = r19;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r2, r13);
        }
        if ((i3 & 147) != 146 || !r2.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1639397548, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:144)");
            }
            C287245Zp r0 = C55416HhM.A03;
            AnonymousClass5ZQ A012 = AnonymousClass5ZN.A01(4.0f);
            boolean A1M = C51975G9x.A1M(3.0f);
            long j = AnonymousClass5RV.A00;
            Modifier A02 = I28.A02(r2, C51967G9n.A0H(C51966G9m.A0X(C56169Hty.A01(modifier2, A012, 3.0f, j, j, A1M), htF2.A00).Ezh(new IntrinsicWidthElement(AnonymousClass05K.A01, C287655aY.A00)), 0.0f));
            int i7 = (i3 << 3) & 7168;
            AnonymousClass5RD A0R = C51971G9r.A0R(C287275Zs.A07, r2, C287215Zl.A02, i7 >> 3);
            int A002 = C287425a7.A00(r2);
            C286565Wx r4 = (C286565Wx) r2;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A013 = C287435a8.A01(r2, A02);
            C51973G9u.A0y(r2, r4);
            C51971G9r.A12(r2, A0R, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r2, A002)) {
                C51971G9r.A13(r2, r1, A002);
            }
            C51965G9l.A18(r2, A013);
            C51967G9n.A1M(C304676Et.A00, r2, r13, ((i7 >> 6) & 112) | 6);
            if (C51967G9n.A1R(r2)) {
                0fL.A00(320804940);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 0, htF2, modifier2, r13);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: X.HtF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: X.HtF} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r11 == X.AnonymousClass5XT.A00) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r29, androidx.compose.ui.Modifier r30, X.C59529JNb r31, X.C62320sa r32, X.0sP r33, int r34, int r35) {
        /*
            r10 = r30
            r0 = 712057293(0x2a7121cd, float:2.1416827E-13)
            r9 = r29
            r9.ExV(r0)
            r24 = r35
            r0 = r35 & 1
            r19 = r31
            r8 = r34
            if (r0 == 0) goto L_0x017a
            r7 = r34 | 6
        L_0x0016:
            r0 = r35 & 2
            r15 = r32
            if (r0 == 0) goto L_0x016f
            r7 = r7 | 48
        L_0x001e:
            r2 = r35 & 4
            if (r2 == 0) goto L_0x0164
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0024:
            r0 = r35 & 8
            r13 = r33
            if (r0 == 0) goto L_0x0159
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x002c:
            r1 = r7 & 1171(0x493, float:1.641E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x0055
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x0055
            r9.Evl()
        L_0x003b:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x0054
            r25 = 2
            X.JG8 r0 = new X.JG8
            r20 = r15
            r21 = r10
            r22 = r13
            r23 = r8
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r1.A06 = r0
        L_0x0054:
            return
        L_0x0055:
            if (r2 == 0) goto L_0x0059
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
        L_0x0059:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0067
            r1 = 1884546742(0x7053e6b6, float:2.62321E29)
            java.lang.String r0 = "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)"
            X.0fL.A01(r1, r0)
        L_0x0067:
            r16 = 3
            r6 = 0
            r1 = 16973958(0x1030086, float:2.4061276E-38)
            r3 = 16973952(0x1030080, float:2.406126E-38)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007e
            r2 = -183190627(0xfffffffff514bb9d, float:-1.885413E32)
            java.lang.String r0 = "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)"
            X.0fL.A01(r2, r0)
        L_0x007e:
            android.content.Context r2 = X.C51968G9o.A0I(r9)
            X.4bM r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A00
            java.lang.Object r0 = r9.AJO(r0)
            boolean r4 = r9.AGu(r2)
            boolean r0 = r9.AGu(r0)
            r0 = r0 | r4
            java.lang.Object r11 = r9.ECw()
            if (r0 != 0) goto L_0x009b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r11 != r0) goto L_0x0122
        L_0x009b:
            X.HtF r12 = A00
            long r4 = r12.A00
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r11 = r2.obtainStyledAttributes(r1, r0)
            int r1 = X.C285595Rx.A00(r4)
            int r0 = r11.getColor(r6, r1)
            r11.recycle()
            if (r0 == r1) goto L_0x00bc
            long r0 = (long) r0
            long r4 = X.C51965G9l.A08(r0)
        L_0x00bc:
            r0 = 16842806(0x1010036, float:2.369371E-38)
            int[] r0 = new int[]{r0}
            android.content.res.TypedArray r0 = r2.obtainStyledAttributes(r3, r0)
            android.content.res.ColorStateList r11 = r0.getColorStateList(r6)
            r0.recycle()
            long r2 = r12.A04
            int r1 = X.C285595Rx.A00(r2)
            if (r11 == 0) goto L_0x00ee
            r0 = 16842910(0x101009e, float:2.3694E-38)
            int[] r0 = new int[]{r0}
            int r0 = r11.getColorForState(r0, r1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            if (r14 == 0) goto L_0x00ee
            if (r0 == r1) goto L_0x00ee
            long r0 = (long) r0
            long r2 = X.C51965G9l.A08(r0)
        L_0x00ee:
            long r0 = r12.A02
            int r14 = X.C285595Rx.A00(r0)
            if (r11 == 0) goto L_0x010e
            r12 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r12 = new int[]{r12}
            int r11 = r11.getColorForState(r12, r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            if (r12 == 0) goto L_0x010e
            if (r11 == r14) goto L_0x010e
            long r0 = (long) r11
            long r0 = X.C51965G9l.A08(r0)
        L_0x010e:
            X.HtF r11 = new X.HtF
            r25 = r11
            r26 = r4
            r28 = r2
            r30 = r2
            r32 = r0
            r34 = r0
            r25.<init>(r26, r28, r30, r32, r34)
            r9.FLL(r11)
        L_0x0122:
            X.HtF r11 = (X.C56127HtF) r11
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0130
            r0 = -551788537(0xffffffffdf1c6007, float:-1.1268014E19)
            X.0fL.A00(r0)
        L_0x0130:
            int r22 = X.C51971G9r.A04(r7)
            r0 = 57344(0xe000, float:8.0356E-41)
            int r7 = r7 << r16
            r7 = r7 & r0
            r22 = r22 | r7
            r20 = r15
            r21 = r13
            r23 = r6
            r17 = r9
            r18 = r10
            r16 = r11
            A00(r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x003b
            r0 = -1252512705(0xffffffffb5582c3f, float:-8.0530657E-7)
            X.0fL.A00(r0)
            goto L_0x003b
        L_0x0159:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x002c
            int r0 = X.G9t.A0H(r9, r13)
            r7 = r7 | r0
            goto L_0x002c
        L_0x0164:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0024
            int r0 = X.G9t.A0Q(r9, r10)
            r7 = r7 | r0
            goto L_0x0024
        L_0x016f:
            r0 = r34 & 48
            if (r0 != 0) goto L_0x001e
            int r0 = X.G9t.A0F(r9, r15)
            r7 = r7 | r0
            goto L_0x001e
        L_0x017a:
            r0 = r34 & 6
            if (r0 != 0) goto L_0x0188
            r0 = r19
            int r7 = X.G9t.A0O(r9, r0)
            r7 = r7 | r34
            goto L_0x0016
        L_0x0188:
            r7 = r8
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I68.A03(X.5Wy, androidx.compose.ui.Modifier, X.JNb, X.0sa, X.0sP, int, int):void");
    }
}
