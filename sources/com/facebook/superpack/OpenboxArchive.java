package com.facebook.superpack;

import X.0dV;
import java.io.Closeable;

public abstract class OpenboxArchive implements Closeable {
    public static native void closeNative(long j);

    public static native int getFileCountNative(long j);

    public static native long getFilePtrNative(long j, int i);

    public static native long getFileSizeNative(long j, int i);

    public static native long openNative(int i, long j, long j2);

    static {
        0dV.A0C("superpack-jni");
    }
}
