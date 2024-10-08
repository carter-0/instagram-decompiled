package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.lockedchat.LockedChatKillSwitch;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class OQ7 {
    public static final 1OC A00(UserSession userSession, String str, List list, Map map) {
        String str2;
        boolean isLockedChatEnabled = LockedChatKillSwitch.isLockedChatEnabled(userSession, false);
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A("direct_v2/search_secondary/");
        A0b.A9m("query", str);
        try {
            StringWriter A0v = JTO.A0v();
            17W A0A = AnonymousClass15o.A00.A0A(A0v);
            A0A.A0b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0A.A0t(AnonymousClass7TE.A18(it));
            }
            A0A.A0Y();
            A0A.close();
            str2 = A0v.toString();
        } catch (IOException e) {
            0wb.A06("DirectSearchSecondaryApi", "Failed to convert collection to json", e);
            str2 = null;
        }
        A0b.A9m("result_types", str2);
        A0b.A9m("offsets", A01(map));
        A0b.A9m("hide_locked_threads", A01(AnonymousClass7TF.A0w("message_content", String.valueOf(isLockedChatEnabled))));
        return DbU.A0S(A0b, C68415NHa.class, OQH.class);
    }

    public static final String A01(Map map) {
        try {
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                Object value = A1J.getValue();
                A0K.A0q(A13);
                A0K.A0J(value);
            }
            return AnonymousClass7TG.A0k(A0K, A0v);
        } catch (IOException e) {
            0wb.A06("DirectSearchSecondaryApi", "Failed to convert collection to json", e);
            return null;
        }
    }
}
