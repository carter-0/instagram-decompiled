package com.instagram.ui.igluglrender.hardwaretexture;

import X.0dV;
import X.A1N;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.hardware.HardwareBuffer;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.jni.HybridData;

public final class HardwareTexture {
    public static final A1N Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public final native boolean allocateJni(IgluConfigHolder igluConfigHolder, int i, int i2);

    public final native Object getHardwareBuffer();

    public final native int getTextureIdJni();

    public final native void releaseJni();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.A1N, java.lang.Object] */
    static {
        0dV.A0C("mediapipeline-iglufilter-hardwarebuffer");
    }

    public final Bitmap getBitmap() {
        HardwareBuffer hardwareBuffer = (HardwareBuffer) getHardwareBuffer();
        if (hardwareBuffer != null) {
            return Bitmap.wrapHardwareBuffer(hardwareBuffer, (ColorSpace) null);
        }
        return null;
    }
}
