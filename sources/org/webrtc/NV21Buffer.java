package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

public class NV21Buffer implements VideoFrame.Buffer {
    public final byte[] data;
    public final int height;
    public final RefCountDelegate refCountDelegate;
    public final int width;

    public static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11);

    public VideoFrame.I420Buffer toI420() {
        int i = this.width;
        int i2 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i, i2, i, i2);
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5;
        int i8 = i6;
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i7, i8);
        nativeCropAndScale(i, i2, i3, i4, i7, i8, this.data, this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }

    public /* synthetic */ int getBufferType() {
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        this.refCountDelegate.release();
    }

    public void retain() {
        this.refCountDelegate.retain();
    }

    public NV21Buffer(byte[] bArr, int i, int i2, Runnable runnable) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
