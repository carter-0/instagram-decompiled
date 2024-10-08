package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Dr  reason: invalid class name and case insensitive filesystem */
public abstract class C375469Dr {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        FanClubInfoDict B3v = 0eE.A00(userSession).A00().A03.B3v();
        if (B3v == null || B3v.getFanClubId() == null || !182.A06(0Tu.A05, userSession, 36316542648193509L)) {
            return false;
        }
        return true;
    }
}
