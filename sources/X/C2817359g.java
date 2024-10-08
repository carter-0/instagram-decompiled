package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.59g  reason: invalid class name and case insensitive filesystem */
public abstract class C2817359g {
    public static String A00(UserSession userSession, 1Xj r4) {
        String id;
        if ((182.A06(0Tu.A05, userSession, 36312879040824667L) || C228342lQ.A08(userSession, 1Au.A00(userSession))) && r4.A2R() != null) {
            id = r4.A2R();
        } else {
            id = r4.getId();
        }
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
