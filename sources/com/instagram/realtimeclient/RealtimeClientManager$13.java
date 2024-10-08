package com.instagram.realtimeclient;

import X.AnonymousClass46Z;

public class RealtimeClientManager$13 implements AnonymousClass46Z {
    public final /* synthetic */ RealtimeClientManager this$0;
    public final /* synthetic */ String val$payloadStr;
    public final /* synthetic */ RealtimeClientManager$Publish val$publish;
    public final /* synthetic */ long val$sendingTimeMs;

    public RealtimeClientManager$13(RealtimeClientManager realtimeClientManager, RealtimeClientManager$Publish realtimeClientManager$Publish, String str, long j) {
        this.this$0 = realtimeClientManager;
        this.val$publish = realtimeClientManager$Publish;
        this.val$payloadStr = str;
        this.val$sendingTimeMs = j;
    }

    public void onFailure() {
        RealtimeClientManager realtimeClientManager = this.this$0;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        synchronized (realtimeClientManager.mObservers) {
            for (RealtimeClientManager$Observer onSendMessage : this.this$0.mObservers) {
                onSendMessage.onSendMessage(this.val$publish.mTopicName, this.val$payloadStr, RealtimeConstants.SEND_FAIL, false, Long.valueOf(System.currentTimeMillis() - this.val$sendingTimeMs));
            }
        }
    }

    public void onSuccess() {
        RealtimeClientManager realtimeClientManager = this.this$0;
        int i = RealtimeClientManager.MQTT_STATE_DESTROYED;
        synchronized (realtimeClientManager.mObservers) {
            for (RealtimeClientManager$Observer onSendMessage : this.this$0.mObservers) {
                onSendMessage.onSendMessage(this.val$publish.mTopicName, this.val$payloadStr, RealtimeConstants.SEND_SUCCESS, false, Long.valueOf(System.currentTimeMillis() - this.val$sendingTimeMs));
            }
        }
    }
}
