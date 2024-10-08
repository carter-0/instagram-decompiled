package com.facebook.papaya.mldw;

import X.0dV;
import com.facebook.jni.HybridData;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public final class Event {
    public static final Event $redex_init_class = null;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(long j, Map map);

    static {
        0dV.A0C("papaya-mldw");
    }

    public Event(long j, ImmutableMap immutableMap) {
        this.mHybridData = initHybrid(j, immutableMap);
    }
}
