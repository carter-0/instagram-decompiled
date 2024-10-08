package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;

/* renamed from: X.44o  reason: invalid class name and case insensitive filesystem */
public final class C2601744o extends GraphQLSubscriptionHandler {
    public final 1Ng A00;

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || !AnonymousClass000.A00(4298).equals(str2)) {
            return false;
        }
        return true;
    }

    public C2601744o(UserSession userSession) {
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        C45322CuQ cuQ;
        try {
            C45258CtM parseFromJson = C45149CrC.parseFromJson(16P.A00(str3));
            if (parseFromJson != null && (cuQ = parseFromJson.A00) != null) {
                this.A00.A00(new C390099qj(cuQ.A00, cuQ.A01));
            }
        } catch (IOException e) {
            0KC.A0M("InteractivitySubmissionStatusRealtimeEventHandler", "onRealtimeEventPayload exception", e, new Object[]{str2, str3});
        }
    }
}
