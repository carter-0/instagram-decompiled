package com.facebook.animated.webp;

import X.AnonymousClass05K;
import X.AnonymousClass0Sc;
import X.C16489Uvk;
import X.C17554Va8;
import X.C268774dy;
import X.X9T;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class WebPImage implements X9T {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native WebPFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public boolean doesRenderSupportScaling() {
        return true;
    }

    public Bitmap.Config getAnimatedBitmapConfig() {
        return null;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage createFromByteArray(byte[] bArr, C268774dy r2) {
        AnonymousClass0Sc.A00();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public C17554Va8 getFrameInfo(int i) {
        Integer num;
        C16489Uvk uvk;
        WebPFrame nativeGetFrame = getFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            if (nativeGetFrame.isBlendWithPreviousFrame()) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            if (nativeGetFrame.shouldDisposeToBackgroundColor()) {
                uvk = C16489Uvk.DISPOSE_TO_BACKGROUND;
            } else {
                uvk = C16489Uvk.DISPOSE_DO_NOT;
            }
            return new C17554Va8(uvk, num, xOffset, yOffset, width, height);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage() {
    }
}
