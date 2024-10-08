package X;

import com.instagram.common.session.UserSession;
import org.json.JSONObject;

public abstract class FCY {
    public static final 1OC A00(UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(userSession, 0);
        AnonymousClass7TF.A1B(str, 1, str2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("friendships/unblock/%s/", new Object[]{str2});
        DbS.A1P(A0a, str2);
        A0a.A9m("container_module", str);
        A0a.A0G("client_request_id", str3);
        return DbW.A0L(A0a, C320136rp.class, C320146rq.class, true);
    }

    public static final 1OC A01(UserSession userSession, String str, String str2, String str3, JSONObject jSONObject, boolean z) {
        String str4;
        String str5 = null;
        if (jSONObject != null) {
            str4 = jSONObject.toString();
        } else {
            str4 = null;
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0K("friendships/block/%s/", new Object[]{str2});
        DbS.A1P(A0a, str2);
        A0a.A9m("surface", str);
        A0a.A9m("container_module", str);
        A0a.A0H("is_auto_block_enabled", z);
        A0a.A0G("client_request_id", str3);
        1Xj A02 = 1E8.A03.A02(userSession, "BlockUserApi", (String) null);
        if (A02 != null) {
            str5 = DbT.A0x(A02);
        }
        A0a.A0G("ranking_info_token", str5);
        if (str4 != null) {
            A0a.AA0("entrypoint", str4);
        }
        A0a.A0O((15p) null, C320136rp.class, C320146rq.class, false);
        return DbT.A0U(A0a, true);
    }

    public static final 1OC A02(UserSession userSession, String str, JSONObject jSONObject) {
        String str2;
        0qQ.A0B(userSession, 0);
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        } else {
            str2 = null;
        }
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A("friendships/block_all_suggested_blocks/");
        A0a.A0G("client_request_id", str);
        A0a.A0O((15p) null, C320136rp.class, C320146rq.class, false);
        if (str2 != null) {
            A0a.AA0("entrypoint", str2);
        }
        return DbW.A0K(A0a);
    }
}
