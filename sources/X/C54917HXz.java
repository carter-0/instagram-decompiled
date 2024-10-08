package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HXz  reason: case insensitive filesystem */
public abstract class C54917HXz {
    public static final void A00(C286575Wy r15, C287245Zp r16, Modifier modifier, 0sL r18, 0sL r19, 0sL r20, int i, int i2) {
        int i3;
        C287245Zp r12 = r16;
        Modifier modifier2 = modifier;
        0sL r10 = r18;
        0sL r9 = r19;
        0sL r8 = r20;
        C51973G9u.A1E(r10, r9, r8);
        C286575Wy r14 = r15;
        r15.ExV(709745039);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r15, r10) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r15, r9);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r15, r8);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i3 |= G9t.A0R(r15, modifier2);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i3 |= G9t.A0S(r15, r12);
        }
        if ((i3 & 9363) != 9362 || !r15.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r12 = C287215Zl.A04;
            }
            if (0fL.A02()) {
                0fL.A01(1958380226, "com.instagram.creation.genai.common.ui.CenteredThreeItemRow (CenteredThreeItemRow.kt:22)");
            }
            int i8 = i3 >> 6;
            AnonymousClass5RD A0s = G9t.A0s(C287275Zs.A04, r15, r12, ((i3 >> 9) & 14) | 48 | (i8 & 896));
            int A00 = C287425a7.A00(r15);
            C286565Wx r6 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r15, modifier2);
            C62320sa r0 = C287485aD.A00;
            C51973G9u.A0z(r14, r6, r0);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r14, A0s, A04, r5);
            0sL r4 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r14, A01);
            AnonymousClass6FX r3 = AnonymousClass6FX.A00;
            C51967G9n.A1P(r14, r10, i3 & 14);
            Modifier A002 = r3.A00(Modifier.A00);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A003 = C287425a7.A00(r14);
            AnonymousClass5RM A042 = C286565Wx.A04(r6);
            Modifier A012 = C287435a8.A01(r14, A002);
            C51973G9u.A0z(r14, r6, r0);
            C287595aO.A00(r14, A0a, r5);
            if (C51965G9l.A1Y(r14, r6, A042, A0w) || !C51972G9s.A1Q(r14, A003)) {
                C51971G9r.A13(r14, r4, A003);
            }
            C287595aO.A00(r14, A012, A1K);
            C51972G9s.A11(r14, r9, i3 >> 3);
            C51972G9s.A11(r14, r8, i8);
            if (0fL.A02()) {
                0fL.A00(309641908);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            C287245Zp r142 = r12;
            ASQ.A06 = new C59195J9z(r142, r8, r9, modifier2, r10, i5, i4, 7);
        }
    }
}
