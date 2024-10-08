package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6Cc  reason: invalid class name and case insensitive filesystem */
public abstract class C304086Cc {
    public static final Integer A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String A04 = 182.A04(0Tu.A05, userSession, 36889718918808410L);
        int hashCode = A04.hashCode();
        if (hashCode != 103067) {
            if (hashCode != 93494179 || !A04.equals("badge")) {
                return null;
            }
            return AnonymousClass05K.A00;
        } else if (A04.equals("hat")) {
            return AnonymousClass05K.A01;
        } else {
            return null;
        }
    }
}
