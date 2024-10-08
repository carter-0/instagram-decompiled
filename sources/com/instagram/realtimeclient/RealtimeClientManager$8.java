package com.instagram.realtimeclient;

import X.0nY;
import X.0ng;
import X.1KD;

public class RealtimeClientManager$8 extends 1KD {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ 0ng val$startMqttJob;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealtimeClientManager$8(RealtimeClientManager realtimeClientManager, String str, 0ng r3) {
        super(str);
        this.this$0 = realtimeClientManager;
        this.val$startMqttJob = r3;
    }

    public boolean onQueueIdle() {
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        0nY.A00().ATE(this.val$startMqttJob);
        return false;
    }
}
