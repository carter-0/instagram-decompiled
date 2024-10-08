package X;

import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.KxF  reason: case insensitive filesystem */
public abstract class C63450KxF {
    public static 1OC A00(GiphyRequestSurface giphyRequestSurface, UserSession userSession, String str, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C62564Khu) it.next()).A00);
        }
        1NY A0O = DbU.A0O(userSession);
        JTS.A1K(A0O, jSONArray, str);
        A0O.A9m("request_surface", giphyRequestSurface.toString());
        return DbT.A0S(A0O, C61293K1g.class, C64034LJy.class);
    }
}
