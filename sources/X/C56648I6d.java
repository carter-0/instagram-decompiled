package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import com.instagram.android.R;

/* renamed from: X.I6d  reason: case insensitive filesystem */
public abstract class C56648I6d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.IxZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: X.IxZ} */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c8, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x00ca;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r22, X.C59964JcX r23, X.LRW r24, X.C62320sa r25, X.0sK r26, int r27, boolean r28) {
        /*
            r3 = 0
            r6 = r23
            r5 = r24
            int r23 = X.DbW.A02(r3, r6, r5)
            r2 = 3
            r12 = r25
            r11 = r26
            X.AnonymousClass7TF.A1D(r11, r2, r12)
            r0 = -1001952172(0xffffffffc4476c54, float:-797.6926)
            r7 = r22
            r7.ExV(r0)
            r4 = r27
            r0 = r27 & 6
            if (r0 != 0) goto L_0x0101
            int r10 = X.C41848B3p.A01(r7, r6)
            r10 = r10 | r27
        L_0x0025:
            r0 = r27 & 48
            r13 = r28
            if (r0 != 0) goto L_0x0030
            int r0 = X.G9t.A0Z(r7, r13)
            r10 = r10 | r0
        L_0x0030:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0039
            int r0 = X.G9t.A0G(r7, r5)
            r10 = r10 | r0
        L_0x0039:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            r9 = 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x0044
            int r0 = X.G9t.A0H(r7, r11)
            r10 = r10 | r0
        L_0x0044:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004d
            int r0 = X.G9t.A0I(r7, r12)
            r10 = r10 | r0
        L_0x004d:
            r1 = r10 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0078
            boolean r0 = r7.Bwn()
            if (r0 == 0) goto L_0x0078
            r7.Evl()
        L_0x005c:
            X.5Xd r1 = r7.ASQ()
            if (r1 == 0) goto L_0x0077
            X.J9G r0 = new X.J9G
            r14 = r0
            r15 = r4
            r16 = r3
            r17 = r6
            r18 = r5
            r19 = r12
            r20 = r11
            r21 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r1.A06 = r0
        L_0x0077:
            return
        L_0x0078:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0086
            r1 = -175715017(0xfffffffff586cd37, float:-3.417627E32)
            java.lang.String r0 = "com.instagram.aistudio.home.view.section.AiHomeCarouselSection (AiHomeCarouselSection.kt:69)"
            X.0fL.A01(r1, r0)
        L_0x0086:
            androidx.compose.foundation.lazy.LazyListState r2 = X.C305066Gi.A00(r7, r3, r3, r3, r2)
            r20 = 0
            X.6F1 r15 = X.C304696Ev.A00(r2, r7)
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            r8 = 1094713344(0x41400000, float:12.0)
            r0 = 0
            androidx.compose.ui.Modifier r21 = X.C287195Zj.A0B(r1, r0, r0, r0, r8)
            X.6Fc r16 = X.C287275Zs.A01(r8)
            X.6Fj r1 = new X.6Fj
            r1.<init>(r8, r0, r8, r0)
            r0 = 63507986(0x3c90e12, float:1.1816949E-36)
            boolean r14 = X.C51973G9u.A1S(r7, r6, r5, r0)
            r0 = r10 & 7168(0x1c00, float:1.0045E-41)
            r8 = 1
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r9)
            r14 = r14 | r0
            boolean r0 = X.C51972G9s.A1L(r10)
            r14 = r14 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r0
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r10 == r0) goto L_0x00bf
            r8 = 0
        L_0x00bf:
            r14 = r14 | r8
            java.lang.Object r0 = r7.ECw()
            if (r14 != 0) goto L_0x00ca
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r0 != r8) goto L_0x00da
        L_0x00ca:
            X.IxZ r0 = new X.IxZ
            r22 = r0
            r24 = r6
            r25 = r5
            r27 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r7.FLL(r0)
        L_0x00da:
            X.0sP r0 = (X.0sP) r0
            X.C51965G9l.A1X(r7, r3)
            r26 = 1
            r23 = 12607878(0xc06186, float:1.76674E-38)
            r24 = 40
            r22 = r0
            r25 = r3
            r19 = r7
            r18 = r2
            r17 = r1
            X.AnonymousClass6HY.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005c
            r0 = -1398446458(0xffffffffaca56686, float:-4.7009644E-12)
            X.0fL.A00(r0)
            goto L_0x005c
        L_0x0101:
            r10 = r4
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56648I6d.A02(X.5Wy, X.JcX, X.LRW, X.0sa, X.0sK, int, boolean):void");
    }

    public static final void A00(C286575Wy r28, Modifier modifier, String str, int i, int i2) {
        int i3;
        C286625Xd ASQ;
        int i4;
        Modifier modifier2 = modifier;
        C286575Wy r0 = r28;
        r0.ExV(204514124);
        int i5 = i2;
        int i6 = i2 & 1;
        int i7 = i;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r0, modifier2) | i;
        } else {
            i3 = i7;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r0, str2);
        }
        if ((i3 & 19) != 18 || !r0.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1414042179, "com.instagram.aistudio.home.view.section.TaglineBubble (AiHomeCarouselSection.kt:562)");
            }
            r0.ExS(-475641572);
            if (str == null) {
                C285245Qk r3 = Modifier.A00;
                AnonymousClass5RD A0a = C51966G9m.A0a(false);
                int A00 = C287425a7.A00(r0);
                C286565Wx r5 = (C286565Wx) r0;
                AnonymousClass5RM A04 = C286565Wx.A04(r5);
                Modifier A01 = C287435a8.A01(r0, r3);
                C51973G9u.A0y(r0, r5);
                C51971G9r.A12(r0, A0a, A04);
                0sL r2 = C287485aD.A02;
                if (r5.A0K || !C51972G9s.A1Q(r0, A00)) {
                    C51971G9r.A13(r0, r2, A00);
                }
                C51965G9l.A18(r0, A01);
                r0.ASN();
                if (C51967G9n.A1b(r5, false)) {
                    0fL.A00(-146518616);
                }
                ASQ = r0.ASQ();
                if (ASQ != null) {
                    i4 = 1;
                    ASQ.A06 = new C59139J7v(modifier2, str2, i5, i7, i4);
                }
                return;
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r0, C287215Zl.A02, C51965G9l.A01((i3 & 14) >> 3));
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, modifier2);
            C62320sa r7 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r7);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A042, r6);
            0sL r52 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r52, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A012);
            C285245Qk r10 = Modifier.A00;
            Modifier Ezh = r10.Ezh(new ZIndexElement(2.0f));
            AnonymousClass5ZQ A013 = AnonymousClass5ZN.A01(56.0f);
            boolean z = false;
            int compare = Float.compare(4.0f, 0.0f);
            if (compare > 0) {
                z = true;
            }
            long j = AnonymousClass5RV.A00;
            Modifier A014 = C56169Hty.A01(Ezh, A013, 4.0f, j, j, z);
            long A08 = C51966G9m.A08(r0);
            AnonymousClass5S2 r13 = AnonymousClass5S0.A00;
            Modifier A07 = C287195Zj.A07(C304766Fd.A01(A014, r13, A08), 10.0f);
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A015 = C287435a8.A01(r0, A07);
            C51973G9u.A0z(r0, A0H, r7);
            C287595aO.A00(r0, A003, r6);
            if (C51965G9l.A1Y(r0, A0H, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r52, A004);
            }
            C287595aO.A00(r0, A015, A1K);
            C286575Wy r27 = r0;
            String str3 = str2;
            AnonymousClass5ZZ.A0n(r27, C51966G9m.A0b(r0), str3, (i3 >> 3) & 14, C51966G9m.A0H(r0));
            r0.ASN();
            Modifier A03 = C287205Zk.A03(C56164Htt.A00(r10, 36.0f, -8.0f));
            AnonymousClass5ZQ r23 = AnonymousClass5ZN.A00;
            long j2 = j;
            Modifier A016 = C304766Fd.A01(C56169Hty.A01(A03, r23, 4.0f, j, j2, AnonymousClass7TF.A1R(compare)), r13, C51966G9m.A08(r0));
            AnonymousClass5RD A005 = C287675aa.A00(alignment, false);
            int A006 = C287425a7.A00(r0);
            AnonymousClass5RM A044 = C286565Wx.A04(A0H);
            Modifier A017 = C287435a8.A01(r0, A016);
            C51973G9u.A0z(r0, A0H, r7);
            C287595aO.A00(r0, A005, r6);
            if (C51965G9l.A1Y(r0, A0H, A044, A0w) || !C51972G9s.A1Q(r0, A006)) {
                C51971G9r.A13(r0, r52, A006);
            }
            C287595aO.A00(r0, A017, A1K);
            r0.ASN();
            Modifier A018 = C304766Fd.A01(C56169Hty.A01(C287205Zk.A0C(C56164Htt.A00(r10, 48.0f, -8.0f), 4.0f), r23, 4.0f, j, j2, AnonymousClass7TF.A1R(compare)), r13, C51966G9m.A08(r0));
            AnonymousClass5RD A007 = C287675aa.A00(alignment, false);
            int A008 = C287425a7.A00(r0);
            AnonymousClass5RM A045 = C286565Wx.A04(A0H);
            Modifier A019 = C287435a8.A01(r0, A018);
            C51973G9u.A0z(r0, A0H, r7);
            C287595aO.A00(r0, A007, r6);
            if (C51965G9l.A1Y(r0, A0H, A045, A0w) || !C51972G9s.A1Q(r0, A008)) {
                C51971G9r.A13(r0, r52, A008);
            }
            C287595aO.A00(r0, A019, A1K);
            if (C51971G9r.A1R(r0)) {
                0fL.A00(1274965925);
            }
        } else {
            r0.Evl();
        }
        ASQ = r0.ASQ();
        if (ASQ != null) {
            i4 = 2;
            ASQ.A06 = new C59139J7v(modifier2, str2, i5, i7, i4);
        }
    }

    public static final void A01(C286575Wy r27, Modifier modifier, C62320sa r29, int i, int i2) {
        int i3;
        long j;
        Modifier modifier2 = modifier;
        C286575Wy r1 = r27;
        r1.ExV(-1014465253);
        int i4 = i2;
        int i5 = i2 & 1;
        C62320sa r31 = r29;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r1, r31) | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 3) != 2 || !r1.Bwn()) {
            if ((i4 & 2) != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(984239851, "com.instagram.aistudio.home.view.section.CarouselCreateCard (AiHomeCarouselSection.kt:367)");
            }
            C285245Qk r2 = Modifier.A00;
            AnonymousClass5ZQ A00 = AnonymousClass5ZN.A00();
            boolean A1M = C51975G9x.A1M(12.0f);
            long j2 = AnonymousClass5RV.A00;
            Modifier A08 = C287205Zk.A08(C287205Zk.A0D(C51976G9y.A0B(r1, C56169Hty.A01(r2, A00, 12.0f, j2, j2, A1M)), 318.0f), 184.0f);
            r1.ExS(1656438190);
            int i7 = i3 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i7, 4);
            Object ECw = r1.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new MM7(r31, 37);
                r1.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r1, false);
            Modifier A05 = C287635aW.A05(A08, (C287625aV) null, (String) null, (C62320sa) ECw, true);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r1);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r1, A05);
            C62320sa r7 = C287485aD.A00;
            C51973G9u.A0z(r1, A0H, r7);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r1, A0a, A04, r6);
            0sL r4 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r1, A002)) {
                C51971G9r.A13(r1, r4, A002);
            }
            0sL A1K = C51966G9m.A1K(r1, A01);
            Modifier A012 = C287195Zj.A01(r2);
            C287265Zr r3 = C287215Zl.A00;
            C287325Zx r11 = C287275Zs.A07;
            AnonymousClass5RD A02 = C291495hO.A02(r11, r1, r3, 48);
            int A003 = C287425a7.A00(r1);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r1, A012);
            C51973G9u.A0z(r1, A0H, r7);
            C287595aO.A00(r1, A02, r6);
            if (C51965G9l.A1Y(r1, A0H, A042, A0w) || !C51972G9s.A1Q(r1, A003)) {
                C51971G9r.A13(r1, r4, A003);
            }
            C287595aO.A00(r1, A013, A1K);
            C304676Et r16 = C304676Et.A00;
            Modifier A0B = C287195Zj.A0B(r2, 0.0f, 22.0f, 0.0f, 0.0f);
            AnonymousClass5RD A022 = C287395a4.A02(C287275Zs.A01, r1, C287215Zl.A04, 48);
            int A004 = C287425a7.A00(r1);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A014 = C287435a8.A01(r1, A0B);
            C51973G9u.A0z(r1, A0H, r7);
            C287595aO.A00(r1, A022, r6);
            if (C51965G9l.A1Y(r1, A0H, A043, A0w) || !C51972G9s.A1Q(r1, A004)) {
                C51971G9r.A13(r1, r4, A004);
            }
            C287595aO.A00(r1, A014, A1K);
            AnonymousClass6G3.A05(r1, C287205Zk.A0C(r2, 74.0f), C287975bA.A00(r1, R.drawable.ig_illustrations_illo_ai_studio_refresh, 0));
            Modifier A0B2 = C287195Zj.A0B(r2, 12.0f, 0.0f, 0.0f, 0.0f);
            C287265Zr r12 = C287215Zl.A02;
            AnonymousClass5RD A023 = C291495hO.A02(r11, r1, r12, 0);
            int A005 = C287425a7.A00(r1);
            AnonymousClass5RM A044 = C286565Wx.A04(A0H);
            Modifier A015 = C287435a8.A01(r1, A0B2);
            C51973G9u.A0z(r1, A0H, r7);
            C287595aO.A00(r1, A023, r6);
            if (C51965G9l.A1Y(r1, A0H, A044, A0w) || !C51972G9s.A1Q(r1, A005)) {
                C51971G9r.A13(r1, r4, A005);
            }
            C287595aO.A00(r1, A015, A1K);
            String A006 = C288035bG.A00(r1, 2131952639);
            boolean z = false;
            C286575Wy r24 = r1;
            AnonymousClass5ZZ.A0P(r24, C287195Zj.A0B(r2, 0.0f, 0.0f, 0.0f, 2.0f), C51966G9m.A0h(r1), A006, 1, C51966G9m.A0H(r1));
            AnonymousClass5ZZ.A0m(r24, C51966G9m.A0b(r1), C288035bG.A00(r1, 2131952638), 1, 16250, C51966G9m.A0H(r1));
            r1.ASN();
            r1.ASN();
            C289585dr.A00(r1, r16.A00(r2, true));
            boolean z2 = ((AnonymousClass5ZY) r1.AJO(AnonymousClass5ZW.A00)).A00;
            Modifier A0T = C51966G9m.A0T(r2);
            Modifier A082 = C287205Zk.A08(C287195Zj.A0B(A0T, 0.0f, 4.0f, 0.0f, 0.0f), 32.0f);
            if (z2) {
                j = C51967G9n.A0a(r1, 1800679847).A0q;
            } else {
                j = C51967G9n.A0a(r1, 1800682215).A0S;
            }
            C286565Wx.A0L(A0H, false);
            Modifier A0T2 = C51970G9q.A0T(r1, A082, j);
            AnonymousClass5RD A024 = C291495hO.A02(r11, r1, r12, 0);
            int A007 = C287425a7.A00(r1);
            AnonymousClass5RM A045 = C286565Wx.A04(A0H);
            Modifier A016 = C287435a8.A01(r1, A0T2);
            C51973G9u.A0z(r1, A0H, r7);
            C287595aO.A00(r1, A024, r6);
            if (C51965G9l.A1Y(r1, A0H, A045, A0w) || !C51972G9s.A1Q(r1, A007)) {
                C51971G9r.A13(r1, r4, A007);
            }
            C287595aO.A00(r1, A016, A1K);
            String A008 = C288035bG.A00(r1, 2131952619);
            Modifier A09 = C287195Zj.A09(A0T, 0.0f, 6.0f);
            AnonymousClass6CB A017 = AnonymousClass6CA.A01(r1);
            r1.ExS(1258774219);
            if (i7 == 4) {
                z = true;
            }
            Object ECw2 = r1.ECw();
            if (z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MM7(r31, 38);
                r1.FLL(ECw2);
            }
            AnonymousClass6CE.A04(r1, A09, A017, A008, C51965G9l.A0y(A0H, ECw2, false));
            r1.ASN();
            if (C51971G9r.A1R(r1)) {
                0fL.A00(-929042617);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, r31, i4, i6, 8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: X.Iw7} */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f0, code lost:
        if (r12 == X.AnonymousClass5XT.A00) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03cc, code lost:
        if (r1 == X.AnonymousClass5XT.A00) goto L_0x03ce;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r49, X.C53325GmB r50, X.C53299Gll r51, X.LRW r52, java.lang.String r53, X.0sK r54, int r55, int r56) {
        /*
            r1 = -867351819(0xffffffffcc4d42f5, float:-5.3808084E7)
            r0 = r49
            r0.ExV(r1)
            r11 = r56
            r1 = r56 & 6
            r30 = r53
            if (r1 != 0) goto L_0x0408
            r1 = r30
            int r1 = X.G9t.A0O(r0, r1)
            r1 = r1 | r56
        L_0x0018:
            r2 = r56 & 48
            r7 = r50
            if (r2 != 0) goto L_0x0023
            int r2 = X.G9t.A0F(r0, r7)
            r1 = r1 | r2
        L_0x0023:
            r2 = r11 & 384(0x180, float:5.38E-43)
            r56 = r51
            if (r2 != 0) goto L_0x0030
            r2 = r56
            int r2 = X.G9t.A0G(r0, r2)
            r1 = r1 | r2
        L_0x0030:
            r2 = r11 & 3072(0xc00, float:4.305E-42)
            r29 = 2048(0x800, float:2.87E-42)
            r53 = r55
            if (r2 != 0) goto L_0x003f
            r2 = r53
            int r2 = X.G9t.A08(r0, r2)
            r1 = r1 | r2
        L_0x003f:
            r2 = r11 & 24576(0x6000, float:3.4438E-41)
            r55 = r52
            if (r2 != 0) goto L_0x004c
            r2 = r55
            int r2 = X.G9t.A0I(r0, r2)
            r1 = r1 | r2
        L_0x004c:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r11
            r28 = 131072(0x20000, float:1.83671E-40)
            if (r2 != 0) goto L_0x005a
            r2 = r54
            int r2 = X.G9t.A0J(r0, r2)
            r1 = r1 | r2
        L_0x005a:
            r2 = 74899(0x12493, float:1.04956E-40)
            r3 = r1 & r2
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r2) goto L_0x0089
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0089
            r0.Evl()
        L_0x006d:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0088
            r10 = 1
            X.JA8 r0 = new X.JA8
            r2 = r0
            r3 = r55
            r4 = r54
            r5 = r56
            r6 = r7
            r7 = r30
            r8 = r11
            r9 = r53
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.A06 = r0
        L_0x0088:
            return
        L_0x0089:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0097
            r3 = 1741367244(0x67cb27cc, float:1.918749E24)
            java.lang.String r2 = "com.instagram.aistudio.home.view.section.CarouselItem (AiHomeCarouselSection.kt:140)"
            X.0fL.A01(r3, r2)
        L_0x0097:
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r2 = 1134493696(0x439f0000, float:318.0)
            androidx.compose.ui.Modifier r3 = X.C287205Zk.A0D(r5, r2)
            r27 = 1127743488(0x43380000, float:184.0)
            r2 = r27
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A08(r3, r2)
            r15 = 1094713344(0x41400000, float:12.0)
            X.5ZQ r14 = X.AnonymousClass5ZN.A00()
            r4 = 0
            r26 = 0
            r3 = 0
            boolean r20 = X.C51975G9x.A1M(r15)
            long r16 = X.AnonymousClass5RV.A00
            r18 = r16
            androidx.compose.ui.Modifier r2 = X.C56169Hty.A01(r13, r14, r15, r16, r18, r20)
            androidx.compose.ui.Modifier r10 = X.C51976G9y.A0B(r0, r2)
            r2 = -2066565006(0xffffffff84d2b872, float:-4.954015E-36)
            r0.ExS(r2)
            r2 = 458752(0x70000, float:6.42848E-40)
            r25 = r1 & r2
            r6 = r25
            r2 = r28
            boolean r2 = X.AnonymousClass7TF.A1S(r6, r2)
            boolean r8 = X.C51966G9m.A1U(r0, r7, r2)
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r52 = r2
            r6 = r2
            r2 = r29
            boolean r6 = X.AnonymousClass7TF.A1S(r6, r2)
            r2 = r56
            boolean r2 = X.C51968G9o.A1T(r0, r2, r8, r6)
            java.lang.Object r12 = r0.ECw()
            if (r2 != 0) goto L_0x00f2
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r12 != r2) goto L_0x0106
        L_0x00f2:
            r18 = 3
            X.Iw7 r12 = new X.Iw7
            r16 = r12
            r17 = r53
            r19 = r7
            r20 = r54
            r21 = r56
            r16.<init>((int) r17, (int) r18, (java.lang.Object) r19, (java.lang.Object) r20, (java.lang.Object) r21)
            r0.FLL(r12)
        L_0x0106:
            X.0sa r12 = (X.C62320sa) r12
            X.5Wx r2 = X.C51965G9l.A0H(r0, r4)
            r24 = 1
            r9 = r26
            r6 = r24
            androidx.compose.ui.Modifier r9 = X.C287635aW.A05(r10, r9, r9, r12, r6)
            X.5RD r8 = X.C51966G9m.A0a(r4)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r6 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r9)
            X.0sa r10 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r2, r10)
            X.0sL r9 = X.C287485aD.A03
            X.0sL r23 = X.C51969G9p.A0w(r0, r8, r6, r9)
            X.0sL r8 = X.C287485aD.A02
            boolean r6 = r2.A0K
            if (r6 != 0) goto L_0x013d
            boolean r6 = X.C51972G9s.A1Q(r0, r13)
            if (r6 != 0) goto L_0x0140
        L_0x013d:
            X.C51971G9r.A13(r0, r8, r13)
        L_0x0140:
            X.0sL r22 = X.C51966G9m.A1K(r0, r12)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A01(r5)
            X.5Zr r14 = X.C287215Zl.A00
            X.5Zx r21 = X.C287275Zs.A07
            r20 = 48
            r13 = r21
            r6 = r20
            X.5RD r6 = X.C291495hO.A02(r13, r0, r14, r6)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r12)
            X.C51973G9u.A0z(r0, r2, r10)
            X.C287595aO.A00(r0, r6, r9)
            r6 = r23
            boolean r6 = X.C51965G9l.A1Y(r0, r2, r13, r6)
            if (r6 != 0) goto L_0x0176
            boolean r6 = X.C51972G9s.A1Q(r0, r14)
            if (r6 != 0) goto L_0x0179
        L_0x0176:
            X.C51971G9r.A13(r0, r8, r14)
        L_0x0179:
            r6 = r22
            X.C287595aO.A00(r0, r12, r6)
            X.6Et r19 = X.C304676Et.A00
            X.5Zp r18 = X.C287215Zl.A04
            X.5Zu r17 = X.C287275Zs.A01
            r13 = r17
            r12 = r18
            r6 = r20
            X.5RD r6 = X.C287395a4.A02(r13, r0, r12, r6)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r14 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r5)
            X.C51973G9u.A0z(r0, r2, r10)
            X.C287595aO.A00(r0, r6, r9)
            r6 = r23
            boolean r6 = X.C51965G9l.A1Y(r0, r2, r14, r6)
            if (r6 != 0) goto L_0x01ae
            boolean r6 = X.C51972G9s.A1Q(r0, r13)
            if (r6 != 0) goto L_0x01b1
        L_0x01ae:
            X.C51971G9r.A13(r0, r8, r13)
        L_0x01b1:
            r6 = r22
            X.C287595aO.A00(r0, r12, r6)
            java.lang.String r14 = r7.A06
            X.Kp1 r6 = r7.A00
            java.lang.String r37 = r6.A01()
            java.lang.String r12 = r7.A05
            r46 = r12
            r12 = r56
            java.lang.String r12 = r12.A03
            r13 = r56
            int r13 = r13.A00
            java.lang.Integer r35 = java.lang.Integer.valueOf(r13)
            com.instagram.api.schemas.IGAIAgentType r33 = r6.A00()
            java.lang.String r41 = r6.A02()
            r6 = r56
            X.Kiw r6 = r6.A01
            int r13 = r1 >> 12
            r43 = r13 & 14
            r13 = 196608(0x30000, float:2.75506E-40)
            r43 = r43 | r13
            int r13 = r1 >> 6
            r13 = r13 & 112(0x70, float:1.57E-43)
            r43 = r43 | r13
            java.lang.String r39 = "home"
            r31 = r0
            r32 = r55
            r34 = r6
            r36 = r14
            r38 = r46
            r40 = r12
            r42 = r53
            r44 = r4
            r45 = r4
            X.HT3.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            X.4Yx r12 = r7.A01
            r6 = -1601161986(0xffffffffa09034fe, float:-2.4429616E-19)
            r0.ExS(r6)
            if (r12 != 0) goto L_0x0402
            r43 = 0
        L_0x020b:
            X.C286565Wx.A0L(r2, r4)
            java.lang.String r6 = r7.A03
            X.2DN r14 = X.C51975G9x.A0W(r0, r6)
            X.5bM r13 = X.C288075bK.A03
            androidx.compose.ui.Modifier r12 = X.C51966G9m.A0W(r5)
            r6 = 1116995584(0x42940000, float:74.0)
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A0C(r12, r6)
            X.AnonymousClass6G3.A08(r0, r6, r14, r13)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A0B(r5, r15, r3, r3, r3)
            X.5Zr r16 = X.C287215Zl.A02
            r13 = r21
            r6 = r16
            X.5RD r6 = X.C291495hO.A02(r13, r0, r6, r4)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r12)
            X.C51973G9u.A0z(r0, r2, r10)
            X.C287595aO.A00(r0, r6, r9)
            r6 = r23
            boolean r6 = X.C51965G9l.A1Y(r0, r2, r13, r6)
            if (r6 != 0) goto L_0x0251
            boolean r6 = X.C51972G9s.A1Q(r0, r14)
            if (r6 != 0) goto L_0x0254
        L_0x0251:
            X.C51971G9r.A13(r0, r8, r14)
        L_0x0254:
            r6 = r22
            X.C287595aO.A00(r0, r12, r6)
            r6 = -1382030214(0xffffffffad9fe47a, float:-1.8177671E-11)
            r0.ExS(r6)
            if (r30 == 0) goto L_0x0274
            long r37 = X.C51966G9m.A0M(r0)
            X.5Z4 r32 = X.C51966G9m.A0b(r0)
            r35 = r1 & 14
            r36 = 16250(0x3f7a, float:2.2771E-41)
            r33 = r30
            r34 = r24
            X.AnonymousClass5ZZ.A0l(r31, r32, r33, r34, r35, r36, r37)
        L_0x0274:
            X.C286565Wx.A0L(r2, r4)
            androidx.compose.ui.Modifier r15 = X.C51966G9m.A0T(r5)
            r1 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A09(r15, r3, r1)
            r14 = r17
            r13 = r18
            r6 = r20
            X.5RD r6 = X.C287395a4.A02(r14, r0, r13, r6)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r12)
            X.C51973G9u.A0z(r0, r2, r10)
            X.C287595aO.A00(r0, r6, r9)
            r6 = r23
            boolean r6 = X.C51965G9l.A1Y(r0, r2, r13, r6)
            if (r6 != 0) goto L_0x02ab
            boolean r6 = X.C51972G9s.A1Q(r0, r14)
            if (r6 != 0) goto L_0x02ae
        L_0x02ab:
            X.C51971G9r.A13(r0, r8, r14)
        L_0x02ae:
            r6 = r22
            X.C287595aO.A00(r0, r12, r6)
            r12 = 2143289344(0x7fc00000, float:NaN)
            r6 = r27
            androidx.compose.ui.Modifier r32 = X.C287205Zk.A0H(r5, r12, r6)
            long r41 = X.C51966G9m.A0H(r0)
            X.5Z4 r33 = X.C51966G9m.A0h(r0)
            r13 = 2
            r39 = 390(0x186, float:5.47E-43)
            r40 = 11128(0x2b78, float:1.5594E-41)
            r34 = r46
            r35 = r24
            r36 = r24
            r37 = r13
            r38 = r20
            X.AnonymousClass5ZZ.A0B(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r6 = -1580446935(0xffffffffa1cc4b29, float:-1.3843472E-18)
            r0.ExS(r6)
            boolean r12 = r7.A0C
            r6 = 6
            if (r12 == 0) goto L_0x02e7
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r5, r1, r3, r3, r3)
            X.AnonymousClass6FU.A00(r0, r1, r3, r6, r13)
        L_0x02e7:
            X.C286565Wx.A0L(r2, r4)
            r0.ASN()
            java.lang.String r1 = r7.A09
            r6 = -1381993160(0xffffffffada07538, float:-1.824195E-11)
            r0.ExS(r6)
            if (r1 == 0) goto L_0x030a
            long r41 = X.C51966G9m.A0H(r0)
            X.5Z4 r33 = X.C51966G9m.A0b(r0)
            androidx.compose.ui.Modifier r32 = X.C287195Zj.A0A(r5, r3, r3, r3)
            r36 = 3
            r34 = r1
            X.AnonymousClass5ZZ.A0B(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x030a:
            X.C286565Wx.A0L(r2, r4)
            r1 = -1381979306(0xffffffffada0ab56, float:-1.8265982E-11)
            r0.ExS(r1)
            if (r43 == 0) goto L_0x0330
            long r50 = X.C51966G9m.A0M(r0)
            X.5Z4 r42 = X.C51966G9m.A0b(r0)
            r49 = 11130(0x2b7a, float:1.5596E-41)
            r40 = r0
            r41 = r26
            r44 = r24
            r45 = r24
            r46 = r13
            r47 = r4
            r48 = r39
            X.AnonymousClass5ZZ.A0B(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
        L_0x0330:
            X.C51970G9q.A13(r0, r2)
            r6 = r19
            r1 = r24
            androidx.compose.ui.Modifier r1 = r6.A00(r5, r1)
            X.C289585dr.A00(r0, r1)
            X.4bM r1 = X.AnonymousClass5ZW.A00
            java.lang.Object r1 = r0.AJO(r1)
            X.5ZY r1 = (X.AnonymousClass5ZY) r1
            boolean r6 = r1.A00
            r12 = 1
            r1 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A0B(r15, r3, r1, r3, r3)
            r1 = 1107296256(0x42000000, float:32.0)
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A08(r5, r1)
            if (r6 == 0) goto L_0x03f7
            r1 = -1301751794(0xffffffffb268d80e, float:-1.35533025E-8)
            X.5Yw r1 = X.C51967G9n.A0a(r0, r1)
            long r5 = r1.A0q
        L_0x0360:
            X.C286565Wx.A0L(r2, r4)
            androidx.compose.ui.Modifier r14 = X.C51970G9q.A0T(r0, r13, r5)
            r5 = r21
            r1 = r16
            X.5RD r1 = X.C291495hO.A02(r5, r0, r1, r4)
            int r6 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r14)
            X.C51973G9u.A0z(r0, r2, r10)
            X.C287595aO.A00(r0, r1, r9)
            r1 = r23
            boolean r1 = X.C51965G9l.A1Y(r0, r2, r13, r1)
            if (r1 != 0) goto L_0x038f
            boolean r1 = X.C51972G9s.A1Q(r0, r6)
            if (r1 != 0) goto L_0x0392
        L_0x038f:
            X.C51971G9r.A13(r0, r8, r6)
        L_0x0392:
            r1 = r22
            X.C287595aO.A00(r0, r5, r1)
            r1 = 2131952618(0x7f1303ea, float:1.9541684E38)
            java.lang.String r5 = X.C288035bG.A00(r0, r1)
            r1 = 1086324736(0x40c00000, float:6.0)
            androidx.compose.ui.Modifier r8 = X.C287195Zj.A09(r15, r3, r1)
            X.6CB r6 = X.AnonymousClass6CA.A01(r0)
            r9 = -1601060433(0xffffffffa091c1af, float:-2.4692125E-19)
            r3 = r25
            r1 = r28
            boolean r1 = X.C51972G9s.A1R(r0, r9, r3, r1)
            boolean r9 = X.C51966G9m.A1U(r0, r7, r1)
            r3 = r52
            r1 = r29
            if (r3 == r1) goto L_0x03be
            r12 = 0
        L_0x03be:
            r1 = r56
            boolean r3 = X.C51968G9o.A1T(r0, r1, r9, r12)
            java.lang.Object r1 = r0.ECw()
            if (r3 != 0) goto L_0x03ce
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r1 != r3) goto L_0x03df
        L_0x03ce:
            r14 = 4
            X.Iw7 r1 = new X.Iw7
            r12 = r1
            r13 = r53
            r15 = r7
            r16 = r54
            r17 = r56
            r12.<init>((int) r13, (int) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17)
            r0.FLL(r1)
        L_0x03df:
            X.0sa r1 = X.C51965G9l.A0y(r2, r1, r4)
            X.AnonymousClass6CE.A04(r0, r8, r6, r5, r1)
            r0.ASN()
            boolean r1 = X.C51971G9r.A1R(r0)
            if (r1 == 0) goto L_0x006d
            r1 = 92991625(0x58af089, float:1.3065816E-35)
            X.0fL.A00(r1)
            goto L_0x006d
        L_0x03f7:
            r1 = -1301749426(0xffffffffb268e14e, float:-1.3555406E-8)
            X.5Yw r1 = X.C51967G9n.A0a(r0, r1)
            long r5 = r1.A0S
            goto L_0x0360
        L_0x0402:
            java.lang.String r43 = X.C52409GRk.A01(r0, r12)
            goto L_0x020b
        L_0x0408:
            r1 = r11
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56648I6d.A03(X.5Wy, X.GmB, X.Gll, X.LRW, java.lang.String, X.0sK, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v52, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: X.Iw7} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0115, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03b2, code lost:
        if (r4 == X.AnonymousClass5XT.A00) goto L_0x03b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C286575Wy r43, X.C53325GmB r44, X.C53299Gll r45, X.LRW r46, java.lang.String r47, X.0sK r48, int r49, int r50) {
        /*
            r1 = 822367769(0x31045619, float:1.925747E-9)
            r0 = r43
            r0.ExV(r1)
            r28 = r50
            r1 = r50 & 6
            r27 = r47
            if (r1 != 0) goto L_0x0454
            r1 = r27
            int r3 = X.G9t.A0O(r0, r1)
            r3 = r3 | r50
        L_0x0018:
            r1 = r50 & 48
            r11 = r44
            if (r1 != 0) goto L_0x0023
            int r1 = X.G9t.A0F(r0, r11)
            r3 = r3 | r1
        L_0x0023:
            r1 = r28
            r1 = r1 & 384(0x180, float:5.38E-43)
            r50 = r45
            if (r1 != 0) goto L_0x0032
            r1 = r50
            int r1 = X.G9t.A0G(r0, r1)
            r3 = r3 | r1
        L_0x0032:
            r1 = r28
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            r29 = 2048(0x800, float:2.87E-42)
            r47 = r49
            if (r1 != 0) goto L_0x0043
            r1 = r47
            int r1 = X.G9t.A08(r0, r1)
            r3 = r3 | r1
        L_0x0043:
            r1 = r28
            r1 = r1 & 24576(0x6000, float:3.4438E-41)
            r49 = r46
            if (r1 != 0) goto L_0x0052
            r1 = r49
            int r1 = X.G9t.A0I(r0, r1)
            r3 = r3 | r1
        L_0x0052:
            r1 = 196608(0x30000, float:2.75506E-40)
            r1 = r28 & r1
            r26 = 131072(0x20000, float:1.83671E-40)
            if (r1 != 0) goto L_0x0061
            r1 = r48
            int r1 = X.G9t.A0J(r0, r1)
            r3 = r3 | r1
        L_0x0061:
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r3
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r1) goto L_0x0090
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x0090
            r0.Evl()
        L_0x0073:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x008f
            r10 = 2
            X.JA8 r0 = new X.JA8
            r2 = r0
            r3 = r49
            r4 = r48
            r5 = r50
            r6 = r11
            r7 = r27
            r8 = r28
            r9 = r47
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.A06 = r0
        L_0x008f:
            return
        L_0x0090:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x009e
            r2 = -175425735(0xfffffffff58b3739, float:-3.5295377E32)
            java.lang.String r1 = "com.instagram.aistudio.home.view.section.CarouselItemV2 (AiHomeCarouselSection.kt:250)"
            X.0fL.A01(r2, r1)
        L_0x009e:
            X.4Yx r2 = r11.A01
            r1 = -1883188899(0xffffffff8fc0d15d, float:-1.9013306E-29)
            r0.ExS(r1)
            r6 = 0
            if (r2 != 0) goto L_0x044e
            r16 = 0
        L_0x00ab:
            X.5Wx r1 = X.C51965G9l.A0H(r0, r6)
            X.4bM r2 = X.AnonymousClass5ZW.A00
            java.lang.Object r2 = r0.AJO(r2)
            X.5ZY r2 = (X.AnonymousClass5ZY) r2
            boolean r2 = r2.A00
            r25 = r2
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            r2 = 1130233856(0x435e0000, float:222.0)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A0D(r10, r2)
            r2 = 1133182976(0x438b0000, float:278.0)
            androidx.compose.ui.Modifier r8 = X.C287205Zk.A08(r4, r2)
            r7 = 1065353216(0x3f800000, float:1.0)
            long r4 = X.C51966G9m.A0C(r0)
            X.5ZQ r2 = X.AnonymousClass5ZN.A00()
            androidx.compose.ui.Modifier r2 = X.C304816Fi.A03(r8, r2, r7, r4)
            androidx.compose.ui.Modifier r2 = X.G9w.A0H(r2)
            long r4 = X.C51966G9m.A08(r0)
            r24 = 0
            androidx.compose.ui.Modifier r7 = X.C51966G9m.A0X(r2, r4)
            r2 = -1883173522(0xffffffff8fc10d6e, float:-1.9036442E-29)
            r0.ExS(r2)
            r2 = 458752(0x70000, float:6.42848E-40)
            r23 = r3 & r2
            r4 = r23
            r2 = r26
            boolean r2 = X.AnonymousClass7TF.A1S(r4, r2)
            boolean r5 = r0.AGw(r11)
            r5 = r5 | r2
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            r46 = r2
            r4 = r2
            r2 = r29
            boolean r4 = X.AnonymousClass7TF.A1S(r4, r2)
            r2 = r50
            boolean r4 = X.C51968G9o.A1T(r0, r2, r5, r4)
            java.lang.Object r2 = r0.ECw()
            if (r4 != 0) goto L_0x0117
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r2 != r4) goto L_0x012b
        L_0x0117:
            r19 = 5
            X.Iw7 r2 = new X.Iw7
            r17 = r2
            r18 = r47
            r20 = r11
            r21 = r48
            r22 = r50
            r17.<init>((int) r18, (int) r19, (java.lang.Object) r20, (java.lang.Object) r21, (java.lang.Object) r22)
            r0.FLL(r2)
        L_0x012b:
            X.0sa r8 = X.C51965G9l.A0y(r1, r2, r6)
            r22 = 1
            r5 = r24
            r2 = r22
            androidx.compose.ui.Modifier r4 = X.C287635aW.A05(r7, r5, r5, r8, r2)
            X.5RD r7 = X.C51966G9m.A0a(r6)
            int r5 = X.C287425a7.A00(r0)
            X.5RM r2 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.0sa r9 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r1, r9)
            X.0sL r8 = X.C287485aD.A03
            X.0sL r21 = X.C51969G9p.A0w(r0, r7, r2, r8)
            X.0sL r7 = X.C287485aD.A02
            boolean r2 = r1.A0K
            if (r2 != 0) goto L_0x0160
            boolean r2 = X.C51972G9s.A1Q(r0, r5)
            if (r2 != 0) goto L_0x0163
        L_0x0160:
            X.C51971G9r.A13(r0, r7, r5)
        L_0x0163:
            X.0sL r12 = X.C51966G9m.A1K(r0, r4)
            java.lang.String r5 = r11.A06
            X.Kp1 r2 = r11.A00
            java.lang.String r36 = r2.A01()
            java.lang.String r4 = r11.A05
            r45 = r4
            r4 = r50
            java.lang.String r4 = r4.A03
            r13 = r50
            int r13 = r13.A00
            java.lang.Integer r34 = java.lang.Integer.valueOf(r13)
            com.instagram.api.schemas.IGAIAgentType r32 = r2.A00()
            java.lang.String r40 = r2.A02()
            r2 = r50
            X.Kiw r2 = r2.A01
            int r13 = r3 >> 12
            r42 = r13 & 14
            r13 = 196608(0x30000, float:2.75506E-40)
            r42 = r42 | r13
            int r13 = r3 >> 6
            r13 = r13 & 112(0x70, float:1.57E-43)
            r42 = r42 | r13
            java.lang.String r38 = "home"
            r30 = r0
            r31 = r49
            r33 = r2
            r35 = r5
            r37 = r45
            r39 = r4
            r41 = r47
            r43 = r6
            r44 = r6
            X.HT3.A00(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r4 = 1114636288(0x42700000, float:60.0)
            r2 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r10, r2, r4, r2, r2)
            X.5Zr r5 = X.C287215Zl.A00
            X.5Zx r14 = X.C287275Zs.A07
            r2 = 48
            X.5RD r2 = X.C291495hO.A02(r14, r0, r5, r2)
            int r5 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r1, r9)
            X.C287595aO.A00(r0, r2, r8)
            r2 = r21
            boolean r2 = X.C51965G9l.A1Y(r0, r1, r13, r2)
            if (r2 != 0) goto L_0x01e2
            boolean r2 = X.C51972G9s.A1Q(r0, r5)
            if (r2 != 0) goto L_0x01e5
        L_0x01e2:
            X.C51971G9r.A13(r0, r7, r5)
        L_0x01e5:
            X.C287595aO.A00(r0, r4, r12)
            X.6Et r20 = X.C304676Et.A00
            androidx.compose.ui.Modifier r4 = X.C51966G9m.A0W(r10)
            r2 = 1119879168(0x42c00000, float:96.0)
            androidx.compose.ui.Modifier r5 = X.C287205Zk.A0C(r4, r2)
            java.lang.String r2 = r11.A03
            X.2DN r4 = X.C51975G9x.A0W(r0, r2)
            r2 = 0
            X.AnonymousClass6G3.A03(r0, r5, r4)
            r4 = -1364622289(0xffffffffaea9842f, float:-7.708711E-11)
            r0.ExS(r4)
            if (r27 == 0) goto L_0x02a7
            r19 = 1086324736(0x40c00000, float:6.0)
            r5 = 1090519040(0x41000000, float:8.0)
            r4 = r19
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r10, r2, r5, r4, r2)
            X.5Zr r13 = X.C287215Zl.A02
            X.5RD r18 = X.C291495hO.A02(r14, r0, r13, r6)
            int r15 = X.C287425a7.A00(r0)
            X.5RM r5 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r17 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r1, r9)
            r4 = r18
            X.C287595aO.A00(r0, r4, r8)
            r4 = r21
            boolean r4 = X.C51965G9l.A1Y(r0, r1, r5, r4)
            if (r4 != 0) goto L_0x0238
            boolean r4 = X.C51972G9s.A1Q(r0, r15)
            if (r4 != 0) goto L_0x023b
        L_0x0238:
            X.C51971G9r.A13(r0, r7, r15)
        L_0x023b:
            r4 = r17
            X.C287595aO.A00(r0, r4, r12)
            if (r25 == 0) goto L_0x0440
            r4 = 99716744(0x5f18e88, float:2.2715889E-35)
            X.5Yw r4 = X.C51967G9n.A0a(r0, r4)
            long r4 = r4.A0q
            X.C286565Wx.A0L(r1, r6)
        L_0x024e:
            r15 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r15 = X.C51969G9p.A0X(r10, r15, r4)
            r5 = 1085276160(0x40b00000, float:5.5)
            r4 = r19
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A09(r15, r4, r5)
            X.5RD r15 = X.C291495hO.A02(r14, r0, r13, r6)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r1, r9)
            X.C287595aO.A00(r0, r15, r8)
            r4 = r21
            boolean r4 = X.C51965G9l.A1Y(r0, r1, r13, r4)
            if (r4 != 0) goto L_0x0280
            boolean r4 = X.C51972G9s.A1Q(r0, r14)
            if (r4 != 0) goto L_0x0283
        L_0x0280:
            X.C51971G9r.A13(r0, r7, r14)
        L_0x0283:
            X.C287595aO.A00(r0, r5, r12)
            long r40 = X.C51966G9m.A0M(r0)
            X.5Z4 r32 = X.C51966G9m.A0f(r0)
            r36 = 2
            r34 = 3
            r37 = r3 & 14
            r38 = 390(0x186, float:5.47E-43)
            r39 = 11130(0x2b7a, float:1.5596E-41)
            r31 = r24
            r33 = r27
            r35 = r22
            X.AnonymousClass5ZZ.A0B(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r0.ASN()
            r0.ASN()
        L_0x02a7:
            X.C286565Wx.A0L(r1, r6)
            androidx.compose.ui.Modifier r18 = X.C51966G9m.A0T(r10)
            r4 = 1073741824(0x40000000, float:2.0)
            r3 = r18
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A09(r3, r2, r4)
            X.5Zp r13 = X.C287215Zl.A04
            X.5a0 r17 = X.C287275Zs.A02
            r3 = r17
            X.5RD r3 = X.C287395a4.A00(r3, r0, r13)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r5)
            X.C51973G9u.A0z(r0, r1, r9)
            X.C287595aO.A00(r0, r3, r8)
            r3 = r21
            boolean r3 = X.C51965G9l.A1Y(r0, r1, r13, r3)
            if (r3 != 0) goto L_0x02e0
            boolean r3 = X.C51972G9s.A1Q(r0, r14)
            if (r3 != 0) goto L_0x02e3
        L_0x02e0:
            X.C51971G9r.A13(r0, r7, r14)
        L_0x02e3:
            X.C287595aO.A00(r0, r5, r12)
            r5 = 1127088128(0x432e0000, float:174.0)
            r3 = 2143289344(0x7fc00000, float:NaN)
            androidx.compose.ui.Modifier r31 = X.C287205Zk.A0H(r10, r3, r5)
            long r34 = X.C51966G9m.A0H(r0)
            X.5Z4 r32 = X.C51966G9m.A0h(r0)
            r33 = r45
            X.AnonymousClass5ZZ.A0T(r30, r31, r32, r33, r34)
            r3 = 2093180423(0x7cc36607, float:8.116538E36)
            r0.ExS(r3)
            boolean r3 = r11.A0C
            if (r3 == 0) goto L_0x030e
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A0B(r10, r4, r2, r2, r2)
            r4 = 2
            r3 = 6
            X.AnonymousClass6FU.A00(r0, r5, r2, r3, r4)
        L_0x030e:
            X.C286565Wx.A0L(r1, r6)
            r0.ASN()
            r3 = -1364563104(0xffffffffaeaa6b60, float:-7.7497786E-11)
            r0.ExS(r3)
            if (r16 == 0) goto L_0x0329
            long r3 = X.C51966G9m.A0M(r0)
            X.5Z4 r13 = X.C51966G9m.A0b(r0)
            r5 = r16
            X.AnonymousClass5ZZ.A0v(r0, r13, r5, r3)
        L_0x0329:
            X.C286565Wx.A0L(r1, r6)
            r19 = 2
            r4 = r20
            r3 = r22
            androidx.compose.ui.Modifier r3 = r4.A00(r10, r3)
            X.C289585dr.A00(r0, r3)
            r5 = 1
            r4 = 1107820544(0x42080000, float:34.0)
            r3 = r18
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A08(r3, r4)
            if (r25 == 0) goto L_0x0435
            r3 = -1364542198(0xffffffffaeaabd0a, float:-7.764285E-11)
            X.5Yw r3 = X.C51967G9n.A0a(r0, r3)
            long r3 = r3.A0q
        L_0x034d:
            X.C286565Wx.A0L(r1, r6)
            androidx.compose.ui.Modifier r4 = X.C51970G9q.A0T(r0, r13, r3)
            X.5Zr r13 = X.C287215Zl.A02
            r14 = 6
            r3 = r17
            X.5RD r3 = X.C291495hO.A02(r3, r0, r13, r14)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r15 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r1, r9)
            X.C287595aO.A00(r0, r3, r8)
            r3 = r21
            boolean r3 = X.C51965G9l.A1Y(r0, r1, r15, r3)
            if (r3 != 0) goto L_0x037d
            boolean r3 = X.C51972G9s.A1Q(r0, r13)
            if (r3 != 0) goto L_0x0380
        L_0x037d:
            X.C51971G9r.A13(r0, r7, r13)
        L_0x0380:
            X.C287595aO.A00(r0, r4, r12)
            r3 = 2131952618(0x7f1303ea, float:1.9541684E38)
            java.lang.String r16 = X.C288035bG.A00(r0, r3)
            X.6CB r15 = X.AnonymousClass6CA.A01(r0)
            r13 = 2093220907(0x7cc4042b, float:8.142198E36)
            r4 = r23
            r3 = r26
            boolean r3 = X.C51972G9s.A1R(r0, r13, r4, r3)
            boolean r13 = X.C51966G9m.A1U(r0, r11, r3)
            r4 = r46
            r3 = r29
            if (r4 == r3) goto L_0x03a4
            r5 = 0
        L_0x03a4:
            r3 = r50
            boolean r3 = X.C51968G9o.A1T(r0, r3, r13, r5)
            java.lang.Object r4 = r0.ECw()
            if (r3 != 0) goto L_0x03b4
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r4 != r3) goto L_0x03c8
        L_0x03b4:
            X.Iw7 r4 = new X.Iw7
            r29 = r4
            r30 = r47
            r31 = r14
            r32 = r11
            r33 = r48
            r34 = r50
            r29.<init>((int) r30, (int) r31, (java.lang.Object) r32, (java.lang.Object) r33, (java.lang.Object) r34)
            r0.FLL(r4)
        L_0x03c8:
            X.0sa r5 = X.C51965G9l.A0y(r1, r4, r6)
            r4 = r18
            r3 = r16
            X.AnonymousClass6CE.A04(r0, r4, r15, r3, r5)
            r0.ASN()
            r0.ASN()
            r3 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r10, r3, r3, r3, r2)
            X.5Zp r3 = X.C287215Zl.A05
            r2 = r17
            X.5RD r2 = X.C287395a4.A02(r2, r0, r3, r14)
            int r5 = X.C287425a7.A00(r0)
            X.5RM r4 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r0, r10)
            X.C51973G9u.A0z(r0, r1, r9)
            X.C287595aO.A00(r0, r2, r8)
            r2 = r21
            boolean r1 = X.C51965G9l.A1Y(r0, r1, r4, r2)
            if (r1 != 0) goto L_0x0407
            boolean r1 = X.C51972G9s.A1Q(r0, r5)
            if (r1 != 0) goto L_0x040a
        L_0x0407:
            X.C51971G9r.A13(r0, r7, r5)
        L_0x040a:
            X.C287595aO.A00(r0, r3, r12)
            java.lang.String r1 = r11.A09
            if (r1 != 0) goto L_0x0413
            java.lang.String r1 = ""
        L_0x0413:
            X.5Z4 r15 = X.C51966G9m.A0b(r0)
            long r20 = X.C51966G9m.A0A(r0)
            r17 = 3
            r18 = 3072(0xc00, float:4.305E-42)
            r14 = r0
            r16 = r1
            r22 = r6
            X.HT0.A00(r14, r15, r16, r17, r18, r19, r20, r22)
            boolean r1 = X.C51971G9r.A1R(r0)
            if (r1 == 0) goto L_0x0073
            r1 = -1746470419(0xffffffff97e6f9ed, float:-1.4926492E-24)
            X.0fL.A00(r1)
            goto L_0x0073
        L_0x0435:
            r3 = -1364539830(0xffffffffaeaac64a, float:-7.765928E-11)
            X.5Yw r3 = X.C51967G9n.A0a(r0, r3)
            long r3 = r3.A0S
            goto L_0x034d
        L_0x0440:
            r4 = 99719240(0x5f19848, float:2.271947E-35)
            X.5Yw r4 = X.C51967G9n.A0a(r0, r4)
            long r4 = r4.A0S
            X.C286565Wx.A0L(r1, r6)
            goto L_0x024e
        L_0x044e:
            java.lang.String r16 = X.C52409GRk.A01(r0, r2)
            goto L_0x00ab
        L_0x0454:
            r3 = r28
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56648I6d.A04(X.5Wy, X.GmB, X.Gll, X.LRW, java.lang.String, X.0sK, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: X.Iw7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: X.Iw7} */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e0, code lost:
        if (r4 == X.AnonymousClass5XT.A00) goto L_0x00e2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C286575Wy r32, X.C53325GmB r33, X.C53299Gll r34, X.LRW r35, java.lang.String r36, X.0sK r37, int r38, int r39) {
        /*
            r1 = -1937402394(0xffffffff8c8595e6, float:-2.0582111E-31)
            r0 = r32
            r0.ExV(r1)
            r8 = r39
            r1 = r39 & 6
            r20 = r36
            if (r1 != 0) goto L_0x0298
            r1 = r20
            int r1 = X.G9t.A0O(r0, r1)
            r1 = r1 | r39
        L_0x0018:
            r2 = r39 & 48
            r7 = r33
            if (r2 != 0) goto L_0x0023
            int r2 = X.G9t.A0F(r0, r7)
            r1 = r1 | r2
        L_0x0023:
            r2 = r8 & 384(0x180, float:5.38E-43)
            r39 = r34
            if (r2 != 0) goto L_0x0030
            r2 = r39
            int r2 = X.G9t.A0G(r0, r2)
            r1 = r1 | r2
        L_0x0030:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            r3 = 2048(0x800, float:2.87E-42)
            r32 = r38
            if (r2 != 0) goto L_0x003f
            r2 = r32
            int r2 = X.G9t.A08(r0, r2)
            r1 = r1 | r2
        L_0x003f:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            r38 = r35
            if (r2 != 0) goto L_0x004c
            r2 = r38
            int r2 = X.G9t.A0I(r0, r2)
            r1 = r1 | r2
        L_0x004c:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r8
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r2 != 0) goto L_0x005a
            r2 = r37
            int r2 = X.G9t.A0J(r0, r2)
            r1 = r1 | r2
        L_0x005a:
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r2) goto L_0x0087
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0087
            r0.Evl()
        L_0x006c:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0086
            r10 = 3
            X.JA8 r0 = new X.JA8
            r2 = r0
            r3 = r38
            r4 = r37
            r5 = r39
            r6 = r7
            r7 = r20
            r9 = r32
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.A06 = r0
        L_0x0086:
            return
        L_0x0087:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0095
            r5 = -1788885504(0xffffffff955fc600, float:-4.5190686E-26)
            java.lang.String r2 = "com.instagram.aistudio.home.view.section.LargeCardItem (AiHomeCarouselSection.kt:496)"
            X.0fL.A01(r5, r2)
        L_0x0095:
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            r19 = 1094713344(0x41400000, float:12.0)
            X.5ZQ r11 = X.AnonymousClass5ZN.A00()
            r6 = 0
            r2 = 0
            boolean r17 = X.C51975G9x.A1M(r19)
            long r13 = X.AnonymousClass5RV.A00
            r12 = r19
            r15 = r13
            androidx.compose.ui.Modifier r5 = X.C56169Hty.A01(r10, r11, r12, r13, r15, r17)
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r5 = X.C54739HQw.A00(r5, r15, r6)
            androidx.compose.ui.Modifier r5 = X.C51976G9y.A0B(r0, r5)
            r9 = 1103101952(0x41c00000, float:24.0)
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A07(r5, r9)
            r11 = 1312309737(0x4e3841e9, float:7.7283181E8)
            r0.ExS(r11)
            r11 = 458752(0x70000, float:6.42848E-40)
            boolean r4 = X.C51972G9s.A1P(r11, r1, r4)
            boolean r11 = X.C51966G9m.A1U(r0, r7, r4)
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            boolean r4 = X.AnonymousClass7TF.A1S(r4, r3)
            r3 = r39
            boolean r3 = X.C51968G9o.A1T(r0, r3, r11, r4)
            java.lang.Object r4 = r0.ECw()
            if (r3 != 0) goto L_0x00e2
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r4 != r3) goto L_0x00f6
        L_0x00e2:
            r23 = 7
            X.Iw7 r4 = new X.Iw7
            r21 = r4
            r22 = r32
            r24 = r7
            r25 = r37
            r26 = r39
            r21.<init>((int) r22, (int) r23, (java.lang.Object) r24, (java.lang.Object) r25, (java.lang.Object) r26)
            r0.FLL(r4)
        L_0x00f6:
            X.0sa r4 = (X.C62320sa) r4
            X.5Wx r3 = X.C51965G9l.A0H(r0, r6)
            androidx.compose.ui.Modifier r5 = X.C287635aW.A06(r5, r4)
            X.5Zr r4 = X.C287215Zl.A00
            X.5RD r14 = X.C51970G9q.A0Z(r0, r4)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r11 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r5)
            X.0sa r18 = X.C287485aD.A00
            r4 = r18
            X.C51973G9u.A0z(r0, r3, r4)
            X.0sL r5 = X.C287485aD.A03
            X.0sL r17 = X.C51969G9p.A0w(r0, r14, r11, r5)
            X.0sL r4 = X.C287485aD.A02
            boolean r11 = r3.A0K
            if (r11 != 0) goto L_0x012b
            boolean r11 = X.C51972G9s.A1Q(r0, r13)
            if (r11 != 0) goto L_0x012e
        L_0x012b:
            X.C51971G9r.A13(r0, r4, r13)
        L_0x012e:
            X.0sL r16 = X.C51966G9m.A1K(r0, r12)
            java.lang.String r11 = r7.A06
            r14 = r11
            X.Kp1 r11 = r7.A00
            java.lang.String r27 = r11.A01()
            java.lang.String r12 = r7.A05
            r36 = r12
            r12 = r39
            java.lang.String r12 = r12.A03
            r13 = r39
            int r13 = r13.A00
            java.lang.Integer r25 = java.lang.Integer.valueOf(r13)
            com.instagram.api.schemas.IGAIAgentType r23 = r11.A00()
            java.lang.String r31 = r11.A02()
            r11 = r39
            X.Kiw r11 = r11.A01
            int r13 = r1 >> 12
            r33 = r13 & 14
            r13 = 196608(0x30000, float:2.75506E-40)
            r33 = r33 | r13
            int r13 = r1 >> 6
            r13 = r13 & 112(0x70, float:1.57E-43)
            r33 = r33 | r13
            java.lang.String r29 = "home"
            r22 = r38
            r24 = r11
            r26 = r14
            r28 = r36
            r30 = r12
            r34 = r6
            r35 = r6
            r21 = r0
            X.HT3.A00(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.4Yx r12 = r7.A01
            r11 = 1866513399(0x6f40bbf7, float:5.9648357E28)
            r0.ExS(r11)
            if (r12 != 0) goto L_0x0292
            r28 = 0
        L_0x0186:
            X.C286565Wx.A0L(r3, r6)
            androidx.compose.ui.Modifier r9 = X.C287195Zj.A0B(r10, r2, r9, r2, r2)
            androidx.compose.ui.Alignment r11 = X.C287215Zl.A0C
            X.5RD r14 = X.C287675aa.A00(r11, r6)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r12 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r9)
            r9 = r18
            X.C51973G9u.A0z(r0, r3, r9)
            X.C287595aO.A00(r0, r14, r5)
            r9 = r17
            boolean r9 = X.C51965G9l.A1Y(r0, r3, r12, r9)
            if (r9 != 0) goto L_0x01b5
            boolean r9 = X.C51972G9s.A1Q(r0, r13)
            if (r9 != 0) goto L_0x01b8
        L_0x01b5:
            X.C51971G9r.A13(r0, r4, r13)
        L_0x01b8:
            r9 = r16
            X.C287595aO.A00(r0, r11, r9)
            java.lang.String r12 = r7.A07
            r9 = -1056964608(0xffffffffc1000000, float:-8.0)
            androidx.compose.ui.Modifier r11 = X.C56164Htt.A00(r10, r2, r9)
            androidx.compose.ui.ZIndexElement r9 = new androidx.compose.ui.ZIndexElement
            r9.<init>(r15)
            androidx.compose.ui.Modifier r11 = r11.Ezh(r9)
            r9 = 6
            A00(r0, r11, r12, r9, r6)
            java.lang.String r11 = r7.A03
            X.2DN r13 = X.C51975G9x.A0W(r0, r11)
            X.5bM r12 = X.C288075bK.A03
            androidx.compose.ui.Modifier r14 = X.C51966G9m.A0W(r10)
            r11 = 1124859904(0x430c0000, float:140.0)
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A0C(r14, r11)
            X.AnonymousClass6G3.A08(r0, r11, r13, r12)
            r0.ASN()
            r11 = 1866530002(0x6f40fcd2, float:5.9726763E28)
            r0.ExS(r11)
            if (r20 == 0) goto L_0x0209
            long r26 = X.C51966G9m.A0M(r0)
            X.5Z4 r23 = X.C51966G9m.A0c(r0)
            r11 = r19
            androidx.compose.ui.Modifier r22 = X.C287195Zj.A0B(r10, r2, r11, r2, r2)
            r1 = r1 & 14
            r25 = r1 | 48
            r24 = r20
            X.AnonymousClass5ZZ.A0O(r21, r22, r23, r24, r25, r26)
        L_0x0209:
            X.C286565Wx.A0L(r3, r6)
            androidx.compose.ui.Modifier r1 = X.C51966G9m.A0T(r10)
            androidx.compose.ui.Modifier r11 = X.C51967G9n.A0H(r1, r2)
            X.5Zp r12 = X.C287215Zl.A04
            X.5a0 r1 = X.C287275Zs.A02
            X.5RD r14 = X.C287395a4.A00(r1, r0, r12)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r13 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r11)
            r1 = r18
            X.C51973G9u.A0z(r0, r3, r1)
            X.C287595aO.A00(r0, r14, r5)
            r1 = r17
            boolean r1 = X.C51965G9l.A1Y(r0, r3, r13, r1)
            if (r1 != 0) goto L_0x023e
            boolean r1 = X.C51972G9s.A1Q(r0, r12)
            if (r1 != 0) goto L_0x0241
        L_0x023e:
            X.C51971G9r.A13(r0, r4, r12)
        L_0x0241:
            r1 = r16
            X.C287595aO.A00(r0, r11, r1)
            long r4 = X.C51966G9m.A0H(r0)
            X.5Z4 r11 = X.C51966G9m.A0d(r0)
            r1 = r36
            X.AnonymousClass5ZZ.A0u(r0, r11, r1, r4)
            r1 = -216497077(0xfffffffff318844b, float:-1.2083623E31)
            r0.ExS(r1)
            boolean r1 = r7.A0C
            if (r1 == 0) goto L_0x0267
            r4 = 2
            r1 = 1073741824(0x40000000, float:2.0)
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A0B(r10, r1, r2, r2, r2)
            X.AnonymousClass6FU.A00(r0, r1, r2, r9, r4)
        L_0x0267:
            X.C286565Wx.A0L(r3, r6)
            r0.ASN()
            r1 = 1866558777(0x6f416d39, float:5.986265E28)
            r0.ExS(r1)
            if (r28 == 0) goto L_0x0284
            long r29 = X.C51966G9m.A0M(r0)
            X.5Z4 r27 = X.C51966G9m.A0c(r0)
            r25 = r0
            r26 = r10
            X.AnonymousClass5ZZ.A0S(r25, r26, r27, r28, r29)
        L_0x0284:
            boolean r1 = X.C51971G9r.A1S(r0, r3, r6)
            if (r1 == 0) goto L_0x006c
            r1 = 1654724859(0x62a118fb, float:1.4858629E21)
            X.0fL.A00(r1)
            goto L_0x006c
        L_0x0292:
            java.lang.String r28 = X.C52409GRk.A01(r0, r12)
            goto L_0x0186
        L_0x0298:
            r1 = r8
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56648I6d.A05(X.5Wy, X.GmB, X.Gll, X.LRW, java.lang.String, X.0sK, int, int):void");
    }

    public static final void A06(C62320sa r32, C286575Wy r33, int i) {
        int i2;
        long j;
        C286575Wy r3 = r33;
        r3.ExV(-1376041304);
        int i3 = i;
        C62320sa r9 = r32;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r3, r9) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1782280494, "com.instagram.aistudio.home.view.section.CarouselCreateCardV2 (AiHomeCarouselSection.kt:427)");
            }
            boolean z = ((AnonymousClass5ZY) r3.AJO(AnonymousClass5ZW.A00)).A00;
            C285245Qk r2 = Modifier.A00;
            Modifier A0X = C51966G9m.A0X(G9w.A0H(C304816Fi.A03(C287205Zk.A08(C287205Zk.A0D(r2, 222.0f), 278.0f), AnonymousClass5ZN.A00(), 1.0f, C51966G9m.A0C(r3))), C51966G9m.A08(r3));
            r3.ExS(-2093577046);
            int i4 = i2 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i4, 4);
            Object ECw = r3.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new MM7(r9, 39);
                r3.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r3, false);
            Modifier A05 = C287635aW.A05(A0X, (C287625aV) null, (String) null, (C62320sa) ECw, true);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r3);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r3, A05);
            C62320sa r8 = C287485aD.A00;
            C51973G9u.A0z(r3, A0H, r8);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r3, A0a, A04, r7);
            0sL r4 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r3, A00)) {
                C51971G9r.A13(r3, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r3, A01);
            Modifier A0B = C287195Zj.A0B(r2, 16.0f, 32.0f, 16.0f, 16.0f);
            AnonymousClass5RD A0Z = C51970G9q.A0Z(r3, C287215Zl.A00);
            int A002 = C287425a7.A00(r3);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r3, A0B);
            C51973G9u.A0z(r3, A0H, r8);
            C287595aO.A00(r3, A0Z, r7);
            if (C51965G9l.A1Y(r3, A0H, A042, A0w) || !C51972G9s.A1Q(r3, A002)) {
                C51971G9r.A13(r3, r4, A002);
            }
            C287595aO.A00(r3, A012, A1K);
            C304676Et r13 = C304676Et.A00;
            AnonymousClass6G3.A05(r3, C287205Zk.A0C(r2, 96.0f), C287975bA.A00(r3, R.drawable.instagram_illustrations_product_illustration_pi_plus_ai_home_96x96, 0));
            String A003 = C288035bG.A00(r3, 2131952639);
            long A0H2 = C51966G9m.A0H(r3);
            C286575Wy r29 = r3;
            AnonymousClass5ZZ.A0T(r29, C51967G9n.A0H(r2, 0.0f), C51966G9m.A0h(r3), A003, A0H2);
            C286575Wy r20 = r3;
            AnonymousClass5ZZ.A0B(r20, (Modifier) null, C51966G9m.A0b(r3), C288035bG.A00(r3, 2131952638), 3, 3, 2, 0, 390, 11130, C51966G9m.A0M(r3));
            C289585dr.A00(r3, r13.A00(r2, true));
            Modifier A0T = C51966G9m.A0T(r2);
            Modifier A08 = C287205Zk.A08(A0T, 34.0f);
            if (z) {
                j = C51967G9n.A0a(r3, -884615037).A0q;
            } else {
                j = C51967G9n.A0a(r3, -884612669).A0S;
            }
            C286565Wx.A0L(A0H, false);
            Modifier A0T2 = C51970G9q.A0T(r3, A08, j);
            AnonymousClass5RD A0L = G9w.A0L(C287275Zs.A02, r3);
            int A004 = C287425a7.A00(r3);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r3, A0T2);
            C51973G9u.A0z(r3, A0H, r8);
            C287595aO.A00(r3, A0L, r7);
            if (C51965G9l.A1Y(r3, A0H, A043, A0w) || !C51972G9s.A1Q(r3, A004)) {
                C51971G9r.A13(r3, r4, A004);
            }
            C287595aO.A00(r3, A013, A1K);
            String A005 = C288035bG.A00(r3, 2131952619);
            AnonymousClass6CB A014 = AnonymousClass6CA.A01(r3);
            r3.ExS(1365426983);
            boolean A1V = C51970G9q.A1V(i4);
            Object ECw2 = r3.ECw();
            if (A1V || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new MM7(r9, 40);
                r3.FLL(ECw2);
            }
            AnonymousClass6CE.A04(r3, A0T, A014, A005, C51965G9l.A0y(A0H, ECw2, false));
            r3.ASN();
            if (C51971G9r.A1R(r3)) {
                0fL.A00(969320069);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r9, i3, 15);
        }
    }
}
