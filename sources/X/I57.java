package X;

import androidx.compose.ui.Modifier;

public abstract class I57 {
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2YM] */
    public static final void A03(C286575Wy r12, C15050ULg uLg, C62320sa r14, int i, int i2, boolean z) {
        boolean z2 = z;
        C62320sa r9 = r14;
        0qQ.A0B(r14, 2);
        r12.ExV(1570985303);
        int i3 = i2;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if (0fL.A02()) {
            0fL.A01(206872969, "com.instagram.schools.channels.ui.SchoolChannelsComponent (SchoolChannelsComponent.kt:30)");
        }
        ? obj = new Object();
        AnonymousClass07g A0P = C51975G9x.A0P(r12);
        if (A0P != null) {
            r12.ExT(-1439476281);
            H2X A00 = C54765HRx.A00(obj, A0P, C51975G9x.A0Q(A0P), H2X.class, "school_channels");
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            C286565Wx.A0L(A0H, false);
            H2X h2x = A00;
            C15050ULg uLg2 = uLg;
            int i4 = i;
            if (uLg != null) {
                r12.ExS(634127027);
                if (z2) {
                    r12.ExS(634155113);
                    A01(r12, uLg, h2x, 64);
                } else {
                    r12.ExS(634245106);
                    A02(r12, uLg, r14, ((i >> 3) & 112) | 8);
                }
                C286565Wx.A0L(A0H, false);
            } else {
                r12.ExS(634358690);
                A00(r12, 0);
            }
            if (C51967G9n.A1b(A0H, false)) {
                0fL.A00(124765550);
            }
            C286625Xd ASQ = r12.ASQ();
            if (ASQ != null) {
                ASQ.A06 = new J8R(i4, i3, 11, r9, uLg2, z2);
                return;
            }
            return;
        }
        throw G9w.A0e();
    }

    public static final void A00(C286575Wy r6, int i) {
        r6.ExV(1861725938);
        if (i != 0 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1662281972, "com.instagram.schools.channels.ui.ShimmerChannels (SchoolChannelsComponent.kt:87)");
            }
            Modifier A04 = C287195Zj.A04(C51969G9p.A0U());
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r6, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r6);
            C286565Wx r3 = (C286565Wx) r6;
            AnonymousClass5RM A042 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r6, A04);
            C51973G9u.A0y(r6, r3);
            C51971G9r.A12(r6, A02, A042);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r1, A00);
            }
            C51965G9l.A18(r6, A01);
            r6.ExS(-1412492308);
            int i2 = 0;
            do {
                I36.A00(r6, 0);
                i2++;
            } while (i2 < 6);
            if (C51971G9r.A1S(r6, r3, false)) {
                0fL.A00(-483129894);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 5);
        }
    }

    public static final void A01(C286575Wy r18, C15050ULg uLg, H2X h2x, int i) {
        C286575Wy r14 = r18;
        if (C51967G9n.A1T(r14, 1026281982)) {
            0fL.A01(886196619, "com.instagram.schools.channels.ui.InternalComposeSheet (SchoolChannelsComponent.kt:60)");
        }
        C262224Cq r8 = ((AnonymousClass6FV) C51974G9v.A0Y(r14, r14.ECw(), AnonymousClass5XT.A00)).A00;
        Object A0r = C51965G9l.A0r(r14);
        Object A16 = C51966G9m.A16(r14);
        DbS.A1X(A16);
        C56035Hri A00 = I3G.A00(r14, C54624HLh.Hidden, (0sP) null, 6, 14);
        C15050ULg uLg2 = uLg;
        H2X h2x2 = h2x;
        boolean z = true;
        C56439HyX.A00(r14, (C61070Jw8) null, (C54624HLh) A00.A02.A05.getValue(), "school_channels_creation_nux_bottom_sheet", (0sL) null, AnonymousClass5PI.A01(r14, new J9J(5, r8, h2x2, A00, A16, A0r, uLg2), 840643179), 8);
        Modifier A02 = C287195Zj.A02(C51969G9p.A0U());
        AnonymousClass5RD A0X = C51968G9o.A0X(r14);
        int A002 = C287425a7.A00(r14);
        C286565Wx r5 = (C286565Wx) r14;
        AnonymousClass5RM A04 = C286565Wx.A04(r5);
        Modifier A01 = C287435a8.A01(r14, A02);
        C51973G9u.A0y(r14, r5);
        C51971G9r.A12(r14, A0X, A04);
        0sL r2 = C287485aD.A02;
        if (r5.A0K || !C51972G9s.A1Q(r14, A002)) {
            C51971G9r.A13(r14, r2, A002);
        }
        C51965G9l.A18(r14, A01);
        if (uLg2 == null) {
            z = false;
        }
        HcZ.A00(r14, new C58691Iw0(14, A00, r8), 0, z);
        if (C51967G9n.A1R(r14)) {
            0fL.A00(-900941124);
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, h2x2, uLg2, i, 4);
        }
    }

    public static final void A02(C286575Wy r7, C15050ULg uLg, C62320sa r9, int i) {
        if (C51967G9n.A1T(r7, -1841051238)) {
            0fL.A01(2056905416, "com.instagram.schools.channels.ui.InternalFragmentSheet (SchoolChannelsComponent.kt:49)");
        }
        boolean z = true;
        Modifier A02 = C287195Zj.A02(C51966G9m.A0T(Modifier.A00));
        AnonymousClass5RD A0X = C51968G9o.A0X(r7);
        int A00 = C287425a7.A00(r7);
        C286565Wx r4 = (C286565Wx) r7;
        AnonymousClass5RM A04 = C286565Wx.A04(r4);
        Modifier A01 = C287435a8.A01(r7, A02);
        C51973G9u.A0y(r7, r4);
        C51971G9r.A12(r7, A0X, A04);
        0sL r1 = C287485aD.A02;
        if (r4.A0K || !C51972G9s.A1Q(r7, A00)) {
            C51971G9r.A13(r7, r1, A00);
        }
        C51965G9l.A18(r7, A01);
        boolean A1V = AnonymousClass7TF.A1V(uLg);
        r7.ExS(1132048464);
        if ((((i & 112) ^ 48) <= 32 || !r7.AGu(r9)) && (i & 48) != 32) {
            z = false;
        }
        Object ECw = r7.ECw();
        if (z || ECw == AnonymousClass5XT.A00) {
            ECw = new C58685Ivu(r9, 30);
            r7.FLL(ECw);
        }
        HcZ.A00(r7, C51965G9l.A0y(r4, ECw, false), 0, A1V);
        if (C51967G9n.A1R(r7)) {
            0fL.A00(-1932407383);
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, uLg, r9, i, 5);
        }
    }
}
