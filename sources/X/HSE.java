package X;

import com.instagram.common.session.UserSession;

public abstract class HSE {
    public static final C56603I4c A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C56603I4c i4c = C56603I4c.A0C;
        if (i4c != null) {
            return i4c;
        }
        C56603I4c i4c2 = new C56603I4c(userSession);
        C56603I4c.A0C = i4c2;
        return i4c2;
    }
}
