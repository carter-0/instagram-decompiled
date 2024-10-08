package com.facebook.cameracore.mediapipeline.standalonetracking;

import X.0dV;
import X.C9921Rja;
import com.facebook.jni.HybridData;

public class ManifestBuilder {
    public final HybridData mHybridData;

    private native void enableBodyTracking();

    private native void enableCapability(String str);

    private native void enableFaceExpressions();

    private native void enableFaceTracking(int i);

    private native void enableFaceTracking3D(int i);

    private native void enableHairSegmentation();

    private native void enableHandTracking(int i, boolean z);

    private native void enableLocation();

    private native void enablePersonSegmentation();

    private native void enableWorldTracking();

    public static native HybridData initHybrid();

    public ManifestBuilder() {
        synchronized (C9921Rja.class) {
            if (!C9921Rja.A00) {
                0dV.A0C("arstandalonetracking-native-android");
                C9921Rja.A00 = true;
            }
        }
        this.mHybridData = initHybrid();
    }
}
