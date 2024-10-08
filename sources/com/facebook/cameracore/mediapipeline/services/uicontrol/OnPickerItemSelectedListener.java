package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.B12;
import com.facebook.jni.HybridData;

public class OnPickerItemSelectedListener implements B12 {
    public HybridData mHybridData;

    public native void onPickerItemSelected(int i);

    public OnPickerItemSelectedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
