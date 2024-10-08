package com.facebook.rsys.callintent.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class CallIntentCreationResult {
    public final NativeHolder mNativeHolder;

    public static native CallIntentCreationResult createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(CallIntent callIntent, int i, String str);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native CallIntent getCallIntent();

    public native String getCollidedLocalCallId();

    public native int getStatusCode();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CallIntentCreationResult)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public CallIntentCreationResult(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public CallIntentCreationResult(CallIntent callIntent, int i, String str) {
        this.mNativeHolder = initNativeHolder(callIntent, i, str);
    }
}
