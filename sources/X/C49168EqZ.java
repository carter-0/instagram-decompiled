package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EqZ  reason: case insensitive filesystem */
public abstract class C49168EqZ {
    public static final 1OC A00(UserSession userSession, String str) {
        1NY A0M = DbZ.A0M(userSession);
        A0M.A0A("oembed/");
        A0M.A9m("url", str);
        return DbU.A0S(A0M, DwT.class, C49806F7t.class);
    }
}
