package X;

import androidx.compose.foundation.layout.IntrinsicHeightElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public abstract class HZ9 {
    public static final void A00(C286575Wy r18, N49 n49, int i) {
        int i2;
        N49 n492 = n49;
        0qQ.A0B(n492, 0);
        C286575Wy r11 = r18;
        r11.ExV(21290914);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, n492) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(737257765, "com.instagram.creator.agent.exampledialog.TextPreview (TextPreview.kt:22)");
            }
            C285245Qk r13 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r13, 16.0f, 8.0f, 16.0f, 16.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r11, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r8 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r11, A0B);
            C62320sa r7 = C287485aD.A00;
            C51973G9u.A0z(r11, r8, r7);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r11, A0Z, A04, r6);
            0sL r4 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r11, A01);
            Modifier A0A = C287195Zj.A0A(r13.Ezh(new IntrinsicHeightElement(AnonymousClass05K.A00, C287655aY.A00)), 0.0f, 0.0f, 0.0f);
            AnonymousClass5RD A0V = C51968G9o.A0V(r11);
            int A002 = C287425a7.A00(r11);
            AnonymousClass5RM A042 = C286565Wx.A04(r8);
            Modifier A012 = C287435a8.A01(r11, A0A);
            C51973G9u.A0z(r11, r8, r7);
            C287595aO.A00(r11, A0V, r6);
            if (C51965G9l.A1Y(r11, r8, A042, A0w) || !C51972G9s.A1Q(r11, A002)) {
                C51971G9r.A13(r11, r4, A002);
            }
            C287595aO.A00(r11, A012, A1K);
            Modifier A0D = C287205Zk.A0D(r13.Ezh(C287205Zk.A00), 4.0f);
            long A0A2 = C51965G9l.A0A(r11);
            AnonymousClass5S2 r2 = AnonymousClass5S0.A00;
            C287675aa.A02(r11, C304766Fd.A01(A0D, r2, A0A2), 0);
            Modifier A09 = C287195Zj.A09(C304766Fd.A01(G9w.A0H(C287195Zj.A0B(r13, 10.0f, 0.0f, 0.0f, 0.0f)), r2, C51966G9m.A0C(r11)), 12.0f, 10.0f);
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r11);
            AnonymousClass5RM A043 = C286565Wx.A04(r8);
            Modifier A013 = C287435a8.A01(r11, A09);
            C51973G9u.A0z(r11, r8, r7);
            C287595aO.A00(r11, A003, r6);
            if (C51965G9l.A1Y(r11, r8, A043, A0w) || !C51972G9s.A1Q(r11, A004)) {
                C51971G9r.A13(r11, r4, A004);
            }
            C287595aO.A00(r11, A013, A1K);
            String str = n492.A01;
            AnonymousClass5ZZ.A0r(r11, C51966G9m.A0b(r11), str, C51966G9m.A0M(r11));
            r11.ASN();
            r11.ASN();
            Modifier A092 = C287195Zj.A09(C304766Fd.A01(G9w.A0H(r13), r2, C51966G9m.A0B(r11)), 12.0f, 10.0f);
            AnonymousClass5RD A005 = C287675aa.A00(alignment, false);
            int A006 = C287425a7.A00(r11);
            AnonymousClass5RM A044 = C286565Wx.A04(r8);
            Modifier A014 = C287435a8.A01(r11, A092);
            C51973G9u.A0z(r11, r8, r7);
            C287595aO.A00(r11, A005, r6);
            if (C51965G9l.A1Y(r11, r8, A044, A0w) || !C51972G9s.A1Q(r11, A006)) {
                C51971G9r.A13(r11, r4, A006);
            }
            C287595aO.A00(r11, A014, A1K);
            AnonymousClass5ZZ.A0r(r11, C51966G9m.A0c(r11), n492.A00, C51966G9m.A0H(r11));
            if (C51971G9r.A1R(r11)) {
                0fL.A00(1138218870);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, n492, i, 0);
        }
    }
}
