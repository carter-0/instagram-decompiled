package X;

import com.instagram.common.session.UserSession;

public abstract class A1B {
    public static void A00(UserSession userSession, String str) {
        0qQ.A0B(str, 0);
        String str2 = userSession.A06;
        if (!0qQ.A0K(str2, str)) {
            throw AnonymousClass7TE.A0z(002.A0v("Not a current user session(expected=", str, ", actual=", str2, ')'));
        }
    }
}
