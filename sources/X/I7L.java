package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

public abstract class I7L {
    public static final void A00(C286575Wy r12, Modifier modifier, CharSequence charSequence, String str, String str2, C62320sa r17, C62320sa r18, int i, int i2, int i3) {
        A03(r12, modifier, charSequence, str, str2, r17, r18, (0sP) null, i, i2, i3, false, false, false, false, false, false, false, false);
    }

    public static final void A01(C286575Wy r14, Modifier modifier, CharSequence charSequence, String str, String str2, C62320sa r19, C62320sa r20, int i, int i2, int i3, boolean z, boolean z2) {
        A03(r14, modifier, charSequence, str, str2, r19, r20, (0sP) null, i, i2, i3, z, z2, false, false, false, false, false, false);
    }

    public static final void A04(C286575Wy r12, Modifier modifier, String str, String str2, C62320sa r16, int i, int i2, int i3) {
        A03(r12, modifier, (CharSequence) null, str, str2, r16, (C62320sa) null, (0sP) null, i, i2, i3, false, false, false, false, false, false, false, false);
    }

    public static final void A05(C286575Wy r13, Modifier modifier, String str, C62320sa r16, int i, int i2, int i3, boolean z) {
        A03(r13, modifier, (CharSequence) null, str, (String) null, r16, (C62320sa) null, (0sP) null, i, i2, i3, z, false, false, false, false, false, false, false);
    }

    public static final void A07(C286575Wy r14, String str, String str2, C62320sa r17, C62320sa r18) {
        A03(r14, (Modifier) null, (CharSequence) null, str, str2, r17, r18, (0sP) null, 0, 0, 32668, false, false, false, false, false, false, false, false);
    }

    public static final void A08(C286575Wy r13, String str, String str2, C62320sa r16, C62320sa r17, int i) {
        A03(r13, (Modifier) null, (CharSequence) null, str, str2, r16, r17, (0sP) null, i, 0, 32668, false, false, false, false, false, false, false, false);
    }

    public static final void A09(C286575Wy r14, String str, C62320sa r16, boolean z, boolean z2) {
        A03(r14, (Modifier) null, (CharSequence) null, str, (String) null, r16, (C62320sa) null, (0sP) null, 0, 0, 32740, z, z2, false, false, false, false, false, false);
    }

    public static final void A0A(C62320sa r15, String str, C286575Wy r17, int i) {
        C286575Wy r0 = r17;
        A03(r0, (Modifier) null, (CharSequence) null, str, (String) null, r15, (C62320sa) null, (0sP) null, i, 3072, 24572, false, false, false, false, false, false, false, false);
    }

    public static final void A0B(C62320sa r15, String str, C286575Wy r17, int i) {
        C286575Wy r0 = r17;
        A03(r0, (Modifier) null, (CharSequence) null, str, (String) null, r15, (C62320sa) null, (0sP) null, i, 0, 32764, false, false, false, false, false, false, false, false);
    }

    public static final void A02(C286575Wy r13, Modifier modifier, CharSequence charSequence, String str, String str2, C62320sa r18, C62320sa r19, int i, int i2, boolean z, boolean z2) {
        A03(r13, modifier, charSequence, str, str2, r18, r19, (0sP) null, i, 3072, i2, z, false, false, false, false, false, z2, false);
    }

