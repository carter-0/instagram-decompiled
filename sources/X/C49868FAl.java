package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import org.json.JSONArray;

/* renamed from: X.FAl  reason: case insensitive filesystem */
public final class C49868FAl {
    public static final 1OC A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        String A06 = 0mp.A06(AnonymousClass000.A00(4179), new Object[]{userSession.A06});
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0A(A06);
        return DbU.A0S(A0b, C3727892k.class, C3727992l.class);
    }

    @Deprecated(message = "")
    public final 1OC A01(AnonymousClass0iw r6, UserSession userSession, Integer num, Collection collection, Collection collection2) {
        String str;
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
        A0a.A0A("friendships/set_besties/");
        switch (num.intValue()) {
            case 0:
                str = "audience_dialog";
                break;
            case 1:
                str = "audience_manager";
                break;
            case 2:
                str = AnonymousClass000.A00(1712);
                break;
            default:
                str = "netego_unit";
                break;
        }
        A0a.A9m("source", str);
        A0a.A9m("module", r6.getModuleName());
        DbX.A1M(A0a, "block_on_empty_thread_creation", "false");
        A0a.AA0("add", jSONArray.toString());
        A0a.AA0("remove", jSONArray2.toString());
        return DbW.A0K(A0a);
    }
}
