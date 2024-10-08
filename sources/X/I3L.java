package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;

public abstract class I3L {
    public static final void A00(C286575Wy r20, C61046Jvk jvk, JRL jrl, C62320sa r23, C62320sa r24, 0sP r25, int i, boolean z) {
        int i2;
        C61046Jvk jvk2 = jvk;
        0qQ.A0B(jvk2, 0);
        C62320sa r9 = r23;
        C62320sa r8 = r24;
        0sP r7 = r25;
        AnonymousClass7TG.A1U(r9, r7, r8);
        JRL jrl2 = jrl;
        0qQ.A0B(jrl2, 5);
        C286575Wy r6 = r20;
        r6.ExV(-894383771);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r6, jvk2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r6, r9);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r6, r7);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r6, r8);
        }
        boolean z2 = z;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0c(r6, z2);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r6, jrl2);
        }
        if ((74899 & i2) != 74898 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(207615995, "instagram.features.clips.spins.participation.ui.ClipsSpinsAddSpinBottomSheetContent (ClipsSpinsAddSpinBottomSheetContent.kt:41)");
            }
            C285245Qk r11 = Modifier.A00;
            Modifier A0G = C51967G9n.A0G(C51966G9m.A0X(r11, C51966G9m.A08(r6)), 8.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r6, 0);
            int A00 = C287425a7.A00(r6);
            C286565Wx r14 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r14);
            Modifier A01 = C287435a8.A01(r6, A0G);
            C51973G9u.A0y(r6, r14);
            C51971G9r.A12(r6, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r14.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            C304676Et r12 = C304676Et.A00;
            A01(r6, jrl2, (i2 >> 15) & 14);
            int i4 = i2 >> 6;
            boolean z3 = false;
            C286575Wy r17 = r6;
            A02(r17, jrl2, r8, r7, C51971G9r.A04(i4) | (i4 & 7168), z2);
            String A002 = C304346Dc.A00(r6, 2131960992);
            Modifier A0S = C51966G9m.A0S(r12, C51966G9m.A0V(C287195Zj.A08(r11, 16.0f)));
            String str = jvk2.A00;
            if (str == null || str.length() == 0) {
                z3 = true;
            }
            C52399GQy A0m = C51965G9l.A0m(r6);
            AnonymousClass6CE.A00((C287605aT) null, r17, A0S, (AnonymousClass6CG) null, AnonymousClass6CD.LARGE, A0m, A002, r23, ((i2 >> 3) & 14) | 1572864, 392, !z3, false);
            if (C51967G9n.A1R(r6)) {
                0fL.A00(-1177213514);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA0(jvk2, r9, r7, r8, jrl2, i3, 6, z2);
        }
    }

    public static final void A01(C286575Wy r5, JRL jrl, int i) {
        int i2;
        r5.ExV(-1504320471);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r5, jrl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-56366559, "instagram.features.clips.spins.participation.ui.Title (ClipsSpinsAddSpinBottomSheetContent.kt:61)");
            }
            Modifier A0V = C51966G9m.A0V(C51967G9n.A0G(Modifier.A00, 8.0f));
            AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A09, false);
            int A002 = C287425a7.A00(r5);
            C286565Wx r3 = (C286565Wx) r5;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r5, A0V);
            C51973G9u.A0y(r5, r3);
            C51971G9r.A12(r5, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r5, A002)) {
                C51971G9r.A13(r5, r1, A002);
            }
            C51965G9l.A18(r5, A01);
            AnonymousClass5ZZ.A0r(r5, C51965G9l.A0S(r5), C304346Dc.A00(r5, jrl.AZT()), C51966G9m.A0H(r5));
            if (C51967G9n.A1R(r5)) {
                0fL.A00(249087845);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, jrl, i, 22);
        }
    }

    public static final void A02(C286575Wy r21, JRL jrl, C62320sa r23, 0sP r24, int i, boolean z) {
        int i2;
        C286575Wy r3 = r21;
        r3.ExV(-361604527);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r3, r24) | i;
        } else {
            i2 = i3;
        }
        int i4 = i & 48;
        C62320sa r25 = r23;
        if (i4 == 0) {
            i2 |= G9t.A0F(r3, r25);
        }
        boolean z2 = z;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0a(r3, z2);
        }
        JRL jrl2 = jrl;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r3, jrl2);
        }
        if ((i2 & 1171) != 1170 || !r3.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(503086855, "instagram.features.clips.spins.participation.ui.SpinTextInput (ClipsSpinsAddSpinBottomSheetContent.kt:76)");
            }
            Object A0m = C51967G9n.A0m(r3, -1461162134);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r3, "");
            }
            C284945Oz r11 = (C284945Oz) A0m;
            C286565Wx r1 = (C286565Wx) r3;
            C286565Wx.A0L(r1, false);
            C56547I1b i1b = (C56547I1b) C51976G9y.A0I(r3, obj, -1461160120);
            C286565Wx.A0L(r1, false);
            C285245Qk r12 = Modifier.A00;
            FillElement fillElement = C287205Zk.A02;
            Modifier Ezh = r12.Ezh(fillElement);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r3, 0);
            int A00 = C287425a7.A00(r3);
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r3, Ezh);
            C51973G9u.A0y(r3, r1);
            C51971G9r.A12(r3, A0Z, A04);
            0sL r13 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r3, A00)) {
                C51971G9r.A13(r3, r13, A00);
            }
            C51965G9l.A18(r3, A01);
            String A1A = C51966G9m.A1A(r11);
            String A002 = C304346Dc.A00(r3, jrl2.AZS());
            Modifier A0U = C51970G9q.A0U(r12, i1b);
            boolean z3 = true;
            Modifier Ezh2 = A0U.Ezh(fillElement);
            boolean A1X = C51974G9v.A1X(r3, -87929804, i2);
            Object ECw = r3.ECw();
            if (A1X || ECw == obj) {
                ECw = J6R.A00(r11, r24, 14);
                r3.FLL(ECw);
            }
            I7P.A05(r3, Ezh2, (C59485JLj) null, false, A1A, A002, C51965G9l.A0z(r1, ECw), 3, 1572864, 48, 63408);
            C286025Tq A003 = HXA.A00(r3, jrl2.AZR(z2));
            r3.ExS(-87914553);
            if ((i2 & 112) != 32) {
                z3 = false;
            }
            Object ECw2 = r3.ECw();
            if (z3 || ECw2 == obj) {
                ECw2 = C59097J6f.A01(r25, 37);
                r3.FLL(ECw2);
            }
            I2Y.A01(r3, (Modifier) null, A003, C51965G9l.A0z(r1, ECw2), 0, 2);
            r3.ASN();
            C60340gF r6 = C60340gF.A00;
            Object A0m2 = C51967G9n.A0m(r3, -1461135980);
            if (A0m2 == obj) {
                A0m2 = new C58092ImE(i1b, (AnonymousClass4D7) null, 16);
                r3.FLL(A0m2);
            }
            if (C51972G9s.A1S(r3, r1, A0m2, r6)) {
                0fL.A00(2109433766);
            }
        } else {
            r3.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8U(r25, r24, jrl2, i3, 11, z2);
        }
    }
}
