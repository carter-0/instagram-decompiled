package X;

import androidx.compose.ui.Modifier;

public abstract class HZL {
    public static final void A00(C286575Wy r28, Modifier modifier, C62320sa r30, int i, int i2, int i3, int i4) {
        int i5;
        C62320sa r6 = r30;
        Modifier modifier2 = modifier;
        C286575Wy r0 = r28;
        r0.ExV(1700712600);
        int i6 = i4;
        int i7 = i3;
        int i8 = i;
        if ((i4 & 1) != 0) {
            i5 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i5 = G9t.A05(r0, i8) | i7;
        } else {
            i5 = i7;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i7 & 48) == 0) {
            i5 |= G9t.A06(r0, i2);
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            i5 |= 384;
        } else if ((i7 & 384) == 0) {
            i5 |= G9t.A0Q(r0, modifier2);
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            i5 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i5 |= G9t.A0H(r0, r6);
        }
        if ((i5 & 1171) != 1170 || !r0.Bwn()) {
            if (i9 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i10 != 0) {
                r6 = C58369Iqo.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1540638160, "com.instagram.creator.agent.settings.improveai.ImproveAiCard (ImproveAiCard.kt:31)");
            }
            C287245Zp r8 = C287215Zl.A04;
            Modifier A0V = C51966G9m.A0V(C287205Zk.A01(r8, modifier2));
            AnonymousClass5ZQ A01 = AnonymousClass5ZN.A01(16.0f);
            long j = AnonymousClass5RV.A00;
            Modifier A07 = C287195Zj.A07(C51969G9p.A0X(C56169Hty.A01(A0V, A01, 4.0f, j, j, true), 16.0f, C51966G9m.A08(r0)), 16.0f);
            boolean A1Q = C51973G9u.A1Q(r0, 2141997144, i5);
            Object ECw = r0.ECw();
            if (A1Q || ECw == AnonymousClass5XT.A00) {
                ECw = C58706IwF.A00(r0, r6, 28);
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            Modifier A05 = C287635aW.A05(A07, (C287625aV) null, (String) null, (C62320sa) ECw, true);
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r0, r8);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, A05);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Q, A04, r12);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r10, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A012);
            AnonymousClass6FX r1 = AnonymousClass6FX.A00;
            C285245Qk r3 = Modifier.A00;
            Modifier A002 = r1.A00(r3);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r0, A002);
            C51973G9u.A0z(r0, A0H, r13);
            C287595aO.A00(r0, A0Z, r12);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r10, A003);
            }
            C287595aO.A00(r0, A013, A1K);
            C286575Wy r7 = r0;
            AnonymousClass5ZZ.A0p(r7, C51965G9l.A0S(r0), C288035bG.A00(r0, 2131964191), 16370, C51966G9m.A0H(r0), AnonymousClass5Z7.A01(16));
            String A004 = C288035bG.A00(r0, 2131964190);
            C286575Wy r16 = r0;
            AnonymousClass5ZZ.A0K(r16, C287195Zj.A0B(r3, 0.0f, 4.0f, 0.0f, 0.0f), C51966G9m.A0b(r0), A004, 3120, 16368, C51966G9m.A0M(r0), AnonymousClass5Z7.A01(12));
            r0.ASN();
            String A014 = C288035bG.A01(r0, C51968G9o.A1Z(Integer.valueOf(i8), i2), 2131964193);
            String A005 = C288035bG.A00(r0, 2131964192);
            HZK.A00(r16, C287205Zk.A0C(r3, 70.0f), (C304786Ff) null, A014, A005, ((float) i8) / ((float) i2), 0.0f, 6.0f, 114843696, 4, AnonymousClass5Z7.A01(14), AnonymousClass5Z7.A01(8));
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-1889082272);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J98(modifier2, r6, i8, i2, i7, i6, 2);
        }
    }
}
