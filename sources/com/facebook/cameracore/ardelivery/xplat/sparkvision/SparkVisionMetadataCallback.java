package com.facebook.cameracore.ardelivery.xplat.sparkvision;

import X.0dV;
import X.CU9;
import com.facebook.cameracore.ardelivery.sparkvision.SparkVisionMetadataResponse;
import com.facebook.jni.HybridData;

public final class SparkVisionMetadataCallback {
    public static final CU9 Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(SparkVisionMetadataResponse sparkVisionMetadataResponse);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.CU9] */
    static {
        0dV.A0C("ard-spark-vision-downloader");
    }

    public SparkVisionMetadataCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
