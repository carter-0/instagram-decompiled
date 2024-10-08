package com.facebook.flexlayout;

import X.0dV;
import com.facebook.flexlayout.layoutoutput.LayoutOutput;

public class FlexLayoutNative {
    public static native void jni_calculateLayout(float[] fArr, float[][] fArr2, float f, float f2, float f3, float f4, float f5, float f6, LayoutOutput layoutOutput, FlexLayoutNativeMeasureCallback flexLayoutNativeMeasureCallback);

    static {
        0dV.A0C("flexlayout");
    }
}
