package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.HUw  reason: case insensitive filesystem */
public abstract class C54840HUw {
    public static final void A00(C286575Wy r23, Modifier modifier, C62320sa r25, C62320sa r26, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C62320sa r21 = r26;
        C62320sa r1 = r25;
        AnonymousClass7TF.A1H(r1, r21);
        C286575Wy r7 = r23;
        r7.ExV(524625757);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r7, r1) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r7, r21);
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0a(r7, z2);
        }
        if ((i3 & 147) != 146 || !r7.Bwn()) {
            if ((i2 & 8) != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1135171025, "com.instagram.barcelona.feed.post.ui.PostHushControl (PostHushControl.kt:29)");
            }
            C285245Qk r18 = Modifier.A00;
            Modifier A0X = C51966G9m.A0X(AnonymousClass6DP.A00(C51966G9m.A0T(r18), 0.0f, z2), C285595Rx.A02(AnonymousClass5RX.A0K[(int) (C51966G9m.A0A(r7) & 63)], AnonymousClass5RW.A03(C51966G9m.A0A(r7)), AnonymousClass5RW.A02(C51966G9m.A0A(r7)), AnonymousClass5RW.A01(C51966G9m.A0A(r7)), 0.7f));
            AnonymousClass5RD A0V = C51968G9o.A0V(r7);
            int A00 = C287425a7.A00(r7);
            C286565Wx r11 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r11);
            Modifier A01 = C287435a8.A01(r7, A0X);
            C62320sa r10 = C287485aD.A00;
            C51973G9u.A0z(r7, r11, r10);
            0sL r9 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r7, A0V, A04, r9);
            0sL r8 = C287485aD.A02;
            if (r11.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r8, A00);
            }
            0sL A1K = C51966G9m.A1K(r7, A01);
            AnonymousClass6FX r13 = AnonymousClass6FX.A00;
            Modifier A02 = C287195Zj.A02(r13.A00(r18));
            long A0M = C51966G9m.A0M(r7);
            AnonymousClass5aQ.A02(r7);
            AnonymousClass5ZQ r4 = AnonymousClass5ZM.A01;
            Modifier A03 = C304816Fi.A03(A02, r4, 0.0f, A0M);
            boolean A1Y = C51974G9v.A1Y(r7, 1348794178, i3);
            Object ECw = r7.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = C58713IwM.A01(r7, r21, 34);
            }
            Modifier A0C = G9w.A0C(r7, r11, A03, ECw);
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
            int A003 = C287425a7.A00(r7);
            AnonymousClass5RM A042 = C286565Wx.A04(r11);
            Modifier A012 = C287435a8.A01(r7, A0C);
            C51973G9u.A0z(r7, r11, r10);
            C287595aO.A00(r7, A002, r9);
            if (C51965G9l.A1Y(r7, r11, A042, A0w) || !C51972G9s.A1Q(r7, A003)) {
                C51971G9r.A13(r7, r8, A003);
            }
            C287595aO.A00(r7, A012, A1K);
            String A004 = C288035bG.A00(r7, 2131953707);
            AnonymousClass5Z4 A0h = C51966G9m.A0h(r7);
            Modifier A0U = C51966G9m.A0U(r18);
            AnonymousClass5ZZ.A04(r7, C287195Zj.A02(A0U), A0h, A004);
            r7.ASN();
            Modifier A022 = C287195Zj.A02(r13.A00(r18));
            long A0M2 = C51966G9m.A0M(r7);
            AnonymousClass5aQ.A02(r7);
            Modifier A032 = C304816Fi.A03(A022, r4, 0.0f, A0M2);
            boolean A1X = C51974G9v.A1X(r7, 1348816704, i3);
            Object ECw2 = r7.ECw();
            if (A1X || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C58713IwM.A00(r7, r25, 35);
            }
            Modifier A0C2 = G9w.A0C(r7, r11, A032, ECw2);
            AnonymousClass5RD A005 = C287675aa.A00(alignment, false);
            int A006 = C287425a7.A00(r7);
            AnonymousClass5RM A043 = C286565Wx.A04(r11);
            Modifier A013 = C287435a8.A01(r7, A0C2);
            C51973G9u.A0z(r7, r11, r10);
            C287595aO.A00(r7, A005, r9);
            if (C51965G9l.A1Y(r7, r11, A043, A0w) || !C51972G9s.A1Q(r7, A006)) {
                C51971G9r.A13(r7, r8, A006);
            }
            C287595aO.A00(r7, A013, A1K);
            String A007 = C288035bG.A00(r7, 2131953708);
            AnonymousClass5ZZ.A04(r7, C287195Zj.A02(A0U), C51966G9m.A0h(r7), A007);
            if (C51971G9r.A1R(r7)) {
                0fL.A00(1134649420);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9E(r21, r25, modifier2, i5, i4, 3, z2);
        }
    }
}
