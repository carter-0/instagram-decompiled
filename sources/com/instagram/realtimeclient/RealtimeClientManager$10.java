package com.instagram.realtimeclient;

import X.0ng;
import X.26E;

public class RealtimeClientManager$10 extends 0ng {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ boolean val$isForegrounded;
    public final /* synthetic */ boolean val$isMsysPresenceReporting;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealtimeClientManager$10(RealtimeClientManager realtimeClientManager, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(i, i2, z, z2);
        this.this$0 = realtimeClientManager;
        this.val$isForegrounded = z3;
        this.val$isMsysPresenceReporting = z4;
    }

    public void run() {
        RealtimeClientManager realtimeClientManager = this.this$0;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        26E r2 = realtimeClientManager.mMqttClient;
        if (r2 != null) {
            r2.FJd(this.val$isForegrounded, !this.val$isMsysPresenceReporting);
        }
    }
}
