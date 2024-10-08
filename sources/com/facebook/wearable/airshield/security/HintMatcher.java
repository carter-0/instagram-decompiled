package com.facebook.wearable.airshield.security;

import X.0dV;
import X.V6X;
import com.facebook.jni.HybridData;

public final class HintMatcher {
    public static final V6X Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* access modifiers changed from: private */
    public final native boolean hintMatchesNative(byte[] bArr, byte[] bArr2);

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V6X] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }
}
