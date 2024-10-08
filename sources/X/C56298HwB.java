package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.HwB  reason: case insensitive filesystem */
public abstract class C56298HwB {
    public static final void A00(LazyListState lazyListState, C286575Wy r11, C61060Jvy jvy, C67744Mtx mtx, int i) {
        int i2;
        LazyListState lazyListState2 = lazyListState;
        boolean A1b = C51973G9u.A1b(lazyListState, mtx, jvy);
        C286575Wy r5 = r11;
        r11.ExV(-701351235);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, lazyListState2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, mtx);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r11, jvy);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(374108466, "com.instagram.direct.securityalert.setting.ui.Success (SecurityAlertSettingView.kt:61)");
            }
            Object A16 = C51966G9m.A16(r11);
            boolean A1U = C51966G9m.A1U(r11, A16, C51973G9u.A1S(r11, mtx, jvy, 411725594));
            Object ECw = r11.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new C74188PqU(16, (Object) jvy, A16, (Object) mtx);
                r11.FLL(ECw);
            }
            C51965G9l.A1X(r11, false);
            AnonymousClass6HY.A04(lazyListState2, r5, (Modifier) null, (0sP) ECw, ((i2 << 3) & 112) | 12582912, 125, A1b);
            if (0fL.A02()) {
                0fL.A00(-683961085);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(mtx, lazyListState2, jvy, i, 44);
        }
    }

    public static final void A01(C286575Wy r5, C67744Mtx mtx, int i) {
        int i2;
        0qQ.A0B(mtx, 0);
        r5.ExV(759299125);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r5, mtx) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-470635741, "com.instagram.direct.securityalert.setting.ui.SecurityAlertSettingScreen (SecurityAlertSettingView.kt:43)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r5, mtx.A04, 0);
            LazyListState A0A = C51967G9n.A0A(r5);
            Object obj = ((C61084JwM) A02.getValue()).A02;
            if (!(obj == AnonymousClass05K.A00 || obj == AnonymousClass05K.A01 || obj == AnonymousClass05K.A0C)) {
                if (obj == AnonymousClass05K.A0N) {
                    C61060Jvy jvy = (C61060Jvy) ((C61084JwM) A02.getValue()).A00;
                    if (jvy != null) {
                        A00(A0A, r5, jvy, mtx, (i2 << 3) & 112);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            if (0fL.A02()) {
                0fL.A00(1476163440);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, mtx, i, 17);
        }
    }
}
