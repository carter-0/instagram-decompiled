package com.facebook.common.memory.leaklistener.core;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

public class KeyedWeakReference extends WeakReference {
    public final WeakReference mCanary;
    public final String mDebugData;
    public final long mTimestamp;

    public Object getCanary() {
        return this.mCanary.get();
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public KeyedWeakReference(Object obj, long j, String str) {
        super(obj);
        this.mTimestamp = j;
        this.mCanary = new WeakReference(new Object());
        this.mDebugData = str;
    }

    public Map getLeakMetadata() {
        return Collections.emptyMap();
    }

    public KeyedWeakReference(Object obj, long j) {
        this(obj, j, (String) null);
    }
}
