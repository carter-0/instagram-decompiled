package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6VE  reason: invalid class name */
public abstract class AnonymousClass6VE {
    public static final boolean A00(UserSession userSession, C255773uh r5) {
        String str;
        String A2y;
        1Xj r3 = r5.A0b;
        String str2 = null;
        if (r3 != null) {
            C2808054e C09 = r3.A0C.C09();
            if (C09 != null) {
                str = C09.Bf8();
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        if (r3 != null) {
            str2 = r3.A2y();
        }
        if (!C379209Sy.A01(userSession, str2)) {
            if (r3 == null) {
                return false;
            }
            String A2y2 = r3.A2y();
            if ((A2y2 == null || A2y2.length() == 0 || !C379209Sy.A01.contains(A2y2)) && ((A2y = r3.A2y()) == null || A2y.length() == 0 || !C379209Sy.A00.contains(A2y))) {
                return false;
            }
        }
        return true;
    }
}
