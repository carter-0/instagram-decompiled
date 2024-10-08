package X;

import com.instagram.common.session.UserSession;

public final class PDQ implements C74410PuQ {
    public final String AUf(UserSession userSession) {
        return "no unsupported notification types through iris";
    }

    public final /* bridge */ /* synthetic */ boolean ASy(UserSession userSession, Object obj) {
        C68161N3b n3b;
        C68149N2p n2p = (C68149N2p) obj;
        0qQ.A0B(n2p, 0);
        if (n2p.A02 == AnonymousClass05K.A00 && (n3b = n2p.A01) != null) {
            0qQ.A0C(n3b, "null cannot be cast to non-null type com.instagram.direct.notifications.core.api.DirectNotification.MessageDirectNotificationTypeData");
            if (!N8Y.A00(2, n3b.A02)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
