package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HvS  reason: case insensitive filesystem */
public abstract class C56258HvS {
    public static final void A01(C286575Wy r23, C62320sa r24, C62320sa r25, C62320sa r26, int i, boolean z) {
        int i2;
        C62320sa r6 = r24;
        C62320sa r13 = r25;
        C62320sa r5 = r26;
        DbZ.A0t(1, r6, r13, r5);
        C286575Wy r11 = r23;
        r11.ExV(2101186178);
        int i3 = i;
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = G9t.A0Y(r11, z2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r11, r6);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r11, r13);
        }
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0H(r11, r5);
        }
        if ((i2 & 5851) != 1170 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1078852606, "com.instagram.comments.mvvm.view.compose.composer.CommentActionMultiSelect (CommentActionMultiSelect.kt:31)");
            }
            C56618I4t.A02(r11, (Modifier) null, 0.0f, 0, 5, AnonymousClass5aQ.A00(r11).A0D);
            Modifier A0p = G9t.A0p(r11, C51966G9m.A0V(C287205Zk.A08(Modifier.A00, 48.0f)));
            AnonymousClass5RD A0W = C51968G9o.A0W(r11);
            int A00 = C287425a7.A00(r11);
            C286565Wx r9 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r11, A0p);
            C51973G9u.A0y(r11, r9);
            C51971G9r.A12(r11, A0W, A04);
            0sL r3 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r3, A00);
            }
            C51965G9l.A18(r11, A01);
            AnonymousClass6FX r10 = AnonymousClass6FX.A00;
            int i4 = i2 << 6;
            int i5 = (i4 & 896) | 6;
            A00(r10, r11, C288035bG.A00(r11, 2131956351), r13, i5 | (i4 & 57344), 4, 0, z2);
            AnonymousClass6FX r14 = r10;
            C286575Wy r15 = r11;
            C62320sa r17 = r6;
            A00(r14, r15, C288035bG.A00(r11, 2131956347), r17, 390 | ((i2 << 9) & 57344), 0, C51966G9m.A09(r11), true);
            AnonymousClass6FX r20 = r10;
            C286575Wy r21 = r11;
            C62320sa r232 = r5;
            A00(r20, r21, C288035bG.A00(r11, 2131956346), r232, i5 | ((i2 << 3) & 57344), 0, C51966G9m.A09(r11), z);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(-1400360893);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8U(r5, r6, r13, i3, 4, z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r1 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        if (r3 == 0) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6FY r31, X.C286575Wy r32, java.lang.String r33, X.C62320sa r34, int r35, int r36, long r37, boolean r39) {
        /*
            r14 = r37
            r0 = 639018042(0x2616a43a, float:5.2264273E-16)
            r6 = r32
            r6.ExV(r0)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r30 = r36
            r0 = r36 & r0
            r32 = r31
            r5 = r35
            if (r0 == 0) goto L_0x0161
            r9 = r35 | 6
        L_0x0018:
            r0 = r36 & 1
            r21 = r33
            if (r0 == 0) goto L_0x0154
            r9 = r9 | 48
        L_0x0020:
            r0 = r36 & 2
            r17 = r39
            if (r0 == 0) goto L_0x0147
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0028:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x003b
            r0 = r36 & 4
            if (r0 != 0) goto L_0x0038
            boolean r1 = r6.AGt(r14)
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x003a
        L_0x0038:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x003a:
            r9 = r9 | r0
        L_0x003b:
            r3 = r36 & 8
            r13 = 16384(0x4000, float:2.2959E-41)
            r12 = 57344(0xe000, float:8.0356E-41)
            r1 = r34
            if (r3 == 0) goto L_0x013c
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x0048:
            r2 = 46811(0xb6db, float:6.5596E-41)
            r2 = r2 & r9
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r0) goto L_0x0079
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0079
            r6.Evl()
            r16 = r1
        L_0x005b:
            X.5Xd r1 = r6.ASQ()
            if (r1 == 0) goto L_0x0078
            r31 = 1
            X.JA4 r0 = new X.JA4
            r25 = r0
            r26 = r32
            r27 = r16
            r28 = r21
            r29 = r5
            r32 = r14
            r34 = r17
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r34)
            r1.A06 = r0
        L_0x0078:
            return
        L_0x0079:
            r6.Ewr()
            r0 = r35 & 1
            if (r0 == 0) goto L_0x012c
            boolean r0 = r6.Aw3()
            if (r0 != 0) goto L_0x012c
            r6.Evl()
            r0 = r36 & 4
            if (r0 == 0) goto L_0x008f
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x008f:
            r16 = r1
        L_0x0091:
            boolean r0 = X.C51967G9n.A1S(r6)
            if (r0 == 0) goto L_0x009f
            r1 = 479082376(0x1c8e3788, float:9.411126E-22)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.composer.ActionButton (CommentActionMultiSelect.kt:63)"
            X.0fL.A01(r1, r0)
        L_0x009f:
            if (r39 == 0) goto L_0x011e
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            r10 = 0
            r8 = 0
            r1 = 1051260355(0x3ea8f5c3, float:0.33)
            r4 = 1
            r0 = r32
            androidx.compose.ui.Modifier r2 = r0.FNR(r11, r1, r4)
            X.5RD r1 = X.C51968G9o.A0X(r6)
            int r7 = X.C287425a7.A00(r6)
            r3 = r6
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r6, r2)
            X.C51973G9u.A0y(r6, r3)
            X.C51971G9r.A12(r6, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x00d4
            boolean r0 = X.C51972G9s.A1Q(r6, r7)
            if (r0 != 0) goto L_0x00d7
        L_0x00d4:
            X.C51971G9r.A13(r6, r1, r7)
        L_0x00d7:
            X.C51965G9l.A18(r6, r2)
            r0 = -1806681016(0xffffffff94503c48, float:-1.0513205E-26)
            r6.ExS(r0)
            boolean r0 = X.C51972G9s.A1P(r9, r12, r13)
            java.lang.Object r1 = r6.ECw()
            if (r0 != 0) goto L_0x00ee
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x00f6
        L_0x00ee:
            r1 = 12
            r0 = r16
            X.Ivp r1 = X.C58680Ivp.A00(r6, r0, r1)
        L_0x00f6:
            X.0sa r0 = X.C51965G9l.A0y(r3, r1, r10)
            androidx.compose.ui.Modifier r19 = X.C287635aW.A05(r11, r8, r8, r0, r4)
            r24 = 2
            X.5Z4 r20 = X.C51965G9l.A0S(r6)
            r22 = 3
            int r0 = r9 >> 3
            r25 = r0 & 14
            r0 = r0 & 896(0x380, float:1.256E-42)
            r25 = r25 | r0
            r26 = 390(0x186, float:5.47E-43)
            r27 = 11128(0x2b78, float:1.5594E-41)
            r23 = r4
            r28 = r14
            r18 = r6
            X.AnonymousClass5ZZ.A0B(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6.ASN()
        L_0x011e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005b
            r0 = 1160948834(0x4532ac62, float:2858.774)
            X.0fL.A00(r0)
            goto L_0x005b
        L_0x012c:
            r0 = r36 & 4
            if (r0 == 0) goto L_0x0136
            long r14 = X.C51966G9m.A0H(r6)
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0136:
            r16 = 0
            if (r3 != 0) goto L_0x0091
            goto L_0x008f
        L_0x013c:
            r0 = r35 & r12
            if (r0 != 0) goto L_0x0048
            int r0 = X.G9t.A0I(r6, r1)
            r9 = r9 | r0
            goto L_0x0048
        L_0x0147:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0028
            r0 = r17
            int r0 = X.G9t.A0a(r6, r0)
            r9 = r9 | r0
            goto L_0x0028
        L_0x0154:
            r0 = r35 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0020
            r0 = r21
            int r0 = X.G9t.A0P(r6, r0)
            r9 = r9 | r0
            goto L_0x0020
        L_0x0161:
            r0 = r35 & 14
            if (r0 != 0) goto L_0x016f
            r0 = r32
            int r9 = X.G9t.A0O(r6, r0)
            r9 = r9 | r35
            goto L_0x0018
        L_0x016f:
            r9 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56258HvS.A00(X.6FY, X.5Wy, java.lang.String, X.0sa, int, int, long, boolean):void");
    }
}
