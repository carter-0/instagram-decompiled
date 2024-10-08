package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public abstract class OXI {
    public static final String A00(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DbT.A1W(it, jSONArray);
        }
        return DbT.A10(jSONArray);
    }

    public static void A01(1NY r2, UserSession userSession, C51905G6z g6z, Collection collection) {
        r2.A9m("user_ids", A00(collection));
        r2.A0Q(AnonymousClass74W.class, AnonymousClass74X.class);
        1OC A0M = r2.A0M();
        A0M.A00 = new C47371Dwh(userSession, g6z, 4);
        1ES.A03(A0M);
    }

    public static final void A02(UserSession userSession, C51905G6z g6z, String str, List list) {
        AnonymousClass7TG.A1N(userSession, str);
        if (AnonymousClass7TE.A1b(list)) {
            1NY A0a = AnonymousClass7TG.A0a(userSession);
            A0a.A0K("direct_v2/threads/%s/approve_participant_requests/", new Object[]{str});
            A01(A0a, userSession, g6z, list);
        }
    }
}
