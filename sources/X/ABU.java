package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import org.json.JSONArray;

public abstract class ABU {
    public static final 1OC A00(AnonymousClass1O9 r5, UserSession userSession, String str) {
        0qQ.A0B(str, 2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("warning/check_offensive_text/");
        A0a.A0Q(C384639he.class, ABV.class);
        A0a.A9m(AnonymousClass000.A00(90), AnonymousClass7TF.A0j("CAPTION"));
        A0a.A9m("text", str);
        A0a.A9m("media_id", (String) null);
        if (r5 != null) {
            A0a.A00 = r5;
        }
        A0a.A0R = true;
        return A0a.A0M();
    }

    public static final 1OC A01(AnonymousClass1O9 r4, UserSession userSession, List list) {
        0qQ.A0B(list, 2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("warning/check_offensive_multi_text/");
        A0a.A0Q(C384639he.class, ABV.class);
        A0a.A9m(AnonymousClass000.A00(90), AnonymousClass7TF.A0j("CAPTION"));
        A0a.A9m("text_list", new JSONArray(list).toString());
        A0a.A9m("media_id", (String) null);
        if (r4 != null) {
            A0a.A00 = r4;
        }
        A0a.A0R = true;
        return A0a.A0M();
    }
}
