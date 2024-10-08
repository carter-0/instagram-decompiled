package com.instagram.realtimeclient;

import X.0Aj;
import X.0KC;
import X.0wc;
import X.16P;
import X.AnonymousClass000;
import X.AnonymousClass0kN;
import X.AnonymousClass46J;
import X.C291065gS;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RealtimeClientEventObserver implements RealtimeClientManager$Observer {
    public static final String TAG = "com.instagram.realtimeclient.RealtimeClientEventObserver";
    public final Map mQueryId2SubtopicMap = Collections.synchronizedMap(new HashMap());
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final UserSession mUserSession;

    public class ClientSubEventType {
        public static final String PAYLOAD_RECEIVED = "receivepayload";
        public static final String SUBSCRIBE = "client_subscribe";
        public static final String UNSUBSCRIBE = "client_unsubscribe";
    }

    public static boolean coinFlip(int i) {
        if (new Random().nextInt(i) == 0) {
            return true;
        }
        return false;
    }

    private boolean isRealTimeSub(String str) {
        return RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str);
    }

    private void logEvent(String str, String str2) {
        long j;
        0wc A02 = AnonymousClass0kN.A02(this.mUserSession);
        0Aj A00 = A02.A00(A02.A00, AnonymousClass000.A00(3298));
        RealtimeClientConfig realtimeClientConfig = this.mRealtimeClientConfig;
        if (realtimeClientConfig != null) {
            j = realtimeClientConfig.getGQLSSamplingWeight();
        } else {
            j = 10000;
        }
        if (coinFlip((int) j)) {
            A00.AAJ("event_type", str);
            A00.AAJ("event_source", "Android");
            A00.A9F(AnonymousClass000.A00(3902), Long.valueOf(j));
            A00.A9F("ig_user_id", Long.valueOf(Long.parseLong(this.mUserSession.A06)));
            A00.AAJ("mqtt_subtopic", str2);
            A00.AAJ(TraceFieldType.TransportType, "MQTT");
            A00.Cgf();
        }
    }

    public void onMessage(C291065gS r3) {
        if (r3 != null && this.mRealtimeClientConfig.isRealtimeEventLogEnabled() && RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(r3.A00)) {
            RealtimePayload parse = RealtimePayloadParser.parse(r3);
            if (parse != null) {
                logEvent(AnonymousClass000.A00(5168), (String) this.mQueryId2SubtopicMap.get(parse.subTopic));
                return;
            }
            0KC.A0D(TAG, "the payload is empty.");
        }
    }

    public void onSendMessage(String str, String str2, String str3, boolean z, Long l) {
        if (RealtimeConstants.SEND_ATTEMPT.equals(str3) && this.mRealtimeClientConfig.isRealtimeEventLogEnabled() && RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str)) {
            try {
                SkywalkerCommand parseFromJson = SkywalkerCommand__JsonHelper.parseFromJson(16P.A00(str2));
                List<String> list = parseFromJson.mSubscribeTopics;
                if (list != null) {
                    for (String str4 : list) {
                        cacheSubtopic(str4);
                        logEvent(AnonymousClass000.A00(4588), str4);
                    }
                }
                List<String> list2 = parseFromJson.mUnsubscribeTopics;
                if (list2 != null) {
                    for (String str5 : list2) {
                        cacheSubtopic(str5);
                        logEvent(AnonymousClass000.A00(4589), str5);
                    }
                }
            } catch (IOException e) {
                0KC.A0F(TAG, "Failed convert message back to command.", e);
            }
        }
    }

    public RealtimeClientEventObserver(UserSession userSession, RealtimeClientConfig realtimeClientConfig) {
        this.mUserSession = userSession;
        this.mRealtimeClientConfig = realtimeClientConfig;
    }

    private void cacheSubtopic(String str) {
        this.mQueryId2SubtopicMap.put(RealtimeSubscription.fromSubscriptionString(str).mSubscriptionQueryId, str);
    }

    public void onSendPayload(String str, byte[] bArr, String str2, Long l) {
    }

    public void onConnectionChanged(AnonymousClass46J r1) {
    }
}
