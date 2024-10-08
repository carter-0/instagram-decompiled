package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Nut  reason: case insensitive filesystem */
public abstract class C69953Nut {
    public static final boolean A00(UserSession userSession, Capabilities capabilities, N4P n4p) {
        boolean z;
        C242243Te r0 = n4p.A0E;
        if (r0 != null) {
            z = r0.A0Q;
        } else {
            z = false;
        }
        if (!capabilities.A00(C376179Gx.PSEUDO_CO_PRESENCE_ENABLED) || !182.A06(0Tu.A06, userSession, 36314493948529272L)) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36310319240380430L) || n4p.A0n || z || !182.A06(r2, userSession, 36314493950298748L)) {
            return false;
        }
        return true;
    }
}
