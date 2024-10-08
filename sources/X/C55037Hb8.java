package X;

import androidx.compose.ui.Modifier;
import java.util.List;

/* renamed from: X.Hb8  reason: case insensitive filesystem */
public abstract class C55037Hb8 {
    public static final void A00(C286575Wy r24, Modifier modifier, GS7 gs7, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        GS7 gs72 = gs7;
        0qQ.A0B(gs72, 1);
        C286575Wy r6 = r24;
        r6.ExV(712739241);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r6, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r6, gs72);
        }
        if ((i3 & 19) != 18 || !r6.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1076136368, "com.instagram.invite.view.loading.ContactLoading (ContactLoading.kt:27)");
            }
            Modifier A09 = C287205Zk.A09(C287195Zj.A00(gs72.A01, C51966G9m.A0V(modifier2)), gs72.A00);
            AnonymousClass5RD A0W = C51968G9o.A0W(r6);
            int A00 = C287425a7.A00(r6);
            C286565Wx r10 = (C286565Wx) r6;
            AnonymousClass5RM A04 = C286565Wx.A04(r10);
            Modifier A01 = C287435a8.A01(r6, A09);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r6, r10, r12);
            0sL r9 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r6, A0W, A04, r9);
            0sL r8 = C287485aD.A02;
            if (r10.A0K || !C51972G9s.A1Q(r6, A00)) {
                C51971G9r.A13(r6, r8, A00);
            }
            0sL A1K = C51966G9m.A1K(r6, A01);
            AnonymousClass6FX r14 = AnonymousClass6FX.A00;
            C55984Hqp A03 = C56666I6v.A03(r6, (List) null, 0.0f, 0.0f, 0, 1572864, 63, 0);
            Modifier A0Q = C51971G9r.A0Q(modifier2, gs72.A02.AeO());
            long j = AnonymousClass5aQ.A00(r6).A0C;
            AnonymousClass5S2 r7 = AnonymousClass5S0.A00;
            C287675aa.A02(r6, C56666I6v.A01(r6, C304766Fd.A01(A0Q, r7, j), A03, 0), 0);
            C285245Qk r15 = Modifier.A00;
            Modifier A092 = C287195Zj.A09(r14.A00(r15), 12.0f, 0.0f);
            AnonymousClass5RD A0L = G9w.A0L(C287275Zs.A00(), r6);
            int A002 = C287425a7.A00(r6);
            AnonymousClass5RM A042 = C286565Wx.A04(r10);
            Modifier A012 = C287435a8.A01(r6, A092);
            C51973G9u.A0z(r6, r10, r12);
            C287595aO.A00(r6, A0L, r9);
            if (C51965G9l.A1Y(r6, r10, A042, A0w) || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r8, A002);
            }
            C287595aO.A00(r6, A012, A1K);
            C287675aa.A02(r6, C56666I6v.A01(r6, C304766Fd.A01(C51968G9o.A0P(C287205Zk.A08(C287205Zk.A07(r15, 0.5f), 12.0f), 7.0f), r7, AnonymousClass5aQ.A00(r6).A0C), A03, 0), 0);
            C287675aa.A02(r6, C56666I6v.A01(r6, C304766Fd.A01(C51968G9o.A0P(C287205Zk.A08(C287205Zk.A07(r15, 0.4f), 12.0f), 7.0f), r7, AnonymousClass5aQ.A00(r6).A0C), A03, 0), 0);
            if (C51971G9r.A1R(r6)) {
                0fL.A00(-116224925);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, gs72, i4, i6, 33);
        }
    }
}
