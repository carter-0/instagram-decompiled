package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hus  reason: case insensitive filesystem */
public abstract class C56225Hus {
    public static final void A00(C286575Wy r14, Modifier modifier, C55932Hpu hpu, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C55932Hpu hpu2 = hpu;
        0qQ.A0B(hpu2, 0);
        C286575Wy r12 = r14;
        r14.ExV(918800866);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r14, hpu2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r14, modifier);
        }
        if ((i3 & 19) != 18 || !r14.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-262558864, "com.instagram.barcelona.common.ui.toast.BdsToastHost (BdsToastHost.kt:26)");
            }
            Modifier A08 = C287195Zj.A08(modifier2, 16.0f);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r14);
            C286565Wx r7 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r14, A08);
            C51973G9u.A0y(r14, r7);
            C51971G9r.A12(r14, A0a, A04);
            0sL r2 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r2, A00);
            }
            C51965G9l.A18(r14, A01);
            C289515dj r22 = C289515dj.A00;
            AnonymousClass62P A002 = AnonymousClass62Q.A00(hpu2.A01);
            r14.ExS(271629923);
            int i7 = i3 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i7, 4);
            Object ECw = r14.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C59111J6t(hpu2, 25);
                r14.FLL(ECw);
            }
            0sL A10 = C51965G9l.A10(r7, ECw);
            boolean A1R = C51972G9s.A1R(r14, 271632748, i7, 4);
            Object ECw2 = r14.ECw();
            if (A1R || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C59099J6h.A00(r14, hpu2, 20);
            }
            0sP A0z = C51965G9l.A0z(r7, ECw2);
            C285245Qk r0 = Modifier.A00;
            A01(r12, C51965G9l.A0L(r22, r0), A0z, A10, A002, 0, 0);
            AnonymousClass62P A003 = AnonymousClass62Q.A00(hpu2.A00);
            boolean A1R2 = C51972G9s.A1R(r12, 271640003, i7, 4);
            Object ECw3 = r12.ECw();
            if (A1R2 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C59111J6t(hpu2, 26);
                r12.FLL(ECw3);
            }
            0sL A102 = C51965G9l.A10(r7, ECw3);
            boolean A1R3 = C51972G9s.A1R(r12, 271642828, i7, 4);
            Object ECw4 = r12.ECw();
            if (A1R3 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = C59099J6h.A01(r12, hpu2, 21);
            }
            A01(r12, r22.AAz(C287215Zl.A06, r0), C51965G9l.A0z(r7, ECw4), A102, A003, 0, 0);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-2062596721);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, hpu2, i4, i5, 13);
        }
    }

    public static final void A01(C286575Wy r15, Modifier modifier, 0sP r17, 0sL r18, AnonymousClass62P r19, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r2 = r15;
        r15.ExV(1720887062);
        int i4 = i2;
        AnonymousClass62P r14 = r19;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r2, r14) | i;
        } else {
            i3 = i5;
        }
        0sL r12 = r18;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r2, r12);
        }
        0sP r11 = r17;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r2, r11);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r2, modifier2);
        }
        if ((i3 & 1171) != 1170 || !r2.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-296302136, "com.instagram.barcelona.common.ui.toast.BdsToastMessages (BdsToastHost.kt:49)");
            }
            AnonymousClass5RD A0R = C51971G9r.A0R(C287275Zs.A00(), r2, C287215Zl.A00, (((i3 >> 9) & 14) | 432) >> 3);
            int A00 = C287425a7.A00(r2);
            C286565Wx r7 = (C286565Wx) r2;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r2, modifier2);
            C51973G9u.A0y(r2, r7);
            C51971G9r.A12(r2, A0R, A04);
            0sL r5 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r2, A00)) {
                C51971G9r.A13(r2, r5, A00);
            }
            C51965G9l.A18(r2, A01);
            r2.ExS(1277576340);
            for (C55765Hn0 hn0 : 00k.A0Y(r14)) {
                r2.ExC(-1762786990, hn0);
                r2.ExS(-1762785109);
                boolean z = true;
                boolean A1U = C51966G9m.A1U(r2, hn0, AnonymousClass7TF.A1S(i3 & 112, 32));
                Object ECw = r2.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = C59103J6l.A00(r2, hn0, r12, 37);
                }
                0sP A0z = C51965G9l.A0z(r7, ECw);
                r2.ExS(-1762783258);
                if ((i3 & 896) != 256) {
                    z = false;
                }
                boolean AGw = r2.AGw(hn0) | z;
                Object ECw2 = r2.ECw();
                if (AGw || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = C51970G9q.A0u(r2, hn0, r11, 36);
                }
                HUZ.A00(r2, hn0, C51965G9l.A0y(r7, ECw2, false), A0z, 0);
                C286565Wx.A0L(r7, false);
            }
            if (C51971G9r.A1S(r2, r7, false)) {
                0fL.A00(-1632181526);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(r11, r12, modifier2, r14, i5, i4, 7);
        }
    }
}
