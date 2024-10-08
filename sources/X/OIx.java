package X;

import com.instagram.common.session.UserSession;

public final class OIx {
    public final OT1 A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        OT1 ot1 = OT1.A02;
        if (ot1 == null) {
            synchronized (this) {
                ot1 = OT1.A02;
                if (ot1 == null) {
                    ot1 = new OT1(userSession);
                    OT1.A02 = ot1;
                }
            }
        }
        return ot1;
    }
}
