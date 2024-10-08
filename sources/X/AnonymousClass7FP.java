package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7FP  reason: invalid class name */
public final class AnonymousClass7FP {
    public final UserSession A00;

    public AnonymousClass7FP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final boolean A00(AnonymousClass7FP r3, C254703su r4, boolean z) {
        String str;
        C271374ik r0;
        if (r4.A10 != 2FW.A0q) {
            return false;
        }
        UserSession userSession = r3.A00;
        if (0qQ.A0K(userSession.A06, r4.BsI())) {
            return false;
        }
        C271374ik r02 = r4.A0e;
        if (r02 != null) {
            str = r02.A09;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str, "permanent") && ((r0 = r4.A0e) == null || r0.A00 <= 0)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36325579259130939L)) {
            return false;
        }
        if (z && !182.A06(r2, userSession, 36325579259524161L)) {
            return false;
        }
        if (!r4.A1S() || 182.A06(r2, userSession, 36325579259196476L)) {
            return true;
        }
        return false;
    }
}
