package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HWo  reason: case insensitive filesystem */
public abstract class C54881HWo {
    public static final void A00(C286575Wy r26, HN2 hn2, C56030Hrc hrc, int i) {
        int i2;
        int i3;
        long j;
        HN2 hn22 = hn2;
        boolean A1U = AnonymousClass7TF.A1U(0, hn22, hrc);
        C286575Wy r4 = r26;
        r4.ExV(207753);
        int i4 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r4, hn22) | i;
        } else {
            i2 = i4;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r4, hrc);
        }
        if ((i2 & 91) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(29606356, "com.instagram.comments.mvvm.view.compose.CommentSortOrderSelector (CommentSortOrderSelector.kt:45)");
            }
            if (hn22 != HN2.A09) {
                i3 = hn22.A00;
            } else {
                i3 = 2131962638;
            }
            String A00 = C288035bG.A00(r4, i3);
            Object A0m = C51967G9n.A0m(r4, -1795351960);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r4, A00);
            }
            C284945Oz r5 = (C284945Oz) A0m;
            C286565Wx A0H = C51965G9l.A0H(r4, false);
            C284945Oz A0J = C51965G9l.A0J(A0H, C51974G9v.A0X(r4, obj, -1795349766, false), false);
            C285245Qk r9 = Modifier.A00;
            Modifier A05 = C287195Zj.A05(C287205Zk.A07(r9, 0.5f));
            Object A0m2 = C51967G9n.A0m(r4, -1795341587);
            if (A0m2 == obj) {
                A0m2 = C58680Ivp.A00(r4, A0J, 7);
            }
            Modifier A052 = C287635aW.A05(A05, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, A0m2, false), A1U);
            if (C51971G9r.A1W(A0J)) {
                j = C51967G9n.A0a(r4, -1795337461).A0S;
            } else {
                j = C51967G9n.A0a(r4, -1795335479).A0k;
            }
            C286565Wx.A0L(A0H, false);
            Modifier A09 = C287195Zj.A09(C51966G9m.A0X(A052, j), 0.0f, 14.0f);
            AnonymousClass5RD A002 = C287395a4.A00(C287275Zs.A04, r4, C287215Zl.A04);
            int A003 = C287425a7.A00(r4);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r4, A09);
            C62320sa r15 = C287485aD.A00;
            C51973G9u.A0z(r4, A0H, r15);
            0sL r14 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A002, A04, r14);
            0sL r13 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r4, A003)) {
                C51971G9r.A13(r4, r13, A003);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A004 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r4, r9);
            C51973G9u.A0z(r4, A0H, r15);
            C287595aO.A00(r4, A0a, r14);
            if (C51965G9l.A1Y(r4, A0H, A042, A0w) || !C51972G9s.A1Q(r4, A004)) {
                C51971G9r.A13(r4, r13, A004);
            }
            C287595aO.A00(r4, A012, A1K);
            String A1A = C51966G9m.A1A(r5);
            C286575Wy r20 = r4;
            AnonymousClass5ZZ.A0S(r20, C287195Zj.A09(r9, 12.0f, 0.0f), C51966G9m.A0c(r4), A1A, C51966G9m.A0H(r4));
            boolean A1W = C51971G9r.A1W(A0J);
            long A005 = C54759HRr.A00(10.0f, 10.0f);
            boolean A1Y = C51974G9v.A1Y(r4, 1263935977, i2);
            Object ECw = r4.ECw();
            if (A1Y || ECw == obj) {
                ECw = new J6W(9, hrc, A0J, r5);
                r4.FLL(ECw);
            }
            0sP A0z = C51965G9l.A0z(A0H, ECw);
            Object A0m3 = C51967G9n.A0m(r4, 1263941676);
            if (A0m3 == obj) {
                A0m3 = C58680Ivp.A00(r4, A0J, 8);
            }
            C56261HvV.A01(r20, C51965G9l.A0y(A0H, A0m3, false), A0z, new C59111J6t(r5, 40), 196992, A005, A1W);
            r4.ASN();
            C287675aa.A02(r4, C304766Fd.A01(C287205Zk.A0G(C287195Zj.A0B(r9, 0.0f, 0.0f, 12.0f, 0.0f), 10.0f, 5.0f), new IG3(!C51971G9r.A1W(A0J)), C51966G9m.A0L(r4)), 0);
            if (C51967G9n.A1R(r4)) {
                0fL.A00(544080454);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, hn22, hrc, i4, 28);
        }
    }
}
