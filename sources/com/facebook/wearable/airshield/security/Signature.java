package com.facebook.wearable.airshield.security;

import X.0dV;
import X.0qQ;
import X.C16795V6c;
import X.JTR;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Signature {
    public static final C16795V6c Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native byte[] toByteArray();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V6c, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Signature(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.Signature");
        return equalsNative(((Signature) obj).getHandleNative());
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public Signature(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
