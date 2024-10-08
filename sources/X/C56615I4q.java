package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.I4q  reason: case insensitive filesystem */
public abstract class C56615I4q {
    public static final void A01(C286575Wy r16, C52971GgO ggO, C334067ac r18, int i) {
        int i2;
        C52971GgO ggO2 = ggO;
        C334067ac r2 = r18;
        AnonymousClass7TF.A1H(r2, ggO2);
        C286575Wy r9 = r16;
        r9.ExV(-104746587);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r9, r2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r9, ggO2);
        }
        if ((i2 & 91) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1414543815, "com.instagram.comments.mvvm.view.compose.composer.AboveCommentComposer (AboveCommentComposer.kt:47)");
            }
            if (r2 instanceof C335417cv) {
                r9.ExS(1220132187);
                C335417cv r5 = (C335417cv) r2;
                C335377cr r10 = r5.A00;
                C335397ct r11 = r5.A01;
                r9.ExS(316459385);
                int i4 = i2 & 112;
                boolean A1S = AnonymousClass7TF.A1S(i4, 32);
                Object ECw = r9.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = C51970G9q.A0r(r9, ggO2, 28);
                }
                C286565Wx A0H = C51965G9l.A0H(r9, false);
                C62320sa r12 = (C62320sa) ((C59520Ya) ECw);
                boolean A1X = C51970G9q.A1X(r9, 316461801, i4, 32);
                Object ECw2 = r9.ECw();
                if (A1X || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C58142In8(ggO2, 26);
                    r9.FLL(ECw2);
                }
                A00(r9, r10, r11, r12, C51968G9o.A1A(A0H, ECw2), AnonymousClass62Q.A00(r5.A07), 0, r5.A0G);
            } else if (r2 instanceof C53497GpT) {
                r9.ExS(1220603387);
                boolean z = ((C53497GpT) r2).A00;
                r9.ExS(316473062);
                int i5 = i2 & 112;
                boolean A1S2 = AnonymousClass7TF.A1S(i5, 32);
                Object ECw3 = r9.ECw();
                if (A1S2 || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = C51970G9q.A0r(r9, ggO2, 29);
                }
                C286565Wx A0H2 = C51965G9l.A0H(r9, false);
                C62320sa r102 = (C62320sa) ((C59520Ya) ECw3);
                boolean A1R = C51972G9s.A1R(r9, 316474856, i5, 32);
                Object ECw4 = r9.ECw();
                if (A1R || ECw4 == AnonymousClass5XT.A00) {
                    ECw4 = C51970G9q.A0r(r9, ggO2, 30);
                }
                C62320sa A19 = C51968G9o.A19(A0H2, ECw4);
                boolean A1X2 = C51970G9q.A1X(r9, 316476613, i5, 32);
                Object ECw5 = r9.ECw();
                if (A1X2 || ECw5 == AnonymousClass5XT.A00) {
                    ECw5 = C51968G9o.A1B(r9, ggO2, 31);
                }
                C56258HvS.A01(r9, r102, A19, C51968G9o.A19(A0H2, ECw5), 0, z);
            } else {
                r9.ExS(1220879194);
            }
            if (C51970G9q.A1a(r9, false)) {
                0fL.A00(-960894107);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, ggO2, r2, i3, 29);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00eb, code lost:
        if (r3.A02 != true) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r29, X.C335377cr r30, X.C335397ct r31, X.C62320sa r32, X.0sP r33, X.AnonymousClass62P r34, int r35, boolean r36) {
        /*
            r0 = -897514574(0xffffffffca8103b2, float:-4227545.0)
            r15 = r29
            r15.ExV(r0)
            r2 = r35
            r0 = r35 & 14
            r8 = r30
            if (r0 != 0) goto L_0x019d
            int r0 = X.G9t.A0O(r15, r8)
            r0 = r0 | r35
        L_0x0016:
            r1 = r35 & 112(0x70, float:1.57E-43)
            r3 = r31
            if (r1 != 0) goto L_0x0021
            int r1 = X.G9t.A0P(r15, r3)
            r0 = r0 | r1
        L_0x0021:
            r1 = r2 & 896(0x380, float:1.256E-42)
            r14 = r32
            if (r1 != 0) goto L_0x002c
            int r1 = X.G9t.A0G(r15, r14)
            r0 = r0 | r1
        L_0x002c:
            r1 = r2 & 7168(0x1c00, float:1.0045E-41)
            r12 = r33
            if (r1 != 0) goto L_0x0037
            int r1 = X.G9t.A0H(r15, r12)
            r0 = r0 | r1
        L_0x0037:
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r35
            r11 = r34
            if (r1 != 0) goto L_0x0045
            int r1 = X.G9t.A0S(r15, r11)
            r0 = r0 | r1
        L_0x0045:
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r35
            r10 = r36
            if (r1 != 0) goto L_0x0052
            int r1 = X.G9t.A0d(r15, r10)
            r0 = r0 | r1
        L_0x0052:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r1) goto L_0x0083
            boolean r1 = r15.Bwn()
            if (r1 == 0) goto L_0x0083
            r15.Evl()
        L_0x0064:
            X.5Xd r1 = r15.ASQ()
            if (r1 == 0) goto L_0x0082
            r22 = 2
            X.JA0 r0 = new X.JA0
            r15 = r0
            r16 = r3
            r17 = r11
            r18 = r12
            r19 = r14
            r20 = r8
            r21 = r2
            r23 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r1.A06 = r0
        L_0x0082:
            return
        L_0x0083:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0091
            r4 = 196448855(0xbb59257, float:6.993885E-32)
            java.lang.String r1 = "com.instagram.comments.mvvm.view.compose.composer.ComposerEnabledComponent (AboveCommentComposer.kt:75)"
            X.0fL.A01(r4, r1)
        L_0x0091:
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            r18 = 0
            androidx.compose.ui.Modifier r7 = X.C51966G9m.A0T(r9)
            X.5Zx r5 = X.C287275Zs.A07
            X.5Zr r1 = X.C287215Zl.A02
            r4 = 0
            X.5RD r6 = X.C291495hO.A02(r5, r15, r1, r4)
            int r13 = X.C287425a7.A00(r15)
            r1 = r15
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r5 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r15, r7)
            X.C51973G9u.A0y(r15, r1)
            X.C51971G9r.A12(r15, r6, r5)
            X.0sL r6 = X.C287485aD.A02
            boolean r5 = r1.A0K
            if (r5 != 0) goto L_0x00c3
            boolean r5 = X.C51972G9s.A1Q(r15, r13)
            if (r5 != 0) goto L_0x00c6
        L_0x00c3:
            X.C51971G9r.A13(r15, r6, r13)
        L_0x00c6:
            X.C51965G9l.A18(r15, r7)
            r32 = 0
            X.C56618I4t.A00(r15)
            r5 = 90220730(0x560a8ba, float:1.05634196E-35)
            r15.ExS(r5)
            if (r30 == 0) goto L_0x00fe
            com.instagram.user.model.User r5 = r8.A00
            java.lang.String r21 = r5.getUsername()
            com.instagram.common.typedurl.ImageUrl r20 = r5.Bh3()
            long r24 = X.C51966G9m.A0B(r15)
            if (r31 == 0) goto L_0x00ed
            boolean r6 = r3.A02
            r5 = 1
            r27 = 1
            if (r6 == r5) goto L_0x00ef
        L_0x00ed:
            r27 = 0
        L_0x00ef:
            r5 = r0 & 896(0x380, float:1.256E-42)
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
            r19 = r15
            r26 = r4
            r22 = r14
            r23 = r5
            A02(r19, r20, r21, r22, r23, r24, r26, r27)
        L_0x00fe:
            X.C286565Wx.A0L(r1, r4)
            r5 = 90237708(0x560eb0c, float:1.0575601E-35)
            r15.ExS(r5)
            if (r31 == 0) goto L_0x0172
            r5 = 90238372(0x560eda4, float:1.0576077E-35)
            r15.ExS(r5)
            boolean r5 = r3.A03
            if (r5 == 0) goto L_0x0136
            if (r30 != 0) goto L_0x0136
            com.instagram.user.model.User r5 = r3.A01
            java.lang.String r21 = r5.getUsername()
            com.instagram.common.typedurl.ImageUrl r20 = r5.Bh3()
            long r24 = X.C51966G9m.A0B(r15)
            r26 = 1
            r6 = 221184(0x36000, float:3.09945E-40)
            r5 = r0 & 896(0x380, float:1.256E-42)
            r5 = r5 | r6
            r19 = r15
            r27 = r26
            r22 = r14
            r23 = r5
            A02(r19, r20, r21, r22, r23, r24, r26, r27)
        L_0x0136:
            X.C286565Wx.A0L(r1, r4)
            int r5 = r3.A00
            java.lang.String r21 = X.C288035bG.A00(r15, r5)
            long r30 = X.C51966G9m.A0M(r15)
            X.5Z4 r17 = X.C51966G9m.A0b(r15)
            r7 = 1068121457(0x3faa3d71, float:1.33)
            r5 = 8589934592(0x200000000, double:4.243991582E-314)
            long r34 = X.AnonymousClass5Z7.A00(r7, r5)
            r23 = 3
            r5 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r16 = X.C287195Zj.A09(r9, r5, r5)
            r27 = 48
            r29 = 14200(0x3778, float:1.9898E-41)
            r19 = r18
            r20 = r18
            r22 = r18
            r24 = r4
            r25 = r4
            r26 = r4
            r28 = r27
            r36 = r4
            X.AnonymousClass5ZZ.A03(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36)
        L_0x0172:
            X.C286565Wx.A0L(r1, r4)
            r5 = 90273129(0x5617569, float:1.0601014E-35)
            r15.ExS(r5)
            if (r10 == 0) goto L_0x018f
            boolean r5 = X.AnonymousClass7TE.A1b(r11)
            if (r5 == 0) goto L_0x018f
            int r5 = r0 >> 12
            r5 = r5 & 14
            int r0 = r0 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r5 = r5 | r0
            X.HX0.A00(r11, r12, r15, r5)
        L_0x018f:
            boolean r0 = X.C51971G9r.A1S(r15, r1, r4)
            if (r0 == 0) goto L_0x0064
            r0 = -571816576(0xffffffffddeac580, float:-2.11463354E18)
            X.0fL.A00(r0)
            goto L_0x0064
        L_0x019d:
            r0 = r2
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56615I4q.A00(X.5Wy, X.7cr, X.7ct, X.0sa, X.0sP, X.62P, int, boolean):void");
    }

    public static final void A02(C286575Wy r33, ImageUrl imageUrl, String str, C62320sa r36, int i, long j, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        C286575Wy r0 = r33;
        r0.ExV(1413983036);
        int i5 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r0, str2) | i;
        } else {
            i2 = i5;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r0, imageUrl);
        }
        C62320sa r32 = r36;
        if ((i5 & 896) == 0) {
            i2 |= G9t.A0G(r0, r32);
        }
        long j2 = j;
        if ((i5 & 7168) == 0) {
            i2 |= G9t.A0E(r0, j2);
        }
        boolean z3 = z;
        if ((57344 & i) == 0) {
            i2 |= G9t.A0c(r0, z3);
        }
        boolean z4 = z2;
        if ((458752 & i) == 0) {
            i2 |= G9t.A0d(r0, z4);
        }
        if ((374491 & i2) != 74898 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1309384216, "com.instagram.comments.mvvm.view.compose.composer.ReplyingToIndicatorRow (AboveCommentComposer.kt:135)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0X = C51966G9m.A0X(C287205Zk.A08(C51966G9m.A0T(r6), 48.0f), j2);
            C287245Zp r11 = C287215Zl.A04;
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A04, r0, r11);
            int A002 = C287425a7.A00(r0);
            C286565Wx r1 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r0, A0X);
            C62320sa r5 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r5);
            0sL r4 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A00, A04, r4);
            0sL r3 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r3, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r0, r11);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r0, r6);
            C51973G9u.A0z(r0, r1, r5);
            C287595aO.A00(r0, A0Q, r4);
            if (C51965G9l.A1Y(r0, r1, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r3, A003);
            }
            C287595aO.A00(r0, A012, A1K);
            r0.ExS(460087161);
            if (z2) {
                Modifier A0B = C287195Zj.A0B(C287205Zk.A02(C287215Zl.A09, r6), 16.0f, 0.0f, 10.0f, 0.0f);
                AnonymousClass5RD A0a = C51966G9m.A0a(false);
                int A004 = C287425a7.A00(r0);
                AnonymousClass5RM A043 = C286565Wx.A04(r1);
                Modifier A013 = C287435a8.A01(r0, A0B);
                C51973G9u.A0z(r0, r1, r5);
                C287595aO.A00(r0, A0a, r4);
                if (C51965G9l.A1Y(r0, r1, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                    C51971G9r.A13(r0, r3, A004);
                }
                C287595aO.A00(r0, A013, A1K);
                C286575Wy r18 = r0;
                GRY.A01(r18, (Modifier) null, C51966G9m.A0o(r0, imageUrl, i2 >> 3), (C288095bM) null, new GS6(28.0f, 33.0f, 2.0f, 1.0f), (0sP) null, 56, 6, 1020, false);
                r0.ASN();
            }
            C286565Wx.A0L(r1, false);
            if (z) {
                r0.ExS(460114816);
                i4 = 2131956414;
                i3 = 1;
            } else {
                i3 = 1;
                r0.ExS(460117310);
                i4 = 2131972170;
            }
            String A14 = C51968G9o.A14(r0, str2, i4);
            C286565Wx.A0L(r1, false);
            Modifier modifier = r6;
            if (!z2) {
                modifier = C287195Zj.A0B(r6, 16.0f, 0.0f, 32.0f, 0.0f);
            }
            C286575Wy r182 = r0;
            AnonymousClass5ZZ.A0B(r182, modifier, C51966G9m.A0c(r0), A14, 5, i3, 2, 0, 390, 11128, C51966G9m.A0M(r0));
            r0.ASN();
            Modifier A02 = C287205Zk.A02(C287215Zl.A09, r6);
            AnonymousClass5RD A0a2 = C51966G9m.A0a(false);
            int A005 = C287425a7.A00(r0);
            AnonymousClass5RM A044 = C286565Wx.A04(r1);
            Modifier A014 = C287435a8.A01(r0, A02);
            C51973G9u.A0z(r0, r1, r5);
            C287595aO.A00(r0, A0a2, r4);
            if (C51965G9l.A1Y(r0, r1, A044, A0w) || !C51972G9s.A1Q(r0, A005)) {
                C51971G9r.A13(r0, r3, A005);
            }
            C287595aO.A00(r0, A014, A1K);
            A03(r32, r0, (i2 >> 6) & 14);
            if (C51971G9r.A1R(r0)) {
                0fL.A00(384032215);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59157J8n(imageUrl, str2, r32, i5, j2, z3, z4);
        }
    }

    public static final void A03(C62320sa r15, C286575Wy r16, int i) {
        int i2;
        C286575Wy r5 = r16;
        r5.ExV(-993507776);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r5, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1914899802, "com.instagram.comments.mvvm.view.compose.composer.ReplyingToDismissIcon (AboveCommentComposer.kt:192)");
            }
            AnonymousClass2DO A00 = C287975bA.A00(r5, R.drawable.instagram_x_pano_outline_12, 0);
            String A002 = C288035bG.A00(r5, 2131972168);
            Modifier A0B = C287195Zj.A0B(Modifier.A00.Ezh(C287205Zk.A00), 14.0f, 0.0f, 22.0f, 0.0f);
            r5.ExS(2037238158);
            boolean A1R = C51968G9o.A1R(i2);
            Object ECw = r5.ECw();
            if (A1R || ECw == AnonymousClass5XT.A00) {
                ECw = C58680Ivp.A00(r5, r15, 11);
            }
            C51965G9l.A1V(r5);
            AnonymousClass6G3.A00(r5, C287215Zl.A09, C287635aW.A06(A0B, (C62320sa) ECw), C51968G9o.A0R(C51966G9m.A0G(r5)), A00, (C288095bM) null, A002, 0.0f, 3080, 48);
            if (0fL.A02()) {
                0fL.A00(1419983904);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r15, i3, 27);
        }
    }
}
