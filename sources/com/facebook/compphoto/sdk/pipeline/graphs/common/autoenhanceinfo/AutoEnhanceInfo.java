package com.facebook.compphoto.sdk.pipeline.graphs.common.autoenhanceinfo;

import X.0dV;
import X.C48301EcK;
import com.facebook.jni.HybridData;

public final class AutoEnhanceInfo {
    public static final C48301EcK Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(float f, int i, int i2, float f2, float f3, float f4, float f5);

    public final native float getClarityGain();

    public final native int getHighPoint();

    public final native float getHighlightsGain();

    public final native int getLowPoint();

    public final native float getShadowsGain();

    public final native float getSharpeningGain();

    public final native float getSliderValue();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.EcK, java.lang.Object] */
    static {
        0dV.A0C("compphoto-sdk-pipeline-graphs-common-autoenhanceinfo-native-android");
    }

    public AutoEnhanceInfo(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
