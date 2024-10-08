package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hbu  reason: case insensitive filesystem */
public abstract class C55085Hbu {
    public static final void A00(C286575Wy r8, C62320sa r9, int i, boolean z, boolean z2) {
        int i2;
        r8.ExV(979255358);
        if ((i & 48) == 0) {
            i2 = G9t.A0Z(r8, z2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r8, r9);
        }
        if ((i2 & 145) != 144 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1100164392, "com.instagram.preloads.earlyaccess.EarlyAccessScreen (EarlyAccessFragment.kt:47)");
            }
            C287325Zx r0 = C287275Zs.A07;
            C285245Qk r5 = Modifier.A00;
            AnonymousClass5RD A0L = G9w.A0L(r0, r8);
            int A00 = C287425a7.A00(r8);
            C286565Wx r6 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r8, r5);
            C51973G9u.A0y(r8, r6);
            C51971G9r.A12(r8, A0L, A04);
            0sL r2 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r8, A00)) {
                C51971G9r.A13(r8, r2, A00);
            }
            C51965G9l.A18(r8, A01);
            String A002 = C304346Dc.A00(r8, 2131961077);
            r8.ExS(92315102);
            boolean A1S = AnonymousClass7TF.A1S(i2 & 896, 256);
            Object ECw = r8.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new G4S(r9, 13);
                r8.FLL(ECw);
            }
            C52636GaA.A0P(r8, new C57125IPo(C51965G9l.A0z(r6, ECw), z2, true), A002);
            I2Y.A02(r8, (Modifier) null, C304346Dc.A00(r8, 2131961075), 0, 2);
            I2Y.A02(r8, (Modifier) null, C304346Dc.A00(r8, 2131961076), 0, 2);
            if (C51967G9n.A1R(r8)) {
                0fL.A00(-1965332969);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J7F(r9, i, z, z2);
        }
    }
}
