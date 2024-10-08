package com.facebook.wearable.airshield.security;

import X.0dV;
import X.0qQ;
import X.JTR;
import X.V6Z;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PrivateKey {
    public static final V6Z Companion = new Object();
    public final HybridData mHybridData;

    public /* synthetic */ PrivateKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Hash deriveNative(long j);

    private final native boolean equalsNative(long j);

    /* access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native Signature signNative(long j);

    public final Hash derive(PublicKey publicKey) {
        0qQ.A0B(publicKey, 0);
        return deriveNative(publicKey.getNative());
    }

    public native int hashCode();

    public final native PublicKey recoverPublicKey();

    public final native byte[] serialize();

    public final Signature sign(Hash hash) {
        0qQ.A0B(hash, 0);
        return signNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.V6Z] */
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
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PrivateKey");
        return equalsNative(((PrivateKey) obj).getHandleNative());
    }

    public PrivateKey() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
