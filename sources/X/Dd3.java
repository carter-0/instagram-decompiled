package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONObject;

public abstract class Dd3 {
    public static final 1OC A00(UserSession userSession, String str, String str2, String str3, Map map) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        String str4 = null;
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("news/log/");
        A0a.A0O((15p) null, 1XP.class, 1XY.class, false);
        A0a.A9m("action", str);
        A0a.A9m("pk", str2);
        A0a.A0G("tuuid", str3);
        if (map != null) {
            str4 = new JSONObject(map).toString();
        }
        A0a.A0G("controls", str4);
        return A0a.A0M();
    }
}
