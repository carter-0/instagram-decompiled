package com.instagram.realtimeclient;

public class MainRealtimeEventHandler$2 implements Runnable {
    public final /* synthetic */ MainRealtimeEventHandler this$0;
    public final /* synthetic */ RealtimeEvent val$patchEvent;

    public MainRealtimeEventHandler$2(MainRealtimeEventHandler mainRealtimeEventHandler, RealtimeEvent realtimeEvent) {
        this.this$0 = mainRealtimeEventHandler;
        this.val$patchEvent = realtimeEvent;
    }

    public void run() {
        for (RealtimeOperation realtimeOperation : this.val$patchEvent.operations) {
            if (this.this$0.mStore.patchStoreWithOperation(realtimeOperation)) {
                MainRealtimeEventHandler.access$300(this.this$0, realtimeOperation);
            }
        }
    }
}
