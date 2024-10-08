package com.facebook.mcrypto.mem;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class PlaintextApplicationPayload {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(byte[] bArr, Number number);

    private native boolean nativeEquals(Object obj);

    public native Number getPlaintextApplicationVersion();

    public native byte[] getPlaintextPayload();

    public native int hashCode();

    public native String toString();

    static {
        0dV.A0C("mcryptojni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PlaintextApplicationPayload)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public PlaintextApplicationPayload(byte[] bArr, Number number) {
        this.mNativeHolder = initNativeHolder(bArr, number);
    }

    public PlaintextApplicationPayload(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
