package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eox  reason: case insensitive filesystem */
public abstract class C49079Eox {
    public static final E3T A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        E3T e3t = new E3T();
        DbZ.A1B(e3t, "IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        return e3t;
    }
}
