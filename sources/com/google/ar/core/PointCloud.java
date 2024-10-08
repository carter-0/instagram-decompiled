package com.google.ar.core;

import java.io.Closeable;
import java.nio.ByteBuffer;

public class PointCloud implements Closeable {
    private native ByteBuffer nativeGetData(long j, long j2);

    private native ByteBuffer nativeGetIds(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j, long j2);

    public final void close() {
        nativeReleasePointCloud(0, 0);
    }

    public final void finalize() {
    }
}
