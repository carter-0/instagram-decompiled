package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.9FF  reason: invalid class name */
public final class AnonymousClass9FF {
    public static final AnonymousClass9FF A00 = new Object();

    public final boolean A00(UserSession userSession, String str) {
        0qQ.A0B(str, 1);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 2342160118797374242L)) {
            return true;
        }
        String A04 = 182.A04(r2, userSession, 36880059537031460L);
        if (A04.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(A04);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    if (0qQ.A0K(jSONArray.get(i), str)) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
                0wc r22 = (0wc) ((AH0) userSession.A01(AH0.class, new C20703Wxa(userSession, 25))).A00.getValue();
                0Aj A002 = r22.A00(r22.A00, "one_link_debug_event");
                A002.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "");
                A002.AAJ("flow", "");
                A002.AAJ("step", "");
                A002.AAJ("caller_context", "");
                A002.AAJ("caller_name", str);
                A002.AAJ("event", "pdp_caller_name_parse_error");
                A002.AAJ("auth_policy", "");
                A002.Cgf();
                return true;
            }
        }
        return false;
    }
}
