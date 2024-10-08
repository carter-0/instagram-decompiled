package com.facebook.wearable.airshield.security;

import X.0dV;
import X.V6W;
import com.facebook.jni.HybridData;

public final class Hint {
    public static final V6W Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* access modifiers changed from: private */
    public final native void createHintNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native byte[] serializeNative();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V6W] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    public final byte[] serialize() {
        return serializeNative();
    }
}
