package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Ds  reason: invalid class name and case insensitive filesystem */
public abstract class C375479Ds {
    public static final int A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (int) 182.A01(0Tu.A05, userSession, 36596106364717370L);
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        FanClubInfoDict B3v = 0eE.A00(userSession).A00().A03.B3v();
        if (B3v == null || B3v.getFanClubId() == null || !182.A06(0Tu.A05, userSession, 36314631387482858L)) {
            return false;
        }
        return true;
    }
}
