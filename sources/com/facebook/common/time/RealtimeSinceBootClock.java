package com.facebook.common.time;

import X.AnonymousClass0JR;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class RealtimeSinceBootClock implements AnonymousClass0JR {
    public static final RealtimeSinceBootClock A00 = new Object();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
