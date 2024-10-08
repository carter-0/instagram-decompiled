package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.Hao  reason: case insensitive filesystem */
public abstract class C55017Hao {
    public static final 1OC A00(UserSession userSession, List list) {
        AnonymousClass7TG.A1N(userSession, list);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(DbS.A11().put("m_pk", ((1Nv) it.next()).getId()));
        }
        String A10 = DbT.A10(jSONArray);
        1NY A0M = DbU.A0M(userSession);
        A0M.A05();
        A0M.A02();
        A0M.A0A("api/v1/accounts/get_controls_filtered_media/");
        A0M.A0Q(C54041GyQ.class, C56210Hud.class);
        1OC A0T = DbT.A0T(A0M, "media_infos", A10);
        0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetControlsFilteredMediaResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetControlsFilteredMediaResponse>>");
        return A0T;
    }
}
