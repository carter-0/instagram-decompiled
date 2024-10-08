package X;

import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.session.SettingsSession;

/* renamed from: X.FEd  reason: case insensitive filesystem */
public final class C49905FEd {
    public static final FA1 A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (FA1) userSession.A01(FA1.class, G2L.A00);
    }

    public final void A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        A01(userSession);
    }

    public static void A01(UserSession userSession) {
        SettingsSession settingsSession = A00(userSession).A00;
        if (settingsSession != null) {
            settingsSession.A03();
        }
    }
}
