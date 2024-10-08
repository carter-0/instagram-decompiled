package com.facebook.cameracore.mediapipeline.arengineservices.utils;

import X.0dV;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;

public final class ManifestUtils {
    public static final ManifestUtils INSTANCE = new Object();
    public static boolean forceSOLoad;

    public static final native int[] filterNeededServicesNative(String str, String str2, int[] iArr, ARExperimentConfig aRExperimentConfig);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils, java.lang.Object] */
    static {
        0dV.A0C("arengineservicesutils");
    }
}
