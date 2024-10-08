package X;

import androidx.compose.ui.Modifier;

public abstract class GRY {
    public static final void A01(C286575Wy r16, Modifier modifier, AnonymousClass2DO r18, C288095bM r19, JSI jsi, 0sP r21, int i, int i2, int i3, boolean z) {
        A00(r16, modifier, (C288195bW) null, r18, r19, jsi, r21, i, i2, i3, 0, 0, z, false, false);
    }

    public static final void A02(C286575Wy r12, Modifier modifier, AnonymousClass2DO r14, JSI jsi, int i) {
        A00(r12, modifier, (C288195bW) null, r14, (C288095bM) null, jsi, (0sP) null, i, 0, 2040, 0, 0, false, false, false);
    }

    public static final void A03(C286575Wy r14, AnonymousClass2DO r15, JSI jsi) {
        A00(r14, (Modifier) null, (C288195bW) null, r15, (C288095bM) null, jsi, (0sP) null, 48, 0, 2044, 0, 0, false, false, false);
    }

    public static final void A04(C286575Wy r12, AnonymousClass2DO r13, JSI jsi, int i, int i2) {
        A00(r12, (Modifier) null, (C288195bW) null, r13, (C288095bM) null, jsi, (0sP) null, i, 0, i2, 0, 0, false, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r4 == false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r30, androidx.compose.ui.Modifier r31, X.C288195bW r32, X.AnonymousClass2DO r33, X.C288095bM r34, X.JSI r35, X.0sP r36, int r37, int r38, int r39, long r40, long r42, boolean r44, boolean r45, boolean r46) {
        /*
            r26 = r31
            r23 = r44
            r25 = r32
            r18 = r40
            r16 = r42
            r22 = r46
            r21 = r45
            r24 = r34
            r27 = r36
            r3 = 0
            r32 = r35
            r1 = r33
            r0 = r32
            boolean r29 = X.AnonymousClass7TF.A1U(r3, r1, r0)
            r0 = 788029335(0x2ef85f97, float:1.12947145E-10)
            r1 = r30
            r1.ExV(r0)
            r6 = r39
            r0 = r39 & 1
            r7 = r37
            if (r0 == 0) goto L_0x0525
            r0 = r37 | 6
        L_0x002f:
            r2 = r39 & 2
            if (r2 == 0) goto L_0x0518
            r0 = r0 | 48
        L_0x0035:
            r15 = r39 & 4
            if (r15 == 0) goto L_0x050b
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x003b:
            r14 = r39 & 8
            if (r14 == 0) goto L_0x04fe
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0041:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0056
            r2 = r39 & 16
            if (r2 != 0) goto L_0x0053
            r4 = r18
            boolean r4 = r1.AGt(r4)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x0055
        L_0x0053:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0055:
            r0 = r0 | r2
        L_0x0056:
            r13 = r39 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r13 != 0) goto L_0x006a
            r2 = r37 & r2
            if (r2 != 0) goto L_0x006b
            r4 = r16
            boolean r2 = r1.AGt(r4)
            int r2 = X.C51969G9p.A03(r2)
        L_0x006a:
            r0 = r0 | r2
        L_0x006b:
            r11 = r39 & 64
            r2 = 1572864(0x180000, float:2.204052E-39)
            if (r11 != 0) goto L_0x007b
            r2 = r37 & r2
            if (r2 != 0) goto L_0x007c
            r2 = r23
            int r2 = X.G9t.A0e(r1, r2)
        L_0x007b:
            r0 = r0 | r2
        L_0x007c:
            r10 = r6 & 128(0x80, float:1.794E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x008c
            r2 = r37 & r2
            if (r2 != 0) goto L_0x008d
            r2 = r21
            int r2 = X.G9t.A0f(r1, r2)
        L_0x008c:
            r0 = r0 | r2
        L_0x008d:
            r9 = r6 & 256(0x100, float:3.59E-43)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            if (r9 != 0) goto L_0x009d
            r2 = r37 & r2
            if (r2 != 0) goto L_0x009e
            r2 = r22
            int r2 = X.G9t.A0g(r1, r2)
        L_0x009d:
            r0 = r0 | r2
        L_0x009e:
            r8 = r6 & 512(0x200, float:7.175E-43)
            r2 = 805306368(0x30000000, float:4.656613E-10)
            if (r8 != 0) goto L_0x00ae
            r2 = r37 & r2
            if (r2 != 0) goto L_0x00af
            r2 = r24
            int r2 = X.G9t.A0X(r1, r2)
        L_0x00ae:
            r0 = r0 | r2
        L_0x00af:
            r5 = r6 & 1024(0x400, float:1.435E-42)
            r35 = r38
            if (r5 == 0) goto L_0x04ec
            r12 = r38 | 6
        L_0x00b7:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r4 = r0 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r2) goto L_0x00f7
            r4 = r12 & 3
            r2 = 2
            if (r4 != r2) goto L_0x00f7
            boolean r2 = r1.Bwn()
            if (r2 == 0) goto L_0x00f7
            r1.Evl()
        L_0x00cf:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x00f6
            X.JCe r0 = new X.JCe
            r28 = r26
            r29 = r25
            r30 = r33
            r31 = r24
            r33 = r27
            r34 = r7
            r36 = r6
            r37 = r18
            r39 = r16
            r41 = r23
            r42 = r21
            r43 = r22
            r27 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r41, r42, r43)
            r1.A06 = r0
        L_0x00f6:
            return
        L_0x00f7:
            r1.Ewr()
            r2 = r37 & 1
            if (r2 == 0) goto L_0x01fb
            boolean r2 = r1.Aw3()
            if (r2 != 0) goto L_0x01fb
            r1.Evl()
            r2 = r39 & 16
            if (r2 == 0) goto L_0x010f
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r2
        L_0x010f:
            boolean r2 = X.C51967G9n.A1S(r1)
            if (r2 == 0) goto L_0x011d
            r4 = -274487810(0xffffffffefa3a5fe, float:-1.0129346E29)
            java.lang.String r2 = "com.instagram.compose.igds.components.peoplecell.IgdsProfilePicture (IgdsProfilePicture.kt:137)"
            X.0fL.A01(r4, r2)
        L_0x011d:
            r2 = -1014918645(0xffffffffc381920b, float:-259.14096)
            X.5Qk r11 = X.C51965G9l.A0K(r1, r2)
            r31 = r11
            if (r23 == 0) goto L_0x02f6
            r28 = 0
            r10 = 0
            r2 = 378991295(0x1696f2bf, float:2.4387001E-25)
            r1.ExS(r2)
            r13 = 30
            r12 = 2000(0x7d0, float:2.803E-42)
            r9 = 8000(0x1f40, float:1.121E-41)
            r8 = 1000(0x3e8, float:1.401E-42)
            com.instagram.compose.ui.gradientspinner.BezierControlPoints r4 = X.GSQ.A00
            r5 = 1065353216(0x3f800000, float:1.0)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x014b
            r14 = 347865175(0x14bc0057, float:1.8983283E-26)
            java.lang.String r2 = "com.instagram.compose.ui.gradientspinner.rememberGradientSpinnerState (GradientSpinnerState.kt:50)"
            X.0fL.A01(r14, r2)
        L_0x014b:
            java.lang.Object[] r14 = new java.lang.Object[r3]
            X.5Tp r37 = X.C52412GRo.A0C
            r2 = 445740967(0x1a9177a7, float:6.0163903E-23)
            boolean r2 = X.C51967G9n.A1V(r1, r2, r13)
            boolean r13 = X.C51970G9q.A1U(r2)
            boolean r2 = r1.AGs(r12)
            boolean r12 = X.C51970G9q.A1U(r2)
            r12 = r12 | r13
            boolean r2 = r1.AGs(r9)
            boolean r2 = X.C51970G9q.A1U(r2)
            r12 = r12 | r2
            boolean r2 = r1.AGs(r9)
            boolean r2 = X.C51970G9q.A1U(r2)
            r12 = r12 | r2
            boolean r2 = r1.AGs(r8)
            boolean r2 = X.C51970G9q.A1U(r2)
            r12 = r12 | r2
            boolean r2 = r1.AGu(r4)
            boolean r2 = X.C51970G9q.A1U(r2)
            r12 = r12 | r2
            boolean r8 = X.G9t.A1S(r1, r5)
            r8 = r8 | r12
            java.lang.Object r2 = r1.ECw()
            if (r8 != 0) goto L_0x0196
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r2 != r8) goto L_0x019e
        L_0x0196:
            X.Ind r2 = new X.Ind
            r2.<init>(r4, r3)
            r1.FLL(r2)
        L_0x019e:
            X.0sa r2 = (X.C62320sa) r2
            X.5Wx r12 = X.C51965G9l.A0H(r1, r3)
            r41 = 4
            r36 = r1
            r38 = r2
            r39 = r14
            r40 = r3
            java.lang.Object r2 = X.C305136Gr.A00(r36, r37, r38, r39, r40, r41)
            X.GRo r2 = (X.C52412GRo) r2
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x01c0
            r4 = -1715471337(0xffffffff99bffc17, float:-1.9850755E-23)
            X.0fL.A00(r4)
        L_0x01c0:
            X.C286565Wx.A0L(r12, r3)
            if (r21 == 0) goto L_0x022f
            r20 = -1
            X.5Oz r4 = r2.A09
            r30 = r4
            boolean r4 = X.C51971G9r.A1W(r30)
            if (r4 != 0) goto L_0x0282
            r14 = 0
            java.util.List r15 = r2.A0B
            int r13 = r15.size()
        L_0x01d8:
            if (r14 >= r13) goto L_0x0273
            X.JNL r9 = r2.A08
            float r8 = r2.A03
            int r4 = r15.size()
            float r4 = (float) r4
            float r8 = r8 / r4
            float r4 = (float) r14
            float r8 = r8 * r4
            float r4 = r9.FHc(r8)
            java.lang.Object r8 = r15.get(r14)
            com.instagram.compose.ui.gradientspinner.Segment r8 = (com.instagram.compose.ui.gradientspinner.Segment) r8
            r8.A00 = r10
            r8.A01 = r4
            r4 = r20
            r8.A02 = r4
            int r14 = r14 + 1
            goto L_0x01d8
        L_0x01fb:
            if (r15 == 0) goto L_0x01ff
            X.5Qk r26 = androidx.compose.ui.Modifier.A00
        L_0x01ff:
            if (r14 == 0) goto L_0x0203
            r25 = 0
        L_0x0203:
            r2 = r39 & 16
            if (r2 == 0) goto L_0x020f
            long r18 = X.C51966G9m.A0F(r1)
            r2 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = r0 & r2
        L_0x020f:
            if (r13 == 0) goto L_0x0213
            long r16 = X.AnonymousClass5RW.A07
        L_0x0213:
            r2 = r23
            boolean r23 = X.C51966G9m.A1Q(r11, r2)
            r2 = r21
            boolean r21 = X.C51966G9m.A1Q(r10, r2)
            r2 = r22
            boolean r22 = X.C51966G9m.A1R(r9, r2)
            if (r8 == 0) goto L_0x0229
            X.5bM r24 = X.C288075bK.A04
        L_0x0229:
            if (r5 == 0) goto L_0x010f
            r27 = 0
            goto L_0x010f
        L_0x022f:
            r21 = 0
            java.lang.Float r4 = r2.A02
            if (r4 != 0) goto L_0x0282
            java.util.List r9 = r2.A0B
            java.util.Iterator r14 = r9.iterator()
        L_0x023b:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L_0x0260
            java.lang.Object r8 = r14.next()
            com.instagram.compose.ui.gradientspinner.Segment r8 = (com.instagram.compose.ui.gradientspinner.Segment) r8
            java.lang.Object r4 = X.00k.A0I(r9)
            com.instagram.compose.ui.gradientspinner.Segment r4 = (com.instagram.compose.ui.gradientspinner.Segment) r4
            float r4 = r4.A00
            r13 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x025c
            float r4 = r8.A00
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            r4 = 2
            if (r13 >= 0) goto L_0x025d
        L_0x025c:
            r4 = 1
        L_0x025d:
            r8.A02 = r4
            goto L_0x023b
        L_0x0260:
            float r4 = r2.A00
            r8 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 % r8
            r2.A00 = r4
            float r8 = r8 - r4
            int r4 = r2.A05
            float r4 = (float) r4
            float r8 = r8 / r4
            java.lang.Float r4 = java.lang.Float.valueOf(r8)
            r2.A02 = r4
            goto L_0x0282
        L_0x0273:
            r4 = r28
            r2.A02 = r4
            r2.A01 = r10
            r2.A00 = r10
            r8 = r30
            r4 = r29
            X.C51967G9n.A16(r8, r4)
        L_0x0282:
            r4 = -1014909248(0xffffffffc381b6c0, float:-259.42773)
            r1.ExS(r4)
            if (r22 == 0) goto L_0x02fa
            X.0eM r4 = X.AnonymousClass3Mk.A0A
            java.lang.Object r8 = r4.getValue()
            com.instagram.api.schemas.RingSpec r8 = (com.instagram.api.schemas.RingSpec) r8
            X.0qQ.A0B(r8, r3)
            java.lang.String r37 = r8.getName()
            com.instagram.api.schemas.RingSpecPoint r4 = r8.Byj()
            float r5 = r4.CGs()
            com.instagram.api.schemas.RingSpecPoint r4 = r8.Byj()
            float r4 = r4.CHR()
            long r40 = X.C289325dP.A00(r5, r4)
            com.instagram.api.schemas.RingSpecPoint r4 = r8.B1X()
            float r5 = r4.CGs()
            com.instagram.api.schemas.RingSpecPoint r4 = r8.B1X()
            float r4 = r4.CHR()
            long r42 = X.C289325dP.A00(r5, r4)
            int[] r14 = X.C240863Mx.A00(r8)
            int r4 = r14.length
            r20 = r4
            java.util.ArrayList r15 = X.DbS.A0v(r20)
            r9 = 0
        L_0x02cd:
            r4 = r20
            if (r9 >= r4) goto L_0x02e2
            r4 = r14[r9]
            long r4 = (long) r4
            r13 = 32
            long r4 = r4 << r13
            X.5RW r13 = new X.5RW
            r13.<init>(r4)
            r15.add(r13)
            int r9 = r9 + 1
            goto L_0x02cd
        L_0x02e2:
            X.62P r38 = X.AnonymousClass62Q.A00(r15)
            java.util.List r4 = r8.BNn()
            X.62P r39 = X.AnonymousClass62Q.A00(r4)
            X.GRc r4 = new X.GRc
            r36 = r4
            r36.<init>(r37, r38, r39, r40, r42)
            goto L_0x033d
        L_0x02f6:
            r23 = 0
            goto L_0x03d9
        L_0x02fa:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0308
            r8 = 1179608106(0x464f642a, float:13273.041)
            java.lang.String r4 = "com.instagram.compose.ui.gradientspinner.GradientSpinnerDefaults.inactiveRing (GradientSpinner.kt:216)"
            X.0fL.A01(r8, r4)
        L_0x0308:
            r40 = 0
            long r42 = X.C289325dP.A00(r5, r5)
            long r4 = X.C51966G9m.A0K(r1)
            X.5RW r5 = X.C51965G9l.A0N(r4)
            long r8 = X.C51966G9m.A0K(r1)
            X.5RW r4 = X.C51965G9l.A0N(r8)
            X.5RW[] r4 = new X.AnonymousClass5RW[]{r5, r4}
            X.62O r38 = X.AnonymousClass62Q.A04(r4)
            java.lang.String r37 = "inactive"
            X.GRc r4 = new X.GRc
            r36 = r4
            r39 = r28
            r36.<init>(r37, r38, r39, r40, r42)
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x033d
            r5 = 643314426(0x265832fa, float:7.500914E-16)
            X.0fL.A00(r5)
        L_0x033d:
            X.C286565Wx.A0L(r12, r3)
            float r5 = r32.AeO()
            float r14 = r32.AeL()
            boolean r8 = X.C61670oa.A02()
            if (r8 == 0) goto L_0x035f
            int r8 = java.lang.Float.compare(r5, r10)
            if (r8 <= 0) goto L_0x04cf
            r8 = 1109393408(0x42200000, float:40.0)
            int r8 = java.lang.Float.compare(r5, r8)
            if (r8 > 0) goto L_0x04cf
            r14 = 1072064102(0x3fe66666, float:1.8)
        L_0x035f:
            float r13 = r32.AeN()
            boolean r8 = X.C61670oa.A02()
            if (r8 == 0) goto L_0x037e
            int r8 = java.lang.Float.compare(r5, r10)
            if (r8 <= 0) goto L_0x04b5
            r8 = 1109393408(0x42200000, float:40.0)
            int r8 = java.lang.Float.compare(r5, r8)
            if (r8 > 0) goto L_0x04b5
            r9 = 1082130432(0x40800000, float:4.0)
        L_0x0379:
            r8 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 * r8
            float r13 = r5 + r9
        L_0x037e:
            X.0qQ.A0B(r11, r3)
            r5 = -1294186883(0xffffffffb2dc467d, float:-2.5643425E-8)
            r1.ExS(r5)
            r9 = 1132920832(0x43870000, float:270.0)
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x0397
            r8 = 1141327734(0x44074776, float:541.1166)
            java.lang.String r5 = "com.instagram.compose.ui.gradientspinner.gradientSpinner (GradientSpinner.kt:45)"
            X.0fL.A01(r8, r5)
        L_0x0397:
            r5 = -1703931794(0xffffffff9a70106e, float:-4.964411E-23)
            r1.ExS(r5)
            r8 = 0
            boolean r10 = X.G9t.A1S(r1, r14)
            boolean r5 = r1.AGr(r9)
            if (r5 == 0) goto L_0x03a9
            r8 = 1
        L_0x03a9:
            r10 = r10 | r8
            java.lang.Object r8 = r1.ECw()
            if (r10 != 0) goto L_0x03b4
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r8 != r5) goto L_0x03bc
        L_0x03b4:
            X.GRm r8 = new X.GRm
            r8.<init>(r14)
            r1.FLL(r8)
        L_0x03bc:
            X.0sK r8 = (X.0sK) r8
            X.C286565Wx.A0L(r12, r3)
            com.instagram.compose.ui.gradientspinner.GradientSpinnerModifierElement r5 = new com.instagram.compose.ui.gradientspinner.GradientSpinnerModifierElement
            r5.<init>(r2, r4, r8, r13)
            androidx.compose.ui.Modifier r11 = r11.Ezh(r5)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x03d6
            r2 = 897569543(0x357fd307, float:9.530199E-7)
            X.0fL.A00(r2)
        L_0x03d6:
            X.C286565Wx.A0L(r12, r3)
        L_0x03d9:
            X.5Wx r8 = X.C51965G9l.A0H(r1, r3)
            r2 = -1014885070(0xffffffffc3821532, float:-260.1656)
            r1.ExS(r2)
            float r4 = r32.AeN()
            r2 = r26
            androidx.compose.ui.Modifier r2 = X.C287205Zk.A0C(r2, r4)
            androidx.compose.ui.Modifier r4 = r2.Ezh(r11)
            float r2 = r32.AeO()
            androidx.compose.ui.Modifier r9 = X.C287205Zk.A0B(r4, r2)
            X.5ZQ r2 = X.AnonymousClass5ZN.A00
            r4 = r16
            androidx.compose.ui.Modifier r4 = X.C304766Fd.A01(r9, r2, r4)
            androidx.compose.ui.Modifier r10 = X.AnonymousClass6FZ.A01(r4, r2)
            r9 = 1056964608(0x3f000000, float:0.5)
            r4 = r18
            androidx.compose.ui.Modifier r9 = X.C304816Fi.A03(r10, r2, r9, r4)
            if (r27 == 0) goto L_0x047c
            r2 = -1262196669(0xffffffffb4c46843, float:-3.6583705E-7)
            java.lang.Object r13 = X.C51967G9n.A0m(r1, r2)
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r13 != r5) goto L_0x041f
            r2 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r13 = X.G9t.A0o(r1, r2)
        L_0x041f:
            X.C286565Wx.A0L(r8, r3)
            r2 = -1262194625(0xffffffffb4c4703f, float:-3.6589515E-7)
            java.lang.Object r4 = X.C51967G9n.A0m(r1, r2)
            if (r4 != r5) goto L_0x0435
            r2 = 38
            X.J6I r4 = new X.J6I
            r4.<init>(r13, r2)
            r1.FLL(r4)
        L_0x0435:
            X.0sP r4 = X.C51965G9l.A0z(r8, r4)
            r2 = r31
            androidx.compose.ui.Modifier r12 = X.C288055bI.A00(r2, r4)
            r2 = -1262191479(0xffffffffb4c47c89, float:-3.6598456E-7)
            java.lang.Object r11 = X.C51974G9v.A0W(r1, r5, r2)
            X.5aT r11 = (X.C287605aT) r11
            X.C286565Wx.A0L(r8, r3)
            X.4bM r2 = X.AnonymousClass5ZU.A00
            java.lang.Object r10 = r1.AJO(r2)
            X.5Yz r10 = (X.C287095Yz) r10
            r4 = -1262187662(0xffffffffb4c48b72, float:-3.6609305E-7)
            r2 = r27
            boolean r2 = X.C51967G9n.A1Y(r1, r2, r4)
            java.lang.Object r4 = r1.ECw()
            if (r2 != 0) goto L_0x0464
            if (r4 != r5) goto L_0x0470
        L_0x0464:
            r5 = 19
            X.GNG r4 = new X.GNG
            r2 = r27
            r4.<init>(r5, r2, r13)
            r1.FLL(r4)
        L_0x0470:
            X.0sa r2 = X.C51965G9l.A0y(r8, r4, r3)
            androidx.compose.ui.Modifier r2 = X.C287635aW.A02(r10, r11, r12, r2)
            androidx.compose.ui.Modifier r9 = r9.Ezh(r2)
        L_0x047c:
            X.C286565Wx.A0L(r8, r3)
            r37 = 0
            r2 = r0 & 14
            r44 = r2 | 48
            r3 = 57344(0xe000, float:8.0356E-41)
            int r2 = r0 >> 15
            r3 = r3 & r2
            r44 = r44 | r3
            r2 = 3670016(0x380000, float:5.142788E-39)
            int r0 = r0 << 9
            r2 = r2 & r0
            r44 = r44 | r2
            r43 = 0
            r45 = 40
            r36 = r1
            r38 = r9
            r39 = r25
            r40 = r33
            r41 = r24
            r42 = r37
            X.AnonymousClass6G3.A00(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00cf
            r0 = 441157416(0x1a4b8728, float:4.2088594E-23)
            X.0fL.A00(r0)
            goto L_0x00cf
        L_0x04b5:
            r8 = 1113587712(0x42600000, float:56.0)
            int r8 = java.lang.Float.compare(r5, r8)
            if (r8 > 0) goto L_0x04c1
            r9 = 1084227584(0x40a00000, float:5.0)
            goto L_0x0379
        L_0x04c1:
            r8 = 1115684864(0x42800000, float:64.0)
            int r8 = java.lang.Float.compare(r5, r8)
            r9 = 1088421888(0x40e00000, float:7.0)
            if (r8 > 0) goto L_0x0379
            r9 = 1086324736(0x40c00000, float:6.0)
            goto L_0x0379
        L_0x04cf:
            r8 = 1113587712(0x42600000, float:56.0)
            int r8 = java.lang.Float.compare(r5, r8)
            if (r8 > 0) goto L_0x04dc
            r14 = 1075000115(0x40133333, float:2.3)
            goto L_0x035f
        L_0x04dc:
            r8 = 1115684864(0x42800000, float:64.0)
            int r8 = java.lang.Float.compare(r5, r8)
            r14 = 1078774989(0x404ccccd, float:3.2)
            if (r8 > 0) goto L_0x035f
            r14 = 1076677837(0x402ccccd, float:2.7)
            goto L_0x035f
        L_0x04ec:
            r2 = r38 & 6
            if (r2 != 0) goto L_0x04fa
            r2 = r27
            int r2 = X.C41848B3p.A01(r1, r2)
            r12 = r38 | r2
            goto L_0x00b7
        L_0x04fa:
            r12 = r35
            goto L_0x00b7
        L_0x04fe:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0041
            r2 = r25
            int r2 = X.G9t.A0R(r1, r2)
            r0 = r0 | r2
            goto L_0x0041
        L_0x050b:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x003b
            r2 = r26
            int r2 = X.G9t.A0Q(r1, r2)
            r0 = r0 | r2
            goto L_0x003b
        L_0x0518:
            r2 = r37 & 48
            if (r2 != 0) goto L_0x0035
            r2 = r32
            int r2 = X.G9t.A0P(r1, r2)
            r0 = r0 | r2
            goto L_0x0035
        L_0x0525:
            r0 = r37 & 6
            if (r0 != 0) goto L_0x0533
            r0 = r33
            int r0 = X.C41848B3p.A01(r1, r0)
            r0 = r0 | r37
            goto L_0x002f
        L_0x0533:
            r0 = r7
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GRY.A00(X.5Wy, androidx.compose.ui.Modifier, X.5bW, X.2DO, X.5bM, X.JSI, X.0sP, int, int, int, long, long, boolean, boolean, boolean):void");
    }
}
