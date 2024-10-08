package com.facebook.imagepipeline.nativecode;

import X.0di;
import android.graphics.Bitmap;

public class NativeBlurFilter {
    public static final NativeBlurFilter $redex_init_class = null;

    public static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        0di.A01("native-filters");
    }
}
