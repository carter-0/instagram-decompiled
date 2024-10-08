package com.instagram.ml.imagecrop;

import X.0dV;
import X.XXM;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class ImageCropJni {
    public static final XXM Companion = new Object();
    public static boolean isLibraryLoadSuccessful;
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native float[] getSaliencyRegion(int i, int i2, float f, ByteBuffer byteBuffer);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XXM, java.lang.Object] */
    static {
        0dV.A0C("image-crop");
    }
}
