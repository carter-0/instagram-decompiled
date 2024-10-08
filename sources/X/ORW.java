package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

public abstract class ORW {
    public static final String A00(AnonymousClass6WO r1) {
        int ordinal = r1.ordinal();
        if (ordinal == 0) {
            return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        }
        if (ordinal == 1) {
            return "stories";
        }
        if (ordinal == 2) {
            return "other";
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final void A01(UserSession userSession, Long l, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_immersive_media");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", str);
            DbS.A1M(A0e, str2);
            A0e.A9F("time_ms", l);
            A0e.AAJ(DialogModule.KEY_MESSAGE, str3);
            A0e.Cgf();
        }
    }
}
