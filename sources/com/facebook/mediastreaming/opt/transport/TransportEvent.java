package com.facebook.mediastreaming.opt.transport;

import X.0oU;
import X.C10870RzW;

public enum TransportEvent {
    CONNECTED,
    STREAMING,
    LIVE_DATA_SENT,
    SLOW,
    LAGGING,
    RECONNECTING,
    FAILED,
    CLOSED,
    NONE;
    
    public static final C10870RzW Companion = null;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.RzW, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        TransportEvent[] transportEventArr;
        $ENTRIES = 0oU.A00(transportEventArr);
        Companion = new Object();
    }

    public static final TransportEvent fromInt(int i) {
        return values()[i];
    }
}
