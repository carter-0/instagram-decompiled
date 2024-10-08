package com.facebook.cameracore.mediapipeline.featureconfig;

import X.0dV;
import com.facebook.jni.HybridData;

public final class ProductFeatureConfig {
    public final HybridData mHybridData;

    public ProductFeatureConfig(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z4;
        this.mHybridData = initHybrid(true, z5, i, z, false, false, z3, z2);
    }

    public static native HybridData initHybrid(boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    static {
        0dV.A0C("featureconfig");
    }

    public ProductFeatureConfig(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ProductFeatureConfig() {
        this(false, 0, false, false, false);
    }
}
