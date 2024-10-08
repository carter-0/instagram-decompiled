package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7a2  reason: invalid class name and case insensitive filesystem */
public final class C333737a2 implements AnonymousClass0lh {
    public final Map A00 = new LinkedHashMap();
    public final UserSession A01;

    public C333737a2(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.A03(C333737a2.class);
    }
}
