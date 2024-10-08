package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HZu  reason: case insensitive filesystem */
public abstract class C54964HZu {
    public static final 1OC A00(UserSession userSession, String str) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("fbsearch/accounts_recs/");
        A0M.A9m("target_user_id", str);
        A0M.A9m("surface", "discover_page");
        return DbU.A0S(A0M, C334247ax.class, C334257ay.class);
    }
}
