package org.webrtc;

public class LibvpxVp9Encoder extends WrappedNativeVideoEncoder {
    public static native long nativeCreate(long j);

    public static native boolean nativeIsSupported();

    public boolean isHardwareEncoder() {
        return false;
    }

    public long createNative(long j) {
        return nativeCreate(j);
    }
}
