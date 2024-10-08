package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.simplejni.NativeHolder;

public class MailboxSDKVideoSource {
    public final NativeHolder mNativeHolder;

    private native boolean equalsNative(long j, Object obj, long j2);

    private native byte[] getVideoDataNative(long j);

    private native String getVideoFilePathNative(long j);

    private native int hashCodeNative(long j);

    public static native NativeHolder initNativeHolder(String str, byte[] bArr);

    private native String toStringNative(long j);

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MailboxSDKVideoSource)) {
            return false;
        }
        return equalsNative(this.mNativeHolder.mNativePointer, obj2, ((MailboxSDKVideoSource) obj2).mNativeHolder.mNativePointer);
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

    public MailboxSDKVideoSource(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
