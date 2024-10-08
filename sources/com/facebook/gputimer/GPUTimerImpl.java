package com.facebook.gputimer;

import X.0KC;
import X.0dV;
import X.C392939vd;
import com.facebook.jni.HybridData;

public final class GPUTimerImpl {
    public static final C392939vd Companion = new Object();
    public static final Class TAG;
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vd] */
    static {
        Class<GPUTimerImpl> cls = GPUTimerImpl.class;
        TAG = cls;
        try {
            0dV.A0C("gputimer-jni");
        } catch (UnsatisfiedLinkError e) {
            0KC.A07(cls, "Failed to load: %s", e, new Object[]{"gputimer-jni"});
        }
    }
}
