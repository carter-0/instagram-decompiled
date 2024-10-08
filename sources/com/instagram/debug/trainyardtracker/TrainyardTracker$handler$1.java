package com.instagram.debug.trainyardtracker;

import X.0qQ;
import android.os.Handler;
import android.os.Message;

public final class TrainyardTracker$handler$1 implements Handler.Callback {
    public final /* synthetic */ TrainyardTracker this$0;

    public TrainyardTracker$handler$1(TrainyardTracker trainyardTracker) {
        this.this$0 = trainyardTracker;
    }

    public final boolean handleMessage(Message message) {
        0qQ.A0B(message, 0);
        Object obj = message.obj;
        0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.debug.trainyardtracker.TrainyardExecutorEvent");
        TrainyardTracker trainyardTracker = this.this$0;
        synchronized (trainyardTracker.events) {
            trainyardTracker.events.add(obj);
        }
        return true;
    }
}
