package X;

import androidx.compose.ui.Modifier;

public abstract class HUV {
    public static final void A00(C286575Wy r18, Modifier modifier, String str, String str2, C62320sa r22, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str3 = str;
        String str4 = str2;
        C62320sa r6 = r22;
        boolean A1b = C51973G9u.A1b(r6, str3, str4);
        C286575Wy r13 = r18;
        r13.ExV(305614296);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r13, r6) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, str3);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r13, str4);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r13, modifier2);
        }
        if ((i3 & 1171) != 1170 || !r13.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1271942268, "com.instagram.barcelona.common.ui.button.TagMediaButton (TagMediaButton.kt:25)");
            }
            Modifier A01 = C288235ba.A01(r13, modifier2, C51965G9l.A0R(0), str4, r6, A1b ? 1 : 0, false);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r13);
            C286565Wx r4 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r13, A01);
            C51973G9u.A0y(r13, r4);
            C51971G9r.A12(r13, A0a, A04);
            0sL r2 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r2, A00);
            }
            C51965G9l.A18(r13, A012);
            AnonymousClass5ZQ A002 = AnonymousClass5ZN.A00();
            String str5 = str3;
            AnonymousClass5ZZ.A0L(r13, C287195Zj.A09(C304766Fd.A01(C304766Fd.A01(Modifier.A00, A002, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A01 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A01), AnonymousClass5RW.A02(AnonymousClass5RW.A01), AnonymousClass5RW.A01(AnonymousClass5RW.A01), 0.4f)), A002, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A09 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A09), AnonymousClass5RW.A02(AnonymousClass5RW.A09), AnonymousClass5RW.A01(AnonymousClass5RW.A09), 0.2f)), 10.0f, 5.0f), C51966G9m.A0b(r13), str5, (i3 >> 3) & 14, C51966G9m.A0I(r13));
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-1590184928);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9Q(r6, modifier2, str4, str3, i5, i4, A1b ? 1 : 0);
        }
    }
}
