package com.facebook.mobileconfig.troubleshooting;

import X.0dV;
import X.C74494Pvo;
import com.facebook.jni.HybridData;

public class BisectStateHolder implements C74494Pvo {
    public final HybridData mHybridData;

    public native boolean canContinue();

    public native String getCulprit();

    public native int getLeft();

    public native int getMiddle();

    public native int getNumberOfStepsMade();

    public native int getNumberOfStepsRemaining();

    public native int getRight();

    public native int getSize();

    public native String getTaskNumber();

    public native String getUniqueId();

    public native boolean isRunning();

    static {
        0dV.A0C("mobileconfigtroubleshooting-jni");
    }

    public BisectStateHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
