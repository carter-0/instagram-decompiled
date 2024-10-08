package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.HSe  reason: case insensitive filesystem */
public abstract class C54772HSe {
    public static final 1OC A00(UserSession userSession, String str) {
        1NY A0M = DbU.A0M(userSession);
        A0M.A04();
        A0M.A0A("ads/ads_history/");
        A0M.A9m("ig_user_id", userSession.A06);
        A0M.A9m("page_type", "94");
        A0M.A0G("next_max_id", str);
        0qQ.A0B(AnonymousClass000.A00(685), 0);
        A0M.A02 = new 1NT(new 0bH(userSession), new 1NX((File) null), C45497CxX.class, false);
        return A0M.A0M();
    }
}
