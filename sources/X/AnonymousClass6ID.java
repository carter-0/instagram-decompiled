package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6ID  reason: invalid class name */
public abstract class AnonymousClass6ID {
    public static final AnonymousClass6IE A00 = new AnonymousClass6IE();

    public static final void A00(C286575Wy r14, Modifier modifier, AnonymousClass6I8 r16, 0sL r17, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        r14.ExV(-511989831);
        int i4 = i2;
        AnonymousClass6I8 r12 = r16;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = 2;
            if (r14.AGw(r12)) {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i5;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i8 = 16;
            if (r14.AGu(modifier)) {
                i8 = 32;
            }
            i3 |= i8;
        }
        0sL r11 = r17;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            int i9 = 128;
            if (r14.AGw(r11)) {
                i9 = 256;
            }
            i3 |= i9;
        }
        if ((i3 & 147) != 146 || !r14.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1085170490, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)");
            }
            int A002 = C287425a7.A00(r14);
            AnonymousClass5Q1 A01 = C287425a7.A01(r14);
            Modifier A012 = C287435a8.A01(r14, modifier2);
            C286565Wx r2 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            C62320sa r1 = AnonymousClass5R6.A0a;
            r14.ExX();
            if (r2.A0K) {
                r14.AMT(r1);
            } else {
                r14.FMk();
            }
            C287595aO.A00(r14, r12, r12.A04);
            C287595aO.A00(r14, A01, r12.A02);
            C287595aO.A00(r14, r11, r12.A03);
            C287595aO.A00(r14, A04, C287485aD.A05);
            C287595aO.A00(r14, A012, C287485aD.A04);
            0sL r4 = C287485aD.A02;
            if (r2.A0K || !0qQ.A0K(r14.ECw(), Integer.valueOf(A002))) {
                Integer valueOf = Integer.valueOf(A002);
                r14.FLL(valueOf);
                r14.ABr(valueOf, r4);
            }
            C286565Wx.A0L(r2, true);
            if (!r14.Bwn()) {
                r14.ExS(-26580342);
                boolean AGw = r14.AGw(r12);
                Object ECw = r14.ECw();
                if (AGw || ECw == AnonymousClass5XT.A00) {
                    ECw = new AnonymousClass9L8(r12, 24);
                    r14.FLL(ECw);
                }
                C286645Xf.A05(r14, (C62320sa) ECw);
            } else {
                r14.ExS(-26502501);
            }
            C286565Wx.A0L(r2, false);
            if (0fL.A02()) {
                0fL.A00(-971610333);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 3, r11, r12, modifier2);
        }
    }

    public static final void A01(C286575Wy r9, Modifier modifier, 0sL r11, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r4 = r9;
        r9.ExV(-1298353104);
        int i4 = i2;
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            int i6 = 2;
            if (r9.AGu(modifier2)) {
                i6 = 4;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        0sL r7 = r11;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            int i7 = 16;
            if (r9.AGw(r11)) {
                i7 = 32;
            }
            i3 |= i7;
        }
        if ((i3 & 19) != 18 || !r9.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1898480588, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)");
            }
            Object ECw = r9.ECw();
            if (ECw == AnonymousClass5XT.A00) {
                ECw = new AnonymousClass6I8();
                ((C286565Wx) r4).A0Q(ECw);
            }
            int i8 = i3 << 3;
            A00(r4, modifier2, (AnonymousClass6I8) ECw, r7, (i8 & 112) | (i8 & 896), 0);
            if (0fL.A02()) {
                0fL.A00(1521471220);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new GSJ(r11, i4, modifier2, i, 5);
        }
    }
}
