package com.facebook.realtime.common.streamid;

import X.0dV;
import X.S9I;
import com.facebook.jni.HybridData;

public final class RSStreamIdProvider {
    public static final S9I Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.S9I, java.lang.Object] */
    static {
        0dV.A0C("streamid_jni");
    }
}
