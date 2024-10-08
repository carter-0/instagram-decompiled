package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;

/* renamed from: X.Kwt  reason: case insensitive filesystem */
public abstract class C63433Kwt {
    public static final void A00(UserSession userSession, C368368sV r7, LEO leo) {
        String str;
        Object obj;
        0qQ.A0B(leo, 1);
        if (r7 != null) {
            Iterator it = C41845B3m.A0X(r7, C368398sY.class, "client_params", 7, 1311672120).iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (0qQ.A0K(((C250663lr) obj).A07("key"), "snooze_on_dismiss_enabled")) {
                    break;
                }
            }
            C250663lr r3 = (C250663lr) obj;
            if (r3 != null) {
                str = r3.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            }
            if (0qQ.A0K(str, RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                leo.A05 = new C65643LxK(userSession, r7, leo.A05, leo);
            }
        }
    }
}
