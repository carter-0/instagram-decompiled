package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class SendMessageAttemptStats {
    public static 2LV CONVERTER = C22181Xwr.A00(69);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native SendMessageAttemptStats createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(short s, long j, int i, int i2, int i3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native short getAttemptsNumber();

    public native long getOutBytesWritten();

    public native int getResult();

    public native int getTransportChannel();

    public native int getTransportState();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SendMessageAttemptStats)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public SendMessageAttemptStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SendMessageAttemptStats(short s, long j, int i, int i2, int i3) {
        Short.valueOf(s).getClass();
        this.mNativeHolder = initNativeHolder(s, j, i, i2, i3);
    }
}
