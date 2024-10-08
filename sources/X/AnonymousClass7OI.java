package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7OI  reason: invalid class name */
public abstract class AnonymousClass7OI {
    public static final boolean A00(UserSession userSession, C254793t3 r4) {
        boolean z = false;
        0qQ.A0B(userSession, 0);
        if (r4 != null) {
            z = AnonymousClass9HV.A00(userSession).A00(r4, 66);
        }
        if (z || r4 == null || !AnonymousClass9HV.A00(userSession).A00(r4, 6)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, C254793t3 r2) {
        0qQ.A0B(userSession, 0);
        if (r2 != null) {
            return AnonymousClass9HV.A00(userSession).A00(r2, 50);
        }
        return false;
    }
}
