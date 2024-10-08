package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Gbz  reason: case insensitive filesystem */
public abstract class C52747Gbz {
    public static final void A00(C286575Wy r7, Modifier modifier, C59488JLm jLm, HL9 hl9, String str, int i, int i2) {
        A01(r7, modifier, jLm, hl9, str, (String) null, 0, i, i2);
    }

    public static final void A02(C286575Wy r9, Modifier modifier, String str) {
        A01(r9, modifier, (C59488JLm) null, (HL9) null, str, (String) null, 0, 48, 60);
    }

    public static final void A04(C286575Wy r9, String str) {
        A01(r9, (Modifier) null, (C59488JLm) null, HL9.Mini, str, (String) null, 0, 384, 58);
    }

    public static final void A05(C286575Wy r9, String str) {
        A01(r9, (Modifier) null, (C59488JLm) null, (HL9) null, str, (String) null, 0, 0, 62);
    }

    public static final void A06(C286575Wy r9, String str) {
        A01(r9, (Modifier) null, (C59488JLm) null, (HL9) null, str, (String) null, 0, 6, 62);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r18, androidx.compose.ui.Modifier r19, X.C59488JLm r20, X.HL9 r21, java.lang.String r22, java.lang.String r23, int r24, int r25, int r26) {
        /*
            r8 = r24
            r9 = r23
            r4 = r21
            r5 = r19
            r6 = 0
            r15 = r22
            X.0qQ.A0B(r15, r6)
            r0 = -1097146049(0xffffffffbe9ae13f, float:-0.30249974)
            r10 = r18
            r10.ExV(r0)
            r18 = r26
            r0 = r26 & 1
            r7 = r25
            if (r0 == 0) goto L_0x018a
            r11 = r25 | 6
        L_0x0020:
            r16 = r26 & 2
            if (r16 == 0) goto L_0x017f
            r11 = r11 | 48
        L_0x0026:
            r3 = r26 & 4
            if (r3 == 0) goto L_0x0174
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x002c:
            r14 = r26 & 8
            if (r14 == 0) goto L_0x0169
            r11 = r11 | 3072(0xc00, float:4.305E-42)
        L_0x0032:
            r13 = r26 & 16
            r2 = r20
            if (r13 == 0) goto L_0x0155
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r12 = r26 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r12 != 0) goto L_0x0048
            r0 = r25 & r0
            if (r0 != 0) goto L_0x0049
            int r0 = X.G9t.A0A(r10, r8)
        L_0x0048:
            r11 = r11 | r0
        L_0x0049:
            r0 = 74899(0x12493, float:1.04956E-40)
            r1 = r11 & r0
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x0074
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x0074
            r10.Evl()
            r3 = r2
        L_0x005d:
            X.5Xd r0 = r10.ASQ()
            if (r0 == 0) goto L_0x0073
            X.J9e r10 = new X.J9e
            r16 = r8
            r17 = r7
            r14 = r15
            r15 = r9
            r12 = r3
            r13 = r4
            r11 = r5
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r0.A06 = r10
        L_0x0073:
            return
        L_0x0074:
            if (r16 == 0) goto L_0x0078
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x0078:
            if (r3 == 0) goto L_0x007c
            X.HL9 r4 = X.HL9.A02
        L_0x007c:
            r3 = 0
            if (r14 == 0) goto L_0x0080
            r9 = r3
        L_0x0080:
            if (r13 != 0) goto L_0x0083
            r3 = r2
        L_0x0083:
            if (r12 == 0) goto L_0x0086
            r8 = 2
        L_0x0086:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0094
            r1 = -373166464(0xffffffffe9c1ee80, float:-2.930612E25)
            java.lang.String r0 = "com.instagram.compose.igds.components.textcell.IgdsHeader (IgdsHeader.kt:61)"
            X.0fL.A01(r1, r0)
        L_0x0094:
            float r0 = X.C287645aX.A00(r10)
            r14 = 0
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A09(r5, r0, r14)
            X.5RD r1 = X.C51968G9o.A0W(r10)
            int r13 = X.C287425a7.A00(r10)
            r2 = r10
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r0 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r10, r12)
            X.C51973G9u.A0y(r10, r2)
            X.C51971G9r.A12(r10, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x00c2
            boolean r0 = X.C51972G9s.A1Q(r10, r13)
            if (r0 != 0) goto L_0x00c5
        L_0x00c2:
            X.C51971G9r.A13(r10, r1, r13)
        L_0x00c5:
            X.C51965G9l.A18(r10, r12)
            X.6FX r1 = X.AnonymousClass6FX.A00
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r13 = 1
            androidx.compose.ui.Modifier r12 = r1.A00(r0)
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            float r1 = X.C287645aX.A01(r10, r0)
            float r0 = X.C287645aX.A01(r10, r0)
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r12, r14, r1, r14, r0)
            r0 = 2141534035(0x7fa53753, float:NaN)
            boolean r0 = X.C51974G9v.A1a(r10, r0, r11)
            java.lang.Object r12 = r10.ECw()
            if (r0 != 0) goto L_0x00f1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r12 != r0) goto L_0x00f7
        L_0x00f1:
            r0 = 20
            X.MYK r12 = X.C51970G9q.A0x(r10, r9, r0)
        L_0x00f7:
            X.0sP r0 = X.C51965G9l.A0z(r2, r12)
            androidx.compose.ui.Modifier r20 = X.AnonymousClass5R5.A00(r1, r0, r6)
            int r0 = r4.ordinal()
            if (r0 == r6) goto L_0x0147
            if (r0 != r13) goto L_0x0199
            r0 = 1963583311(0x7509e74f, float:1.7481352E32)
            X.5ZE r0 = X.C51967G9n.A0b(r10, r0)
            X.5Z4 r12 = r0.A01
            long r0 = X.C51966G9m.A0M(r10)
        L_0x0114:
            X.5Z4 r21 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r12, (X.C268454dQ) null, (X.AnonymousClass5ZD) null, (X.C291825hw) null, 0, 0, 0, 6291454, r0, 0, 0, 0)
            X.C286565Wx.A0L(r2, r6)
            r24 = r11 & 14
            int r0 = r11 >> 15
            r0 = r0 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            r26 = 11260(0x2bfc, float:1.5779E-41)
            r19 = r10
            r23 = r8
            r25 = r0
            X.AnonymousClass5ZZ.A0A(r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = 2141558234(0x7fa595da, float:NaN)
            r10.ExS(r0)
            if (r3 == 0) goto L_0x0139
            A03(r10, r3, r6)
        L_0x0139:
            boolean r0 = X.C51971G9r.A1S(r10, r2, r6)
            if (r0 == 0) goto L_0x005d
            r0 = -1459976071(0xffffffffa8fa8879, float:-2.7814761E-14)
            X.0fL.A00(r0)
            goto L_0x005d
        L_0x0147:
            r0 = 1963312433(0x7505c531, float:1.6957397E32)
            X.5ZE r0 = X.C51967G9n.A0b(r10, r0)
            X.5Z4 r12 = r0.A07
            long r0 = X.C51966G9m.A0H(r10)
            goto L_0x0114
        L_0x0155:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003a
            r0 = 32768(0x8000, float:4.5918E-41)
            boolean r1 = X.G9t.A1V(r10, r2, r0, r7)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0166
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x0166:
            r11 = r11 | r0
            goto L_0x003a
        L_0x0169:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0032
            int r0 = X.G9t.A0R(r10, r9)
            r11 = r11 | r0
            goto L_0x0032
        L_0x0174:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002c
            int r0 = X.G9t.A0Q(r10, r4)
            r11 = r11 | r0
            goto L_0x002c
        L_0x017f:
            r0 = r25 & 48
            if (r0 != 0) goto L_0x0026
            int r0 = X.G9t.A0P(r10, r5)
            r11 = r11 | r0
            goto L_0x0026
        L_0x018a:
            r0 = r25 & 6
            if (r0 != 0) goto L_0x0196
            int r11 = X.G9t.A0O(r10, r15)
            r11 = r11 | r25
            goto L_0x0020
        L_0x0196:
            r11 = r7
            goto L_0x0020
        L_0x0199:
            r0 = 2141539551(0x7fa54cdf, float:NaN)
            X.Wub r0 = X.C51972G9s.A0v(r10, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52747Gbz.A01(X.5Wy, androidx.compose.ui.Modifier, X.JLm, X.HL9, java.lang.String, java.lang.String, int, int, int):void");
    }

    public static final void A03(C286575Wy r14, C59488JLm jLm, int i) {
        int i2;
        C286575Wy r4 = r14;
        r14.ExV(-313669485);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C51970G9q.A05(G9t.A1T(r14, jLm, i3) ? 1 : 0) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(926982345, "com.instagram.compose.igds.components.textcell.IgdsHeaderEndAddOn (IgdsHeader.kt:98)");
            }
            Modifier A0E = C51967G9n.A0E(Modifier.A00, 24.0f);
            if (jLm instanceof C57121IPk) {
                r14.ExS(340773982);
                C57121IPk iPk = (C57121IPk) jLm;
                C62320sa r10 = iPk.A01;
                AnonymousClass6CE.A00((C287605aT) null, r4, A0E, (AnonymousClass6CG) null, (AnonymousClass6CD) null, AnonymousClass6CA.A00(r14), iPk.A00, r10, 384, 328, iPk.A02, false);
            } else if (jLm instanceof C57120IPj) {
                r14.ExS(340783563);
                C57120IPj iPj = (C57120IPj) jLm;
                AnonymousClass5RW r2 = iPj.A00;
                r14.ExS(340784505);
                C288165bT.A01(r4, A0E, iPj.A01, 384, r2.A00);
                C51965G9l.A1V(r14);
            } else {
                throw C51973G9u.A0o(r14, 340772469);
            }
            if (C51970G9q.A1Z(r4)) {
                0fL.A00(7351308);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, jLm, i3, 33);
        }
    }
}
