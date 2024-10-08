package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* renamed from: X.2o2  reason: invalid class name */
public abstract class AnonymousClass2o2 {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return AnonymousClass2o3.A00(userSession).A05(UserMonetizationProductType.FAN_CLUB_CREATOR);
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36323977236328081L);
    }

    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36312973530367553L);
    }

    public static final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        FanClubInfoDict B3v = 0eE.A00(userSession).A00().A03.B3v();
        if (B3v == null || B3v.getFanClubId() == null || !182.A06(0Tu.A06, userSession, 36315894107934362L)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession) {
        if (182.A06(0Tu.A05, userSession, 36323990121229974L) || LTP.A00(userSession)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36323990121229974L)) {
            return true;
        }
        if (!LTP.A04(userSession) || !182.A06(r2, userSession, 36325751058150595L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        FanClubInfoDict B3v = 0eE.A00(userSession).A00().A03.B3v();
        if (B3v == null || B3v.getFanClubId() == null || !182.A06(0Tu.A05, userSession, 36315894107934362L)) {
            return false;
        }
        return true;
    }
}
