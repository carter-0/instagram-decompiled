package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

public final class AfG implements C336227eH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AfG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final 1OC AMt(String str) {
        UserSession userSession;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                userSession = (UserSession) this.A02;
                0qQ.A0B(userSession, 0);
                str2 = 0mp.A06(C273654mx.A00(149), new Object[]{userSession.A06, "following"});
                str3 = "feed_favorites_list_page";
                break;
            case 1:
                userSession = (UserSession) this.A02;
                str2 = "users/search/";
                str3 = "story_user_tag_page";
                break;
            default:
                1NY r4 = new 1NY((0lg) this.A02);
                r4.A05();
                r4.A0A("business/account/get_suggested_hashtags/");
                Iterator it = ((C39659A3z) this.A01).A00.A01.iterator();
                String str4 = "";
                while (it.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(it);
                    if (str4.length() > 0) {
                        str4 = 002.A0R(str4, ",");
                    }
                    str4 = 002.A0R(str4, A18);
                }
                r4.A9m("used_hashtags", str4);
                r4.A0R(CGV.class, D2T.class);
                return r4.A0M();
        }
        return FGQ.A04(userSession, str2, str, str3, (String) null);
    }
}
