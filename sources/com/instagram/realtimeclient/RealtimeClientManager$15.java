package com.instagram.realtimeclient;

public class RealtimeClientManager$15 implements Runnable {
    public final /* synthetic */ RealtimeClientManager this$0;

    public RealtimeClientManager$15(RealtimeClientManager realtimeClientManager) {
        this.this$0 = realtimeClientManager;
    }

    public void run() {
        RealtimeClientManager realtimeClientManager = this.this$0;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        if (realtimeClientManager.mMqttClient != null || realtimeClientManager.mIsInitializingMqttClient) {
            realtimeClientManager.mIsInitializingMqttClient = false;
            RealtimeClientManager.access$2300(realtimeClientManager);
            RealtimeClientManager realtimeClientManager2 = this.this$0;
            realtimeClientManager2.mMqttClient = null;
            RealtimeClientManager.access$3100(realtimeClientManager2);
        }
    }
}
