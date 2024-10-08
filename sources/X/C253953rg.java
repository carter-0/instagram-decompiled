package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3rg  reason: invalid class name and case insensitive filesystem */
public final class C253953rg extends GraphQLSubscriptionHandler {
    public final UserSession A00;
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        0qQ.A0B(str, 0);
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || !AnonymousClass000.A00(4296).equals(str2)) {
            return false;
        }
        return true;
    }

    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        C45230Csl csl;
        C45401Cvh cvh;
        0qQ.A0B(str3, 2);
        try {
            C45231Csm parseFromJson = C44803ClF.parseFromJson(16P.A00(str3));
            if (parseFromJson != null && (csl = parseFromJson.A00) != null && (cvh = csl.A00) != null) {
                11Z.A02(new C45992DHv(cvh, this));
            }
        } catch (IOException e) {
            throw new IllegalStateException("error parsing feedback like event from skywalker", e);
        }
    }

    public C253953rg(UserSession userSession) {
        this.A00 = userSession;
    }
}
