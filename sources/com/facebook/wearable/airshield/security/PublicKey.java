package com.facebook.wearable.airshield.security;

import X.0dV;
import X.0qQ;
import X.AnonymousClass7TG;
import X.C16793V6a;
import X.JTR;
import com.facebook.jni.HybridData;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PublicKey {
    public static final C16793V6a Companion = new Object();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    public static final PublicKey from(byte[] bArr) {
        0qQ.A0B(bArr, 0);
        PublicKey publicKey = new PublicKey((HybridData) null);
        publicKey.setRaw(bArr);
        return publicKey;
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native boolean verifySignatureNative(long j, long j2);

    public native int hashCode();

    public final native byte[] serialize();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V6a, java.lang.Object] */
    static {
        0dV.A0C("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PublicKey(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!0qQ.A0K(getClass(), JTR.A0v(obj))) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PublicKey");
        return equalsNative(((PublicKey) obj).getHandleNative());
    }

    public final long getNative() {
        return getHandleNative();
    }

    public final boolean verifySignature(Hash hash, Signature signature) {
        AnonymousClass7TG.A1N(hash, signature);
        return verifySignatureNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed(), signature.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public PublicKey(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
