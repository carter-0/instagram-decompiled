package X;

import com.instagram.common.session.UserSession;

public final class PDU implements C74410PuQ {
    public final /* synthetic */ OGB A00;

    public final boolean ASy(UserSession userSession, Object obj) {
        0qQ.A0B(userSession, 1);
        if (System.currentTimeMillis() >= ((1Av) this.A00.A02.invoke(userSession)).A01.getLong(AnonymousClass000.A00(1280), -1)) {
            return true;
        }
        return false;
    }

    public final String AUf(UserSession userSession) {
        return "app setting - all notifications paused";
    }

    public PDU(OGB ogb) {
        this.A00 = ogb;
    }
}
