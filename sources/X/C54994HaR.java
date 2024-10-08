package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HaR  reason: case insensitive filesystem */
public abstract class C54994HaR {
    public static final void A00(UserSession userSession, C243363Yl r4, C243363Yl r5, 1Xj r6) {
        0qQ.A0B(userSession, 0);
        C51965G9l.A13();
        if (r4 != r5) {
            r6.A44(r5);
            C243363Yl r2 = C243363Yl.LIKED;
            int A0v = r6.A0v();
            int i = A0v - 1;
            if (r5 == r2) {
                i = A0v + 1;
            }
            r6.A3u(i);
            r6.AE7(userSession);
        }
    }
}
