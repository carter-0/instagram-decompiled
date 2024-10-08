package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.5kS  reason: invalid class name and case insensitive filesystem */
public abstract class C293275kS {
    public static int A00(UserSession userSession, C254063rs r6, int i, int i2, int i3, int i4) {
        C2365934i r3;
        Reel reel;
        C255773uh A09;
        if (i == -1 || i2 == -1 || (r3 = r6.A08.A0A) == null) {
            return -1;
        }
        int i5 = -1;
        while (i <= i2) {
            if (!(r3.Bkf(i) == null || (reel = (Reel) r3.Bkf(i)) == null || (A09 = reel.A09(userSession)) == null || !A09.A1m() || reel.A16(userSession))) {
                if (i < i3) {
                    i5 = i;
                } else if (i <= i4 || i5 == -1) {
                    return i;
                }
            }
            i++;
        }
        return i5;
    }

    public static boolean A01(C228102kn r4, AnonymousClass5GH r5) {
        C293245kP r0;
        C275464qK r3 = r5.A00;
        boolean z = false;
        if (r3.A00.A0B != null) {
            z = true;
        }
        if (z || (((r0 = r5.A01) != null && r0.CEq() == 1) || r3.A01 == 1UQ.A0Q)) {
            return false;
        }
        return r4.CKZ();
    }
}
