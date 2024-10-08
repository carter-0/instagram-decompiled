package com.facebook.common.time;

import X.AnonymousClass0JQ;
import X.AnonymousClass0JR;

public class AwakeTimeSinceBootClock implements AnonymousClass0JR {
    public static final AwakeTimeSinceBootClock INSTANCE = new Object();

    public /* synthetic */ long now() {
        return AnonymousClass0JQ.$default$now(this);
    }

    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    public long nowNanos() {
        return System.nanoTime();
    }
}
