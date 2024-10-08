package X;

import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.HwT  reason: case insensitive filesystem */
public abstract class C56316HwT {
    public static final UserSession A00(FoaUserSession foaUserSession) {
        0qQ.A0B(foaUserSession, 0);
        UserSession userSession = ((IgMetaSessionImpl) foaUserSession).A00;
        if (userSession instanceof UserSession) {
            return userSession;
        }
        throw AnonymousClass7TE.A0z("Requesting logged in session, when a user is logged out");
    }

    public static final IgMetaSessionImpl A01(0lg r1) {
        0qQ.A0B(r1, 0);
        return new IgMetaSessionImpl(r1);
    }
}
