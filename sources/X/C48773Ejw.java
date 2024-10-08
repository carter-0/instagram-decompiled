package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.Ejw  reason: case insensitive filesystem */
public abstract class C48773Ejw {
    public static final 1OC A00(AnonymousClass0iw r5, UserSession userSession, Collection collection, Collection collection2) {
        DbZ.A0t(0, userSession, collection, collection2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DbT.A1W(it, jSONArray);
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            DbT.A1W(it2, jSONArray2);
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("friendships/update_feed_favorites/");
        A0a.A9m("module", r5.getModuleName());
        A0a.A9m("block_on_empty_thread_creation", "false");
        A0a.A0Q(C47336Dv3.class, C49896FBz.class);
        A0a.AA0("add", jSONArray.toString());
        A0a.AA0("remove", jSONArray2.toString());
        return DbW.A0K(A0a);
    }
}
