package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I2i  reason: case insensitive filesystem */
public abstract class C56578I2i {
    public static final void A01(C286575Wy r17, Modifier modifier, 0sL r19, 0sL r20, AnonymousClass62P r21, int i, boolean z) {
        int i2;
        Modifier modifier2 = modifier;
        AnonymousClass62P r1 = r21;
        int A02 = DbW.A02(0, r1, modifier2);
        0sL r3 = r19;
        0sL r2 = r20;
        AnonymousClass7TF.A1D(r3, 3, r2);
        C286575Wy r11 = r17;
        r11.ExV(35080314);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, r1) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r11, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r11, modifier2);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r11, r3);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r11, r2);
        }
        if ((i2 & 9363) != 9362 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(25541621, "com.instagram.creation.genai.memu.settings.MemuPhotosLayout (MemuPhotosGridLayout.kt:40)");
            }
            I5T.A02(C287275Zs.A01(1.0f), C287275Zs.A01(1.0f), (C56498HzU) null, r11, C51967G9n.A0C(C51966G9m.A0V(modifier2), 12.0f), AnonymousClass5PI.A01(r11, new C59369JGv(A02, r1, r3, r2, z2), 1822711285), 3, 0, 1576368, 48);
            if (0fL.A02()) {
                0fL.A00(1860084867);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            int i4 = i3;
            ASQ.A06 = new J9G(i4, A02, r1, modifier2, r2, r3, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.Io8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: X.Io8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.Io8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: X.Io8} */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d4, code lost:
        if (r13 == X.AnonymousClass5XT.A00) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0112, code lost:
        if (r10 == X.AnonymousClass5XT.A00) goto L_0x0114;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r29, X.C46539Dgg r30, X.0sL r31, X.0sL r32, int r33, int r34, boolean r35) {
        /*
            r4 = 0
            r6 = r30
            r15 = r31
            X.AnonymousClass7TF.A1C(r6, r4, r15)
            r8 = 4
            r0 = r32
            X.0qQ.A0B(r0, r8)
            r0 = 1716856967(0x66552887, float:2.5165291E23)
            r7 = r29
            r7.ExV(r0)
            r5 = r34
            r0 = r34 & 6
            if (r0 != 0) goto L_0x01cf
            int r9 = X.G9t.A0O(r7, r6)
            r9 = r9 | r34
        L_0x0022:
            r0 = r34 & 48
            r1 = 32
            r31 = r33
            if (r0 != 0) goto L_0x0031
            r0 = r31
            int r0 = X.G9t.A06(r7, r0)
            r9 = r9 | r0
        L_0x0031:
            r0 = r5 & 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            r19 = r35
            if (r0 != 0) goto L_0x0040
            r0 = r19
            int r0 = X.G9t.A0a(r7, r0)
            r9 = r9 | r0
        L_0x0040:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0049
            int r0 = X.G9t.A0H(r7, r15)
            r9 = r9 | r0
        L_0x0049:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 != 0) goto L_0x0056
            r0 = r32
            int r0 = X.G9t.A0I(r7, r0)
            r9 = r9 | r0
        L_0x0056:
            r3 = r9 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r0) goto L_0x007e
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x007e
            r7.Evl()
        L_0x0065:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x007d
            r13 = 5
            X.J9E r0 = new X.J9E
            r7 = r0
            r8 = r6
            r9 = r15
            r10 = r32
            r11 = r5
            r12 = r31
            r14 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r1.A06 = r0
        L_0x007d:
            return
        L_0x007e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x008c
            r3 = -1639692385(0xffffffff9e44479f, float:-1.03909645E-20)
            java.lang.String r0 = "com.instagram.creation.genai.memu.settings.MemuPhotoItem (MemuPhotosGridLayout.kt:61)"
            X.0fL.A01(r3, r0)
        L_0x008c:
            float r11 = X.C51972G9s.A01(r7)
            r0 = 1077936128(0x40400000, float:3.0)
            float r11 = r11 / r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 - r0
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0D(r3, r11)
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A08(r0, r11)
            r18 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r17 = X.C54739HQw.A00(r11, r0, r4)
            r0 = 1997257604(0x770bbb84, float:2.8341115E33)
            r7.ExS(r0)
            r11 = r9 & 896(0x380, float:1.256E-42)
            boolean r12 = X.AnonymousClass7TF.A1S(r11, r10)
            r0 = 57344(0xe000, float:8.0356E-41)
            boolean r0 = X.C51972G9s.A1P(r9, r0, r2)
            r12 = r12 | r0
            r16 = r9 & 112(0x70, float:1.57E-43)
            r0 = r16
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            r12 = r12 | r0
            r2 = r9 & 14
            boolean r0 = X.AnonymousClass7TF.A1S(r2, r8)
            r12 = r12 | r0
            java.lang.Object r13 = r7.ECw()
            if (r12 != 0) goto L_0x00d6
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x00ea
        L_0x00d6:
            X.Io8 r13 = new X.Io8
            r20 = r13
            r21 = r6
            r22 = r32
            r23 = r31
            r24 = r4
            r25 = r19
            r20.<init>(r21, r22, r23, r24, r25)
            r7.FLL(r13)
        L_0x00ea:
            X.0sa r13 = (X.C62320sa) r13
            X.5Wx r1 = X.C51965G9l.A0H(r7, r4)
            r0 = 1997263432(0x770bd248, float:2.835915E33)
            boolean r11 = X.C51972G9s.A1R(r7, r0, r11, r10)
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r10 = X.AnonymousClass7TF.A1S(r9, r0)
            r11 = r11 | r10
            boolean r10 = X.C51972G9s.A1J(r16)
            r11 = r11 | r10
            boolean r10 = X.AnonymousClass7TF.A1S(r2, r8)
            r11 = r11 | r10
            java.lang.Object r10 = r7.ECw()
            if (r11 != 0) goto L_0x0114
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r10 != r11) goto L_0x0128
        L_0x0114:
            r24 = 1
            X.Io8 r10 = new X.Io8
            r20 = r10
            r21 = r6
            r22 = r15
            r23 = r31
            r25 = r19
            r20.<init>(r21, r22, r23, r24, r25)
            r7.FLL(r10)
        L_0x0128:
            X.0sa r14 = X.C51965G9l.A0y(r1, r10, r4)
            r29 = 1
            X.0sP r12 = X.C287655aY.A00
            X.GQZ r11 = new X.GQZ
            r10 = r18
            r11.<init>(r10, r13, r14)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A02(r3, r12, r11)
            r10 = r17
            androidx.compose.ui.Modifier r14 = r10.Ezh(r11)
            X.5RD r11 = X.C51966G9m.A0a(r4)
            int r13 = X.C287425a7.A00(r7)
            X.5RM r10 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r7, r14)
            X.C51973G9u.A0y(r7, r1)
            X.C51971G9r.A12(r7, r11, r10)
            X.0sL r11 = X.C287485aD.A02
            boolean r10 = r1.A0K
            if (r10 != 0) goto L_0x0163
            boolean r10 = X.C51972G9s.A1Q(r7, r13)
            if (r10 != 0) goto L_0x0166
        L_0x0163:
            X.C51971G9r.A13(r7, r11, r13)
        L_0x0166:
            X.C51965G9l.A18(r7, r12)
            X.5dj r10 = X.C289515dj.A00
            java.lang.String r11 = r6.A02
            com.instagram.common.typedurl.SimpleImageUrl r21 = X.DbS.A0V(r11)
            r25 = 196608(0x30000, float:2.75506E-40)
            r26 = 94
            r27 = 0
            r23 = r18
            r24 = r18
            r30 = r4
            r20 = r7
            r22 = r18
            X.2DN r12 = X.1zC.A02(r20, r21, r22, r23, r24, r25, r26, r27, r29, r30)
            X.5bM r11 = X.C288075bK.A00
            androidx.compose.ui.Modifier r3 = r10.CmS(r3)
            X.AnonymousClass6G3.A08(r7, r3, r12, r11)
            r3 = 1803753868(0x6b83198c, float:3.1697985E26)
            r7.ExS(r3)
            if (r35 == 0) goto L_0x01c1
            boolean r3 = r6.A03
            r10 = 1803756962(0x6b8325a2, float:3.17094E26)
            boolean r9 = X.C51972G9s.A1R(r7, r10, r9, r0)
            boolean r0 = X.AnonymousClass7TF.A1S(r2, r8)
            r9 = r9 | r0
            java.lang.Object r2 = r7.ECw()
            if (r9 != 0) goto L_0x01ae
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x01b4
        L_0x01ae:
            r0 = 20
            X.J6k r2 = X.C59102J6k.A00(r7, r6, r15, r0)
        L_0x01b4:
            X.0sP r9 = X.C51965G9l.A0z(r1, r2)
            r8 = r14
            r10 = r31
            r11 = r16
            r12 = r3
            A00(r7, r8, r9, r10, r11, r12)
        L_0x01c1:
            boolean r0 = X.C51971G9r.A1S(r7, r1, r4)
            if (r0 == 0) goto L_0x0065
            r0 = 1484939191(0x58825fb7, float:1.14678083E15)
            X.0fL.A00(r0)
            goto L_0x0065
        L_0x01cf:
            r9 = r5
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56578I2i.A02(X.5Wy, X.Dgg, X.0sL, X.0sL, int, int, boolean):void");
    }

    public static final void A00(C286575Wy r15, Modifier modifier, 0sP r17, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        0sP r5 = r17;
        AnonymousClass7TG.A1Q(modifier2, r5);
        C286575Wy r13 = r15;
        r15.ExV(-870619976);
        int i4 = i2;
        boolean z2 = z;
        if ((i2 & 6) == 0) {
            i3 = G9t.A0Y(r15, z2) | i2;
        } else {
            i3 = i4;
        }
        int i5 = i;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r15, i5);
        }
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0Q(r15, modifier2);
        }
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0H(r15, r5);
        }
        if ((i3 & 1171) != 1170 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1170664635, "com.instagram.creation.genai.memu.settings.MemuPhotoItemOverlay (MemuPhotosGridLayout.kt:104)");
            }
            Modifier A0X = C51966G9m.A0X(modifier2, AnonymousClass5aQ.A00(r15).A0y);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r15);
            C286565Wx r8 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r15, A0X);
            C51973G9u.A0y(r15, r8);
            C51971G9r.A12(r15, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r1, A00);
            }
            C51965G9l.A18(r15, A01);
            Modifier AAz = C289515dj.A00.AAz(C287215Zl.A07, C287195Zj.A02(Modifier.A00));
            HLW hlw = HLW.ON_MEDIA;
            r13.ExS(644107780);
            boolean z3 = true;
            boolean A1S = AnonymousClass7TF.A1S(i3 & 7168, C249703kE.FLAG_MOVED);
            if ((i3 & 112) != 32) {
                z3 = false;
            }
            boolean z4 = A1S | z3;
            Object ECw = r13.ECw();
            if (z4 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58735Iwi(i5, 13, r5);
                r13.FLL(ECw);
            }
            HXJ.A00(r13, AAz, hlw, C51965G9l.A0z(r8, ECw), ((i3 << 3) & 112) | 24576, 8, z2, false);
            if (C51967G9n.A1R(r13)) {
                0fL.A00(1391127947);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i4, i5, 7, modifier2, r5, z2);
        }
    }
}
