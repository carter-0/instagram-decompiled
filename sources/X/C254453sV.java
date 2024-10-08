package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3sV  reason: invalid class name and case insensitive filesystem */
public abstract class C254453sV {
    public static final HashMap A00(UserSession userSession) {
        double d;
        0qQ.A0B(userSession, 0);
        C2370236a A00 = C2370236a.A00(userSession);
        0qQ.A07(A00);
        String A01 = A00.A01();
        String str = "";
        if (A01 == null) {
            A01 = str;
        }
        0eP r4 = new 0eP("last_action", A01);
        String A02 = A00.A02();
        if (A02 != null) {
            str = A02;
        }
        0eP r3 = new 0eP("last_actions", str);
        synchronized (A00) {
            d = A00.A00;
        }
        return 0Yt.A02(new 0eP[]{r4, r3, new 0eP("scroll_velocity", String.valueOf(d))});
    }
}
