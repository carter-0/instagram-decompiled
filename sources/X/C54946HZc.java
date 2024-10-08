package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HZc  reason: case insensitive filesystem */
public abstract class C54946HZc {
    public static final void A00(C286575Wy r13, C62320sa r14, int i, int i2) {
        int i3;
        0qQ.A0B(r14, 1);
        C286575Wy r8 = r13;
        r13.ExV(976992500);
        int i4 = i2;
        if ((i2 & 14) == 0) {
            i3 = G9t.A05(r13, i) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 112) == 0) {
            i3 |= G9t.A0F(r13, r14);
        }
        if ((i3 & 91) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-475386122, "com.instagram.direct.fragment.thread.chatsettings.customthemepreview.CreateButton (CreateButton.kt:24)");
            }
            C285245Qk r5 = Modifier.A00;
            long j = AnonymousClass5RW.A01;
            Modifier A0X = C51966G9m.A0X(C51968G9o.A0P(C287205Zk.A08(C51966G9m.A0T(r5), 32.0f), 8.0f), ((long) i) << 32);
            boolean A1O = C51973G9u.A1O(r13, -1671471153, i3);
            Object ECw = r13.ECw();
            if (A1O || ECw == AnonymousClass5XT.A00) {
                ECw = new C73897PlY(r14, 29);
                r13.FLL(ECw);
            }
            C286565Wx r6 = (C286565Wx) r8;
            Modifier A0D = G9w.A0D(r13, r6, A0X, (C62320sa) ECw);
            AnonymousClass5RD A0L = G9w.A0L(C287275Zs.A02, r13);
            int A00 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r13, A0D);
            C51973G9u.A0y(r13, r6);
            C51971G9r.A12(r13, A0L, A04);
            0sL r1 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r1, A00);
            }
            C51965G9l.A18(r13, A01);
            AnonymousClass5ZZ.A0X(r8, C51966G9m.A0S(C304676Et.A00, r5), C51966G9m.A0h(r8), C288035bG.A00(r13, 2131957263), C51966G9m.A0H(r13));
            if (C51967G9n.A1R(r8)) {
                0fL.A00(-1206725562);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, r14, i, i4, 16);
        }
    }
}
