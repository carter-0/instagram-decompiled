package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mgo  reason: case insensitive filesystem */
public abstract class C67015Mgo {
    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!2HM.A00(userSession).A03() || !182.A06(0Tu.A05, userSession, 36316503993422243L)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!2HM.A00(userSession).A03() || !DbY.A1Z(0Tu.A05, userSession, 36316503993225634L)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(UserSession userSession) {
        if (!A03(userSession) || !new AnonymousClass631(userSession).A03.A01(112)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        if (!A03(userSession) || !new AnonymousClass631(userSession).A03.A01(113)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        if (!A04(userSession) || !new AnonymousClass631(userSession).A03.A01(111)) {
            return false;
        }
        return true;
    }
}
