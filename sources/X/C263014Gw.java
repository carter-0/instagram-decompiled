package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4Gw  reason: invalid class name and case insensitive filesystem */
public final class C263014Gw {
    public static final C263014Gw A00 = new Object();

    public final boolean A03(UserSession userSession, 1Xj r6) {
        String str;
        User CCd;
        User CCd2;
        String str2 = userSession.A06;
        User CCd3 = r6.A0C.CCd();
        if (CCd3 != null) {
            str = CCd3.getId();
        } else {
            str = null;
        }
        if (0qQ.A0K(str2, str) || (CCd = r6.A0C.CCd()) == null || !0qQ.A0K(CCd.A0K(), true) || (CCd2 = r6.A0C.CCd()) == null || CCd2.A29()) {
            return false;
        }
        return true;
    }

    public static final Integer A00(1Xj r3) {
        List Alu = r3.A0C.Alu();
        if (Alu == null) {
            return null;
        }
        int A14 = r3.A14();
        int size = Alu.size();
        if (A14 != -1) {
            size--;
        }
        return Integer.valueOf(size);
    }

    public static final boolean A01(UserSession userSession, 1Xj r2) {
        if (!r2.A6H() || !C56645I6a.A02(userSession)) {
            return false;
        }
        return true;
    }

    public final boolean A02(UserSession userSession, 1Xj r4) {
        if (!r4.A6V(userSession) || r4.A6S(userSession)) {
            return false;
        }
        Integer A002 = A00(r4);
        if (A002 == null || A002.intValue() < C56645I6a.A00(userSession)) {
            return true;
        }
        return false;
    }
}
