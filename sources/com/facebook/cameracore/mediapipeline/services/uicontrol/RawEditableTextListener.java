package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.C41812B1r;
import com.facebook.jni.HybridData;

public class RawEditableTextListener implements C41812B1r {
    public HybridData mHybridData;

    public native void onExit();

    public native void onTextChanged(String str);

    public RawEditableTextListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
