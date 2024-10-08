package com.instagram.realtimeclient;

import X.AnonymousClass46Z;

public class RealtimeClientManager$14 implements AnonymousClass46Z {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ boolean val$isSkywalkerCommand;
    public final /* synthetic */ String val$payload;
    public final /* synthetic */ long val$sendingTimeMs;
    public final /* synthetic */ String val$topicName;

    public RealtimeClientManager$14(RealtimeClientManager realtimeClientManager, String str, String str2, boolean z, long j) {
        this.this$0 = realtimeClientManager;
        this.val$topicName = str;
        this.val$payload = str2;
        this.val$isSkywalkerCommand = z;
        this.val$sendingTimeMs = j;
    }

    public void onFailure() {
        RealtimeClientManager realtimeClientManager = this.this$0;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        synchronized (realtimeClientManager.mObservers) {
            for (RealtimeClientManager$Observer onSendMessage : this.this$0.mObservers) {
                onSendMessage.onSendMessage(this.val$topicName, this.val$payload, RealtimeConstants.SEND_FAIL, this.val$isSkywalkerCommand, Long.valueOf(System.currentTimeMillis() - this.val$sendingTimeMs));
            }
        }
    }

    public void onSuccess() {
        RealtimeClientManager realtimeClientManager = this.this$0;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        synchronized (realtimeClientManager.mObservers) {
            for (RealtimeClientManager$Observer onSendMessage : this.this$0.mObservers) {
                onSendMessage.onSendMessage(this.val$topicName, this.val$payload, RealtimeConstants.SEND_SUCCESS, this.val$isSkywalkerCommand, Long.valueOf(System.currentTimeMillis() - this.val$sendingTimeMs));
            }
        }
    }
}
