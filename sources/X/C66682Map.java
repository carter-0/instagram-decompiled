package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Map  reason: case insensitive filesystem */
public abstract class C66682Map {
    public static final boolean A00(UserSession userSession, int i) {
        0qQ.A0B(userSession, 1);
        0Tu r3 = 0Tu.A06;
        if (182.A06(r3, userSession, 36324453977698399L)) {
            boolean z = false;
            if (i == 0) {
                if (182.A06(r3, userSession, 36324453977763936L)) {
                    Boolean bool = (Boolean) DcK.A00(userSession).A03.getValue();
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                    return !z;
                }
            } else if (i != 2) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
