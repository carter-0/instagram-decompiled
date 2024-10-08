package com.facebook.wearable.airshield.security;

import X.0dV;
import X.0qQ;
import X.JTR;
import X.V6V;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Hash {
    public static final V6V Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    public static final Hash from(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        Hash hash = new Hash((HybridData) null);
        hash.setRaw(bArr);
        return hash;
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* access modifiers changed from: private */
    public final native void hashBytes(byte[] bArr);

    /* access modifiers changed from: private */
    public final native void hashString(String str);

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native byte[] toByteArray();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V6V] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hash(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.Hash");
        return equalsNative(((Hash) obj).getHandleNative());
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public Hash(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
