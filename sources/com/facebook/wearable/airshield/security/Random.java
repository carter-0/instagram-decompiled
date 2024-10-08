package com.facebook.wearable.airshield.security;

import X.0dV;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.C16794V6b;
import X.C20629WwN;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Random {
    public static final C16794V6b Companion = new Object();
    public static final AnonymousClass0eM instance = AnonymousClass0eN.A01(C20629WwN.A00);
    public final HybridData mHybridData;

    public /* synthetic */ Random(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public final native void bytesNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V6b, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    public Random() {
        this.mHybridData = initHybrid();
    }
}
