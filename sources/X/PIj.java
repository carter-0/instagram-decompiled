package X;

import com.instagram.common.session.UserSession;

public final class PIj implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r5) {
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A00;
        if (!2Ek.A01(r0.A01(userSession))) {
            return false;
        }
        Boolean bool = (Boolean) 1bJ.A00(userSession).A0C.A0E.get(AnonymousClass2EX.A00);
        if ((bool == null || !bool.booleanValue()) && !182.A06(0Tu.A05, userSession, 36315855453163110L)) {
            return false;
        }
        return true;
    }

    public PIj(UserSession userSession) {
        this.A00 = userSession;
    }
}
