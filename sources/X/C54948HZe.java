package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.HZe  reason: case insensitive filesystem */
public abstract class C54948HZe {
    public static final void A00(C286575Wy r8, C61078JwG jwG, C62320sa r10, 0sP r11, int i) {
        int i2;
        C51973G9u.A1E(jwG, r11, r10);
        r8.ExV(-41972417);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r8, jwG) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r8, r11);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r8, r10);
        }
        if ((i2 & 147) != 146 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1802439417, "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.EncryptedUserList (EncryptedUserList.kt:31)");
            }
            LazyListState A0A = C51967G9n.A0A(r8);
            r8.ExS(1637045594);
            boolean z = true;
            boolean A1U = C51966G9m.A1U(r8, jwG, AnonymousClass7TF.A1S(i2 & 896, 256));
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1U | z;
            Object ECw = r8.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C74188PqU(7, (Object) r11, (Object) r10, (Object) jwG);
                r8.FLL(ECw);
            }
            C51965G9l.A1X(r8, false);
            AnonymousClass6HY.A05(A0A, r8, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-1020164044);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(jwG, r10, r11, i, 33);
        }
    }
}
