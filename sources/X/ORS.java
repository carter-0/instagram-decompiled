package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

public abstract class ORS {
    public static 1NY A00(UserSession userSession, C16666Uz2 uz2, C14068TpH tpH, String str, Map map) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("reports/get_frx_prompt/");
        A0N.A0R(NHE.class, ORT.class);
        A0N.A9m("frx_prompt_request_type", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0N.A9m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, uz2.toString());
        A0N.A9m("location", tpH.toString());
        A0N.A9m("container_module", str);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            C51974G9v.A1C(A0N, A0u);
        }
        return A0N;
    }

    public static 1OC A01(UserSession userSession, C69402Nkg nkg, Integer num, String str, String str2, String str3, String str4, Map map, boolean z) {
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("reports/get_frx_prompt/");
        A0N.A0R(NHU.class, ORU.class);
        String str5 = "2";
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                case 1:
                    break;
                case 2:
                    str5 = "4";
                    break;
                case 3:
                    str5 = "3";
                    break;
                case 4:
                    str5 = "12";
                    break;
                case 5:
                    str5 = "13";
                    break;
                default:
                    throw AnonymousClass7TE.A0w("Invalid payload type");
            }
        }
        A0N.A9m("frx_prompt_request_type", str5);
        A0N.A9m("context", str);
        A0N.A0H(AnonymousClass000.A00(1506), z);
        if (str2 != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str2);
            String obj = jSONArray.toString();
            if (obj != null) {
                A0N.A9m("selected_tag_types", obj);
            }
        }
        if (str3 != null) {
            A0N.A9m("victim_user_id", str3);
        }
        if (str4 != null) {
            A0N.A9m("tip_number", str4);
        }
        if (nkg != null) {
            A0N.A9m("action_type", nkg.toString());
        }
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            C51974G9v.A1C(A0N, A0u);
        }
        return A0N.A0M();
    }
}
