package X;

import com.instagram.api.schemas.IGConsiderAndBrowseType;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.51e  reason: invalid class name and case insensitive filesystem */
public abstract class C2803051e {
    public static final boolean A00(C278644xI r2, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!A02(r2, userSession) || !182.A06(0Tu.A06, userSession, 36320549852619358L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(C278644xI r3, UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!182.A06(0Tu.A06, userSession, 36320549852684895L) || !A02(r3, userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(C278644xI r4, UserSession userSession) {
        List<C278624xG> AiA;
        if (r4 == null || (AiA = r4.AiA()) == null) {
            return false;
        }
        if ((AiA instanceof Collection) && AiA.isEmpty()) {
            return false;
        }
        for (C278624xG CGB : AiA) {
            if (CGB.CGB() == IGConsiderAndBrowseType.PROFILE_AND_BROWSE) {
                return 182.A06(0Tu.A06, userSession, 36320549852422748L);
            }
        }
        return false;
    }

    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A06, userSession, 36320549853995628L);
    }
}
