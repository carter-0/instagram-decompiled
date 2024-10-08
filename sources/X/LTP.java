package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.followersshare.FollowersShareFragment;

public abstract class LTP {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A01(userSession) || A02(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A05(userSession) || A06(userSession) || A07(userSession) || A08(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A09(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A00(userSession) || 182.A06(0Tu.A05, userSession, 36328946513493697L)) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession) {
        long A01 = 182.A01(0Tu.A05, userSession, 36610120843073512L);
        if (Long.valueOf(A01) == null || A01 != 2) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        long A01 = 182.A01(0Tu.A05, userSession, 36607226035115546L);
        if (Long.valueOf(A01) == null || A01 != 1) {
            return false;
        }
        return true;
    }

    public static final boolean A06(UserSession userSession) {
        long A01 = 182.A01(0Tu.A05, userSession, 36607226035115546L);
        if (Long.valueOf(A01) == null || A01 != 2) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession) {
        long A01 = 182.A01(0Tu.A05, userSession, 36607226035115546L);
        if (Long.valueOf(A01) == null || A01 != 3) {
            return false;
        }
        return true;
    }

    public static final boolean A08(UserSession userSession) {
        long A01 = 182.A01(0Tu.A05, userSession, 36607226035115546L);
        if (Long.valueOf(A01) == null || A01 != 4) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        long A01 = 182.A01(AnonymousClass7TF.A0H(userSession), userSession, 36610120843073512L);
        if (Long.valueOf(A01) == null || A01 != 1) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        if (!A04(userSession) || !182.A06(0Tu.A05, userSession, 36325751058281669L)) {
            return false;
        }
        return true;
    }

    public static boolean A0A(FollowersShareFragment followersShareFragment) {
        return A09(followersShareFragment.A0R());
    }
}
