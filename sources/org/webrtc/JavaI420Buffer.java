package org.webrtc;

import X.C51971G9r;
import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

public class JavaI420Buffer implements VideoFrame.I420Buffer {
    public final ByteBuffer dataU;
    public final ByteBuffer dataV;
    public final ByteBuffer dataY;
    public final int height;
    public final RefCountDelegate refCountDelegate;
    public final int strideU;
    public final int strideV;
    public final int strideY;
    public final int width;

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = i;
        int i5 = (i + 1) / 2;
        int i6 = i * i2;
        int i7 = i5 * i3;
        int i8 = i6 + i7;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i5 * 2 * i3) + i6);
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i6);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i6);
        nativeAllocateByteBuffer.limit(i8);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i8);
        nativeAllocateByteBuffer.limit(i8 + i7);
        return new JavaI420Buffer(i4, i2, slice, i, slice2, i5, nativeAllocateByteBuffer.slice(), i5, new JavaI420Buffer$$ExternalSyntheticLambda1(nativeAllocateByteBuffer));
    }

    public static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public static void checkCapacity(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = (i3 * (i2 - 1)) + i;
        if (byteBuffer.capacity() < i4) {
            throw C51971G9r.A0l("Buffer must be at least ", " bytes, but was ", i4, byteBuffer.capacity());
        }
    }

    public static VideoFrame.Buffer cropAndScaleI420(VideoFrame.I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        if (i9 == i11 && i10 == i12) {
            ByteBuffer dataY2 = i420Buffer.getDataY();
            ByteBuffer dataU2 = i420Buffer.getDataU();
            ByteBuffer dataV2 = i420Buffer.getDataV();
            dataY2.position(i + (i420Buffer.getStrideY() * i2));
            int i13 = i / 2;
            int i14 = i2 / 2;
            dataU2.position((i420Buffer.getStrideU() * i14) + i13);
            dataV2.position(i13 + (i14 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            return wrap(i11, i12, dataY2.slice(), i420Buffer.getStrideY(), dataU2.slice(), i420Buffer.getStrideU(), dataV2.slice(), i420Buffer.getStrideV(), new JavaI420Buffer$$ExternalSyntheticLambda0(i420Buffer));
        }
        JavaI420Buffer allocate = allocate(i11, i12);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i7, i8, i9, i10, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        return allocate;
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        } else {
            ByteBuffer slice = byteBuffer.slice();
            ByteBuffer slice2 = byteBuffer2.slice();
            ByteBuffer slice3 = byteBuffer3.slice();
            int i6 = (i + 1) / 2;
            int i7 = (i2 + 1) / 2;
            checkCapacity(slice, i, i2, i3);
            checkCapacity(slice2, i6, i7, i4);
            checkCapacity(slice3, i6, i7, i5);
            return new JavaI420Buffer(i, i2, slice, i3, slice2, i4, slice3, i5, runnable);
        }
    }

    public /* synthetic */ int getBufferType() {
        return 1;
    }

    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    public int getHeight() {
        return this.height;
    }

    public int getStrideU() {
        return this.strideU;
    }

    public int getStrideV() {
        return this.strideV;
    }

    public int getStrideY() {
        return this.strideY;
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

    public JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
