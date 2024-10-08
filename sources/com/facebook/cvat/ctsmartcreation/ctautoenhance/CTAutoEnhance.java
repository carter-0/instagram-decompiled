package com.facebook.cvat.ctsmartcreation.ctautoenhance;

import X.0dV;
import X.RV9;
import com.facebook.jni.HybridData;

public final class CTAutoEnhance {
    public static final RV9 Companion = new Object();
    public final HybridData mHybridData = initHybridNative(4, 30, 0.8f);

    private final native HybridData initHybridNative(int i, int i2, float f);

    private final native CTAutoEnhanceControlValues nativeAnalyze(int i, int i2, int i3, int i4);

    private final native String nativeGetProcessingMetricsJSON();

    private final native void nativeRender(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RV9, java.lang.Object] */
    static {
        0dV.A0C("ctautoenhance-native");
    }
}
