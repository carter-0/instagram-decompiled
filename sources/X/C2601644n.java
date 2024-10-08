package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.44n  reason: invalid class name and case insensitive filesystem */
public final class C2601644n extends GraphQLSubscriptionHandler {
    public final 1Ng A00;
    public final UserSession A01;

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        if (!RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str) || !AnonymousClass000.A00(4297).equals(str2)) {
            return false;
        }
        return true;
    }

    public final void onRealtimeEventPayload(String str, String str2, String str3) {
        C45424Cw4 cw4;
        long longValue;
        AnonymousClass1qK r2;
        long j;
        long j2;
        try {
            C45257CtL parseFromJson = C45147CrA.parseFromJson(0c9.A04.A01(this.A01, str3));
            if (parseFromJson != null && (cw4 = parseFromJson.A00) != null) {
                String str4 = cw4.A07;
                if (str4 == "story") {
                    longValue = cw4.A00;
                } else {
                    longValue = cw4.A04.longValue();
                }
                if (cw4.A02.booleanValue()) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Long l = cw4.A03;
                    if (l == null) {
                        j2 = 0;
                    } else {
                        j2 = timeUnit.convert(l.longValue(), timeUnit);
                    }
                    r2 = new C16372Utp(cw4.A01, cw4.A06, cw4.A05, str4, j2, longValue);
                } else {
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    Long l2 = cw4.A03;
                    if (l2 == null) {
                        j = 0;
                    } else {
                        j = timeUnit2.convert(l2.longValue(), timeUnit2);
                    }
                    r2 = new C16371Uto(j, cw4.A05, longValue);
                }
                this.A00.A00(r2);
            }
        } catch (IOException e) {
            0KC.A0M("InteractivityActivateQuestionEventHandler", "onRealtimeEventPayload exception", e, new Object[]{str2, str3});
        }
    }

    public C2601644n(UserSession userSession) {
        this.A00 = AnonymousClass1Nd.A00(userSession);
        this.A01 = userSession;
    }
}
