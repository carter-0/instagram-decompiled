package X;

import androidx.compose.ui.Modifier;

public abstract class I2O {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r1 == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r16, androidx.compose.ui.Modifier r17, X.C55704Hm1 r18, int r19, int r20, int r21, int r22) {
        /*
            r2 = r18
            r6 = r20
            r3 = r17
            r0 = -1213453625(0xffffffffb7ac2ac7, float:-2.0523918E-5)
            r14 = r16
            r14.ExV(r0)
            r4 = r22
            r0 = r22 & 1
            r7 = r19
            r5 = r21
            if (r0 == 0) goto L_0x0126
            r8 = r21 | 6
        L_0x001a:
            r10 = r22 & 2
            if (r10 == 0) goto L_0x011b
            r8 = r8 | 48
        L_0x0020:
            r9 = r22 & 4
            if (r9 == 0) goto L_0x0110
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r0 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0039
            r0 = r22 & 8
            if (r0 != 0) goto L_0x0036
            boolean r1 = r14.AGu(r2)
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x0038
        L_0x0036:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0038:
            r8 = r8 | r0
        L_0x0039:
            r1 = r8 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r1 != r0) goto L_0x005d
            boolean r0 = r14.Bwn()
            if (r0 == 0) goto L_0x005d
            r14.Evl()
        L_0x0048:
            X.5Xd r0 = r14.ASQ()
            if (r0 == 0) goto L_0x005c
            r15 = 1
            X.J98 r8 = new X.J98
            r9 = r3
            r10 = r2
            r11 = r7
            r12 = r6
            r13 = r5
            r14 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r0.A06 = r8
        L_0x005c:
            return
        L_0x005d:
            r14.Ewr()
            r0 = r21 & 1
            if (r0 == 0) goto L_0x00ee
            boolean r0 = r14.Aw3()
            if (r0 != 0) goto L_0x00ee
            int r8 = X.C51971G9r.A05(r14, r4, r8)
        L_0x006e:
            boolean r0 = X.C51967G9n.A1S(r14)
            if (r0 == 0) goto L_0x007c
            r1 = -276085710(0xffffffffef8b4432, float:-8.620172E28)
            java.lang.String r0 = "com.instagram.barcelona.feed.ui.loading.FeedShimmer (FeedShimmer.kt:76)"
            X.0fL.A01(r1, r0)
        L_0x007c:
            r0 = 1058642330(0x3f19999a, float:0.6)
            java.lang.Float r10 = java.lang.Float.valueOf(r0)
            r9 = 0
            r0 = 1061997773(0x3f4ccccd, float:0.8)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            java.lang.Float r0 = X.C51967G9n.A0h()
            java.lang.Float[] r0 = new java.lang.Float[]{r10, r1, r0, r1, r10}
            java.util.List r15 = X.0sr.A1P(r0)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r14)
            long r0 = r0.A0G
            r16 = 0
            r19 = 48
            r20 = 124(0x7c, float:1.74E-43)
            r17 = r16
            r18 = r9
            r21 = r0
            X.Hqp r11 = X.C56666I6v.A03(r14, r15, r16, r17, r18, r19, r20, r21)
            int r12 = r8 >> 3
            X.5RD r1 = X.C51976G9y.A0D(r14, r12)
            int r13 = X.C287425a7.A00(r14)
            r10 = r14
            X.5Wx r10 = (X.C286565Wx) r10
            X.5RM r0 = X.C286565Wx.A04(r10)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r14, r3)
            X.C51973G9u.A0y(r14, r10)
            X.C51971G9r.A12(r14, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r10.A0K
            if (r0 != 0) goto L_0x00d4
            boolean r0 = X.C51972G9s.A1Q(r14, r13)
            if (r0 != 0) goto L_0x00d7
        L_0x00d4:
            X.C51971G9r.A13(r14, r1, r13)
        L_0x00d7:
            X.C51965G9l.A18(r14, r8)
            r0 = 1049475028(0x3e8db7d4, float:0.27679312)
            r14.ExS(r0)
            r8 = 0
        L_0x00e1:
            if (r8 >= r7) goto L_0x0102
            r1 = r12 & 112(0x70, float:1.57E-43)
            r0 = r12 & 896(0x380, float:1.256E-42)
            r1 = r1 | r0
            A02(r14, r2, r11, r6, r1)
            int r8 = r8 + 1
            goto L_0x00e1
        L_0x00ee:
            if (r10 == 0) goto L_0x00f2
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
        L_0x00f2:
            if (r9 == 0) goto L_0x00f5
            r6 = 1
        L_0x00f5:
            r0 = r22 & 8
            if (r0 == 0) goto L_0x006e
            X.Hm1 r2 = new X.Hm1
            r2.<init>()
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x006e
        L_0x0102:
            boolean r0 = X.C51971G9r.A1S(r14, r10, r9)
            if (r0 == 0) goto L_0x0048
            r0 = -372209071(0xffffffffe9d08a51, float:-3.151372E25)
            X.0fL.A00(r0)
            goto L_0x0048
        L_0x0110:
            r0 = r5 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0026
            int r0 = X.G9t.A07(r14, r6)
            r8 = r8 | r0
            goto L_0x0026
        L_0x011b:
            r0 = r21 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0020
            int r0 = X.G9t.A0P(r14, r3)
            r8 = r8 | r0
            goto L_0x0020
        L_0x0126:
            r0 = r21 & 14
            if (r0 != 0) goto L_0x0132
            int r8 = X.G9t.A05(r14, r7)
            r8 = r8 | r21
            goto L_0x001a
        L_0x0132:
            r8 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2O.A00(X.5Wy, androidx.compose.ui.Modifier, X.Hm1, int, int, int, int):void");
    }

    public static final void A01(C286575Wy r12, C55704Hm1 hm1, C55984Hqp hqp, int i) {
        int i2;
        r12.ExV(-865927034);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r12, hqp) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r12, hm1);
        }
        if ((i2 & 91) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-895236779, "com.instagram.barcelona.feed.ui.loading.TextBlockShimmer (FeedShimmer.kt:119)");
            }
            AnonymousClass62P r4 = hm1.A02;
            int i3 = 0;
            for (Object next : r4) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                float A04 = AnonymousClass7TE.A04(next);
                C285245Qk r2 = Modifier.A00;
                Modifier A08 = C287205Zk.A08(C287195Zj.A00(hm1.A01, C287205Zk.A07(r2, A04)), 16.0f);
                r12.ExS(1766626102);
                boolean A1S = AnonymousClass7TF.A1S(i2 & 14, 4) | C51972G9s.A1L(i2);
                Object ECw = r12.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = new C59101J6j(5, (Object) hm1, (Object) hqp);
                    r12.FLL(ECw);
                }
                C286565Wx A0H = C51965G9l.A0H(r12, false);
                C287675aa.A02(r12, C289575dp.A00(A08, (0sP) ECw), 0);
                r12.ExS(-597724760);
                if (i3 < DbT.A02(r4, 1)) {
                    G9w.A15(r12, r2, 6.0f);
                }
                C286565Wx.A0L(A0H, false);
                i3 = i4;
            }
            if (0fL.A02()) {
                0fL.A00(1564266923);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, hm1, hqp, i, 20);
        }
    }

    public static final void A02(C286575Wy r16, C55704Hm1 hm1, C55984Hqp hqp, int i, int i2) {
        int i3;
        C286575Wy r11 = r16;
        r11.ExV(-1355586479);
        int i4 = i2;
        C55984Hqp hqp2 = hqp;
        if ((i2 & 14) == 0) {
            i3 = G9t.A0O(r11, hqp2) | i2;
        } else {
            i3 = i4;
        }
        int i5 = i;
        if ((i2 & 112) == 0) {
            i3 |= G9t.A06(r11, i5);
        }
        C55704Hm1 hm12 = hm1;
        if ((i4 & 896) == 0) {
            i3 |= G9t.A0Q(r11, hm12);
        }
        if ((i3 & 731) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-39198502, "com.instagram.barcelona.feed.ui.loading.ShimmerRow (FeedShimmer.kt:93)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A00 = C287195Zj.A00(hm12.A00, r5);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r11, C287215Zl.A05, 0);
            int A002 = C287425a7.A00(r11);
            C286565Wx r3 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r11, A00);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r11, r3, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r11, A02, A04, r12);
            0sL r2 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r11, A002)) {
                C51971G9r.A13(r11, r2, A002);
            }
            0sL A1K = C51966G9m.A1K(r11, A01);
            C287325Zx r17 = C287275Zs.A07;
            C287265Zr r1 = C287215Zl.A02;
            AnonymousClass5RD A022 = C291495hO.A02(r17, r11, r1, 0);
            int A003 = C287425a7.A00(r11);
            AnonymousClass5RM A042 = C286565Wx.A04(r3);
            Modifier A012 = C287435a8.A01(r11, r5);
            C51973G9u.A0z(r11, r3, r13);
            C287595aO.A00(r11, A022, r12);
            if (C51965G9l.A1Y(r11, r3, A042, A0w) || !C51972G9s.A1Q(r11, A003)) {
                C51971G9r.A13(r11, r2, A003);
            }
            C287595aO.A00(r11, A012, A1K);
            Modifier A0C = C287205Zk.A0C(r5, 36.0f);
            r11.ExS(-1380933653);
            int i6 = i3 & 14;
            boolean A1I = C51972G9s.A1I(i6);
            Object ECw = r11.ECw();
            if (A1I || ECw == AnonymousClass5XT.A00) {
                ECw = new C58728Iwb(hqp2, 6);
                r11.FLL(ECw);
            }
            C287675aa.A02(r11, C289575dp.A00(A0C, C51965G9l.A0z(r3, ECw)), 0);
            r11.ASN();
            AnonymousClass5RD A023 = C291495hO.A02(r17, r11, r1, 0);
            int A004 = C287425a7.A00(r11);
            AnonymousClass5RM A043 = C286565Wx.A04(r3);
            Modifier A013 = C287435a8.A01(r11, r5);
            C51973G9u.A0z(r11, r3, r13);
            C287595aO.A00(r11, A023, r12);
            if (C51965G9l.A1Y(r11, r3, A043, A0w) || !C51972G9s.A1Q(r11, A004)) {
                C51971G9r.A13(r11, r2, A004);
            }
            C287595aO.A00(r11, A013, A1K);
            r11.ExS(-1380930950);
            for (int i7 = 0; i7 < i5; i7++) {
                A01(r11, hm12, hqp2, ((i3 >> 3) & 112) | i6);
                r11.ExS(-1380928168);
                if (i5 > 1) {
                    G9w.A15(r11, r5, 6.0f);
                }
                C286565Wx.A0L(r3, false);
            }
            if (C51973G9u.A1R(r11, r3)) {
                0fL.A00(-675769782);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(hqp2, hm12, i5, i4, 18);
        }
    }
}
