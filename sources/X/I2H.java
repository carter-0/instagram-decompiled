package X;

import androidx.compose.ui.Modifier;

public abstract class I2H {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r20, X.LRW r21, X.AnonymousClass4DH r22, java.lang.String r23, java.util.List r24, X.0sP r25, X.0sP r26, int r27, int r28) {
        /*
            r12 = r23
            r0 = -1000548699(0xffffffffc45cd6a5, float:-883.3538)
            r2 = r20
            r2.ExV(r0)
            r14 = r28
            r0 = r28 & 1
            r3 = 4
            r8 = r25
            r13 = r27
            if (r0 == 0) goto L_0x00e5
            r0 = r27 | 6
        L_0x0017:
            r1 = r28 & 2
            r7 = r26
            if (r1 == 0) goto L_0x00da
            r0 = r0 | 48
        L_0x001f:
            r1 = r28 & 4
            r9 = r24
            if (r1 == 0) goto L_0x00cf
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0027:
            r1 = r28 & 16
            r11 = r21
            if (r1 == 0) goto L_0x00c4
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x002f:
            r5 = r28 & 32
            r6 = 131072(0x20000, float:1.83671E-40)
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r5 != 0) goto L_0x003f
            r1 = r1 & r27
            if (r1 != 0) goto L_0x0040
            int r1 = X.G9t.A0T(r2, r12)
        L_0x003f:
            r0 = r0 | r1
        L_0x0040:
            r4 = 73875(0x12093, float:1.03521E-40)
            r4 = r4 & r0
            r1 = 73874(0x12092, float:1.0352E-40)
            if (r4 != r1) goto L_0x0063
            boolean r1 = r2.Bwn()
            if (r1 == 0) goto L_0x0063
            r2.Evl()
        L_0x0052:
            X.5Xd r0 = r2.ASQ()
            if (r0 == 0) goto L_0x0062
            r15 = 1
            X.JAm r6 = new X.JAm
            r10 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A06 = r6
        L_0x0062:
            return
        L_0x0063:
            if (r5 == 0) goto L_0x0067
            java.lang.String r12 = "Your AIs"
        L_0x0067:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0075
            r4 = 367552614(0x15e86866, float:9.3868765E-26)
            java.lang.String r1 = "com.instagram.aistudio.yourais.Layout (YourAIsFragment.kt:227)"
            X.0fL.A01(r4, r1)
        L_0x0075:
            r4 = 0
            r1 = -1710271675(0xffffffff9a0f5345, float:-2.963897E-23)
            boolean r5 = X.C51973G9u.A1S(r2, r9, r11, r1)
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r0
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r6)
            r5 = r5 | r1
            r1 = r0 & 14
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r3)
            r5 = r5 | r1
            boolean r0 = X.C51968G9o.A1S(r0)
            r5 = r5 | r0
            java.lang.Object r15 = r2.ECw()
            if (r5 != 0) goto L_0x009b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r15 != r0) goto L_0x00af
        L_0x009b:
            r21 = 8
            X.Pmh r15 = new X.Pmh
            r16 = r11
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r12
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r2.FLL(r15)
        L_0x00af:
            X.0sP r15 = (X.0sP) r15
            X.C51965G9l.A1X(r2, r4)
            X.AnonymousClass6HY.A08(r2, r15)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0052
            r0 = 1869121395(0x6f688773, float:7.196427E28)
            X.0fL.A00(r0)
            goto L_0x0052
        L_0x00c4:
            r1 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x002f
            int r1 = X.G9t.A0I(r2, r11)
            r0 = r0 | r1
            goto L_0x002f
        L_0x00cf:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0027
            int r1 = X.G9t.A0G(r2, r9)
            r0 = r0 | r1
            goto L_0x0027
        L_0x00da:
            r1 = r27 & 48
            if (r1 != 0) goto L_0x001f
            int r1 = X.G9t.A0F(r2, r7)
            r0 = r0 | r1
            goto L_0x001f
        L_0x00e5:
            r0 = r27 & 6
            if (r0 != 0) goto L_0x00f1
            int r0 = X.C41848B3p.A01(r2, r8)
            r0 = r0 | r27
            goto L_0x0017
        L_0x00f1:
            r0 = r13
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2H.A01(X.5Wy, X.LRW, X.4DH, java.lang.String, java.util.List, X.0sP, X.0sP, int, int):void");
    }

    public static final void A00(C286575Wy r18, int i) {
        C286575Wy r14 = r18;
        r14.ExV(2016830816);
        if (i != 0 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(129309649, "com.instagram.aistudio.yourais.ListItemsShimmer (YourAIsFragment.kt:320)");
            }
            C285245Qk r13 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(C51966G9m.A0T(r13), 16.0f, 0.0f);
            C287325Zx r182 = C287275Zs.A07;
            C287265Zr r10 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r182, r14, r10, 0);
            int A00 = C287425a7.A00(r14);
            C286565Wx r8 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r14, A09);
            C62320sa r7 = C287485aD.A00;
            C51973G9u.A0z(r14, r8, r7);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r14, A02, A04, r6);
            0sL r4 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r14, A01);
            r14.ExS(831269827);
            int i2 = 0;
            do {
                Modifier A0B = C287195Zj.A0B(r13, 4.0f, 0.0f, 0.0f, 16.0f);
                AnonymousClass5RD A0W = C51968G9o.A0W(r14);
                int A002 = C287425a7.A00(r14);
                AnonymousClass5RM A042 = C286565Wx.A04(r8);
                Modifier A012 = C287435a8.A01(r14, A0B);
                C51973G9u.A0z(r14, r8, r7);
                C287595aO.A00(r14, A0W, r6);
                if (C51965G9l.A1Y(r14, r8, A042, A0w) || !C51972G9s.A1Q(r14, A002)) {
                    C51971G9r.A13(r14, r4, A002);
                }
                C287595aO.A00(r14, A012, A1K);
                AnonymousClass6FX r15 = AnonymousClass6FX.A00;
                C56666I6v.A07(r14, C287205Zk.A0C(r13, 56.0f), AnonymousClass5ZN.A00);
                Modifier A0B2 = C287195Zj.A0B(r15.A00(r13), 16.0f, 0.0f, 0.0f, 0.0f);
                AnonymousClass5RD A022 = C291495hO.A02(r182, r14, r10, 0);
                int A003 = C287425a7.A00(r14);
                AnonymousClass5RM A043 = C286565Wx.A04(r8);
                Modifier A013 = C287435a8.A01(r14, A0B2);
                C51973G9u.A0z(r14, r8, r7);
                C287595aO.A00(r14, A022, r6);
                if (C51965G9l.A1Y(r14, r8, A043, A0w) || !C51972G9s.A1Q(r14, A003)) {
                    C51971G9r.A13(r14, r4, A003);
                }
                C287595aO.A00(r14, A013, A1K);
                C56666I6v.A05(r14, C287205Zk.A07(C51968G9o.A0P(C287195Zj.A0B(C287205Zk.A08(r13, 18.0f), 0.0f, 0.0f, 0.0f, 8.0f), 8.0f), 0.5f));
                C56666I6v.A07(r14, C287205Zk.A07(C287205Zk.A08(r13, 14.0f), 0.3f), AnonymousClass5ZN.A01(8.0f));
                r14.ASN();
                r14.ASN();
                i2++;
            } while (i2 < 5);
            if (C51971G9r.A1S(r14, r8, false)) {
                0fL.A00(1813721034);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 10);
        }
    }

    public static final void A02(C286575Wy r14, 0sP r15, int i) {
        int i2;
        C286575Wy r11 = r14;
        r14.ExV(-1491621930);
        int i3 = i;
        0sP r5 = r15;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(956752305, "com.instagram.aistudio.yourais.YourAIsNullState (YourAIsFragment.kt:349)");
            }
            Object A0r = C51965G9l.A0r(r14);
            C285245Qk r2 = Modifier.A00;
            Modifier A0U = C51966G9m.A0U(r2);
            AnonymousClass5RD A0M = G9w.A0M(r14);
            int A00 = C287425a7.A00(r14);
            C286565Wx r1 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r14, A0U);
            C51973G9u.A0y(r14, r1);
            C51971G9r.A12(r14, A0M, A04);
            0sL r6 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r6, A00);
            }
            C51965G9l.A18(r14, A01);
            String A002 = C288035bG.A00(r14, 2131968697);
            long A0H = C51966G9m.A0H(r11);
            AnonymousClass5ZZ.A0S(r11, C287195Zj.A07(r2, 6.0f), C51966G9m.A0e(r11), A002, A0H);
            String A003 = C288035bG.A00(r11, 2131968696);
            long A0M2 = C51966G9m.A0M(r11);
            AnonymousClass5ZZ.A0S(r11, C287195Zj.A07(r2, 6.0f), C51966G9m.A0c(r11), A003, A0M2);
            String A004 = C288035bG.A00(r11, 2131968691);
            long A0N = C51966G9m.A0N(r11);
            AnonymousClass5Z4 A0h = C51966G9m.A0h(r11);
            Modifier A07 = C287195Zj.A07(r2, 6.0f);
            C287625aV A0R = C51965G9l.A0R(0);
            boolean A1V = C51970G9q.A1V(i2 & 14) | C51967G9n.A1Z(r11, A0r, -1549100577);
            Object ECw = r11.ECw();
            if (A1V || ECw == AnonymousClass5XT.A00) {
                ECw = G9w.A0v(r11, r5, A0r, 13);
            }
            AnonymousClass5ZZ.A0X(r11, C287635aW.A05(A07, A0R, (String) null, C51965G9l.A0y(r1, ECw, false), true), A0h, A004, A0N);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(1037479158);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r5, i3, 16);
        }
    }
}
