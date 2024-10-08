package com.instagram.realtimeclient;

import X.C291065gS;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.util.Collections;
import java.util.List;

public class RealtimeClientManager$IgnoredMqttTopicsHandler extends RealtimeEventHandler {
    public boolean canHandleRealtimeEvent(String str, String str2) {
        return true;
    }

    public boolean handleRealtimeEvent(C291065gS r2, RealtimePayload realtimePayload) {
        return true;
    }

    public List getMqttTopicsToHandle() {
        return Collections.singletonList(RealtimeConstants.MQTT_TOPIC_PREEMPTIVE_PING);
    }

    public /* synthetic */ RealtimeClientManager$IgnoredMqttTopicsHandler(RealtimeClientManager.1 r1) {
    }

    public RealtimeClientManager$IgnoredMqttTopicsHandler() {
    }
}
