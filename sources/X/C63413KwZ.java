package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.KwZ  reason: case insensitive filesystem */
public abstract class C63413KwZ {
    public static 1OC A00(UserSession userSession, ShareLaterMedia shareLaterMedia, String str, String str2) {
        String str3;
        1NY r4 = new 1NY(userSession);
        String str4 = shareLaterMedia.A05;
        r4.A0K("media/%s/share/", new Object[]{str4});
        r4.A04();
        r4.A0R(1XP.class, 1XY.class);
        JTO.A1W(r4, str4);
        r4.A9m("caption", shareLaterMedia.A04);
        if (shareLaterMedia.A07) {
            C299935wF A00 = C363388je.A00(userSession).A00(CallerContext.A01("ShareLaterApi"));
            String str5 = A00.A03;
            if (C363388je.A02(A00)) {
                str3 = "PAGE";
            } else {
                str3 = "USER";
            }
            r4.A9m("waterfall_id", str);
            r4.A9m("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            r4.A9m(AnonymousClass000.A00(778), str3);
            r4.A9m("share_to_fb_destination_id", str5);
            r4.A9m("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (str5.isEmpty()) {
                FRP.A01(userSession, str2);
            }
        }
        return r4.A0M();
    }
}
