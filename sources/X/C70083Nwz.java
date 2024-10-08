package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Nwz  reason: case insensitive filesystem */
public abstract class C70083Nwz {
    public static final boolean A00(UserSession userSession, DirectThreadKey directThreadKey) {
        AnonymousClass3U9 A0a;
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 0);
        if (directThreadKey == null || (A0a = C66582MXn.A0a(userSession, directThreadKey)) == null) {
            return false;
        }
        if (A0a.CXW()) {
            r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36325742468281522L)) {
                return false;
            }
            j = 36325742469264576L;
        } else if (A0a.COb() || AnonymousClass48O.A04(A0a.C6a())) {
            return false;
        } else {
            r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36325742468347059L)) {
                return false;
            }
            j = 36325742469133502L;
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }
}
