package X;

import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimePayload;
import java.util.Collections;
import java.util.List;

/* renamed from: X.43c  reason: invalid class name and case insensitive filesystem */
public final class C2597943c extends RealtimeEventHandler {
    public 0sP A00;

    public final boolean canHandleRealtimeEvent(String str, String str2) {
        0qQ.A0B(str, 0);
        return RealtimeConstants.MQTT_TOPIC_LS_RESPONSE.equals(str);
    }

    public final boolean handleRealtimeEvent(C291065gS r5, RealtimePayload realtimePayload) {
        0qQ.A0B(r5, 0);
        Execution.executeAsync(new C68354NBq(MqttNetworkSessionPlugin.get(), r5.A00, r5.A01), (AccountSession) null, 3);
        return true;
    }

    public final void onMqttChannelStateChanged(AnonymousClass46J r2) {
        0qQ.A0B(r2, 0);
        0sP r0 = this.A00;
        if (r0 != null) {
            r0.invoke(r2);
        }
    }

    public final boolean shouldNotifyMqttChannelStateChanged() {
        return true;
    }

    public final List getMqttTopicsToHandle() {
        List singletonList = Collections.singletonList(RealtimeConstants.MQTT_TOPIC_LS_RESPONSE);
        0qQ.A07(singletonList);
        return singletonList;
    }
}
