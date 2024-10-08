package com.facebook.animated.gif;

import X.0di;
import X.AnonymousClass05K;
import X.C16489Uvk;
import X.C17554Va8;
import X.C268774dy;
import X.X9T;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class GifImage implements X9T {
    public static volatile boolean sInitialized;
    public Bitmap.Config mDecodeBitmapConfig = null;
    public long mNativeContext;

    public static GifImage createFromByteArray(byte[] bArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        C268774dy r2 = C268774dy.A02;
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                0di.A01("gifimage");
            }
        }
        allocateDirect.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(allocateDirect, Integer.MAX_VALUE, false);
        nativeCreateFromDirectByteBuffer.mDecodeBitmapConfig = r2.A00;
        return nativeCreateFromDirectByteBuffer;
    }

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native GifFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    public boolean doesRenderSupportScaling() {
        return false;
    }

    public Bitmap.Config getAnimatedBitmapConfig() {
        return this.mDecodeBitmapConfig;
    }

    public GifImage(long j) {
        this.mNativeContext = j;
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
        C16489Uvk uvk;
        GifFrame nativeGetFrame = getFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            Integer num = AnonymousClass05K.A00;
            int disposalMode = nativeGetFrame.getDisposalMode();
            if (!(disposalMode == 0 || disposalMode == 1)) {
                if (disposalMode == 2) {
                    uvk = C16489Uvk.DISPOSE_TO_BACKGROUND;
                } else if (disposalMode == 3) {
                    uvk = C16489Uvk.DISPOSE_TO_PREVIOUS;
                }
                return new C17554Va8(uvk, num, xOffset, yOffset, width, height);
            }
            uvk = C16489Uvk.DISPOSE_DO_NOT;
            return new C17554Va8(uvk, num, xOffset, yOffset, width, height);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public GifImage() {
    }
}
