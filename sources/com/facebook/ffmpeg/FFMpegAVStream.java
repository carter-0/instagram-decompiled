package com.facebook.ffmpeg;

import java.nio.ByteBuffer;

public class FFMpegAVStream {
    public long mNativeContext;

    private native void nativeFinalize();

    private native void nativeSetOrientationHint(int i);

    private native void nativeWriteFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r3 == 270) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOrientationHint(int r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000f
            r0 = 90
            if (r3 == r0) goto L_0x000f
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 == r0) goto L_0x000f
            r1 = 270(0x10e, float:3.78E-43)
            r0 = 0
            if (r3 != r1) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.Pxe.A1Z(r0)
            r2.nativeSetOrientationHint(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegAVStream.setOrientationHint(int):void");
    }

    public FFMpegAVStream(long j) {
        this.mNativeContext = j;
    }

    public void finalize() {
        nativeFinalize();
    }

    public void writeFrame(FFMpegBufferInfo fFMpegBufferInfo, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        nativeWriteFrame(fFMpegBufferInfo, byteBuffer);
    }
}
