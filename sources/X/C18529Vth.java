package X;

import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vth  reason: case insensitive filesystem */
public final class C18529Vth {
    public static final C18529Vth A00 = new Object();

    public final boolean A00(PromoteData promoteData) {
        UserSession userSession = promoteData.A0y;
        0qQ.A06(userSession);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36319630729420331L)) {
            return false;
        }
        if (promoteData.A2F || !182.A06(r3, userSession, 36319231297461273L)) {
            return true;
        }
        return false;
    }
}
