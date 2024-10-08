package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7jz  reason: invalid class name and case insensitive filesystem */
public final class C339677jz {
    public final synchronized C339667jy A00(UserSession userSession) {
        C339667jy r0;
        0qQ.A0B(userSession, 0);
        r0 = C339667jy.A02;
        if (r0 == null) {
            r0 = new C339667jy(userSession);
            C339667jy.A02 = r0;
        }
        return r0;
    }
}
