package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

public abstract class LJW {
    public static final void A01(1Fb r3, UserSession userSession, L8M l8m, String str, String str2) {
        String str3;
        0qQ.A0B(str, 3);
        if (l8m.A03) {
            C63384Kw5.A00(r3, userSession, str, str2, "story_composer");
        } else if (l8m.A02 && (str3 = l8m.A01) != null) {
            r3.A9m("share_to_facebook_dating", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            if (str2 != null) {
                r3.A9m("waterfall_id", str2);
            }
            r3.A9m("share_to_fb_destination_id", str3);
        }
        r3.A9m("xpost_surface", l8m.A00);
    }

    public static final L8M A00(AnonymousClass3Q2 r5, 1us r6) {
        boolean z;
        boolean A0C = AnonymousClass8PU.A0C(r5, r6);
        String str = r5.A2i;
        if (r5.A55 || (r6 != null && r6.CT0())) {
            z = true;
        } else {
            z = false;
        }
        return new L8M(str, r5.A2p, A0C, z);
    }
}
