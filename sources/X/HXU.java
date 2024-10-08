package X;

import androidx.compose.ui.Modifier;

public abstract class HXU {
    public static final void A00(Modifier modifier, C286575Wy r28, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C286575Wy r2 = r28;
        r2.ExV(-167840704);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r2, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i3 & 3) != 2 || !r2.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1400344529, "com.instagram.compose.ui.badge.InternalBadge (Internal.kt:22)");
            }
            String A00 = C288035bG.A00(r2, 2131964443);
            long A0L = C51966G9m.A0L(r2);
            C267314bM r6 = AnonymousClass6CK.A00;
            long A04 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (A0L & 63)], AnonymousClass5RW.A03(A0L), AnonymousClass5RW.A02(A0L), AnonymousClass5RW.A01(A0L), AnonymousClass7TE.A04(r2.AJO(r6)));
            AnonymousClass5aQ.A02(r2);
            Modifier A09 = C287195Zj.A09(C304766Fd.A01(modifier2, AnonymousClass5ZM.A03, A04), 4.0f, 1.0f);
            long A042 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (C51966G9m.A0A(r2) & 63)], AnonymousClass5RW.A03(C51966G9m.A0A(r2)), AnonymousClass5RW.A02(C51966G9m.A0A(r2)), AnonymousClass5RW.A01(C51966G9m.A0A(r2)), AnonymousClass7TE.A04(r2.AJO(r6)));
            long A01 = AnonymousClass5Z7.A01(10);
            C286575Wy r20 = r2;
            C291525hS.A03(r20, A09, new AnonymousClass5Z4(new AnonymousClass5Z2(), (C268454dQ) null, AnonymousClass5ZD.A01, 0, 0, 5767160, A042, A01, 0, 0), A00, (0sP) null, 0, 1, 1, 114819072, 56, false);
            if (0fL.A02()) {
                0fL.A00(1089244168);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier2, i4, i6, 8);
        }
    }
}
