package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hwf  reason: case insensitive filesystem */
public abstract class C56328Hwf {
    public static final void A00(C286575Wy r15, Modifier modifier, 0sP r17, int i, int i2, boolean z) {
        int i3;
        AnonymousClass2DO A00;
        long A04;
        Modifier modifier2 = modifier;
        r15.ExV(-368739020);
        int i4 = i2;
        0sP r4 = r17;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r15, r4) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0Z(r15, z2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r15, modifier2);
        }
        if ((i3 & 147) != 146 || !r15.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-522090636, "com.instagram.opal.impl.ui.AudienceSelectButton (OpalAudienceSelectorFragment.kt:444)");
            }
            Object A0m = C51967G9n.A0m(r15, 723168254);
            Object obj = AnonymousClass5XT.A00;
            C287605aT r7 = (C287605aT) C51972G9s.A0l(r15, A0m, obj);
            C286565Wx r3 = (C286565Wx) r15;
            C286565Wx.A0L(r3, false);
            C287625aV A0R = C51965G9l.A0R(1);
            boolean A1N = C51973G9u.A1N(r15, 723176454, i3);
            Object ECw = r15.ECw();
            if (A1N || ECw == obj) {
                ECw = C51970G9q.A0t(r15, r4, 30);
            }
            Modifier A002 = HR4.A00((C287095Yz) null, r7, modifier2, A0R, C51965G9l.A0z(r3, ECw), z2, true);
            if (z) {
                r15.ExS(943684188);
                A00 = C287975bA.A00(r15, R.drawable.instagram_circle_check_pano_filled_24, 0);
                A04 = C51966G9m.A0N(r15);
            } else {
                r15.ExS(943926856);
                A00 = C287975bA.A00(r15, R.drawable.checkbox, 0);
                A04 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (C51966G9m.A0H(r15) & 63)], AnonymousClass5RW.A03(C51966G9m.A0H(r15)), AnonymousClass5RW.A02(C51966G9m.A0H(r15)), AnonymousClass5RW.A01(C51966G9m.A0H(r15)), 0.2f);
            }
            C288165bT.A05(r15, A002, A00, A04);
            if (C51967G9n.A1b(r3, false)) {
                0fL.A00(267122871);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i5, i4, 10, modifier2, r17, z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: X.Ixt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: X.Ixt} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0352, code lost:
        X.AnonymousClass5ZZ.A0Q(r26, r27, X.C51966G9m.A0g(r0), r29, X.C51966G9m.A0H(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x035d, code lost:
        X.C286565Wx.A0L(r3, false);
        r0.ASN();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01e1, code lost:
        if (r6 == X.AnonymousClass5XT.A00) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0253, code lost:
        if (r6 == X.C62520KhB.Loaded) goto L_0x0255;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r47, X.C62520KhB r48, X.C62520KhB r49, java.lang.String r50, java.util.List r51, X.C62320sa r52, X.0sP r53, X.0sP r54, X.0sP r55, int r56, int r57, boolean r58) {
        /*
            r1 = -1690753345(0xffffffff9b3926bf, float:-1.5315361E-22)
            r0 = r47
            r0.ExV(r1)
            r4 = r57
            r1 = r57 & 6
            r44 = r53
            if (r1 != 0) goto L_0x0369
            r1 = r44
            int r1 = X.C41848B3p.A01(r0, r1)
            r1 = r1 | r57
        L_0x0018:
            r2 = r57 & 48
            r43 = r54
            if (r2 != 0) goto L_0x0025
            r2 = r43
            int r2 = X.G9t.A0F(r0, r2)
            r1 = r1 | r2
        L_0x0025:
            r2 = r4 & 384(0x180, float:5.38E-43)
            r42 = r55
            if (r2 != 0) goto L_0x0032
            r2 = r42
            int r2 = X.G9t.A0G(r0, r2)
            r1 = r1 | r2
        L_0x0032:
            r2 = r4 & 3072(0xc00, float:4.305E-42)
            r45 = r52
            if (r2 != 0) goto L_0x003f
            r2 = r45
            int r2 = X.G9t.A0H(r0, r2)
            r1 = r1 | r2
        L_0x003f:
            r2 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x004a
            r2 = r48
            int r2 = X.G9t.A0S(r0, r2)
            r1 = r1 | r2
        L_0x004a:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r57 & r2
            r47 = r49
            if (r2 != 0) goto L_0x0059
            r2 = r47
            int r2 = X.G9t.A0T(r0, r2)
            r1 = r1 | r2
        L_0x0059:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r57 & r2
            r24 = r50
            if (r2 != 0) goto L_0x0068
            r2 = r24
            int r2 = X.G9t.A0U(r0, r2)
            r1 = r1 | r2
        L_0x0068:
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r57 & r2
            r41 = r56
            if (r2 != 0) goto L_0x007d
            r2 = r41
            boolean r3 = r0.AGs(r2)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x007c
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x007c:
            r1 = r1 | r2
        L_0x007d:
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            r2 = r57 & r2
            r40 = r58
            if (r2 != 0) goto L_0x008c
            r2 = r40
            int r2 = X.G9t.A0g(r0, r2)
            r1 = r1 | r2
        L_0x008c:
            r2 = 805306368(0x30000000, float:4.656613E-10)
            r2 = r57 & r2
            r46 = r51
            if (r2 != 0) goto L_0x009b
            r2 = r46
            int r2 = X.G9t.A0N(r0, r2)
            r1 = r1 | r2
        L_0x009b:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r1 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r2) goto L_0x00d2
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x00d2
            r0.Evl()
        L_0x00ae:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x00d1
            X.JBc r0 = new X.JBc
            r5 = r0
            r6 = r48
            r7 = r47
            r8 = r24
            r9 = r46
            r10 = r45
            r11 = r44
            r12 = r43
            r13 = r42
            r14 = r41
            r15 = r4
            r16 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1.A06 = r0
        L_0x00d1:
            return
        L_0x00d2:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00e0
            r3 = -599923829(0xffffffffdc3de38b, float:-2.13795827E17)
            java.lang.String r2 = "com.instagram.opal.impl.ui.OpalAudienceSelectorContent (OpalAudienceSelectorFragment.kt:261)"
            X.0fL.A01(r3, r2)
        L_0x00e0:
            java.lang.Object r7 = X.C51965G9l.A0r(r0)
            r23 = 3
            r2 = 0
            r3 = r23
            androidx.compose.foundation.lazy.LazyListState r22 = X.C305066Gi.A00(r0, r2, r2, r2, r3)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r25 = 0
            r3 = 860894850(0x33503682, float:4.847835E-8)
            boolean r3 = X.C51967G9n.A1Z(r0, r7, r3)
            java.lang.Object r5 = r0.ECw()
            if (r3 != 0) goto L_0x0102
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r5 != r3) goto L_0x0107
        L_0x0102:
            r3 = 4
            X.G2d r5 = X.G9w.A0s(r0, r7, r3)
        L_0x0107:
            X.0sa r5 = (X.C62320sa) r5
            X.5Wx r3 = X.C51965G9l.A0H(r0, r2)
            r21 = 6
            r8 = r0
            r9 = r25
            r10 = r5
            r11 = r6
            r12 = r2
            r13 = r21
            java.lang.Object r11 = X.C305136Gr.A00(r8, r9, r10, r11, r12, r13)
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r5 = X.C51966G9m.A0U(r8)
            androidx.compose.ui.Modifier r6 = X.G9t.A0p(r0, r5)
            X.0sP r5 = X.C287655aY.A00
            androidx.compose.ui.Modifier r6 = X.JJP.A00(r6, r5, r2)
            X.5RD r10 = X.C51969G9p.A0Z(r0, r2)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r5 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r6)
            X.0sa r9 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r3, r9)
            X.0sL r6 = X.C287485aD.A03
            X.0sL r20 = X.C51969G9p.A0w(r0, r10, r5, r6)
            X.0sL r5 = X.C287485aD.A02
            boolean r10 = r3.A0K
            if (r10 != 0) goto L_0x0152
            boolean r10 = X.C51972G9s.A1Q(r0, r13)
            if (r10 != 0) goto L_0x0155
        L_0x0152:
            X.C51971G9r.A13(r0, r5, r13)
        L_0x0155:
            X.0sL r19 = X.C51966G9m.A1K(r0, r12)
            X.6Et r18 = X.C304676Et.A00
            if (r50 != 0) goto L_0x0365
            java.lang.String r29 = ""
        L_0x015f:
            r10 = -2112815589(0xffffffff8210fe1b, float:-1.0652374E-37)
            r0.ExS(r10)
            r17 = r1 & 14
            boolean r10 = X.C51972G9s.A1I(r17)
            java.lang.Object r13 = r0.ECw()
            if (r10 != 0) goto L_0x0175
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r13 != r10) goto L_0x0181
        L_0x0175:
            r12 = 31
            X.G4U r13 = new X.G4U
            r10 = r44
            r13.<init>(r10, r12)
            r0.FLL(r13)
        L_0x0181:
            X.0sP r31 = X.C51965G9l.A0z(r3, r13)
            androidx.compose.ui.Modifier r15 = X.C51966G9m.A0T(r8)
            r10 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r27 = X.C287195Zj.A03(r15)
            r32 = 384(0x180, float:5.38E-43)
            r33 = 56
            r26 = r0
            r28 = r25
            r30 = r25
            X.C52751Gc3.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r12 = X.AnonymousClass7TE.A1b(r46)
            r16 = 57344(0xe000, float:8.0356E-41)
            if (r12 == 0) goto L_0x02d1
            r5 = -1072499963(0xffffffffc012f305, float:-2.2960827)
            r0.ExS(r5)
            r5 = 1
            r6 = r18
            androidx.compose.ui.Modifier r35 = r6.A00(r8, r5)
            r8 = -2112801960(0xffffffff82113358, float:-1.0667652E-37)
            r6 = r46
            boolean r8 = X.C51967G9n.A1Z(r0, r6, r8)
            boolean r6 = X.C51974G9v.A1V(r1)
            r8 = r8 | r6
            boolean r6 = r0.AGu(r11)
            boolean r8 = X.C51968G9o.A1T(r0, r7, r8, r6)
            boolean r6 = X.C51973G9u.A1H(r1)
            r8 = r8 | r6
            boolean r6 = X.C51973G9u.A1I(r1)
            r8 = r8 | r6
            r6 = r1 & r16
            boolean r6 = X.C51972G9s.A1K(r6)
            r8 = r8 | r6
            java.lang.Object r6 = r0.ECw()
            if (r8 != 0) goto L_0x01e3
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r6 != r8) goto L_0x01fd
        L_0x01e3:
            r34 = 5
            X.Ixt r6 = new X.Ixt
            r26 = r6
            r27 = r7
            r28 = r42
            r29 = r43
            r30 = r48
            r31 = r11
            r32 = r46
            r33 = r41
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            r0.FLL(r6)
        L_0x01fd:
            X.0sP r36 = X.C51965G9l.A0z(r3, r6)
            r37 = 12582912(0xc00000, float:1.7632415E-38)
            r38 = 124(0x7c, float:1.74E-43)
            r33 = r22
            r34 = r0
            r39 = r5
            X.AnonymousClass6HY.A04(r33, r34, r35, r36, r37, r38, r39)
        L_0x020e:
            X.C286565Wx.A0L(r3, r2)
            r5 = 0
            X.C56618I4t.A00(r0)
            r6 = -2112652165(0xffffffff82137c7b, float:-1.0835578E-37)
            boolean r6 = X.C51974G9v.A1a(r0, r6, r1)
            java.lang.Object r8 = r0.ECw()
            if (r6 != 0) goto L_0x0226
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r8 != r6) goto L_0x0232
        L_0x0226:
            X.G2d r8 = new X.G2d
            r7 = r23
            r6 = r45
            r8.<init>(r6, r7)
            r0.FLL(r8)
        L_0x0232:
            X.0sa r32 = X.C51965G9l.A0y(r3, r8, r2)
            r6 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r31 = X.C304346Dc.A00(r0, r6)
            r6 = 1101004800(0x41a00000, float:20.0)
            androidx.compose.ui.Modifier r27 = X.C287195Zj.A09(r15, r10, r6)
            X.GQy r30 = X.C51965G9l.A0m(r0)
            X.6CD r29 = X.AnonymousClass6CD.LARGE
            X.KhB r7 = X.C62520KhB.Loading
            r6 = r47
            if (r6 == r7) goto L_0x0255
            X.KhB r7 = X.C62520KhB.Loaded
            r36 = 0
            if (r6 != r7) goto L_0x0257
        L_0x0255:
            r36 = 1
        L_0x0257:
            r6 = 1573248(0x180180, float:2.20459E-39)
            int r33 = r1 >> 12
            r33 = r33 & r16
            r33 = r33 | r6
            r34 = 264(0x108, float:3.7E-43)
            r26 = r0
            r28 = r25
            r35 = r40
            X.AnonymousClass6CE.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r6 = 2131968833(0x7f134341, float:1.9574572E38)
            java.lang.String r12 = X.C304346Dc.A00(r0, r6)
            r8 = 1
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A0A(r15, r10, r5, r10)
            r5 = r18
            androidx.compose.ui.Modifier r10 = X.C51966G9m.A0S(r5, r6)
            long r13 = X.C51966G9m.A0M(r0)
            X.5Z4 r11 = X.C51966G9m.A0b(r0)
            r7 = 0
            r9 = r0
            X.AnonymousClass5ZZ.A0X(r9, r10, r11, r12, r13)
            r0.ASN()
            r5 = 861097042(0x33534c52, float:4.919668E-8)
            r0.ExS(r5)
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r1
            r1 = 1048576(0x100000, float:1.469368E-39)
            r5 = 4
            if (r6 == r1) goto L_0x029c
            r8 = 0
        L_0x029c:
            r1 = r17
            if (r1 != r5) goto L_0x02a1
            r7 = 1
        L_0x02a1:
            r8 = r8 | r7
            java.lang.Object r7 = r0.ECw()
            if (r8 != 0) goto L_0x02ac
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r7 != r1) goto L_0x02ba
        L_0x02ac:
            X.Iw3 r7 = new X.Iw3
            r6 = r24
            r5 = r44
            r1 = r21
            r7.<init>(r6, r5, r1)
            r0.FLL(r7)
        L_0x02ba:
            X.0sa r2 = X.C51965G9l.A0y(r3, r7, r2)
            r1 = r22
            X.C52381GQg.A00(r1, r0, r2)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00ae
            r1 = -1149172718(0xffffffffbb810412, float:-0.003937253)
            X.0fL.A00(r1)
            goto L_0x00ae
        L_0x02d1:
            r7 = -1068897112(0xffffffffc049eca8, float:-3.1550694)
            r0.ExS(r7)
            r11 = 1
            r7 = r18
            androidx.compose.ui.Modifier r7 = r7.A00(r15, r11)
            androidx.compose.ui.Modifier r7 = X.C287195Zj.A07(r7, r10)
            androidx.compose.ui.Alignment r13 = X.C287215Zl.A09
            X.5RD r14 = X.C287675aa.A00(r13, r2)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r11 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r0, r7)
            X.C51973G9u.A0z(r0, r3, r9)
            X.C287595aO.A00(r0, r14, r6)
            r6 = r20
            boolean r6 = X.C51965G9l.A1Y(r0, r3, r11, r6)
            if (r6 != 0) goto L_0x0308
            boolean r6 = X.C51972G9s.A1Q(r0, r12)
            if (r6 != 0) goto L_0x030b
        L_0x0308:
            X.C51971G9r.A13(r0, r5, r12)
        L_0x030b:
            r5 = r19
            X.C287595aO.A00(r0, r7, r5)
            X.5dj r6 = X.C289515dj.A00
            int r5 = r48.ordinal()
            switch(r5) {
                case 0: goto L_0x0321;
                case 1: goto L_0x0341;
                case 2: goto L_0x032f;
                case 3: goto L_0x0321;
                case 4: goto L_0x0321;
                case 5: goto L_0x0321;
                default: goto L_0x0319;
            }
        L_0x0319:
            r1 = -302983399(0xffffffffedf0d719, float:-9.317055E27)
            X.Wub r0 = X.C51972G9s.A0v(r0, r3, r1)
            throw r0
        L_0x0321:
            r5 = -801708412(0xffffffffd036e684, float:-1.22742415E10)
            r0.ExS(r5)
            androidx.compose.ui.Modifier r5 = r6.AAz(r13, r8)
            X.GQD.A00(r0, r5)
            goto L_0x035d
        L_0x032f:
            r5 = -802168049(0xffffffffd02fe30f, float:-1.18035732E10)
            r0.ExS(r5)
            r5 = 2131968420(0x7f1341a4, float:1.9573734E38)
            java.lang.String r29 = X.C304346Dc.A00(r0, r5)
            androidx.compose.ui.Modifier r27 = r6.AAz(r13, r8)
            goto L_0x0352
        L_0x0341:
            r5 = -802512149(0xffffffffd02aa2eb, float:-1.14512148E10)
            r0.ExS(r5)
            r5 = 2131974093(0x7f1357cd, float:1.958524E38)
            java.lang.String r29 = X.C304346Dc.A00(r0, r5)
            androidx.compose.ui.Modifier r27 = r6.AAz(r13, r8)
        L_0x0352:
            long r30 = X.C51966G9m.A0H(r0)
            X.5Z4 r28 = X.C51966G9m.A0g(r0)
            X.AnonymousClass5ZZ.A0Q(r26, r27, r28, r29, r30)
        L_0x035d:
            X.C286565Wx.A0L(r3, r2)
            r0.ASN()
            goto L_0x020e
        L_0x0365:
            r29 = r24
            goto L_0x015f
        L_0x0369:
            r1 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56328Hwf.A01(X.5Wy, X.KhB, X.KhB, java.lang.String, java.util.List, X.0sa, X.0sP, X.0sP, X.0sP, int, int, boolean):void");
    }
}
