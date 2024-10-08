package com.instagram.realtimeclient;

import X.C291065gS;
import java.util.Collections;
import java.util.List;

public abstract class GraphQLSubscriptionHandler extends RealtimeEventHandler {
    public abstract void onRealtimeEventPayload(String str, String str2, String str3);

    public final List getMqttTopicsToHandle() {
        return Collections.singletonList(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE);
    }

    public final boolean handleRealtimeEvent(C291065gS r4, RealtimePayload realtimePayload) {
        if (!canHandleRealtimeEvent(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimePayload.subTopic)) {
            return false;
        }
        onRealtimeEventPayload(RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE, realtimePayload.subTopic, realtimePayload.stringPayload);
        return true;
    }
}
