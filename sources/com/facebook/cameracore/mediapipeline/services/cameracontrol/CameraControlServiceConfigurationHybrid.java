package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C371668yo;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C371668yo mConfiguration;

    public static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);

    public CameraControlServiceConfigurationHybrid(C371668yo r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
