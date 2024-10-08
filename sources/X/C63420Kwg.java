package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Kwg  reason: case insensitive filesystem */
public abstract class C63420Kwg {
    public static final 1NY A00(UserSession userSession, Integer num, String str, String str2, String str3, String str4) {
        String str5;
        0qQ.A0B(num, 5);
        C299935wF A00 = C363388je.A00(userSession).A00(CallerContext.A01("FacebookMediaShareApi"));
        String str6 = A00.A03;
        if (C363388je.A02(A00)) {
            str5 = "PAGE";
        } else {
            str5 = "USER";
        }
        1NY A0M = DbU.A0M(userSession);
        A0M.A0K("media/%s/share/", new Object[]{str});
        A0M.A04();
        A0M.A0Q(1XP.class, 1XY.class);
        JTO.A1W(A0M, str);
        A0M.A9m("caption", str2);
        A0M.A9m("xpost_surface", C63422Kwi.A00(num));
        A0M.A9m(AnonymousClass000.A00(778), str5);
        A0M.A9m("share_to_fb_destination_id", str6);
        A0M.A9m("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0M.A9m("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (str6.length() == 0) {
            FRP.A01(userSession, str4);
        }
        A0M.A9m("use_fb_post_time", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (str3 != null) {
            A0M.A9m("waterfall_id", str3);
        }
        return A0M;
    }
}
