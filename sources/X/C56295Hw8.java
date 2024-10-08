package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hw8  reason: case insensitive filesystem */
public abstract class C56295Hw8 {
    public static final void A00(C286575Wy r18, C328607Fl r19, 0sL r20, int i) {
        int i2;
        float f;
        int i3;
        C287245Zp r14;
        AnonymousClass7AE r1;
        C328547Ff r2;
        int i4;
        C328607Fl r9 = r19;
        0sL r8 = r20;
        AnonymousClass7TF.A1H(r9, r8);
        C286575Wy r10 = r18;
        r10.ExV(-1792664265);
        int i5 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r10, r9) | i;
        } else {
            i2 = i5;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, r8);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2133305222, "com.instagram.direct.messagethread.compose.DecoratedMessage (DecoratedMessage.kt:37)");
            }
            C285245Qk r21 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r21);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r10);
            C286565Wx r5 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r10, A0T);
            C62320sa r0 = C287485aD.A00;
            C51973G9u.A0z(r10, r5, r0);
            0sL r15 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r10, A0a, A04, r15);
            0sL r142 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r142, A00);
            }
            0sL A1K = C51966G9m.A1K(r10, A01);
            C289515dj r182 = C289515dj.A00;
            Object A0m = C51967G9n.A0m(r10, -1201164478);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r10, 0);
            }
            C286565Wx.A0L(r5, false);
            boolean z = r9.A0T;
            if (z || (((r1 = r9.A06) != null && ((i4 = r1.A00) == 0 || i4 == 4)) || !((r2 = r9.A0I.A01) == AnonymousClass7GB.A00 || r2 == C328537Fe.A00))) {
                f = 0.0f;
            } else {
                f = 56.0f;
            }
            Modifier A0B = C287195Zj.A0B(A0T, f, 0.0f, 8.0f, 0.0f);
            AnonymousClass5RD A0V = C51968G9o.A0V(r10);
            int A002 = C287425a7.A00(r10);
            AnonymousClass5RM A042 = C286565Wx.A04(r5);
            Modifier A012 = C287435a8.A01(r10, A0B);
            C51973G9u.A0z(r10, r5, r0);
            C287595aO.A00(r10, A0V, r15);
            if (C51965G9l.A1Y(r10, r5, A042, A0w) || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r142, A002);
            }
            C287595aO.A00(r10, A012, A1K);
            AnonymousClass6FX r13 = AnonymousClass6FX.A00;
            AnonymousClass7AE r12 = r9.A06;
            if (r12 == null || !((i3 = r12.A00) == 0 || i3 == 4)) {
                C328557Fg r22 = r9.A0I;
                C328547Ff r16 = r22.A01;
                if (r16 == AnonymousClass7GB.A00 || r16 == C328537Fe.A00) {
                    r10.ExS(1780126239);
                } else {
                    r10.ExS(1780022451);
                    C54957HZn.A00(r10, r13.AB1(C287215Zl.A03, r21), r22, 0);
                }
            } else {
                r10.ExS(1779768530);
                if (z) {
                    r14 = C287215Zl.A04;
                } else {
                    r14 = C287215Zl.A03;
                }
                C54954HZk.A00(r10, C287195Zj.A0B(r13.AB1(r14, r21), 8.0f, 0.0f, 0.0f, 0.0f), r12, 0);
            }
            int i6 = 0;
            C286565Wx.A0L(r5, false);
            A01(r10, JG2.A00(r10, A0m, r8, 18, 2001255963), 48, z);
            r10.ASN();
            C331547Rk r3 = r9.A0G;
            r10.ExS(-1201135966);
            if (r3 != null) {
                C268024cd A0Y = C51968G9o.A0Y(r10);
                GAV gav = r3.A01;
                if (gav != null && gav.A03 == 0) {
                    i6 = (int) (16.0f * A0Y.AwL());
                }
                boolean A1V = C51967G9n.A1V(r10, -1201130764, i6);
                Object ECw = r10.ECw();
                if (A1V || ECw == obj) {
                    ECw = new C58735Iwi(i6, 17, A0m);
                    r10.FLL(ECw);
                }
                C54955HZl.A00(r182, r10, r3, C51965G9l.A0z(r5, ECw), 6);
            }
            if (C51971G9r.A1S(r10, r5, false)) {
                0fL.A00(-1641225482);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r9, r8, i5, 11);
        }
    }

    public static final void A01(C286575Wy r4, 0sL r5, int i, boolean z) {
        int i2;
        r4.ExV(1363088530);
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r4, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r4, r5);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(264770596, "com.instagram.direct.messagethread.compose.LayoutDirectionProvider (DecoratedMessage.kt:70)");
            }
            C267314bM r2 = AnonymousClass5YA.A07;
            Object AJO = r4.AJO(r2);
            if (z) {
                r4.ExS(875471874);
                AnonymousClass5Q8 r0 = AnonymousClass5Q8.Ltr;
                if (AJO == r0) {
                    r0 = AnonymousClass5Q8.Rtl;
                }
                C51971G9r.A11(r4, r2.A02(r0), new C59110J6s(r5, 41), -1824270825);
            } else {
                r4.ExS(875677342);
                C51967G9n.A1P(r4, r5, (i2 >> 3) & 14);
            }
            if (C51970G9q.A1Z(r4)) {
                0fL.A00(630911869);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r5, i, 12, z);
        }
    }
}
