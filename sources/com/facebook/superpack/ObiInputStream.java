package com.facebook.superpack;

import X.0dV;
import java.io.InputStream;

public abstract class ObiInputStream extends InputStream {
    public static native void closeNative(long j, byte[] bArr);

    public static native long openBytesNative(byte[] bArr, int i, int i2);

    public static native long openInputStreamNative(InputStream inputStream, int i);

    public static native long openObArchiveBytesNative(long j, long j2, int i);

    public static native long openRawBytesNative(long j, int i);

    public static native int readNative(long j, byte[] bArr, int i, int i2);

    static {
        0dV.A0C("superpack-jni");
    }
}
