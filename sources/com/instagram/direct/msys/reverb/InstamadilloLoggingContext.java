package com.instagram.direct.msys.reverb;

import X.OSF;
import com.facebook.simplejni.NativeHolder;

public class InstamadilloLoggingContext {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, int i, int i2);

    private native boolean nativeEquals(Object obj);

    public native int getQplInstanceKey();

    public native int getQplMarkerId();

    public native String getUniqueId();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InstamadilloLoggingContext)) {
            return false;
        }
        return nativeEquals(obj);
    }

    static {
        OSF.A00();
    }

    public InstamadilloLoggingContext(String str, int i, int i2) {
        this.mNativeHolder = initNativeHolder(str, i, i2);
    }

    public InstamadilloLoggingContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
