package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HWr  reason: case insensitive filesystem */
public abstract class C54884HWr {
    public static final void A00(C286575Wy r14, C336627ev r15, int i) {
        int i2;
        C336627ev r3 = r15;
        0qQ.A0B(r15, 0);
        C286575Wy r6 = r14;
        r14.ExV(1694133358);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r14, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1930170927, "com.instagram.comments.mvvm.view.compose.RestrictedCommentsSectionHeader (RestrictedCommentSectionHeader.kt:23)");
            }
            C285245Qk r10 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(C287195Zj.A0B(r10, 12.0f, 0.0f, 12.0f, 0.0f), 0.0f, 12.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A00 = C287425a7.A00(r14);
            C286565Wx r142 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r142);
            Modifier A01 = C287435a8.A01(r6, A09);
            C62320sa r152 = C287485aD.A00;
            C51973G9u.A0z(r6, r142, r152);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r6, A0Z, A04, r13);
            0sL r12 = C287485aD.A02;
            if (r142.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r12, A00);
            }
            0sL A1K = C51966G9m.A1K(r6, A01);
            C335857de r4 = r3.A00;
            boolean A1Y = C51967G9n.A1Y(r6, r4, 1277583514);
            Object ECw = r6.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                int i4 = 2131956367;
                if (r4.ordinal() != 0) {
                    i4 = 2131956368;
                }
                ECw = Integer.valueOf(i4);
                r6.FLL(ECw);
            }
            int A0M = AnonymousClass7TE.A0M(ECw);
            C286565Wx.A0L(r142, false);
            Modifier A0T = C51966G9m.A0T(r10);
            AnonymousClass5RD A0V = C51968G9o.A0V(r6);
            int A002 = C287425a7.A00(r6);
            AnonymousClass5RM A042 = C286565Wx.A04(r142);
            Modifier A012 = C287435a8.A01(r6, A0T);
            C51973G9u.A0z(r6, r142, r152);
            C287595aO.A00(r6, A0V, r13);
            if (C51965G9l.A1Y(r6, r142, A042, A0w) || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r12, A002);
            }
            C287595aO.A00(r6, A012, A1K);
            AnonymousClass6FX r9 = AnonymousClass6FX.A00;
            AnonymousClass5ZZ.A0s(r6, C51966G9m.A0f(r6), C288035bG.A00(r6, A0M), C51966G9m.A0M(r6));
            C286575Wy r8 = r6;
            C56618I4t.A02(r8, r9.AB1(C287215Zl.A04, C287195Zj.A0B(r10, 8.0f, 0.0f, 0.0f, 0.0f)), 0.0f, 0, 6, 0);
            if (C51971G9r.A1R(r6)) {
                0fL.A00(1882768902);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r3, i3, 25);
        }
    }
}
