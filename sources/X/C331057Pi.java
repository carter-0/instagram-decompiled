package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Pi  reason: invalid class name and case insensitive filesystem */
public final class C331057Pi {
    public static final boolean A01(UserSession userSession, C242373Tu r4) {
        if (r4 == null || !r4.A03(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C242373Tu r2) {
        return r2 != null && r2.A01();
    }

    public final boolean A03(UserSession userSession, C242373Tu r4) {
        0qQ.A0B(userSession, 1);
        if (A02(r4) || A01(userSession, r4)) {
            return true;
        }
        return false;
    }

    public static final C331077Pk A00(UserSession userSession) {
        return (C331077Pk) userSession.A01(C331077Pk.class, new AnonymousClass9L0(userSession, 17));
    }
}
