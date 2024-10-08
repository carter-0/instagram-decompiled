package X;

import com.instagram.common.session.UserSession;

public final class PIi implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r5) {
        UserSession userSession = this.A00;
        if (182.A06(0Tu.A05, userSession, 36327537764219383L)) {
            return false;
        }
        if ((C67015Mgo.A02(userSession) || C67015Mgo.A00(userSession) || C67015Mgo.A01(userSession)) && !C67046MhJ.A02(userSession) && !C67046MhJ.A00(userSession) && !C67046MhJ.A01(userSession)) {
            return true;
        }
        return false;
    }

    public PIi(UserSession userSession) {
        this.A00 = userSession;
    }
}
