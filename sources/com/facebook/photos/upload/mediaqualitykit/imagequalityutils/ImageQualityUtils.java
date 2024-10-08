package com.facebook.photos.upload.mediaqualitykit.imagequalityutils;

import X.0dV;
import X.C62991Kph;
import android.graphics.Bitmap;
import com.facebook.jni.HybridClassBase;

public final class ImageQualityUtils extends HybridClassBase {
    public static int BLUE_CHANNEL = 2;
    public static final C62991Kph Companion = new Object();
    public static int GREEN_CHANNEL = 1;

    private final native void initHybrid();

    public final native float calculateColorChannelSSIM(int i, Bitmap bitmap, Bitmap bitmap2);

    public final native float calculateESSIM(Bitmap bitmap, Bitmap bitmap2);

    public final native double calculateMSSSIM(Bitmap bitmap, Bitmap bitmap2);

    public final native float calculateSSIM(Bitmap bitmap, Bitmap bitmap2);

    public final native int getBitmapStride(Bitmap bitmap);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Kph, java.lang.Object] */
    static {
        0dV.A0C("image_quality_utils");
    }

    public ImageQualityUtils() {
        initHybrid();
    }
}
