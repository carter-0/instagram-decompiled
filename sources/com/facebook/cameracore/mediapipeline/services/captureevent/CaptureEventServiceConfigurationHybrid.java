package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.C371678yq;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class CaptureEventServiceConfigurationHybrid extends ServiceConfiguration {
    public final CaptureEventInputWrapper mCaptureEventInputWrapper;
    public final C371678yq mConfiguration;

    public static native HybridData initHybrid(CaptureEventInputWrapper captureEventInputWrapper);

    public CaptureEventServiceConfigurationHybrid(C371678yq r3) {
        this.mConfiguration = r3;
        CaptureEventInputWrapper captureEventInputWrapper = new CaptureEventInputWrapper(r3.A00);
        this.mCaptureEventInputWrapper = captureEventInputWrapper;
        this.mHybridData = initHybrid(captureEventInputWrapper);
    }
}
