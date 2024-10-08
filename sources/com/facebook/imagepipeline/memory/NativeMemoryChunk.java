package com.facebook.imagepipeline.memory;

import X.002;
import X.0di;
import android.util.Log;
import java.io.Closeable;

public class NativeMemoryChunk implements Closeable {
    public boolean mIsClosed = true;

    public static native long nativeAllocate(int i);

    public static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    public static native void nativeFree(long j);

    public static native void nativeMemcpy(long j, long j2, int i);

    public static native byte nativeReadByte(long j);

    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(0);
        }
    }

    public void finalize() {
        boolean z;
        synchronized (this) {
            z = this.mIsClosed;
        }
        if (!z) {
            Log.w("NativeMemoryChunk", 002.A0g("finalize: Chunk ", Integer.toHexString(System.identityHashCode(this)), " still active. "));
            close();
        }
    }

    static {
        0di.A01("imagepipeline");
    }
}
