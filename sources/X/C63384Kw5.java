package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Kw5  reason: case insensitive filesystem */
public abstract class C63384Kw5 {
    public static final void A00(1Fb r3, UserSession userSession, String str, String str2, String str3) {
        String str4;
        C299935wF A00 = C363388je.A00(userSession).A00(CallerContext.A01("FacebookMediaShareApi"));
        String str5 = A00.A03;
        if (C363388je.A02(A00)) {
            str4 = "PAGE";
        } else {
            str4 = "USER";
        }
        r3.A9m(AnonymousClass000.A00(778), str4);
        r3.A9m("share_to_fb_destination_id", str5);
        r3.A9m("share_to_facebook", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        r3.A9m("no_token_crosspost", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        if (str5.length() == 0) {
            FRP.A01(userSession, str3);
        }
        if (str2 != null) {
            r3.A9m("waterfall_id", str2);
        }
        r3.A9m(AnonymousClass000.A00(1117), str);
    }
}
