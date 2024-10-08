package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.78a  reason: invalid class name and case insensitive filesystem */
public final class C3267578a implements AnonymousClass78U {
    public static final C3267578a A00 = new Object();

    public final boolean CVU(UserSession userSession, AnonymousClass78R r6, String str) {
        0qQ.A0B(userSession, 2);
        if (str.length() == 0) {
            return false;
        }
        String obj = 00l.A0B(str).toString();
        if (obj != null && obj.equalsIgnoreCase("meta")) {
            return true;
        }
        if (!00p.A0k("metaai", str, true) || !182.A06(0Tu.A05, userSession, 36331179896488899L)) {
            return false;
        }
        return true;
    }
}
