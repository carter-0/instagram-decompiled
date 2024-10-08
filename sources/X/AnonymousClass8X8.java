package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8X8  reason: invalid class name */
public abstract class AnonymousClass8X8 {
    public static final List A00 = 0sr.A1P(new 28D[]{28D.A5X, 28D.A42, 28D.A43, 28D.A5Y, 28D.A3N, 28D.A0a, 28D.A0V, 28D.A44, 28D.A26, 28D.A0d, 28D.A3V, 28D.A3T, 28D.A3z, 28D.A3y, 28D.A5L, 28D.A5M, 28D.A4q, 28D.A4V, 28D.A4W, 28D.A4X, 28D.A4a});

    public static final boolean A00(28D r3, AnonymousClass4DH r4, UserSession userSession, C279284yO r6, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r3, 1);
        0qQ.A0B(r6, 2);
        0qQ.A0B(userSession, 3);
        Bundle bundle = r4.mArguments;
        if ((bundle != null && bundle.getBoolean("ARGS_GALLERY_FIRST_ENABLED", false)) || z3) {
            return true;
        }
        if (z2 || z) {
            return false;
        }
        if (A01(r3, userSession, r6) || r3 == 28D.A0X || r3 == 28D.A0t || r3 == 28D.A1E || r3 == 28D.A1M || r3 == 28D.A3U || r3 == 28D.A3T || r3 == 28D.A0g || r3 == 28D.A0s) {
            return true;
        }
        if (C3505485d.A00(r3, userSession) != AnonymousClass05K.A00 || !(r6 instanceof AnonymousClass80O)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(28D r2, UserSession userSession, C279284yO r4, boolean z) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r4, 1);
        0qQ.A0B(userSession, 2);
        if (A01(r2, userSession, r4) || ((C3505485d.A01(r2, userSession) && !z) || r2 == 28D.A1l || r2 == 28D.A0t)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(28D r5, UserSession userSession, C279284yO r7) {
        if (!AnonymousClass8X9.A00(r5, userSession)) {
            if (!r7.equals(AnonymousClass9QA.A00)) {
                return false;
            }
            if (r5 == 28D.A0a) {
                return 182.A06(0Tu.A05, userSession, 36326369533245167L);
            }
            if (A00.contains(r5) || (r5 == 28D.A0W && 182.A06(0Tu.A05, userSession, 36326700245596084L))) {
                return true;
            }
            return false;
        }
        return true;
    }
}
