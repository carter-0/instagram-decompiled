package com.facebook.rsys.crypto.gen;

import X.2LV;
import X.AnonymousClass65M;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class CryptoContextHolder {
    public static 2LV CONVERTER = new AnonymousClass65M();
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native CryptoContextHolder createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(McfReference mcfReference);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native McfReference getContext();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CryptoContextHolder)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public CryptoContextHolder(McfReference mcfReference) {
        mcfReference.getClass();
        this.mNativeHolder = initNativeHolder(mcfReference);
    }

    public CryptoContextHolder(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
