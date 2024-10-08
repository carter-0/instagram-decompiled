package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import com.instagram.rtc.analytics.RtcCallSurveyLogger;
import java.util.List;

/* renamed from: X.42u  reason: invalid class name and case insensitive filesystem */
public final class C2597142u extends RealtimeEventHandler {
    public final Context A00;
    public final UserSession A01;

    public C2597142u(Context context, UserSession userSession) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
    }

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        0qQ.A0B(str, 0);
        return RealtimeConstants.MQTT_TOPIC_RTC_ON_DEMAND_LOG.equals(str);
    }

    public final boolean handleRealtimeEvent(C291065gS r11, RealtimePayload realtimePayload) {
        0qQ.A0B(r11, 0);
        if (!0qQ.A0K(r11.A00, RealtimeConstants.MQTT_TOPIC_RTC_ON_DEMAND_LOG)) {
            return false;
        }
        UserSession userSession = this.A01;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36314244840425968L)) {
            Context applicationContext = this.A00.getApplicationContext();
            0qQ.A07(applicationContext);
            OWA owa = C66953Mfm.A00(applicationContext, userSession).A06;
            String A02 = 0Uo.A02();
            RtcCallSurveyLogger rtcCallSurveyLogger = owa.A02;
            if (rtcCallSurveyLogger != null) {
                rtcCallSurveyLogger.A01("triggered_by_peer", "triggered_by_peer", A02, (String) owa.A0M.invoke(), 182.A06(r3, owa.A09, 36314244840491505L));
            }
        }
        return true;
    }

    public final List getMqttTopicsToHandle() {
        return 0sr.A1M(new String[]{RealtimeConstants.MQTT_TOPIC_RTC_ON_DEMAND_LOG});
    }
}
