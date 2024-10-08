package X;

import com.instagram.common.session.UserSession;

public abstract class SCL {
    public static final C11235SGv A00 = new C11235SGv();

    public static final void A00(UserSession userSession, String str, String str2, boolean z) {
        AnonymousClass3LT r0;
        2cc A002 = C71342cb.A00(userSession);
        String str3 = str;
        if (!z) {
            str3 = null;
        }
        C12800T7n t7n = new C12800T7n(str2, str3);
        A002.A0G = z;
        A002.A0E("separate_process", t7n);
        if (z && (r0 = C340057kd.A00(userSession).A01) != null) {
            r0.A00(str2, str);
        }
    }
}
