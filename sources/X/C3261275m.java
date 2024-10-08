package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.75m  reason: invalid class name and case insensitive filesystem */
public abstract class C3261275m {
    public static final boolean A00(UserSession userSession, AnonymousClass2Ep r5, boolean z) {
        User BZK;
        0Tu r2;
        if (!r5.CUG() && (BZK = r5.BZK()) != null && ((BZK.A1x() || BZK.A20()) && ((AnonymousClass3U9) r5).A01.A2T)) {
            if (z) {
                r2 = 0Tu.A05;
            } else {
                r2 = 0Tu.A06;
            }
            if (182.A06(r2, userSession, 36319136808180665L)) {
                return true;
            }
        }
        return false;
    }
}
