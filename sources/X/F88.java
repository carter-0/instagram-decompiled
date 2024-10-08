package X;

import com.instagram.common.session.UserSession;

public abstract class F88 {
    public static final 1OC A00(UserSession userSession, String str, String str2) {
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("discover/chaining_dismiss/");
        A0L.A9m("target_id", str);
        DbX.A1M(A0L, "chaining_user_id", str2);
        return A0L.A0M();
    }

    public static final 1OC A01(UserSession userSession, String str, String str2, String str3) {
        1NY A0L = DbZ.A0L(userSession);
        A0L.A0A("discover/aysf_dismiss/");
        A0L.A9m("target_id", str);
        DbX.A1M(A0L, "uuid", str2);
        if (str3 != null) {
            A0L.A9m("algorithm", str3);
        }
        return A0L.A0M();
    }
}
