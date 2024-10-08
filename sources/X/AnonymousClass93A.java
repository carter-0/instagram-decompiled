package X;

import android.util.Pair;
import com.instagram.common.session.UserSession;

/* renamed from: X.93A  reason: invalid class name */
public abstract class AnonymousClass93A {
    public static 0xa A00;

    public static final 1OC A00(UserSession userSession) {
        Pair A002 = C278474ww.A00(userSession);
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A01);
        r3.A0A("creatives/write_supported_capabilities/");
        Object obj = A002.first;
        0qQ.A06(obj);
        r3.A0G((String) obj, (String) A002.second);
        r3.A0O((15p) null, 1XP.class, 1XY.class, false);
        r3.A0R = true;
        return r3.A0M();
    }
}
