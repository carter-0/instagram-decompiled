package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Ele  reason: case insensitive filesystem */
public abstract class C48878Ele {
    public static final FAS A00(UserSession userSession, C65891hh r5) {
        String str;
        AnonymousClass7TG.A1N(r5, userSession);
        DirectThreadKey directThreadKey = r5.A00;
        if (directThreadKey != null) {
            String str2 = directThreadKey.A00;
            String str3 = directThreadKey.A01;
            if (str2 == null || str3 == null) {
                return null;
            }
            String str4 = r5.A01;
            if (str4 != null) {
                return new FAS(userSession, str4, str2, str3);
            }
            str = "sessionIdFromCall";
        } else {
            str = "directThreadKey";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
