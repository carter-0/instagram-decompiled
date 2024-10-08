package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.Set;

public final class ENK extends 1XF {
    public final void A06(AnonymousClass5HJ r9, UserSession userSession, String str) {
        UserSession userSession2 = userSession;
        AnonymousClass7TF.A1H(r9, userSession);
        String str2 = r9.A0g;
        if (str2 == null) {
            str2 = "";
        }
        String queryParameter = DbT.A09(str2).getQueryParameter("launch_reel_user_ids");
        if (queryParameter != null) {
            Set A0k = 00k.A0k(DbX.A0x(queryParameter));
            new AnonymousClass3PT(userSession2, AnonymousClass3BU.NOTIFICATION, new C47990EPw(userSession, this), "notification_prefetch", (Map) null, A0k).A06();
        }
    }

    public final boolean A09(AnonymousClass5HJ r2, UserSession userSession, String str) {
        return true;
    }

    public final String A0C() {
        return "igstory";
    }

    public final void A0D(AnonymousClass5HJ r2, 0lg r3, C70792OLn oLn, String str) {
        0qQ.A0B(oLn, 3);
        oLn.A00(true);
    }
}
