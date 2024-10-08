package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.9Qo  reason: invalid class name and case insensitive filesystem */
public abstract class C378629Qo {
    public static final boolean A00(UserSession userSession, String str) {
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 0);
        if (str == null) {
            return false;
        }
        if (str.equals("324984895725671")) {
            r2 = 0Tu.A05;
            j = 36317393051456616L;
        } else if (!str.equals("389287015265096")) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36317393051522153L;
        }
        if (182.A06(r2, userSession, j) || 182.A06(0Tu.A06, userSession, 36327627958598215L)) {
            return true;
        }
        return false;
    }
}
