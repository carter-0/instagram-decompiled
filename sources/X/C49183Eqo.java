package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Eqo  reason: case insensitive filesystem */
public abstract class C49183Eqo {
    public static final 1OC A00(UserSession userSession, String str) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("users/blocked_list/");
        A0M.A0Q(Dw0.class, F8D.class);
        if (!(str == null || str.length() == 0)) {
            A0M.A9m("max_id", str);
        }
        return A0M.A0M();
    }
}
