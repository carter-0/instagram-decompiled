package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6w6  reason: invalid class name and case insensitive filesystem */
public abstract class C322606w6 {
    public static final long A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return TimeUnit.MINUTES.toMillis(182.A01(0Tu.A05, userSession, 36606212423357798L));
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36322207709800447L);
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36327426095069606L);
    }

    public static final boolean A03(UserSession userSession) {
        long j;
        0qQ.A0B(userSession, 0);
        boolean A0K = 0qQ.A0K(C71342cb.A00(userSession).A05, "PROFILE");
        0Tu r2 = 0Tu.A05;
        if (A0K) {
            j = 36317560555771219L;
        } else {
            j = 36317560556164440L;
        }
        return 182.A06(r2, userSession, j);
    }

    public static final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!0qQ.A0K(C71342cb.A00(userSession).A05, "PROFILE")) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36317560556164440L) || !182.A06(r2, userSession, 36317560556295514L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36328147649706969L);
    }

    public static final boolean A05(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36324909244297681L) || 182.A06(r2, userSession, 36327426095069606L)) {
            return true;
        }
        return false;
    }
}
