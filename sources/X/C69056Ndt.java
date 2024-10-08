package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.io.IOException;
import java.util.List;

/* renamed from: X.Ndt  reason: case insensitive filesystem */
public final class C69056Ndt extends RealtimeEventHandler {
    public final 1Ng A00;

    public C69056Ndt(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    public final boolean handleRealtimeEvent(C291065gS r6, RealtimePayload realtimePayload) {
        0qQ.A0B(r6, 0);
        if (realtimePayload == null) {
            throw AnonymousClass7TE.A0z("Skywalker payload should be supported.");
        } else if (!0qQ.A0K(realtimePayload.subTopic, "fb_unseen_notif_count")) {
            return false;
        } else {
            0qQ.A07(r6.A00);
            String str = realtimePayload.subTopic;
            String str2 = realtimePayload.stringPayload;
            0qQ.A06(str2);
            try {
                OCZ parseFromJson = O1Z.parseFromJson(16P.A00(str2));
                if (parseFromJson == null) {
                    return true;
                }
                this.A00.A00(new C50269FWa(parseFromJson.A01, parseFromJson.A00));
                return true;
            } catch (IOException e) {
                0KC.A0M("FacebookEntrypointBadgeEventHandler", "onRealtimeEventPayload exception", e, new Object[]{str});
                return true;
            }
        }
    }

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        return "fb_unseen_notif_count".equals(str2);
    }

    public final List getMqttTopicsToHandle() {
        return AnonymousClass7TE.A1I(RealtimeConstants.MQTT_TOPIC_SKYWALKER);
    }
}
