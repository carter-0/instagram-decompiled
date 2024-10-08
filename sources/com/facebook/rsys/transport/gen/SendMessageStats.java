package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class SendMessageStats {
    public static 2LV CONVERTER = C22181Xwr.A00(70);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native SendMessageStats createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(short s, long j, long j2, long j3, boolean z, int i, String str, int i2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native short getAttemptsNumber();

    public native long getEnqueueTimestampMs();

    public native int getErrorCode();

    public native String getErrorMessage();

    public native boolean getIsSuccess();

    public native long getOutBytesWritten();

    public native long getPublishTimestampMs();

    public native int getTransportChannel();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SendMessageStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public SendMessageStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SendMessageStats(short s, long j, long j2, long j3, boolean z, int i, String str, int i2) {
        Short.valueOf(s).getClass();
        this.mNativeHolder = initNativeHolder(s, j, j2, j3, z, i, str, i2);
    }
}
