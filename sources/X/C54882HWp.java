package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HWp  reason: case insensitive filesystem */
public abstract class C54882HWp {
    public static final void A00(C286575Wy r9, Modifier modifier, C62320sa r11, int i, int i2, boolean z) {
        int i3;
        C286565Wx r3;
        0qQ.A0B(r11, 2);
        r9.ExV(1511285013);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r9, modifier) | i;
        } else {
            i3 = i;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i6 & 112) == 0) {
            i3 |= G9t.A0Z(r9, z);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 896) == 0) {
            i3 |= G9t.A0G(r9, r11);
        }
        if ((i3 & 731) != 146 || !r9.Bwn()) {
            if (i5 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1311561107, "com.instagram.comments.mvvm.view.compose.EmptyComments (EmptyComments.kt:25)");
            }
            if (z) {
                r9.ExS(-2043366774);
                Modifier A0V = C51966G9m.A0V(modifier);
                AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
                int A00 = C287425a7.A00(r9);
                r3 = (C286565Wx) r9;
                AnonymousClass5RM A04 = C286565Wx.A04(r3);
                Modifier A01 = C287435a8.A01(r9, A0V);
                C51973G9u.A0y(r9, r3);
                C51971G9r.A12(r9, A0Z, A04);
                0sL r2 = C287485aD.A02;
                if (r3.A0K || !C51972G9s.A1Q(r9, A00)) {
                    C51971G9r.A13(r9, r2, A00);
                }
                C51965G9l.A18(r9, A01);
                AnonymousClass2DO A002 = C287975bA.A00(r9, R.drawable.loadmore_icon_refresh_compound, 0);
                Modifier A0W = C51966G9m.A0W(Modifier.A00);
                r9.ExS(293506427);
                boolean A1N = C51972G9s.A1N(i3);
                Object ECw = r9.ECw();
                if (A1N || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58680Ivp(r11, 9);
                    r9.FLL(ECw);
                }
                AnonymousClass6G3.A0B(r9, C51969G9p.A0V(r3, A0W, ECw), A002, C288035bG.A00(r9, 2131971905), 8);
            } else {
                r9.ExS(-2043012847);
                Modifier A07 = C287195Zj.A07(C51966G9m.A0V(modifier), 36.0f);
                AnonymousClass5RD A0Z2 = C51966G9m.A0Z(false);
                int A003 = C287425a7.A00(r9);
                r3 = (C286565Wx) r9;
                AnonymousClass5RM A042 = C286565Wx.A04(r3);
                Modifier A012 = C287435a8.A01(r9, A07);
                C51973G9u.A0y(r9, r3);
                C51971G9r.A12(r9, A0Z2, A042);
                0sL r1 = C287485aD.A02;
                if (r3.A0K || !C51972G9s.A1Q(r9, A003)) {
                    C51971G9r.A13(r9, r1, A003);
                }
                C51965G9l.A18(r9, A012);
                I7M.A0B(r9, C288035bG.A00(r9, 2131956418), C288035bG.A00(r9, 2131956417));
            }
            r9.ASN();
            if (C51967G9n.A1b(r3, false)) {
                0fL.A00(151534071);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i6, i4, 4, modifier, r11, z2);
        }
    }
}
