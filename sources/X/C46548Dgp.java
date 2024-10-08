package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dgp  reason: case insensitive filesystem */
public abstract class C46548Dgp {
    public static final C46474Dfc A01(UserSession userSession, String str, String str2, String str3) {
        DbZ.A0t(0, userSession, str2, str3);
        C46474Dfc dfc = new C46474Dfc(userSession.A05, str2, str3);
        dfc.A0R = str;
        if (2R8.A07(userSession.A06, str)) {
            dfc.A0b = true;
        }
        return dfc;
    }

    public static final C46474Dfc A02(UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TG.A1U(str, str2, str3);
        C46474Dfc dfc = new C46474Dfc(userSession.A05, str2, str3);
        if (!DbU.A1a(str, " ")) {
            dfc.A0S = str;
            User user = (User) 17h.A00(userSession).A02.get(str);
            if (user != null && 2R8.A07(userSession.A06, user.getId())) {
                dfc.A0b = true;
            }
            return dfc;
        }
        throw DbW.A0c("Username cannot contain whitespace: ", str);
    }

    public static final C46474Dfc A00(UserSession userSession, String str, String str2) {
        DbY.A1S(userSession, str2);
        C46474Dfc dfc = new C46474Dfc(userSession.A05, str, str2);
        dfc.A0R = userSession.A06;
        dfc.A0b = true;
        return dfc;
    }
}
