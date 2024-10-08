package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.wonderwall.model.WallInfo;

public abstract class I60 {
    public static final void A02(C286575Wy r14, C53047Ghf ghf, int i) {
        int i2;
        String A0h;
        C53047Ghf ghf2 = ghf;
        0qQ.A0B(ghf, 0);
        C286575Wy r4 = r14;
        r14.ExV(-143189629);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, ghf) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1731985303, "com.instagram.wonderwall.ui.compose.screens.WallEmptyState (WallFeedScreen.kt:163)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r14, ghf.A09, 0);
            boolean A1Y = C51967G9n.A1Y(r14, A02.getValue(), -183607567);
            Object ECw = r14.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = (WallInfo) ((C53379Gn9) A02.getValue()).A03;
                r14.FLL(ECw);
            }
            WallInfo wallInfo = (WallInfo) ECw;
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            C285245Qk r9 = Modifier.A00;
            Modifier A0G = G9w.A0G(r9);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A00 = C287425a7.A00(r14);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r14, A0G);
            C62320sa r15 = C287485aD.A00;
            C51973G9u.A0z(r14, A0H, r15);
            0sL r142 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A0Z, A04, r142);
            0sL r13 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r13, A00);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            r4.ExS(586163233);
            if (wallInfo != null && wallInfo.A02) {
                C56355Hx6.A00(r4, wallInfo, ghf2, (i2 << 3) & 112);
            }
            C286565Wx.A0L(A0H, false);
            Modifier A07 = C287195Zj.A07(C51966G9m.A0U(r9), 20.0f);
            AnonymousClass5RD A0N = G9w.A0N(r4);
            int A002 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r4, A07);
            C51973G9u.A0z(r4, A0H, r15);
            C287595aO.A00(r4, A0N, r142);
            if (C51965G9l.A1Y(r4, A0H, A042, A0w) || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r13, A002);
            }
            C287595aO.A00(r4, A012, A1K);
            C51975G9x.A12(r4, r9, R.drawable.ig_illustrations_illo_boards);
            G9w.A15(r4, r9, 24.0f);
            C51975G9x.A11(r4, 2131976747);
            G9w.A15(r4, r9, 8.0f);
            r4.ExS(-1979388517);
            if (wallInfo != null && wallInfo.A02) {
                if (wallInfo.A03) {
                    r4.ExS(-1979385897);
                    A0h = C304346Dc.A00(r4, 2131976746);
                } else {
                    r4.ExS(-1979383021);
                    A0h = G9w.A0h(r4, wallInfo.A00.getUsername(), 2131976756);
                }
                C286565Wx.A0L(A0H, false);
                C51975G9x.A14(r4, C51966G9m.A0g(r4), A0h);
            }
            if (C51973G9u.A1R(r4, A0H)) {
                0fL.A00(499039171);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, ghf2, i3, 14);
        }
    }

    public static final void A03(C286575Wy r4, C53047Ghf ghf, int i) {
        int i2;
        0qQ.A0B(ghf, 0);
        r4.ExV(-754614423);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r4, ghf) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-431189647, "com.instagram.wonderwall.ui.compose.screens.WallFeedScreen (WallFeedScreen.kt:55)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r4, ghf.A09, 0);
            if (((C53379Gn9) A02.getValue()).A09) {
                r4.ExS(-885680718);
                C56356Hx7.A01(r4, 0);
            } else if (((C53379Gn9) A02.getValue()).A06) {
                r4.ExS(-885617850);
                A02(r4, ghf, i2 & 14);
            } else if (((C53379Gn9) A02.getValue()).A07) {
                r4.ExS(-885543822);
                A01(r4, 0);
            } else if (G9w.A1b(((C53379Gn9) A02.getValue()).A02)) {
                r4.ExS(-885477761);
                A04(r4, ghf, i2 & 14);
            } else {
                r4.ExS(-885425743);
            }
            C51965G9l.A1X(r4, false);
            C55817Hnx hnx = (C55817Hnx) ((C53379Gn9) A02.getValue()).A01;
            if (hnx != null) {
                I6X.A04(r4, hnx, 8);
            }
            if (0fL.A02()) {
                0fL.A00(-309145258);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, ghf, i, 15);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: X.IxD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: X.IxD} */
    /* JADX WARNING: type inference failed for: r25v1, types: [X.JLF, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0184, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e2, code lost:
        if (r10.A05.CbH() != false) goto L_0x01e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C286575Wy r37, X.C53047Ghf r38, int r39) {
        /*
            r5 = 0
            r7 = r38
            X.0qQ.A0B(r7, r5)
            r1 = 1612083587(0x60167183, float:4.336236E19)
            r0 = r37
            r0.ExV(r1)
            r20 = r39
            r1 = r39 & 6
            r3 = 4
            r2 = 2
            if (r1 != 0) goto L_0x0275
            int r8 = X.G9t.A0O(r0, r7)
            r8 = r8 | r39
        L_0x001c:
            r1 = r8 & 3
            if (r1 != r2) goto L_0x0037
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0037
            r0.Evl()
        L_0x0029:
            X.5Xd r2 = r0.ASQ()
            if (r2 == 0) goto L_0x0036
            r1 = 16
        L_0x0031:
            r0 = r20
            X.JGE.A01(r2, r7, r0, r1)
        L_0x0036:
            return
        L_0x0037:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0045
            r2 = 1762903706(0x6913c69a, float:1.1165623E25)
            java.lang.String r1 = "com.instagram.wonderwall.ui.compose.screens.WallFeedStaggeredGrid (WallFeedScreen.kt:75)"
            X.0fL.A01(r2, r1)
        L_0x0045:
            X.0Ud r1 = r7.A09
            r14 = 0
            r19 = 7
            X.4gU r18 = X.AnonymousClass6FW.A02(r0, r1, r5)
            java.lang.Object r2 = r18.getValue()
            r1 = 32525715(0x1f04d93, float:8.827339E-38)
            boolean r2 = X.C51967G9n.A1Y(r0, r2, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0063
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0070
        L_0x0063:
            java.lang.Object r1 = r18.getValue()
            X.Gn9 r1 = (X.C53379Gn9) r1
            java.lang.Object r1 = r1.A03
            com.instagram.wonderwall.model.WallInfo r1 = (com.instagram.wonderwall.model.WallInfo) r1
            r0.FLL(r1)
        L_0x0070:
            com.instagram.wonderwall.model.WallInfo r1 = (com.instagram.wonderwall.model.WallInfo) r1
            X.5Wx r4 = X.C51965G9l.A0H(r0, r5)
            if (r1 != 0) goto L_0x008d
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0084
            r1 = -1422406343(0xffffffffab37cd39, float:-6.5299464E-13)
            X.0fL.A00(r1)
        L_0x0084:
            X.5Xd r2 = r0.ASQ()
            if (r2 == 0) goto L_0x0036
            r1 = 17
            goto L_0x0031
        L_0x008d:
            java.lang.Object r6 = r18.getValue()
            r2 = 32527959(0x1f05657, float:8.828597E-38)
            boolean r2 = X.C51967G9n.A1Y(r0, r6, r2)
            java.lang.Object r9 = r0.ECw()
            if (r2 != 0) goto L_0x00a2
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r9 != r2) goto L_0x00ae
        L_0x00a2:
            java.lang.Object r2 = r18.getValue()
            X.Gn9 r2 = (X.C53379Gn9) r2
            boolean r2 = r2.A04
            java.lang.Boolean r9 = X.C51967G9n.A0e(r0, r2)
        L_0x00ae:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r6 = r9.booleanValue()
            X.C286565Wx.A0L(r4, r5)
            r2 = 32532623(0x1f0688f, float:8.831211E-38)
            r0.ExS(r2)
            r17 = r8 & 14
            r2 = r17
            boolean r2 = X.AnonymousClass7TF.A1S(r2, r3)
            java.lang.Object r3 = r0.ECw()
            if (r2 != 0) goto L_0x00cf
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r3 != r2) goto L_0x00d5
        L_0x00cf:
            r2 = 8
            X.IwD r3 = X.C58704IwD.A00(r0, r7, r2)
        L_0x00d5:
            X.0sa r23 = X.C51965G9l.A0y(r4, r3, r5)
            r15 = 0
            r33 = 1
            r25 = 3072(0xc00, float:4.305E-42)
            r26 = 52
            r21 = r14
            r22 = r0
            r24 = r15
            r27 = r6
            X.GQw r11 = X.C52382GQh.A00(r21, r22, r23, r24, r25, r26, r27)
            X.5Qk r16 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r8 = X.C51966G9m.A0U(r16)
            androidx.compose.ui.Modifier r10 = X.C52383GQi.A00(r8, r11)
            X.5RD r3 = X.C51966G9m.A0a(r5)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r2 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r0, r10)
            X.C51973G9u.A0y(r0, r4)
            X.C51971G9r.A12(r0, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r4.A0K
            if (r2 != 0) goto L_0x0118
            boolean r2 = X.C51972G9s.A1Q(r0, r12)
            if (r2 != 0) goto L_0x011b
        L_0x0118:
            X.C51971G9r.A13(r0, r3, r12)
        L_0x011b:
            X.C51965G9l.A18(r0, r10)
            X.5dj r12 = X.C289515dj.A00
            r2 = -1912422052(0xffffffff8e02c15c, float:-1.6116836E-30)
            r0.ExS(r2)
            r10 = 6
            if (r6 != 0) goto L_0x0135
            X.4gU r2 = r11.A06
            float r3 = X.C51971G9r.A03(r2)
            float r2 = r11.A01
            float r3 = r3 / r2
            A00(r12, r0, r3, r10, r5)
        L_0x0135:
            X.C286565Wx.A0L(r4, r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r10 = X.HR2.A00(r0)
            X.IFQ r25 = new X.IFQ
            r25.<init>()
            r29 = 1094713344(0x41400000, float:12.0)
            X.6Fc r22 = X.C287275Zs.A01(r29)
            r2 = 1090519040(0x41000000, float:8.0)
            X.6Fj r13 = new X.6Fj
            r13.<init>(r2, r2, r2, r2)
            r2 = -1912406216(0xffffffff8e02ff38, float:-1.614662E-30)
            boolean r2 = X.C51967G9n.A1Y(r0, r11, r2)
            java.lang.Object r3 = r0.ECw()
            if (r2 != 0) goto L_0x015f
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r3 != r2) goto L_0x0167
        L_0x015f:
            r2 = 5
            X.J6g r3 = X.C59098J6g.A01(r11, r2)
            r0.FLL(r3)
        L_0x0167:
            androidx.compose.ui.Modifier r27 = X.C51973G9u.A0D(r4, r8, r3)
            r2 = -1912402454(0xffffffff8e030dea, float:-1.6153696E-30)
            boolean r8 = X.G9t.A1W(r0, r1, r2, r6)
            boolean r3 = X.C51972G9s.A1I(r17)
            r2 = r18
            boolean r3 = X.C51968G9o.A1U(r0, r2, r8, r3)
            java.lang.Object r2 = r0.ECw()
            if (r3 != 0) goto L_0x0186
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r2 != r3) goto L_0x019a
        L_0x0186:
            r35 = 22
            X.IxD r2 = new X.IxD
            r34 = r2
            r36 = r1
            r37 = r7
            r38 = r18
            r39 = r6
            r34.<init>(r35, r36, r37, r38, r39)
            r0.FLL(r2)
        L_0x019a:
            X.0sP r28 = X.C51965G9l.A0z(r4, r2)
            X.5Tp r2 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A0M
            r30 = 102436352(0x61b0e00, float:2.9162545E-35)
            r31 = 144(0x90, float:2.02E-43)
            r26 = r0
            r32 = r5
            r23 = r13
            r24 = r10
            X.C56165Htu.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2 = -1912362503(0xffffffff8e03a9f9, float:-1.6228836E-30)
            java.lang.Object r3 = X.C51967G9n.A0m(r0, r2)
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r3 != r8) goto L_0x01c5
            r2 = r19
            X.IwD r2 = X.C58704IwD.A01(r10, r2)
            X.5TX r3 = X.C51969G9p.A0R(r0, r2)
        L_0x01c5:
            X.4gU r3 = (X.C270284gU) r3
            X.C286565Wx.A0L(r4, r5)
            r2 = -1912359633(0xffffffff8e03b52f, float:-1.6234233E-30)
            r0.ExS(r2)
            boolean r2 = r1.A02
            if (r2 == 0) goto L_0x0219
            boolean r2 = X.C51971G9r.A1X(r3)
            if (r2 == 0) goto L_0x01e4
            X.6Gn r2 = r10.A05
            boolean r2 = r2.CbH()
            r29 = 1
            if (r2 == 0) goto L_0x01e6
        L_0x01e4:
            r29 = 0
        L_0x01e6:
            androidx.compose.ui.Alignment r3 = X.C287215Zl.A06
            r2 = r16
            androidx.compose.ui.Modifier r24 = r12.AAz(r3, r2)
            r12 = 1137180672(0x43c80000, float:400.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            X.5b7 r13 = X.C51965G9l.A0F(r14, r11, r12)
            long r2 = X.C285605Ry.A01
            X.GeF r21 = X.I74.A01(r13, r15, r2)
            X.5b7 r11 = X.C51965G9l.A0F(r14, r11, r12)
            X.GeG r22 = X.I74.A05(r11, r15, r2)
            r3 = -1925110093(0xffffffff8d4126b3, float:-5.95193E-31)
            r2 = 27
            X.5PJ r26 = X.JJS.A00(r0, r1, r7, r2, r3)
            r27 = 200064(0x30d80, float:2.8035E-40)
            r28 = 16
            r23 = r0
            r25 = r14
            X.C56663I6s.A07(r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0219:
            X.C286565Wx.A0L(r4, r5)
            r24 = 5
            r1 = -1912347913(0xffffffff8e03e2f7, float:-1.6256276E-30)
            boolean r2 = X.C51967G9n.A1W(r0, r1, r6)
            boolean r1 = X.C51972G9s.A1I(r17)
            r2 = r2 | r1
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x0232
            if (r1 != r8) goto L_0x0238
        L_0x0232:
            r1 = 46
            X.GA1 r1 = X.GA1.A00(r0, r7, r1, r6)
        L_0x0238:
            X.0sa r23 = X.C51965G9l.A0y(r4, r1, r5)
            r25 = 56
            r21 = r10
            r22 = r0
            r26 = r5
            X.C52381GQg.A04(r21, r22, r23, r24, r25, r26)
            r1 = -1912344425(0xffffffff8e03f097, float:-1.6262836E-30)
            boolean r1 = X.C51967G9n.A1W(r0, r1, r6)
            boolean r2 = X.C51966G9m.A1U(r0, r10, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x025a
            if (r1 != r8) goto L_0x0264
        L_0x025a:
            r2 = 19
            X.MGB r1 = new X.MGB
            r1.<init>(r10, r14, r2, r6)
            r0.FLL(r1)
        L_0x0264:
            X.C51968G9o.A1E(r0, r4, r1, r9)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x0029
            r1 = -299170492(0xffffffffee2b0544, float:-1.3232076E28)
            X.0fL.A00(r1)
            goto L_0x0029
        L_0x0275:
            r8 = r20
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I60.A04(X.5Wy, X.Ghf, int):void");
    }

    public static final void A00(C289525dk r17, C286575Wy r18, float f, int i, int i2) {
        int i3;
        float f2 = f;
        C289525dk r0 = r17;
        0qQ.A0B(r0, 0);
        C286575Wy r6 = r18;
        r6.ExV(431036924);
        int i4 = i2;
        int i5 = i;
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r6, r0) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A00(r6, f2);
        }
        if ((i3 & 19) != 18 || !r6.Bwn()) {
            if (i6 != 0) {
                f2 = 0.0f;
            }
            if (0fL.A02()) {
                0fL.A01(-323325617, "com.instagram.wonderwall.ui.compose.screens.WallRefreshIndicator (WallFeedScreen.kt:223)");
            }
            C52390GQp.A01(r6, r0.AAz(C287215Zl.A0C, Modifier.A00), f2, 2.0f, 0.0f, ((i3 >> 3) & 14) | 196608, 88, C51966G9m.A0G(r6), 0, false);
            if (0fL.A02()) {
                0fL.A00(935362488);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59129J7l(r0, f2, i5, i4, 1);
        }
    }

    public static final void A01(C286575Wy r6, int i) {
        r6.ExV(1301386431);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1593404762, "com.instagram.wonderwall.ui.compose.screens.WallErrorScreen (WallFeedScreen.kt:199)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(C51966G9m.A0U(r5), 32.0f);
            AnonymousClass5RD A0N = G9w.A0N(r6);
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, A07);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A0N, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            C51975G9x.A12(r6, r5, R.drawable.ig_illustrations_illo_warning_refresh);
            G9w.A15(r6, r5, 24.0f);
            C51975G9x.A11(r6, 2131976749);
            G9w.A15(r6, r5, 8.0f);
            C51975G9x.A14(r6, C51966G9m.A0g(r6), C304346Dc.A00(r6, 2131976748));
            if (C51967G9n.A1R(r6)) {
                0fL.A00(-868371653);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 21);
        }
    }
}
