package X;

import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.Modifier;

public abstract class I3B {
    public static final void A00(C286575Wy r13, int i) {
        r13.ExV(-1505811533);
        if (i != 0 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(470029355, "com.instagram.schools.tab.ui.SchoolShimmerListRow (SchoolShimmerListRow.kt:30)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0A = C287205Zk.A0A(C51966G9m.A0T(r6), 72.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r13, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r13);
            C286565Wx r11 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r11);
            Modifier A01 = C287435a8.A01(r13, A0A);
            C62320sa r10 = C287485aD.A00;
            C51973G9u.A0z(r13, r11, r10);
            0sL r9 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r13, A02, A04, r9);
            0sL r7 = C287485aD.A02;
            if (r11.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r7, A00);
            }
            0sL A1K = C51966G9m.A1K(r13, A01);
            AnonymousClass6FX r2 = AnonymousClass6FX.A00;
            C287245Zp r1 = C287215Zl.A04;
            A01(r13, r2.AB1(r1, r6), 0);
            Modifier A0E = C51967G9n.A0E(r2.AB1(r1, r6), 12.0f);
            AnonymousClass5RD A022 = C291495hO.A02(C287275Zs.A00(), r13, C287215Zl.A02, 6);
            int A002 = C287425a7.A00(r13);
            AnonymousClass5RM A042 = C286565Wx.A04(r11);
            Modifier A012 = C287435a8.A01(r13, A0E);
            C51973G9u.A0z(r13, r11, r10);
            C287595aO.A00(r13, A022, r9);
            if (C51965G9l.A1Y(r13, r11, A042, A0w) || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r7, A002);
            }
            C287595aO.A00(r13, A012, A1K);
            A02(r13, C287205Zk.A07(r6, 0.66f), 6);
            A02(r13, C287205Zk.A07(r6, 0.5f), 6);
            if (C51971G9r.A1R(r13)) {
                0fL.A00(403410442);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 15);
        }
    }

    public static final void A01(C286575Wy r7, Modifier modifier, int i) {
        int i2;
        r7.ExV(-129408494);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r7, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1553388833, "com.instagram.schools.tab.ui.CircularImageShimmer (SchoolShimmerListRow.kt:44)");
            }
            C56666I6v.A07(r7, modifier.Ezh(new SizeElement(C287655aY.A00, 64.0f, 64.0f, 64.0f, 64.0f, false)), AnonymousClass5ZN.A01(32.0f));
            if (0fL.A02()) {
                0fL.A00(1366335468);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, modifier, i, 49);
        }
    }

    public static final void A02(C286575Wy r2, Modifier modifier, int i) {
        int i2;
        r2.ExV(1091170853);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r2, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1309172868, "com.instagram.schools.tab.ui.TextShimmer (SchoolShimmerListRow.kt:55)");
            }
            C56666I6v.A05(r2, C51968G9o.A0P(C287205Zk.A0A(modifier, 14.0f), 4.0f));
            if (0fL.A02()) {
                0fL.A00(178235793);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, modifier, i, 0);
        }
    }
}
