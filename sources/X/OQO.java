package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import kotlin.Deprecated;

public abstract class OQO {
    public static final Long A01(UserSession userSession, C254743sy r2) {
        0qQ.A0B(r2, 1);
        return 1bJ.A00(userSession).BWH(C66647MaG.A03(r2));
    }

    @Deprecated(message = "Please use `DirectThreadStore#getExtendedThread(threadKey)?.ephemeralityParams` instead.")
    public static final C70621ODs A00(UserSession userSession, DirectThreadKey directThreadKey) {
        AnonymousClass7TG.A1N(userSession, directThreadKey);
        AnonymousClass3U9 A03 = 2Dr.A03(1bJ.A00(userSession), directThreadKey);
        if (A03 != null) {
            return A03.B25();
        }
        return null;
    }
}
