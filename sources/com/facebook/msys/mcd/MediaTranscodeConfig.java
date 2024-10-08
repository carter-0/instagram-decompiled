package com.facebook.msys.mcd;

import X.C66595MYh;
import com.facebook.simplejni.NativeHolder;

public class MediaTranscodeConfig {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native Integer getMaxVideoResolutionNative(long j);

    private native boolean getPreserveOriginalSizeNative(long j);

    private native byte[] getVideoEditsNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(Integer num, byte[] bArr, boolean z);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaTranscodeConfig)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj2, ((MediaTranscodeConfig) obj2).mNativeHolder.mNativePointer);
    }

    public int hashCode() {
        return hashCodeNative(this.mNativeHolder.mNativePointer);
    }

    public String toString() {
        return toStringNative(this.mNativeHolder.mNativePointer);
    }

    static {
        C66595MYh.A00();
    }

    public MediaTranscodeConfig(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
