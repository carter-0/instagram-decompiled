package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7aw  reason: invalid class name and case insensitive filesystem */
public abstract class C334237aw {
    public static final long A00 = TimeUnit.SECONDS.toMillis(10);
    public static final Map A01 = new ConcurrentHashMap();

    public static final 1OC A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A("restrict_action/get_restricted_users/");
        r2.A0O((15p) null, C334247ax.class, C334257ay.class, false);
        return r2.A0M();
    }

    public static final 1OC A01(UserSession userSession, String str, String str2) {
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A01);
        r3.A0A("restrict_action/unrestrict/");
        r3.A9m("target_user_id", str);
        r3.A0O((15p) null, C334247ax.class, C334257ay.class, false);
        r3.A9m("container_module", str2);
        return r3.A0M();
    }

    public static final void A02(Context context, AnonymousClass07i r11, UserSession userSession, G83 g83, C333937aO r14, String str, String str2, String str3, List list) {
        String str4 = str3;
        0qQ.A0B(r11, 1);
        0qQ.A0B(r14, 3);
        List list2 = list;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("session_user_id:%s::change_type:%s::target_user_id:%s", userSession.A06, "restrict_many", TextUtils.join(",", list2));
        0qQ.A07(formatStrLocaleSafe);
        Map map = A01;
        Number number = (Number) map.get(formatStrLocaleSafe);
        if (number != null) {
            if (number.longValue() + A00 <= System.currentTimeMillis()) {
                map.remove(formatStrLocaleSafe);
            } else {
                return;
            }
        }
        1NY r5 = new 1NY(userSession, -2);
        r5.A08(AnonymousClass05K.A01);
        r5.A0A("restrict_action/restrict_many/");
        r5.A9m("user_ids", TextUtils.join(",", list2));
        r5.A0O((15p) null, C334247ax.class, C334257ay.class, false);
        r5.A9m("container_module", str);
        if (str3 == null) {
            String str5 = str2;
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("surface", AnonymousClass000.A00(3799));
                    jSONObject.put("comment_id", str5);
                } catch (JSONException e) {
                    0wb.A03("Restrict API", 002.A0R(AnonymousClass000.A00(2254), e.getMessage()));
                }
                str4 = jSONObject.toString();
                0qQ.A07(str4);
            }
            r5.A0R = true;
            1OC A0M = r5.A0M();
            A0M.A00 = new ED5(userSession, new C390179qr(r14), g83, formatStrLocaleSafe);
            1ES.A00(context, r11, A0M);
        }
        r5.AA0("entrypoint", str4);
        r5.A0R = true;
        1OC A0M2 = r5.A0M();
        A0M2.A00 = new ED5(userSession, new C390179qr(r14), g83, formatStrLocaleSafe);
        1ES.A00(context, r11, A0M2);
    }
}
