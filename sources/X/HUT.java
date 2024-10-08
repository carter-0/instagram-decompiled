package X;

import androidx.compose.ui.Modifier;

public abstract class HUT {
    public static final void A00(C286575Wy r13, Modifier modifier, AnonymousClass2DO r15, C53353Gmd gmd, String str, C62320sa r18, int i, int i2) {
        int i3;
        C53353Gmd gmd2 = gmd;
        Modifier modifier2 = modifier;
        AnonymousClass2DO r7 = r15;
        C62320sa r9 = r18;
        AnonymousClass7TF.A1H(r9, r15);
        C286575Wy r14 = r13;
        r13.ExV(-437200455);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r14, r9) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r14, r15);
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r14, str2);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r14, modifier2);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0S(r14, gmd2);
        }
        if ((i3 & 9363) != 9362 || !r14.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                gmd2 = C53353Gmd.A04;
            }
            if (0fL.A02()) {
                0fL.A01(-1898372839, "com.instagram.barcelona.common.ui.button.IconButtonOnMedia (IconButtonOnMedia.kt:29)");
            }
            Modifier A0C = C287205Zk.A0C(C288235ba.A02(r14, modifier2, C51965G9l.A0R(0), r9), gmd2.A01);
            long A04 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A01 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A01), AnonymousClass5RW.A02(AnonymousClass5RW.A01), AnonymousClass5RW.A01(AnonymousClass5RW.A01), 0.4f);
            AnonymousClass5ZQ r3 = AnonymousClass5ZN.A00;
            Modifier A01 = C304766Fd.A01(C304766Fd.A01(A0C, r3, A04), r3, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A09 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A09), AnonymousClass5RW.A02(AnonymousClass5RW.A09), AnonymousClass5RW.A01(AnonymousClass5RW.A09), 0.2f));
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A00 = C287425a7.A00(r14);
            C286565Wx r4 = (C286565Wx) r14;
            AnonymousClass5RM A042 = C286565Wx.A04(r4);
            Modifier A012 = C287435a8.A01(r14, A01);
            C51973G9u.A0y(r14, r4);
            C51971G9r.A12(r14, A0Z, A042);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A012);
            AnonymousClass2DO r16 = r7;
            C288165bT.A07(r14, C287205Zk.A0C(Modifier.A00, gmd2.A00), r16, str, C51965G9l.A01(i3 >> 3), C51973G9u.A09(r14, C51966G9m.A0E(r14)));
            if (C51967G9n.A1R(r14)) {
                0fL.A00(-1256949210);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA8(r7, gmd2, r9, modifier2, str2, i5, i4, 4);
        }
    }
}
