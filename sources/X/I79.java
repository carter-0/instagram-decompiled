package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.compose.core.ui.IgClickableTextKt;

public abstract class I79 {
    public static final void A08(C286575Wy r24, HBP hbp, int i) {
        int i2;
        HBP hbp2 = hbp;
        0qQ.A0B(hbp2, 0);
        C286575Wy r8 = r24;
        r8.ExV(260711102);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, hbp2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1931958700, "com.instagram.friendmap.view.compose.FriendMapHidePlacesBottomSheet (FriendMapHidePlacesBottomSheet.kt:63)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r8, hbp2.A02, 0);
            AnonymousClass62P r18 = ((C53547GqI) A02.getValue()).A05;
            int size = r18.size();
            boolean A1V = C51967G9n.A1V(r8, -1019739300, size);
            Object ECw = r8.ECw();
            if (A1V || ECw == AnonymousClass5XT.A00) {
                ECw = new C67001MgZ(size, 4);
                r8.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r8, false);
            GZF A01 = C52610GZj.A01(r8, (C62320sa) ECw, 0, 54, 0);
            C262224Cq r15 = ((AnonymousClass6FV) C51974G9v.A0Y(r8, r8.ECw(), AnonymousClass5XT.A00)).A00;
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A0C, false);
            int A002 = C287425a7.A00(r8);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r8, A0U);
            C62320sa r11 = C287485aD.A00;
            C51973G9u.A0z(r8, A0H, r11);
            0sL r10 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r8, A00, A04, r10);
            0sL r9 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r8, A002)) {
                C51971G9r.A13(r8, r9, A002);
            }
            0sL A1K = C51966G9m.A1K(r8, A012);
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A06, r8, C287215Zl.A00, 54);
            int A003 = C287425a7.A00(r8);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r8, A0U);
            C51973G9u.A0z(r8, A0H, r11);
            C287595aO.A00(r8, A022, r10);
            if (C51965G9l.A1Y(r8, A0H, A042, A0w) || !C51972G9s.A1Q(r8, A003)) {
                C51971G9r.A13(r8, r9, A003);
            }
            C287595aO.A00(r8, A013, A1K);
            C304826Fj r2 = new C304826Fj(0.0f, 0.0f, 0.0f, 0.0f);
            C52605GZe gZe = C52605GZe.A00;
            AnonymousClass5PJ A014 = AnonymousClass5PI.A01(r8, new C59433JJi(2, A01, A02, hbp2, r18, r15), 1004574688);
            C52617GZq.A01(r2, A01, gZe, r8, (C287245Zp) null, A0U, (0sP) null, A014, 100666800, 7920);
            if (C51971G9r.A1R(r8)) {
                0fL.A00(881334857);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, hbp2, i3, 23);
        }
    }

    public static final C286025Tq A00(C286575Wy r6, C54621HLe hLe, boolean z) {
        int i;
        C303876Bd A0L;
        if (C51967G9n.A1U(r6, 167149202)) {
            0fL.A01(1723894929, "com.instagram.friendmap.view.compose.hidePlacesHeaderSubtitle (FriendMapHidePlacesBottomSheet.kt:266)");
        }
        int ordinal = hLe.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            r6.ExS(-2032210746);
            String A00 = C304346Dc.A00(r6, 2131962778);
            if (!z || hLe != C54621HLe.HIDE_PLACES_INTRO) {
                i = 2131962706;
                if (hLe == C54621HLe.HIDE_PLACES_RADIUS) {
                    i = 2131962714;
                }
            } else {
                i = 2131962710;
            }
            String A0h = G9w.A0h(r6, A00, i);
            int A08 = 00l.A08(A0h, A00, 0, false);
            int A05 = C51966G9m.A05(A00, A08);
            A0L = C51972G9s.A0L(A0h);
            A0L.A06(C51973G9u.A0F(C51966G9m.A0D(r6)), A08, A05);
            A0L.A0A("link", AnonymousClass000.A00(776), A08, A05);
        } else if (ordinal == 2) {
            r6.ExS(-2031229069);
            A0L = C51969G9p.A0b();
            A0L.A09(C304346Dc.A00(r6, 2131962708));
        } else {
            throw C51973G9u.A0n(r6, 1458462078);
        }
        C286025Tq A02 = A0L.A02();
        C286565Wx r62 = (C286565Wx) r6;
        if (C51967G9n.A1b(r62, false)) {
            0fL.A00(1863808809);
        }
        C286565Wx.A0L(r62, false);
        return A02;
    }

    public static final C62320sa A01(GZF gzf, C286575Wy r4, C54621HLe hLe, HBP hbp, C262224Cq r7) {
        if (0fL.A02()) {
            0fL.A01(-1488722957, "com.instagram.friendmap.view.compose.onBackButtonClicked (FriendMapHidePlacesBottomSheet.kt:143)");
        }
        r4.ExS(-1930070793);
        boolean z = false;
        boolean A1U = C51966G9m.A1U(r4, r7, C51970G9q.A1U(r4.AGu(gzf) ? 1 : 0)) | C51970G9q.A1U(r4.AGu(hbp) ? 1 : 0);
        if (r4.AGu(hLe)) {
            z = true;
        }
        boolean z2 = A1U | z;
        Object ECw = r4.ECw();
        if (z2 || ECw == AnonymousClass5XT.A00) {
            ECw = C58699Iw8.A00(r7, gzf, hbp, hLe, 6);
            r4.FLL(ECw);
        }
        C62320sa r1 = (C62320sa) ECw;
        if (C51970G9q.A1Z(r4)) {
            0fL.A00(-512461721);
        }
        return r1;
    }

    public static final C62320sa A02(GZF gzf, C286575Wy r4, C54621HLe hLe, HBP hbp, C262224Cq r7) {
        if (0fL.A02()) {
            0fL.A01(-1335257275, "com.instagram.friendmap.view.compose.onNextButtonClicked (FriendMapHidePlacesBottomSheet.kt:125)");
        }
        r4.ExS(-817278775);
        boolean z = false;
        boolean A1U = C51966G9m.A1U(r4, r7, C51970G9q.A1U(r4.AGu(gzf) ? 1 : 0)) | C51970G9q.A1U(r4.AGu(hLe) ? 1 : 0);
        if (r4.AGu(hbp)) {
            z = true;
        }
        boolean z2 = A1U | z;
        Object ECw = r4.ECw();
        if (z2 || ECw == AnonymousClass5XT.A00) {
            ECw = C58699Iw8.A00(r7, gzf, hbp, hLe, 7);
            r4.FLL(ECw);
        }
        C62320sa r1 = (C62320sa) ECw;
        if (C51970G9q.A1Z(r4)) {
            0fL.A00(424631876);
        }
        return r1;
    }

    public static final void A03(GZF gzf, C286575Wy r30, C68150N2q n2q, C53547GqI gqI, HBP hbp, C262224Cq r34, int i) {
        int i2;
        C286575Wy r0 = r30;
        r0.ExV(1826116025);
        int i3 = i;
        C68150N2q n2q2 = n2q;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, n2q2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= C51970G9q.A06(G9t.A1U(r0, gqI, i3) ? 1 : 0);
        }
        HBP hbp2 = hbp;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r0, hbp2);
        }
        C262224Cq r6 = r34;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r0, r6);
        }
        GZF gzf2 = gzf;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0S(r0, gzf2);
        }
        if ((i2 & 9363) != 9362 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-595460203, "com.instagram.friendmap.view.compose.HiddenPlaceCell (FriendMapHidePlacesBottomSheet.kt:439)");
            }
            Object A0m = C51967G9n.A0m(r0, 53549754);
            Object obj = AnonymousClass5XT.A00;
            C287605aT r18 = (C287605aT) C51972G9s.A0l(r0, A0m, obj);
            C286565Wx r1 = (C286565Wx) r0;
            C286565Wx.A0L(r1, false);
            C285245Qk r17 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r17), C287645aX.A00(r0), C287645aX.A01(r0, R.dimen.account_discovery_bottom_gap), C287645aX.A00(r0), C287645aX.A01(r0, R.dimen.account_discovery_bottom_gap));
            r0.ExS(53565257);
            int i4 = i2 & 14;
            int i5 = i2 & 896;
            int i6 = i5;
            int i7 = 57344 & i2;
            boolean A1T = C51968G9o.A1T(r0, r6, AnonymousClass7TF.A1S(i4, 4), AnonymousClass7TF.A1S(i5, 256)) | C51972G9s.A1K(i7);
            Object ECw = r0.ECw();
            if (A1T || ECw == obj) {
                ECw = C58699Iw8.A00(gzf2, r6, hbp2, n2q2, 4);
                r0.FLL(ECw);
            }
            Modifier A04 = C287635aW.A04(r18, A0B, C51965G9l.A0y(r1, ECw, false));
            AnonymousClass5RD A0K = G9w.A0K(C287275Zs.A02, r0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r0, A04);
            C51973G9u.A0y(r0, r1);
            C51971G9r.A12(r0, A0K, A042);
            0sL r11 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r11, A00);
            }
            C51965G9l.A18(r0, A01);
            AnonymousClass6FX r112 = AnonymousClass6FX.A00;
            String str = n2q2.A04;
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
            long A0H = C51966G9m.A0H(r0);
            C285245Qk r8 = r17;
            Modifier A002 = r112.A00(r8);
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            AnonymousClass5ZZ.A0V(r0, A002, A0c, str, A0H);
            Modifier A0I = G9w.A0I(r8, C287645aX.A01(r0, R.dimen.account_discovery_bottom_gap));
            AnonymousClass2DO A003 = C287975bA.A00(r0, R.drawable.instagram_delete_pano_outline_24, 0);
            long A09 = C51966G9m.A09(r0);
            boolean z4 = gqI.A07;
            r0.ExS(-303932424);
            if (i6 == 256) {
                z2 = true;
            }
            if (i4 == 4) {
                z3 = true;
            }
            boolean z5 = z2 | z3;
            Object ECw2 = r0.ECw();
            if (z5 || ECw2 == obj) {
                ECw2 = new C58185Inp(8, n2q2, hbp2);
                r0.FLL(ECw2);
            }
            I50.A00(r18, r0, A0I, A003, (String) null, C51965G9l.A0y(r1, ECw2, false), 16.0f, 221184, 4, A09, z4);
            AnonymousClass2DO A004 = C287975bA.A00(r0, R.drawable.instagram_edit_pano_outline_24, 0);
            long A0L = C51966G9m.A0L(r0);
            boolean A1T2 = C51968G9o.A1T(r0, r6, C51972G9s.A1R(r0, -303922744, i4, 4), AnonymousClass7TF.A1S(i6, 256));
            if (i7 != 16384) {
                z = false;
            }
            boolean z6 = A1T2 | z;
            Object ECw3 = r0.ECw();
            if (z6 || ECw3 == obj) {
                ECw3 = C58699Iw8.A00(gzf2, r6, hbp2, n2q2, 5);
                r0.FLL(ECw3);
            }
            I50.A00(r18, r0, (Modifier) null, A004, (String) null, C51965G9l.A0y(r1, ECw3, false), 16.0f, 221184, 69, A0L, false);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-1491774456);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9H(i3, 6, hbp2, gzf2, n2q2, gqI, r6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: X.IxF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: X.IxF} */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0221, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x0223;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.GZF r24, X.C286575Wy r25, X.C54621HLe r26, X.C53547GqI r27, X.HBP r28, X.C262224Cq r29, int r30) {
        /*
            r1 = 696143054(0x297e4cce, float:5.6465947E-14)
            r0 = r25
            r0.ExV(r1)
            r7 = r30
            r1 = r30 & 6
            r3 = 1
            r15 = r26
            if (r1 != 0) goto L_0x0244
            int r1 = X.G9t.A0O(r0, r15)
            r1 = r1 | r30
        L_0x0017:
            r2 = r30 & 48
            r9 = 32
            r8 = r27
            if (r2 != 0) goto L_0x0028
            boolean r2 = X.G9t.A1U(r0, r8, r7)
            int r2 = X.C51970G9q.A06(r2)
            r1 = r1 | r2
        L_0x0028:
            r2 = r7 & 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            r11 = r28
            if (r2 != 0) goto L_0x0035
            int r2 = X.G9t.A0Q(r0, r11)
            r1 = r1 | r2
        L_0x0035:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            r14 = r29
            if (r2 != 0) goto L_0x0040
            int r2 = X.G9t.A0H(r0, r14)
            r1 = r1 | r2
        L_0x0040:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            r6 = 16384(0x4000, float:2.2959E-41)
            r30 = r24
            if (r2 != 0) goto L_0x004f
            r2 = r30
            int r2 = X.G9t.A0S(r0, r2)
            r1 = r1 | r2
        L_0x004f:
            r4 = r1 & 9363(0x2493, float:1.312E-41)
            r2 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r2) goto L_0x0074
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0074
            r0.Evl()
        L_0x005e:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0073
            r4 = 7
            X.J9H r0 = new X.J9H
            r2 = r0
            r3 = r7
            r5 = r11
            r6 = r30
            r7 = r14
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r1.A06 = r0
        L_0x0073:
            return
        L_0x0074:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0082
            r4 = -722999087(0xffffffffd4e7e8d1, float:-7.9683477E12)
            java.lang.String r2 = "com.instagram.friendmap.view.compose.HidePlacesContent (FriendMapHidePlacesBottomSheet.kt:366)"
            X.0fL.A01(r4, r2)
        L_0x0082:
            int r10 = r15.ordinal()
            r4 = 0
            if (r10 == r4) goto L_0x01ec
            r18 = 0
            if (r10 == r3) goto L_0x0184
            r2 = 2
            if (r10 != r2) goto L_0x0247
            r2 = -102398868(0xfffffffff9e5846c, float:-1.4896523E35)
            r0.ExS(r2)
            java.lang.String r13 = r8.A03
            r2 = 2131962712(0x7f132b58, float:1.9562157E38)
            java.lang.String r22 = X.C304346Dc.A00(r0, r2)
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r10 = X.C51966G9m.A0T(r12)
            float r9 = X.C287645aX.A00(r0)
            float r2 = X.C287645aX.A00(r0)
            r6 = 0
            androidx.compose.ui.Modifier r17 = X.C287195Zj.A0B(r10, r9, r6, r2, r6)
            r2 = -696038213(0xffffffffd6834cbb, float:-7.2182789E13)
            r0.ExS(r2)
            r9 = r1 & 896(0x380, float:1.256E-42)
            boolean r1 = X.AnonymousClass7TF.A1S(r9, r5)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x00c8
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x00ce
        L_0x00c8:
            r1 = 13
            X.J6i r2 = X.C59100J6i.A01(r0, r11, r1)
        L_0x00ce:
            X.0sP r2 = (X.0sP) r2
            r1 = r0
            X.5Wx r1 = (X.C286565Wx) r1
            java.lang.Boolean r19 = X.C51967G9n.A0f(r1, r3)
            r3 = 64
            java.lang.Integer r20 = java.lang.Integer.valueOf(r3)
            r27 = 432(0x1b0, float:6.05E-43)
            r28 = 59376(0xe7f0, float:8.3203E-41)
            r24 = r4
            r25 = r4
            r26 = r4
            r16 = r0
            r21 = r13
            r23 = r2
            X.I7P.A04(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r2 = r8.A08
            if (r2 == 0) goto L_0x0179
            r2 = -696020350(0xffffffffd6839282, float:-7.2332635E13)
            r0.ExS(r2)
            r2 = 2131962702(0x7f132b4e, float:1.9562137E38)
        L_0x00fe:
            java.lang.String r24 = X.C304346Dc.A00(r0, r2)
            X.C286565Wx.A0L(r1, r4)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0113
            r3 = -1922631209(0xffffffff8d66f9d7, float:-7.1174956E-31)
            java.lang.String r2 = "com.instagram.compose.igds.components.button.IgdsButtonStyles.destructiveLink (IgdsButton.kt:339)"
            X.0fL.A01(r3, r2)
        L_0x0113:
            long r2 = X.C51966G9m.A09(r0)
            X.6CB r10 = new X.6CB
            r10.<init>(r2)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0128
            r2 = 188385137(0xb3a8771, float:3.5924192E-32)
            X.0fL.A00(r2)
        L_0x0128:
            X.6CD r22 = X.AnonymousClass6CD.LARGE
            boolean r13 = r8.A07
            r2 = 2131165203(0x7f070013, float:1.7944616E38)
            float r3 = X.C287645aX.A01(r0, r2)
            float r2 = X.C287645aX.A01(r0, r2)
            androidx.compose.ui.Modifier r20 = X.C287195Zj.A0B(r12, r6, r3, r6, r2)
            r2 = -696012928(0xffffffffd683af80, float:-7.2394895E13)
            boolean r2 = X.C51972G9s.A1R(r0, r2, r9, r5)
            java.lang.Object r3 = r0.ECw()
            if (r2 != 0) goto L_0x014c
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r3 != r2) goto L_0x0156
        L_0x014c:
            r2 = 29
            X.Inj r3 = new X.Inj
            r3.<init>(r11, r2)
            r0.FLL(r3)
        L_0x0156:
            X.0sa r25 = X.C51965G9l.A0y(r1, r3, r4)
            r26 = 1572864(0x180000, float:2.204052E-39)
            r27 = 392(0x188, float:5.5E-43)
            r19 = r0
            r21 = r18
            r23 = r10
            r28 = r13
            r29 = r4
            X.AnonymousClass6CE.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x016b:
            boolean r1 = X.C51967G9n.A1b(r1, r4)
            if (r1 == 0) goto L_0x005e
            r1 = 1361076629(0x51206195, float:4.3051995E10)
            X.0fL.A00(r1)
            goto L_0x005e
        L_0x0179:
            r2 = -696017602(0xffffffffd6839d3e, float:-7.2355687E13)
            r0.ExS(r2)
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            goto L_0x00fe
        L_0x0184:
            r2 = -103664071(0xfffffffff9d23639, float:-1.3643526E35)
            r0.ExS(r2)
            r2 = 2131962707(0x7f132b53, float:1.9562147E38)
            java.lang.String r19 = X.C304346Dc.A00(r0, r2)
            X.5Z4 r18 = X.C51966G9m.A0h(r0)
            long r20 = X.C51966G9m.A0H(r0)
            androidx.compose.ui.Modifier r2 = X.C51969G9p.A0U()
            r3 = 2131165190(0x7f070006, float:1.794459E38)
            float r5 = X.C287645aX.A01(r0, r3)
            float r3 = X.C287645aX.A00(r0)
            androidx.compose.ui.Modifier r17 = X.G9t.A0q(r0, r2, r5, r3)
            r16 = r0
            X.AnonymousClass5ZZ.A0V(r16, r17, r18, r19, r20)
            float r5 = r8.A00
            r3 = -696059053(0xffffffffd682fb53, float:-7.200797E13)
            boolean r1 = X.C51973G9u.A1P(r0, r3, r1)
            java.lang.Object r6 = r0.ECw()
            if (r1 != 0) goto L_0x01c4
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r6 != r1) goto L_0x01ca
        L_0x01c4:
            r1 = 12
            X.J6i r6 = X.C59100J6i.A01(r0, r11, r1)
        L_0x01ca:
            X.0sP r6 = (X.0sP) r6
            X.5Wx r1 = X.C51965G9l.A0H(r0, r4)
            r20 = 1112014848(0x42480000, float:50.0)
            r21 = 1140457472(0x43fa0000, float:500.0)
            float r9 = X.C287645aX.A00(r0)
            float r3 = X.C287645aX.A00(r0)
            androidx.compose.ui.Modifier r17 = X.G9t.A0q(r0, r2, r9, r3)
            r22 = 3456(0xd80, float:4.843E-42)
            r18 = r6
            r19 = r5
            r23 = r4
            X.I50.A01(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x016b
        L_0x01ec:
            r10 = 0
            r2 = -103882466(0xfffffffff9cee11e, float:-1.3427238E35)
            r0.ExS(r2)
            r2 = -696087125(0xffffffffd6828dab, float:-7.1772485E13)
            r0.ExS(r2)
            r2 = r1 & 112(0x70, float:1.57E-43)
            if (r2 == r9) goto L_0x0207
            r2 = r1 & 64
            if (r2 == 0) goto L_0x0242
            boolean r2 = r0.AGw(r8)
            if (r2 == 0) goto L_0x0242
        L_0x0207:
            r2 = r1 & 896(0x380, float:1.256E-42)
            boolean r2 = X.AnonymousClass7TF.A1S(r2, r5)
            boolean r3 = X.C51968G9o.A1T(r0, r14, r3, r2)
            r2 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r2
            if (r1 != r6) goto L_0x0218
            r10 = 1
        L_0x0218:
            r3 = r3 | r10
            java.lang.Object r2 = r0.ECw()
            if (r3 != 0) goto L_0x0223
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0237
        L_0x0223:
            r17 = 6
            X.IxF r2 = new X.IxF
            r16 = r2
            r18 = r14
            r19 = r11
            r20 = r8
            r21 = r30
            r16.<init>(r17, r18, r19, r20, r21)
            r0.FLL(r2)
        L_0x0237:
            X.0sP r2 = (X.0sP) r2
            X.5Wx r1 = X.C51965G9l.A0H(r0, r4)
            X.AnonymousClass6HY.A08(r0, r2)
            goto L_0x016b
        L_0x0242:
            r3 = 0
            goto L_0x0207
        L_0x0244:
            r1 = r7
            goto L_0x0017
        L_0x0247:
            r1 = -696087214(0xffffffffd6828d52, float:-7.1771739E13)
            X.Wub r0 = X.C51973G9u.A0n(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I79.A04(X.GZF, X.5Wy, X.HLe, X.GqI, X.HBP, X.4Cq, int):void");
    }

    public static final void A05(C286575Wy r19, C54621HLe hLe, C53547GqI gqI, HBP hbp, int i) {
        int i2;
        C68150N2q n2q;
        C286575Wy r3 = r19;
        r3.ExV(1257414726);
        int i3 = i;
        C54621HLe hLe2 = hLe;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r3, hLe2) | i;
        } else {
            i2 = i3;
        }
        C53547GqI gqI2 = gqI;
        if ((i & 48) == 0) {
            i2 |= C51970G9q.A06(G9t.A1U(r3, gqI2, i3) ? 1 : 0);
        }
        HBP hbp2 = hbp;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r3, hbp2);
        }
        if ((i2 & 147) != 146 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1388818162, "com.instagram.friendmap.view.compose.HidePlacesFooter (FriendMapHidePlacesBottomSheet.kt:217)");
            }
            if (C51967G9n.A1U(r3, 981928586)) {
                0fL.A01(-143374950, "com.instagram.friendmap.view.compose.hidePlacesFooterText (FriendMapHidePlacesBottomSheet.kt:302)");
            }
            C286025Tq r12 = null;
            if (hLe2 == C54621HLe.HIDE_PLACES_INTRO && (n2q = gqI2.A02) != null) {
                String A00 = C304346Dc.A00(r3, 2131962721);
                String A01 = C304346Dc.A01(r3, new Object[]{n2q.A04, A00}, 2131962705);
                int A08 = 00l.A08(A01, A00, 0, false);
                int A05 = C51966G9m.A05(A00, A08);
                AnonymousClass5ZB r11 = new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0D(r3), 0, 0);
                C303876Bd A0L = C51972G9s.A0L(A01);
                A0L.A06(r11, A08, A05);
                r12 = C51967G9n.A0K(A0L, "link", "location_settings_annotation", A08, A05);
            }
            if (0fL.A02()) {
                0fL.A00(-888583745);
            }
            C286565Wx A0G = C51965G9l.A0G(r3);
            if (r12 != null) {
                AnonymousClass5Z4 A0b = C51966G9m.A0b(r3);
                long A0M = C51966G9m.A0M(r3);
                boolean z = false;
                Modifier A0q = G9t.A0q(r3, Modifier.A00, C287645aX.A01(r3, R.dimen.abc_button_padding_horizontal_material), C287645aX.A00(r3));
                boolean A1Y = C51967G9n.A1Y(r3, r12, 1217036885);
                if ((i2 & 896) == 256) {
                    z = true;
                }
                boolean z2 = A1Y | z;
                Object ECw = r3.ECw();
                if (z2 || ECw == AnonymousClass5XT.A00) {
                    ECw = J6S.A00(r12, hbp2, 45);
                    r3.FLL(ECw);
                }
                IgClickableTextKt.A06(r3, A0q, r12, A0b, C51965G9l.A0z(A0G, ECw), A0M);
            }
            if (0fL.A02()) {
                0fL.A00(583224787);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(hbp2, hLe2, gqI2, i3, 49);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0200, code lost:
        if (r8.length() <= 64) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0281, code lost:
        if (r6.A04.size() < 3) goto L_0x0202;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0273  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C286575Wy r31, X.C54621HLe r32, X.C53547GqI r33, X.HBP r34, X.C62320sa r35, X.C62320sa r36, int r37) {
        /*
            r1 = -1923723360(0xffffffff8d564fa0, float:-6.6039686E-31)
            r0 = r31
            r0.ExV(r1)
            r5 = r37
            r1 = r37 & 6
            if (r1 != 0) goto L_0x02c1
            r1 = r32
            int r2 = X.G9t.A0O(r0, r1)
            r2 = r2 | r37
        L_0x0016:
            r1 = r37 & 48
            r6 = r33
            if (r1 != 0) goto L_0x0025
            boolean r1 = X.G9t.A1U(r0, r6, r5)
            int r1 = X.C51970G9q.A06(r1)
            r2 = r2 | r1
        L_0x0025:
            r1 = r5 & 384(0x180, float:5.38E-43)
            r31 = r34
            if (r1 != 0) goto L_0x0032
            r1 = r31
            int r1 = X.G9t.A0Q(r0, r1)
            r2 = r2 | r1
        L_0x0032:
            r1 = r5 & 3072(0xc00, float:4.305E-42)
            r30 = r35
            if (r1 != 0) goto L_0x003f
            r1 = r30
            int r1 = X.G9t.A0H(r0, r1)
            r2 = r2 | r1
        L_0x003f:
            r1 = r5 & 24576(0x6000, float:3.4438E-41)
            r29 = r36
            if (r1 != 0) goto L_0x004c
            r1 = r29
            int r1 = X.G9t.A0I(r0, r1)
            r2 = r2 | r1
        L_0x004c:
            r3 = r2 & 9363(0x2493, float:1.312E-41)
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r1) goto L_0x0076
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0076
            r0.Evl()
        L_0x005b:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0075
            r9 = 8
            X.J9H r0 = new X.J9H
            r7 = r0
            r8 = r5
            r10 = r31
            r11 = r30
            r12 = r29
            r13 = r6
            r14 = r32
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r1.A06 = r0
        L_0x0075:
            return
        L_0x0076:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0084
            r3 = 721513091(0x2b016a83, float:4.597782E-13)
            java.lang.String r1 = "com.instagram.friendmap.view.compose.HidePlacesHeader (FriendMapHidePlacesBottomSheet.kt:160)"
            X.0fL.A01(r3, r1)
        L_0x0084:
            X.5Qk r16 = androidx.compose.ui.Modifier.A00
            r17 = 0
            androidx.compose.ui.Modifier r9 = X.C51966G9m.A0T(r16)
            r1 = 0
            float r3 = X.C287645aX.A00(r0)
            r8 = 0
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A0B(r9, r8, r3, r8, r8)
            X.5RD r11 = X.C51968G9o.A0X(r0)
            int r10 = X.C287425a7.A00(r0)
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r4 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r0, r7)
            X.0sa r14 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r3, r14)
            X.0sL r13 = X.C287485aD.A03
            X.0sL r15 = X.C51969G9p.A0w(r0, r11, r4, r13)
            X.0sL r12 = X.C287485aD.A02
            boolean r4 = r3.A0K
            if (r4 != 0) goto L_0x00c0
            boolean r4 = X.C51972G9s.A1Q(r0, r10)
            if (r4 != 0) goto L_0x00c3
        L_0x00c0:
            X.C51971G9r.A13(r0, r12, r10)
        L_0x00c3:
            X.0sL r11 = X.C51966G9m.A1K(r0, r7)
            float r7 = X.C287645aX.A00(r0)
            float r4 = X.C287645aX.A00(r0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r9, r7, r8, r4, r8)
            X.5a0 r9 = X.C287275Zs.A02
            X.5Zp r7 = X.C287215Zl.A04
            X.5RD r10 = X.C287395a4.A00(r9, r0, r7)
            int r9 = X.C287425a7.A00(r0)
            X.5RM r7 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r3, r14)
            X.C287595aO.A00(r0, r10, r13)
            boolean r7 = X.C51965G9l.A1Y(r0, r3, r7, r15)
            if (r7 != 0) goto L_0x00f9
            boolean r7 = X.C51972G9s.A1Q(r0, r9)
            if (r7 != 0) goto L_0x00fc
        L_0x00f9:
            X.C51971G9r.A13(r0, r12, r9)
        L_0x00fc:
            X.C287595aO.A00(r0, r4, r11)
            X.6FX r11 = X.AnonymousClass6FX.A00
            r4 = -172958159(0xfffffffff5b0de31, float:-4.484135E32)
            boolean r4 = X.C51967G9n.A1U(r0, r4)
            if (r4 == 0) goto L_0x0112
            r7 = 1892321047(0x70ca8717, float:5.014343E29)
            java.lang.String r4 = "com.instagram.friendmap.view.compose.hidePlacesHeaderIcon (FriendMapHidePlacesBottomSheet.kt:352)"
            X.0fL.A01(r7, r4)
        L_0x0112:
            int r4 = r32.ordinal()
            r9 = 2131238082(0x7f081cc2, float:1.8092433E38)
            if (r4 != r1) goto L_0x011e
            r9 = 2131239025(0x7f082071, float:1.8094345E38)
        L_0x011e:
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x012a
            r7 = -778113527(0xffffffffd19eee09, float:-8.53248E10)
            X.0fL.A00(r7)
        L_0x012a:
            X.C286565Wx.A0L(r3, r1)
            X.2DO r20 = X.C287975bA.A00(r0, r9, r1)
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            int r24 = r2 << 12
            r24 = r24 & r7
            r26 = 0
            r25 = 125(0x7d, float:1.75E-43)
            r18 = r0
            r19 = r17
            r21 = r17
            r22 = r30
            r23 = r8
            r28 = r1
            X.I50.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            r7 = 1294602791(0x4d2a1227, float:1.78332272E8)
            boolean r7 = X.C51967G9n.A1U(r0, r7)
            if (r7 == 0) goto L_0x015b
            r8 = 1093871939(0x41332943, float:11.197574)
            java.lang.String r7 = "com.instagram.friendmap.view.compose.hidePlacesHeaderTitle (FriendMapHidePlacesBottomSheet.kt:253)"
            X.0fL.A01(r8, r7)
        L_0x015b:
            if (r4 != r1) goto L_0x029b
            r7 = 1106695494(0x41f6d546, float:30.854137)
            r0.ExS(r7)
            r7 = 2131962718(0x7f132b5e, float:1.956217E38)
            java.lang.String r13 = X.C304346Dc.A00(r0, r7)
        L_0x016a:
            boolean r7 = X.C51967G9n.A1b(r3, r1)
            if (r7 == 0) goto L_0x0176
            r7 = -396710580(0xffffffffe85aad4c, float:-4.1306906E24)
            X.0fL.A00(r7)
        L_0x0176:
            X.C286565Wx.A0L(r3, r1)
            X.5Z4 r12 = X.C51966G9m.A0d(r0)
            long r14 = X.C51966G9m.A0H(r0)
            r7 = 2131165190(0x7f070006, float:1.794459E38)
            float r10 = X.C287645aX.A01(r0, r7)
            r7 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r9 = X.C287645aX.A01(r0, r7)
            r8 = r16
            androidx.compose.ui.Modifier r8 = X.G9t.A0q(r0, r8, r10, r9)
            androidx.compose.ui.Modifier r11 = r11.A00(r8)
            r10 = r0
            X.AnonymousClass5ZZ.A0X(r10, r11, r12, r13, r14)
            r8 = 1427598699(0x55176d6b, float:1.04060126E13)
            boolean r8 = X.C51967G9n.A1U(r0, r8)
            if (r8 == 0) goto L_0x01ae
            r9 = -1010355122(0xffffffffc3c7344e, float:-398.40863)
            java.lang.String r8 = "com.instagram.friendmap.view.compose.hidePlacesHeaderButtonText (FriendMapHidePlacesBottomSheet.kt:329)"
            X.0fL.A01(r9, r8)
        L_0x01ae:
            if (r4 == r1) goto L_0x0290
            r8 = 2
            if (r4 == r8) goto L_0x0285
            r8 = -202765757(0xfffffffff3ea0a43, float:-3.7085132E31)
            r0.ExS(r8)
            r8 = 2131968361(0x7f134169, float:1.9573614E38)
        L_0x01bc:
            java.lang.String r23 = X.C304346Dc.A00(r0, r8)
            boolean r8 = X.C51967G9n.A1b(r3, r1)
            if (r8 == 0) goto L_0x01cc
            r8 = -1613286772(0xffffffff9fd7328c, float:-9.1139665E-20)
            X.0fL.A00(r8)
        L_0x01cc:
            X.C286565Wx.A0L(r3, r1)
            X.6CB r22 = X.AnonymousClass6CA.A00(r0)
            X.6CD r21 = X.AnonymousClass6CD.LARGE
            r8 = -154178817(0xfffffffff6cf6aff, float:-2.103468E33)
            boolean r8 = X.C51967G9n.A1U(r0, r8)
            if (r8 == 0) goto L_0x01e6
            r9 = -1779424931(0xffffffff95f0215d, float:-9.6987866E-26)
            java.lang.String r8 = "com.instagram.friendmap.view.compose.hidePlacesHeaderButtonEnabled (FriendMapHidePlacesBottomSheet.kt:340)"
            X.0fL.A01(r9, r8)
        L_0x01e6:
            r27 = 0
            r8 = 3
            r9 = 2
            if (r4 == r1) goto L_0x027b
            if (r4 != r9) goto L_0x0202
            boolean r4 = r6.A06
            if (r4 == 0) goto L_0x0204
            java.lang.String r8 = r6.A03
            boolean r4 = X.C51966G9m.A1X(r8)
            if (r4 == 0) goto L_0x0204
            int r8 = r8.length()
            r4 = 64
            if (r8 > r4) goto L_0x0204
        L_0x0202:
            r27 = 1
        L_0x0204:
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0210
            r4 = -1140953406(0xffffffffbbfe6ec2, float:-0.007764668)
            X.0fL.A00(r4)
        L_0x0210:
            X.C286565Wx.A0L(r3, r1)
            r8 = 1572864(0x180000, float:2.204052E-39)
            int r4 = r2 >> 12
            r25 = r4 & 14
            r25 = r25 | r8
            r26 = 396(0x18c, float:5.55E-43)
            r20 = r17
            r24 = r29
            X.AnonymousClass6CE.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0.ASN()
            r4 = r32
            X.5Tq r4 = A00(r0, r4, r1)
            X.5Z4 r10 = X.C51966G9m.A0c(r0)
            long r12 = X.C51966G9m.A0M(r0)
            float r8 = X.C287645aX.A01(r0, r7)
            float r7 = X.C287645aX.A00(r0)
            r1 = r16
            androidx.compose.ui.Modifier r8 = X.G9t.A0q(r0, r1, r8, r7)
            r1 = 1048980904(0x3e862da8, float:0.26206708)
            boolean r7 = X.C51967G9n.A1Y(r0, r4, r1)
            boolean r1 = X.C51973G9u.A1I(r2)
            r7 = r7 | r1
            java.lang.Object r1 = r0.ECw()
            if (r7 != 0) goto L_0x0259
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0264
        L_0x0259:
            r2 = 46
            r1 = r31
            X.J6S r1 = X.J6S.A00(r4, r1, r2)
            r0.FLL(r1)
        L_0x0264:
            X.0sP r11 = X.C51965G9l.A0z(r3, r1)
            r9 = r4
            r7 = r0
            com.instagram.compose.core.ui.IgClickableTextKt.A06(r7, r8, r9, r10, r11, r12)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x005b
            r1 = 1916526737(0x723be091, float:3.7212916E30)
            X.0fL.A00(r1)
            goto L_0x005b
        L_0x027b:
            java.util.List r4 = r6.A04
            int r4 = r4.size()
            if (r4 >= r8) goto L_0x0204
            goto L_0x0202
        L_0x0285:
            r8 = -202767101(0xfffffffff3ea0503, float:-3.7081882E31)
            r0.ExS(r8)
            r8 = 2131960992(0x7f1324a0, float:1.9558668E38)
            goto L_0x01bc
        L_0x0290:
            r8 = -202769630(0xfffffffff3e9fb22, float:-3.7075767E31)
            r0.ExS(r8)
            r8 = 2131952258(0x7f130282, float:1.9540954E38)
            goto L_0x01bc
        L_0x029b:
            r7 = 1106697969(0x41f6def1, float:30.858858)
            r0.ExS(r7)
            boolean r7 = r6.A08
            if (r7 == 0) goto L_0x02b7
            r7 = 1106698701(0x41f6e1cd, float:30.860254)
            r0.ExS(r7)
            r7 = 2131962720(0x7f132b60, float:1.9562173E38)
        L_0x02ae:
            java.lang.String r13 = X.C304346Dc.A00(r0, r7)
            X.C286565Wx.A0L(r3, r1)
            goto L_0x016a
        L_0x02b7:
            r7 = 1106701069(0x41f6eb0d, float:30.86477)
            r0.ExS(r7)
            r7 = 2131962701(0x7f132b4d, float:1.9562135E38)
            goto L_0x02ae
        L_0x02c1:
            r2 = r5
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I79.A06(X.5Wy, X.HLe, X.GqI, X.HBP, X.0sa, X.0sa, int):void");
    }

    public static final void A07(C286575Wy r17, C54621HLe hLe, HBP hbp, C62320sa r20, C62320sa r21, int i) {
        int i2;
        C286575Wy r13 = r17;
        r13.ExV(1336774743);
        int i3 = i;
        C54621HLe hLe2 = hLe;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, hLe2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r11 = r20;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r11);
        }
        C62320sa r10 = r21;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r13, r10);
        }
        HBP hbp2 = hbp;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0R(r13, hbp2);
        }
        if ((i2 & 1171) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-133434592, "com.instagram.friendmap.view.compose.HidePlacesIntroNux (FriendMapHidePlacesBottomSheet.kt:497)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r5), 0.0f, C287645aX.A00(r13), 0.0f, 0.0f);
            AnonymousClass5RD A01 = C291495hO.A01(C287275Zs.A06, r13, C287215Zl.A00);
            int A00 = C287425a7.A00(r13);
            C286565Wx r4 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r13, A0B);
            C51973G9u.A0y(r13, r4);
            C51971G9r.A12(r13, A01, A04);
            0sL r7 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r7, A00);
            }
            C51965G9l.A18(r13, A012);
            String A002 = C304346Dc.A00(r13, 2131962711);
            C286575Wy r15 = r13;
            AnonymousClass5ZZ.A0X(r15, C287195Zj.A0B(r5, C287645aX.A01(r13, R.dimen.abc_dropdownitem_icon_width), C287645aX.A01(r13, R.dimen.abc_action_bar_elevation_material), C287645aX.A01(r13, R.dimen.abc_dropdownitem_icon_width), 0.0f), I5Q.A00(r13), A002, C51966G9m.A0H(r13));
            C286025Tq A003 = A00(r13, hLe2, true);
            AnonymousClass5Z4 A0c = C51966G9m.A0c(r13);
            long A0M = C51966G9m.A0M(r13);
            Modifier A09 = C287195Zj.A09(r5, C287645aX.A00(r13), C287645aX.A00(r13));
            boolean A1Y = C51967G9n.A1Y(r13, A003, 1860657699) | C51973G9u.A1J(i2);
            Object ECw = r13.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = J6S.A00(A003, hbp2, 47);
                r13.FLL(ECw);
            }
            IgClickableTextKt.A06(r15, A09, A003, A0c, C51965G9l.A0z(r4, ECw), A0M);
            I7L.A00(r13, (Modifier) null, (CharSequence) null, C304346Dc.A00(r13, 2131962709), C304346Dc.A00(r13, 2131954722), r10, r11, ((i2 >> 3) & 112) | ((i2 << 15) & 3670016), 3072, 24476);
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-1935167871);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(hbp2, hLe2, r11, r10, i3, 15);
        }
    }
}
