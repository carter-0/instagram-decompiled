package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6wh  reason: invalid class name and case insensitive filesystem */
public final class C322966wh implements AnonymousClass0lh {
    public static final C322976wi A02 = new Object();
    public final UserSession A00;
    public final Map A01 = new LinkedHashMap();

    public static final Integer A00(C322966wh r3) {
        UserSession userSession = r3.A00;
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36320008687525751L)) {
            return Integer.valueOf((int) 182.A01(r2, userSession, 36601483663970514L));
        }
        return null;
    }

    public final void onSessionWillEnd() {
        this.A01.clear();
    }

    public C322966wh(UserSession userSession) {
        this.A00 = userSession;
    }
}
