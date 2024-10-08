package X;

import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.HdK  reason: case insensitive filesystem */
public abstract class C55168HdK {
    public static final 1OC A00(UserSession userSession, SearchContext searchContext, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        String str7;
        String str8 = null;
        String str9 = null;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C51968G9o.A1K(A0a, 002.A0S("story_interactions/", str2, '/'), str);
        C51965G9l.A1S(A0a, str3);
        A0a.A9m("tray_session_id", str5);
        A0a.A0C("tray_position", i);
        A0a.A9m("viewer_session_id", str6);
        A0a.A0G("delivery_class", str4);
        if (searchContext != null) {
            str9 = searchContext.A05;
        }
        A0a.A0G("search_session_id", str9);
        if (searchContext != null) {
            str7 = searchContext.A03;
        } else {
            str7 = null;
        }
        A0a.A0G("rank_token", str7);
        if (searchContext != null) {
            str8 = searchContext.A02;
        }
        A0a.A0G("query_text", str8);
        A0a.A0Q(1XP.class, 1XY.class);
        return DbW.A0K(A0a);
    }
}
