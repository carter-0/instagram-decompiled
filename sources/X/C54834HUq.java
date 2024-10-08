package X;

import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.HUq  reason: case insensitive filesystem */
public abstract class C54834HUq {
    public static final void A00(C286575Wy r31, Modifier modifier, C62320sa r33, int i, int i2, int i3, int i4) {
        int i5;
        Modifier modifier2 = modifier;
        C286575Wy r11 = r31;
        r11.ExV(-227348371);
        int i6 = i4;
        int i7 = i3;
        int i8 = i;
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = G9t.A05(r11, i8) | i3;
        } else {
            i5 = i7;
        }
        int i9 = i2;
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= G9t.A06(r11, i9);
        }
        C62320sa r9 = r33;
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i7 & 384) == 0) {
            i5 |= G9t.A0G(r11, r9);
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            i5 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i5 |= G9t.A0R(r11, modifier2);
        }
        if ((i5 & 1171) != 1170 || !r11.Bwn()) {
            if (i10 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1934316836, "com.instagram.barcelona.feed.post.ui.PostAnimatedTextLabel (PostAnimatedTextLabel.kt:28)");
            }
            r11.ExS(-555103176);
            Modifier A00 = AnonymousClass5R5.A00(modifier2, J18.A00, true);
            if (r33 != null) {
                A00 = A00.Ezh(C288235ba.A04(r11, Modifier.A00, r9));
            }
            C286565Wx r0 = (C286565Wx) r11;
            C286565Wx.A0L(r0, false);
            AnonymousClass5RD A0W = C51968G9o.A0W(r11);
            int A002 = C287425a7.A00(r11);
            AnonymousClass5RM A04 = C286565Wx.A04(r0);
            Modifier A01 = C287435a8.A01(r11, A00);
            C51973G9u.A0y(r11, r0);
            C51971G9r.A12(r11, A0W, A04);
            0sL r6 = C287485aD.A02;
            if (r0.A0K || !C51972G9s.A1Q(r11, A002)) {
                C51971G9r.A13(r11, r6, A002);
            }
            C51965G9l.A18(r11, A01);
            Modifier A003 = AnonymousClass6FZ.A00(Modifier.A00).Ezh(new SizeAnimationModifierElement(new C287965b7(new C289005cr(1 | (1 << 32)), 1.0f, 400.0f), C287215Zl.A0E));
            String A02 = C304346Dc.A02(r11, AnonymousClass7TF.A1b(i8), i9, i8);
            String valueOf = String.valueOf(i8);
            int A08 = 00l.A08(A02, valueOf, 0, false);
            if (A08 >= 0) {
                r11.ExS(1829424536);
                r11.ExS(-633720588);
                int i11 = i5 & 14;
                boolean A1I = C51972G9s.A1I(i11);
                Object ECw = r11.ECw();
                if (A1I || ECw == AnonymousClass5XT.A00) {
                    ECw = Integer.valueOf(DbX.A05(valueOf));
                    r11.FLL(ECw);
                }
                int A0M = AnonymousClass7TE.A0M(ECw);
                C286565Wx.A0L(r0, false);
                r11.ExS(-633717714);
                boolean A1I2 = C51972G9s.A1I(i11);
                Object ECw2 = r11.ECw();
                if (A1I2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = Integer.valueOf(DbX.A05(A02));
                    r11.FLL(ECw2);
                }
                int A0M2 = AnonymousClass7TE.A0M(ECw2);
                C286565Wx.A0L(r0, false);
                String A0q = C51967G9n.A0q(A02, 0, A08);
                String A0q2 = C51967G9n.A0q(A02, A08 + A0M, A0M2);
                r11.ExS(-633711116);
                if (A0q.length() > 0) {
                    AnonymousClass5ZZ.A0F(r11, A003, (AnonymousClass5Z4) null, A0q, 1, 2, 27640, C51966G9m.A0M(r11));
                }
                C286565Wx.A0L(r0, false);
                C56232Huz.A00(r11, A003, (AnonymousClass5ZD) null, i8, 0, i11, 124, 0, 0, false);
                if (A0q2.length() > 0) {
                    AnonymousClass5ZZ.A0F(r11, A003, (AnonymousClass5Z4) null, A0q2, 1, 2, 27640, C51966G9m.A0M(r11));
                }
            } else {
                r11.ExS(1830417807);
                C56232Huz.A00(r11, A003, (AnonymousClass5ZD) null, i8, 0, i5 & 14, 124, 0, 0, false);
                AnonymousClass5ZZ.A0F(r11, A003, (AnonymousClass5Z4) null, C304346Dc.A02(r11, new Object[]{""}, i9, i8), 1, 2, 27640, C51966G9m.A0M(r11));
            }
            if (C51971G9r.A1S(r11, r0, false)) {
                0fL.A00(-646547090);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J98(modifier2, r9, i8, i9, i7, i6, 0);
        }
    }
}
