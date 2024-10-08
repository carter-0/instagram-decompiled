package com.facebook.cameracore.mediapipeline.services.haptic;

import X.C371918zM;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class HapticServiceConfigurationHybrid extends ServiceConfiguration {
    public final HapticServiceDelegateWrapper mDelegateWrapper;

    public static native HybridData initHybrid(HapticServiceDelegateWrapper hapticServiceDelegateWrapper);

    public HapticServiceConfigurationHybrid(C371918zM r3) {
        HapticServiceDelegateWrapper hapticServiceDelegateWrapper = new HapticServiceDelegateWrapper(r3.A00);
        this.mDelegateWrapper = hapticServiceDelegateWrapper;
        this.mHybridData = initHybrid(hapticServiceDelegateWrapper);
    }
}
