package com.instagram.realtimeclient;

public class MainRealtimeEventHandler$1 implements Runnable {
    public final /* synthetic */ MainRealtimeEventHandler this$0;
    public final /* synthetic */ RealtimeEvent val$realtimeEvent;

    public MainRealtimeEventHandler$1(MainRealtimeEventHandler mainRealtimeEventHandler, RealtimeEvent realtimeEvent) {
        this.this$0 = mainRealtimeEventHandler;
        this.val$realtimeEvent = realtimeEvent;
    }

    public void run() {
        RealtimeEvent realtimeEvent = this.val$realtimeEvent;
        if (realtimeEvent.action.ordinal() == 0) {
            MainRealtimeEventHandler mainRealtimeEventHandler = this.this$0;
            DirectRealtimePayload directRealtimePayload = realtimeEvent.payload;
            String str = directRealtimePayload.clientRequestId;
            if (str == null) {
                str = directRealtimePayload.clientContext;
            }
            MainRealtimeEventHandler.access$000(mainRealtimeEventHandler, str, realtimeEvent.statusCode, directRealtimePayload.message, directRealtimePayload.clientFacingErrorMessage, directRealtimePayload.isEpdError, directRealtimePayload.throttlingType, directRealtimePayload.threadId, directRealtimePayload.itemId, directRealtimePayload.timestamp, directRealtimePayload.ttlMs, directRealtimePayload.errorCode, directRealtimePayload.canSeeNotes, directRealtimePayload.canSeeBroadcastChats);
        }
    }
}
