package com.facebook.wearable.airshield.security;

import X.0dV;
import X.0qQ;
import X.JTR;
import X.V6Y;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InitializationVector {
    public static final V6Y Companion = new Object();
    public final HybridData mHybridData;

    public /* synthetic */ InitializationVector(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean equalsNative(long j);

    /* access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native int size();

    public final native byte[] toByteArray();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V6Y] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.InitializationVector");
        return equalsNative(((InitializationVector) obj).getHandleNative());
    }

    public InitializationVector() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
