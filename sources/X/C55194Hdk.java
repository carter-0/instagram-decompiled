package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hdk  reason: case insensitive filesystem */
public abstract class C55194Hdk {
    public static final void A00(C286575Wy r16, Modifier modifier, 0sL r18, float f, int i, int i2, boolean z, boolean z2) {
        int i3;
        Modifier modifier2;
        float f2 = f;
        boolean z3 = z2;
        boolean z4 = z;
        Modifier modifier3 = modifier;
        0sL r9 = r18;
        0qQ.A0B(r9, 4);
        C286575Wy r1 = r16;
        r1.ExV(-1465673884);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r1, modifier3) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0Z(r1, z4);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0a(r1, z3);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A02(r1, f2);
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i3 |= G9t.A0I(r1, r9);
        }
        if ((i3 & 9363) != 9362 || !r1.Bwn()) {
            if (i5 != 0) {
                modifier3 = C51969G9p.A0U();
            }
            if (i7 != 0) {
                z4 = true;
            }
            if (i8 != 0) {
                z3 = true;
            }
            if (i9 != 0) {
                f2 = 0.0f;
            }
            if (0fL.A02()) {
                0fL.A01(-132325610, "com.instagram.wonderwall.ui.compose.components.WallCard (WallCard.kt:26)");
            }
            r1.ExS(301687288);
            if (z4) {
                C285245Qk r162 = Modifier.A00;
                AnonymousClass5ZQ A01 = AnonymousClass5ZN.A01(12.0f);
                long j = AnonymousClass5RV.A00;
                modifier2 = modifier3.Ezh(C56169Hty.A01(r162, A01, 4.0f, j, j, true));
            } else {
                modifier2 = modifier3;
            }
            if (z3) {
                modifier2 = modifier2.Ezh(C51968G9o.A0Q(Modifier.A00, 12.0f, f2, C51966G9m.A0K(r1)));
            }
            C286565Wx r6 = (C286565Wx) r1;
            C286565Wx.A0L(r6, false);
            Modifier A0X = C51969G9p.A0X(modifier2, 12.0f, C51966G9m.A08(r1));
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r1);
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A012 = C287435a8.A01(r1, A0X);
            C51973G9u.A0y(r1, r6);
            C51971G9r.A12(r1, A0a, A04);
            0sL r3 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r1, A00)) {
                C51971G9r.A13(r1, r3, A00);
            }
            C51965G9l.A18(r1, A012);
            C51972G9s.A11(r1, r9, i3 >> 12);
            if (0fL.A02()) {
                0fL.A00(807488674);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59191J9v(modifier3, r9, f2, i6, i4, 1, z4, z3);
        }
    }
}
