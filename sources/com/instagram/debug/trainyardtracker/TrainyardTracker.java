package com.instagram.debug.trainyardtracker;

import X.00k;
import X.0qQ;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

public final class TrainyardTracker {
    public final List events = new ArrayList();
    public final Handler handler = new Handler(Looper.getMainLooper(), new TrainyardTracker$handler$1(this));

    public final void storeEvent(TrainyardExecutorEvent trainyardExecutorEvent) {
        0qQ.A0B(trainyardExecutorEvent, 0);
        Message.obtain(this.handler, 0, trainyardExecutorEvent).sendToTarget();
    }

    public final List getAndDrainEvents() {
        List A0a;
        synchronized (this.events) {
            A0a = 00k.A0a(this.events);
            this.events.clear();
        }
        return A0a;
    }
}