    public static final void A06(C286575Wy r28, CharSequence charSequence, 0sP r30, int i, int i2) {
        int i3;
        0sP r2;
        C286625Xd ASQ;
        GSJ A01;
        C286575Wy r10 = r28;
        r10.ExV(-1002163239);
        int i4 = i2;
        CharSequence charSequence2 = charSequence;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r10, charSequence2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        0sP r9 = r30;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r10, r9);
        }
        if ((i3 & 19) != 18 || !r10.Bwn()) {
            r2 = null;
            if (i6 == 0) {
                r2 = r9;
            }
            if (0fL.A02()) {
                0fL.A01(698993382, "com.instagram.compose.igds.components.bottombutton.FooterText (IgdsBottomButton.kt:114)");
            }
            if (charSequence == null || 00l.A0W(charSequence2)) {
                if (0fL.A02()) {
                    0fL.A00(131228398);
                }
                ASQ = r10.ASQ();
                if (ASQ != null) {
                    A01 = GSJ.A01(r2, charSequence2, i4, i5, 21);
                    ASQ.A06 = A01;
                }
                return;
            }
            Modifier A09 = C287195Zj.A09(C51969G9p.A0U(), C287645aX.A00(r10), C287645aX.A01(r10, R.dimen.abc_button_padding_horizontal_material));
            AnonymousClass5Z4 A05 = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0b(r10), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0M(r10), 0, 0, 0);
            boolean z = charSequence2 instanceof C286025Tq;
            if (z && r2 != null) {
                r10.ExS(1807212048);
                C286025Tq r1 = (C286025Tq) charSequence2;
                boolean A1O = C51973G9u.A1O(r10, -772981168, i3);
                Object ECw = r10.ECw();
                if (A1O || ECw == AnonymousClass5XT.A00) {
                    ECw = J6I.A00(r10, r2, 32);
                }
                C51965G9l.A1X(r10, false);
                IgClickableTextKt.A02(r10, A09, r1, A05, (0sP) ECw, 3, 0, 0, 112572, 0);
            } else if (z) {
                r10.ExS(1807487328);
                AnonymousClass5ZZ.A00(r10, A09, (C286025Tq) charSequence2, A05, 3, 0, 0, 0, 0, 24444, 0);
            } else {
                r10.ExS(1807656960);
                AnonymousClass5ZZ.A07(r10, A09, A05, charSequence2.toString());
            }
            if (C51970G9q.A1a(r10, false)) {
                0fL.A00(1333088830);
            }
        } else {
            r10.Evl();
            r2 = r9;
        }
        ASQ = r10.ASQ();
        if (ASQ != null) {
            A01 = GSJ.A01(r2, charSequence2, i4, i5, 22);
            ASQ.A06 = A01;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r36, androidx.compose.ui.Modifier r37, java.lang.CharSequence r38, java.lang.String r39, java.lang.String r40, X.C62320sa r41, X.C62320sa r42, X.0sP r43, int r44, int r45, int r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54) {
        /*
            r23 = r37
            r22 = r47
            r21 = r48
            r35 = r38
            r19 = r50
            r20 = r49
            r18 = r51
            r32 = r43
            r34 = r40
            r1 = r52
            r17 = r53
            r33 = r42
            r16 = r54
            r3 = 0
            r49 = r39
            r48 = r41
            r2 = r49
            r0 = r48
            X.AnonymousClass7TF.A1H(r2, r0)
            r0 = 1087658650(0x40d45a9a, float:6.6360598)
            r6 = r36
            r6.ExV(r0)
            r4 = r46
            r0 = r46 & 1
            r5 = r44
            if (r0 == 0) goto L_0x036c
            r7 = r44 | 6
        L_0x0038:
            r0 = r46 & 2
            if (r0 == 0) goto L_0x035f
            r7 = r7 | 48
        L_0x003e:
            r31 = r46 & 4
            if (r31 == 0) goto L_0x0352
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r30 = r46 & 8
            r14 = 2048(0x800, float:2.87E-42)
            if (r30 == 0) goto L_0x0345
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x004c:
            r29 = r46 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r29 == 0) goto L_0x0338
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0054:
            r28 = r46 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r28 != 0) goto L_0x0064
            r0 = r44 & r0
            if (r0 != 0) goto L_0x0065
            r0 = r34
            int r0 = X.G9t.A0T(r6, r0)
        L_0x0064:
            r7 = r7 | r0
        L_0x0065:
            r27 = r46 & 64
            r26 = 1572864(0x180000, float:2.204052E-39)
            if (r27 == 0) goto L_0x032b
            r7 = r7 | r26
        L_0x006d:
            r0 = r4 & 128(0x80, float:1.794E-43)
            r25 = r0
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r25 != 0) goto L_0x007f
            r0 = r44 & r0
            if (r0 != 0) goto L_0x0080
            r0 = r20
            int r0 = X.G9t.A0f(r6, r0)
        L_0x007f:
            r7 = r7 | r0
        L_0x0080:
            r0 = r4 & 256(0x100, float:3.59E-43)
            r24 = r0
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r24 != 0) goto L_0x0092
            r0 = r44 & r0
            if (r0 != 0) goto L_0x0093
            r0 = r19
            int r0 = X.G9t.A0g(r6, r0)
        L_0x0092:
            r7 = r7 | r0
        L_0x0093:
            r10 = r4 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r10 != 0) goto L_0x00a3
            r0 = r44 & r0
            if (r0 != 0) goto L_0x00a4
            r0 = r18
            int r0 = X.G9t.A0h(r6, r0)
        L_0x00a3:
            r7 = r7 | r0
        L_0x00a4:
            r11 = r4 & 1024(0x400, float:1.435E-42)
            r8 = r45
            if (r11 == 0) goto L_0x031a
            r2 = r45 | 6
        L_0x00ac:
            r12 = r4 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x030d
            r2 = r2 | 48
        L_0x00b2:
            r13 = r4 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0302
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x00b8:
            r9 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x02f1
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x00be:
            r14 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r14 == 0) goto L_0x02e0
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x00c4:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r15 = r7 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r0) goto L_0x0112
            r0 = r2 & 9363(0x2493, float:1.312E-41)
            r15 = r0
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r15 != r0) goto L_0x0112
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0112
            r6.Evl()
        L_0x00de:
            X.5Xd r2 = r6.ASQ()
            if (r2 == 0) goto L_0x0111
            X.JDF r0 = new X.JDF
            r24 = r0
            r25 = r23
            r26 = r35
            r27 = r49
            r28 = r34
            r29 = r48
            r30 = r33
            r31 = r32
            r32 = r5
            r33 = r8
            r34 = r4
            r35 = r22
            r36 = r21
            r37 = r20
            r38 = r19
            r39 = r18
            r40 = r1
            r41 = r17
            r42 = r16
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            r2.A06 = r0
        L_0x0111:
            return
        L_0x0112:
            if (r31 == 0) goto L_0x0116
            X.5Qk r23 = androidx.compose.ui.Modifier.A00
        L_0x0116:
            r15 = r30
            r0 = r22
            boolean r22 = X.C51966G9m.A1R(r15, r0)
            r15 = r29
            r0 = r21
            boolean r21 = X.C51966G9m.A1Q(r15, r0)
            if (r28 == 0) goto L_0x012a
            r34 = 0
        L_0x012a:
            if (r27 == 0) goto L_0x012e
            r33 = 0
        L_0x012e:
            r15 = r20
            r0 = r25
            boolean r20 = X.C51966G9m.A1R(r0, r15)
            r15 = r19
            r0 = r24
            boolean r19 = X.C51966G9m.A1Q(r0, r15)
            r0 = r18
            boolean r18 = X.C51966G9m.A1R(r10, r0)
            if (r11 == 0) goto L_0x0148
            r35 = 0
        L_0x0148:
            if (r12 == 0) goto L_0x014c
            r32 = 0
        L_0x014c:
            boolean r1 = X.C51966G9m.A1Q(r13, r1)
            r0 = r17
            boolean r17 = X.C51966G9m.A1R(r9, r0)
            r0 = r16
            boolean r16 = X.C51966G9m.A1Q(r14, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x016a
            r9 = 31246380(0x1dcc82c, float:8.110247E-38)
            java.lang.String r0 = "com.instagram.compose.igds.components.bottombutton.IgdsBottomButton (IgdsBottomButton.kt:58)"
            X.0fL.A01(r9, r0)
        L_0x016a:
            int r0 = r7 >> 6
            r0 = r0 & 14
            X.5Zx r10 = X.C287275Zs.A07
            X.5Zr r9 = X.C287215Zl.A02
            int r0 = r0 >> 3
            int r0 = X.C51965G9l.A01(r0)
            X.5RD r13 = X.C291495hO.A02(r10, r6, r9, r0)
            int r12 = X.C287425a7.A00(r6)
            r0 = r6
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r10 = X.C286565Wx.A04(r0)
            r9 = r23
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r6, r9)
            X.C51973G9u.A0y(r6, r0)
            X.C51971G9r.A12(r6, r13, r10)
            X.0sL r10 = X.C287485aD.A02
            boolean r9 = r0.A0K
            if (r9 != 0) goto L_0x019f
            boolean r9 = X.C51972G9s.A1Q(r6, r12)
            if (r9 != 0) goto L_0x01a2
        L_0x019f:
            X.C51971G9r.A13(r6, r10, r12)
        L_0x01a2:
            X.C51965G9l.A18(r6, r11)
            r9 = -816599778(0xffffffffcf53ad1e, float:-3.55133798E9)
            r6.ExS(r9)
            if (r17 == 0) goto L_0x01c7
            r10 = 1065353216(0x3f800000, float:1.0)
            X.4cd r9 = X.C51968G9o.A0Y(r6)
            float r9 = r9.AwL()
            float r10 = r10 / r9
            androidx.compose.ui.Modifier r9 = X.C51969G9p.A0U()
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A08(r9, r10)
            long r9 = X.C51965G9l.A0A(r6)
            X.C51969G9p.A14(r6, r11, r9)
        L_0x01c7:
            X.C286565Wx.A0L(r0, r3)
            if (r34 != 0) goto L_0x01d0
            if (r35 == 0) goto L_0x02dd
            if (r1 != 0) goto L_0x02dd
        L_0x01d0:
            r10 = 1
        L_0x01d1:
            r9 = -816587187(0xffffffffcf53de4d, float:-3.55456128E9)
            r6.ExS(r9)
            if (r1 == 0) goto L_0x02d7
            r12 = 0
        L_0x01da:
            X.C286565Wx.A0L(r0, r3)
            r9 = -816583182(0xffffffffcf53edf2, float:-3.55558656E9)
            r6.ExS(r9)
            if (r10 == 0) goto L_0x02d1
            r11 = 0
        L_0x01e6:
            X.C286565Wx.A0L(r0, r3)
            r9 = -816580299(0xffffffffcf53f935, float:-3.55632461E9)
            r6.ExS(r9)
            if (r1 == 0) goto L_0x01fc
            int r13 = X.C51965G9l.A01(r2)
            r10 = r35
            r9 = r32
            A06(r6, r10, r9, r13, r3)
        L_0x01fc:
            X.C286565Wx.A0L(r0, r3)
            r9 = -816571607(0xffffffffcf541b29, float:-3.55854976E9)
            X.5Qk r13 = X.C51965G9l.A0K(r6, r9)
            r36 = 0
            androidx.compose.ui.Modifier r9 = X.C51966G9m.A0T(r13)
            r10 = r16 ^ 1
            if (r10 == 0) goto L_0x02cd
            androidx.compose.ui.Modifier r10 = X.G9t.A0q(r6, r13, r12, r11)
            androidx.compose.ui.Modifier r38 = r9.Ezh(r10)
        L_0x0218:
            X.C286565Wx.A0L(r0, r3)
            X.6CA r10 = X.AnonymousClass6CA.A00
            X.GQy r41 = r10.A02(r6)
            X.6CD r40 = X.AnonymousClass6CD.LARGE
            int r13 = r7 >> 3
            r44 = r13 & 14
            r44 = r44 | r26
            int r12 = r7 << 3
            r11 = r12 & 112(0x70, float:1.57E-43)
            r44 = r44 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r11
            r44 = r44 | r12
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            int r11 = r7 << 9
            r11 = r11 & r12
            r44 = r44 | r11
            r45 = 264(0x108, float:3.7E-43)
            r37 = r6
            r39 = r36
            r42 = r49
            r43 = r48
            r46 = r22
            r47 = r21
            X.AnonymousClass6CE.A00(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r11 = -816554826(0xffffffffcf545cb6, float:-3.5628457E9)
            r6.ExS(r11)
            if (r34 == 0) goto L_0x029a
            int r11 = r34.length()
            if (r11 == 0) goto L_0x029a
            if (r33 == 0) goto L_0x029a
            float r12 = X.C287645aX.A00(r6)
            r11 = 1095761920(0x41500000, float:13.0)
            androidx.compose.ui.Modifier r38 = X.C287195Zj.A09(r9, r12, r11)
            if (r18 == 0) goto L_0x02be
            r9 = -816540597(0xffffffffcf54944b, float:-3.56648832E9)
            r6.ExS(r9)
            X.6CB r41 = X.AnonymousClass6CA.A00(r6)
            X.C286565Wx.A0L(r0, r3)
        L_0x0276:
            int r9 = r7 >> 18
            r10 = r9 & 14
            r10 = r10 | r26
            int r9 = r7 >> 12
            r9 = r9 & 112(0x70, float:1.57E-43)
            r10 = r10 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            int r44 = r7 >> 9
            r44 = r44 & r9
            r44 = r44 | r10
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r13 & r7
            r44 = r44 | r13
            r42 = r34
            r43 = r33
            r46 = r20
            r47 = r19
            X.AnonymousClass6CE.A00(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
        L_0x029a:
            X.C286565Wx.A0L(r0, r3)
            r7 = -816534954(0xffffffffcf54aa56, float:-3.56793293E9)
            r6.ExS(r7)
            if (r1 != 0) goto L_0x02b0
            int r9 = X.C51965G9l.A01(r2)
            r7 = r35
            r2 = r32
            A06(r6, r7, r2, r9, r3)
        L_0x02b0:
            boolean r0 = X.C51971G9r.A1S(r6, r0, r3)
            if (r0 == 0) goto L_0x00de
            r0 = -1201221125(0xffffffffb866d1fb, float:-5.5031833E-5)
            X.0fL.A00(r0)
            goto L_0x00de
        L_0x02be:
            r9 = -816538994(0xffffffffcf549a8e, float:-3.56689869E9)
            r6.ExS(r9)
            r9 = 3
            X.GQy r41 = r10.A03(r6, r9, r3, r3)
            X.C286565Wx.A0L(r0, r3)
            goto L_0x0276
        L_0x02cd:
            r38 = r9
            goto L_0x0218
        L_0x02d1:
            float r11 = X.C287645aX.A00(r6)
            goto L_0x01e6
        L_0x02d7:
            float r12 = X.C287645aX.A00(r6)
            goto L_0x01da
        L_0x02dd:
            r10 = 0
            goto L_0x01d1
        L_0x02e0:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00c4
            r0 = r16
            boolean r0 = r6.AGv(r0)
            if (r0 != 0) goto L_0x02ee
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x02ee:
            r2 = r2 | r15
            goto L_0x00c4
        L_0x02f1:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x00be
            r0 = r17
            boolean r0 = r6.AGv(r0)
            if (r0 != 0) goto L_0x02ff
            r14 = 1024(0x400, float:1.435E-42)
        L_0x02ff:
            r2 = r2 | r14
            goto L_0x00be
        L_0x0302:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x00b8
            int r0 = X.G9t.A0a(r6, r1)
            r2 = r2 | r0
            goto L_0x00b8
        L_0x030d:
            r0 = r45 & 48
            if (r0 != 0) goto L_0x00b2
            r0 = r32
            int r0 = X.G9t.A0F(r6, r0)
            r2 = r2 | r0
            goto L_0x00b2
        L_0x031a:
            r0 = r45 & 6
            if (r0 != 0) goto L_0x0328
            r0 = r35
            int r0 = X.C41848B3p.A01(r6, r0)
            r2 = r45 | r0
            goto L_0x00ac
        L_0x0328:
            r2 = r8
            goto L_0x00ac
        L_0x032b:
            r0 = r44 & r26
            if (r0 != 0) goto L_0x006d
            r0 = r33
            int r0 = X.G9t.A0K(r6, r0)
            r7 = r7 | r0
            goto L_0x006d
        L_0x0338:
            r0 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0054
            r0 = r21
            int r0 = X.G9t.A0c(r6, r0)
            r7 = r7 | r0
            goto L_0x0054
        L_0x0345:
            r0 = r5 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x004c
            r0 = r22
            int r0 = X.G9t.A0b(r6, r0)
            r7 = r7 | r0
            goto L_0x004c
        L_0x0352:
            r0 = r5 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0044
            r0 = r23
            int r0 = X.G9t.A0Q(r6, r0)
            r7 = r7 | r0
            goto L_0x0044
        L_0x035f:
            r0 = r44 & 48
            if (r0 != 0) goto L_0x003e
            r0 = r48
            int r0 = X.G9t.A0F(r6, r0)
            r7 = r7 | r0
            goto L_0x003e
        L_0x036c:
            r0 = r44 & 6
            if (r0 != 0) goto L_0x0378
            int r7 = X.G9t.A0O(r6, r2)
            r7 = r7 | r44
            goto L_0x0038
        L_0x0378:
            r7 = r5
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7L.A03(X.5Wy, androidx.compose.ui.Modifier, java.lang.CharSequence, java.lang.String, java.lang.String, X.0sa, X.0sa, X.0sP, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
