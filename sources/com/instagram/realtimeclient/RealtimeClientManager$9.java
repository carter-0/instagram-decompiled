package com.instagram.realtimeclient;

import X.0wb;
import X.26E;
import X.C249883kW;

public class RealtimeClientManager$9 implements Runnable {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ 26E val$mqttClient;
    public final /* synthetic */ RealtimeMqttClientConfig val$realtimeMqttClientConfig;
    public final /* synthetic */ C249883kW val$zeroTokenManager;

    public RealtimeClientManager$9(RealtimeClientManager realtimeClientManager, 26E r2, RealtimeMqttClientConfig realtimeMqttClientConfig, C249883kW r4) {
        this.this$0 = realtimeClientManager;
        this.val$mqttClient = r2;
        this.val$realtimeMqttClientConfig = realtimeMqttClientConfig;
        this.val$zeroTokenManager = r4;
    }

    public void run() {
        RealtimeClientManager realtimeClientManager = this.this$0;
        26E r1 = this.val$mqttClient;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        realtimeClientManager.mMqttClient = r1;
        realtimeClientManager.mRealtimeMqttClientConfig = this.val$realtimeMqttClientConfig;
        realtimeClientManager.mZeroTokenManager = this.val$zeroTokenManager;
        realtimeClientManager.mZeroTokenChangeListener.onTokenChange();
        RealtimeClientManager realtimeClientManager2 = this.this$0;
        realtimeClientManager2.mZeroTokenManager.AAX(realtimeClientManager2.mZeroTokenChangeListener);
        RealtimeClientManager realtimeClientManager3 = this.this$0;
        int i2 = realtimeClientManager3.mMqttTargetState;
        if (i2 == -1) {
            0wb.A03("RealtimeClientManager", "MQTT status is UNSET after finishing Initialization");
        } else if (i2 == 1) {
            RealtimeClientManager.access$2300(realtimeClientManager3);
        } else if (i2 == 2) {
            RealtimeClientManager.access$2400(realtimeClientManager3);
            this.this$0.mMqttClient.start();
        } else if (i2 == 3) {
            realtimeClientManager3.mMqttClient.stop();
        }
        synchronized (this.this$0) {
            this.this$0.mIsInitializingMqttClient = false;
        }
    }
}
