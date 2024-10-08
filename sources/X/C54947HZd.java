package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.HZd  reason: case insensitive filesystem */
public abstract class C54947HZd {
    public static final void A00(C286575Wy r6, C67751Mu4 mu4, int i) {
        int i2;
        0qQ.A0B(mu4, 0);
        r6.ExV(-135573019);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r6, mu4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2100831291, "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.EncryptedDeviceList (EncryptedDeviceList.kt:40)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r6, mu4.A03, 0);
            LazyListState A0A = C51967G9n.A0A(r6);
            Object A16 = C51966G9m.A16(r6);
            boolean A1U = C51966G9m.A1U(r6, A16, G9t.A1Y(r6, A02, mu4, -519602024));
            Object ECw = r6.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new C74188PqU(6, (Object) A02, A16, (Object) mu4);
                r6.FLL(ECw);
            }
            C51965G9l.A1X(r6, false);
            AnonymousClass6HY.A05(A0A, r6, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(460836053);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, mu4, i, 14);
        }
    }
}
