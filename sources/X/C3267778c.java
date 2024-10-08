package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.78c  reason: invalid class name and case insensitive filesystem */
public final class C3267778c implements AnonymousClass78U {
    public static final C3267778c A00 = new Object();

    public final boolean CVU(UserSession userSession, AnonymousClass78R r7, String str) {
        String obj;
        0qQ.A0B(userSession, 2);
        if (str.length() == 0) {
            return false;
        }
        if (str.equalsIgnoreCase(002.A0C("ai", ' ')) || ((obj = 00l.A0B(str).toString()) != null && obj.equalsIgnoreCase("meta ai"))) {
            return true;
        }
        if (!str.equalsIgnoreCase("ai") || 182.A06(0Tu.A05, userSession, 36328366693170465L)) {
            return false;
        }
        return true;
    }
}
