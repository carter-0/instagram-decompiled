package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.5fd  reason: invalid class name and case insensitive filesystem */
public abstract class C290635fd {
    @Deprecated(message = "Use getInstanceAsync() instead", replaceWith = @ReplaceWith(expression = "getInstanceAsync(userSession)", imports = {}))
    public static final C290645fe A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C290645fe) userSession.A01(C290645fe.class, new C377199Kx(userSession, 40));
    }

    public static final C290815g0 A01(UserSession userSession, 2Cn r4) {
        0qQ.A0B(userSession, 0);
        C290815g0 r0 = new C290815g0(new C59795JYo(userSession), 1967622104);
        r0.A00 = r4;
        return r0;
    }
}
