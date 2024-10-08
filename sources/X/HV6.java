package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HV6 {
    public static final void A00(C286575Wy r27, Modifier modifier, C62320sa r29, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        Modifier modifier2 = modifier;
        C62320sa r15 = r29;
        0qQ.A0B(r15, 0);
        C286575Wy r6 = r27;
        r6.ExV(825791415);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r6, r15) | i;
        } else {
            i3 = i6;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0Z(r6, z3);
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0a(r6, z4);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0R(r6, modifier2);
        }
        if ((i3 & 1171) != 1170 || !r6.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-742515955, "com.instagram.barcelona.feed.post.ui.PostViewActivityRow (PostViewActivityRow.kt:31)");
            }
            C287245Zp r9 = C287215Zl.A04;
            C287295Zu r8 = C287275Zs.A00;
            Modifier A0V = C51966G9m.A0V(C287195Zj.A0B(AnonymousClass6DP.A00(modifier2, 0.0f, false), 12.0f, 13.0f, 16.0f, 13.0f));
            AnonymousClass5RD A00 = C287395a4.A00(r8, r6, r9);
            int A002 = C287425a7.A00(r6);
            C286565Wx r2 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r6, A0V);
            C62320sa r82 = C287485aD.A00;
            C51973G9u.A0z(r6, r2, r82);
            0sL r7 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r6, A00, A04, r7);
            0sL r1 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r1, A002);
            }
            0sL A1K = C51966G9m.A1K(r6, A01);
            AnonymousClass6FX r12 = AnonymousClass6FX.A00;
            r6.ExS(1101413182);
            if (z) {
                String A003 = C288035bG.A00(r6, 2131953695);
                C286575Wy r20 = r6;
                AnonymousClass5ZZ.A0F(r20, r12.A00(Modifier.A00), C51966G9m.A0h(r6), A003, 1, 2, 11256, C51966G9m.A0H(r6));
            }
            C286565Wx.A0L(r2, false);
            r6.ExS(1101424560);
            if (z2) {
                C285245Qk r11 = Modifier.A00;
                r6.ExS(1101427662);
                boolean A1N = C51975G9x.A1N(i3);
                Object ECw = r6.ECw();
                if (A1N || ECw == AnonymousClass5XT.A00) {
                    ECw = C58713IwM.A00(r6, r15, 48);
                }
                Modifier A05 = C287635aW.A05(r11, (C287625aV) null, (String) null, C51965G9l.A0y(r2, ECw, false), true);
                AnonymousClass5RD A0Q = C51965G9l.A0Q(r6, r9);
                int A004 = C287425a7.A00(r6);
                AnonymousClass5RM A042 = C286565Wx.A04(r2);
                Modifier A012 = C287435a8.A01(r6, A05);
                C51973G9u.A0z(r6, r2, r82);
                C287595aO.A00(r6, A0Q, r7);
                if (C51965G9l.A1Y(r6, r2, A042, A0w) || !C51972G9s.A1Q(r6, A004)) {
                    C51971G9r.A13(r6, r1, A004);
                }
                C287595aO.A00(r6, A012, A1K);
                AnonymousClass5ZZ.A0t(r6, C51966G9m.A0c(r6), C288035bG.A00(r6, 2131953704), C51966G9m.A0M(r6));
                if (C51966G9m.A15(r6) == AnonymousClass5Q8.Rtl) {
                    r6.ExS(94985500);
                    i4 = R.drawable.instagram_chevron_left_pano_outline_24;
                } else {
                    r6.ExS(95104571);
                    i4 = R.drawable.instagram_chevron_right_pano_outline_24;
                }
                AnonymousClass2DO A005 = C287975bA.A00(r6, i4, 0);
                C286565Wx.A0L(r2, false);
                C51970G9q.A14(r6, C287205Zk.A0C(C287195Zj.A0B(r11, 2.0f, 0.0f, 0.0f, 0.0f), 12.0f), A005);
                r6.ASN();
            }
            if (C51971G9r.A1S(r6, r2, false)) {
                0fL.A00(-439596925);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9A(r15, modifier2, i6, i5, 1, z4, z);
        }
    }
}
