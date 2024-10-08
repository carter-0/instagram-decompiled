package com.instagram.realtimeclient;

import X.0xI;
import X.AnonymousClass05K;
import X.AnonymousClass46J;
import X.AnonymousClass7TF;
import X.C291065gS;
import X.DbU;
import com.instagram.common.session.UserSession;
import java.util.Random;

public class AnalyticsLoggingObserver implements RealtimeClientManager$Observer {
    public int mConnectingCount;
    public long mLastConnectionStatusChangeTimestamp;
    public final Random mRandomGenerator = new Random();
    public final int mReceiveMessageSampleRate;
    public final UserSession mUserSession;

    public void onMessage(C291065gS r1) {
    }

    public void onConnectionChanged(AnonymousClass46J r11) {
        String str;
        RealtimeConstants.CONNECTION_STATUS_EVENT_NAME.getClass();
        0xI A01 = 0xI.A01(RealtimeConstants.CONNECTION_STATUS_EVENT_NAME, (String) null);
        long currentTimeMillis = System.currentTimeMillis();
        Integer num = r11.A00;
        Integer num2 = AnonymousClass05K.A01;
        if (AnonymousClass7TF.A1W(num, num2)) {
            str = RealtimeConstants.MQTT_CONNECTED;
        } else if (num == num2 || num == AnonymousClass05K.A00) {
            int i = this.mConnectingCount + 1;
            this.mConnectingCount = i;
            this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
            if (i == 1) {
                A01.A0C("event_type", RealtimeConstants.MQTT_CONNECTING);
                A01.A08(Integer.valueOf(this.mConnectingCount), "connecting_count");
                DbU.A1R(A01, this.mUserSession);
                return;
            }
            return;
        } else {
            str = RealtimeConstants.MQTT_DISCONNECTED;
        }
        A01.A0C("event_type", str);
        A01.A08(Integer.valueOf(this.mConnectingCount), "connecting_count");
        A01.A0B("time_spend", Long.valueOf(currentTimeMillis - this.mLastConnectionStatusChangeTimestamp));
        DbU.A1R(A01, this.mUserSession);
        this.mConnectingCount = 0;
        this.mLastConnectionStatusChangeTimestamp = currentTimeMillis;
    }

    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        String str4;
        if (z) {
            str4 = RealtimeConstants.SUBSCRIPTION_STATUS_EVENT_NAME;
        } else {
            str4 = RealtimeConstants.SEND_MESSAGE_EVENT_NAME;
        }
        0xI A01 = 0xI.A01(str4, (String) null);
        A01.A0C("send_message", str2);
        A01.A0C("event_type", str3);
        A01.A0C("mqtt_topic", str);
        if (l != null) {
            A01.A0B("send_time", l);
        }
        DbU.A1R(A01, this.mUserSession);
    }

    public void onSendPayload(String str, byte[] bArr, String str2, Long l) {
        RealtimeConstants.SEND_PAYLOAD_EVENT_NAME.getClass();
        0xI A01 = 0xI.A01(RealtimeConstants.SEND_PAYLOAD_EVENT_NAME, (String) null);
        A01.A08(Integer.valueOf(bArr.length), "length");
        A01.A0C("event_type", str2);
        A01.A0C("mqtt_topic", str);
        if (l != null) {
            A01.A0B("send_time", l);
        }
        DbU.A1R(A01, this.mUserSession);
    }

    public AnalyticsLoggingObserver(UserSession userSession, int i) {
        this.mUserSession = userSession;
        this.mReceiveMessageSampleRate = i;
    }
}
