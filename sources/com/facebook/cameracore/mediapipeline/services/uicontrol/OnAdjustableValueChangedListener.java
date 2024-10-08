package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.B11;
import com.facebook.jni.HybridData;

public class OnAdjustableValueChangedListener implements B11 {
    public HybridData mHybridData;

    public native void onAdjustableValueChanged(float f);

    public OnAdjustableValueChangedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
