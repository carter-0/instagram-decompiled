package com.facebook.cameracore.mediapipeline.services.music;

import X.C371908zL;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class MusicServiceConfigurationHybrid extends ServiceConfiguration {
    public final C371908zL mConfiguration;

    public static native HybridData initHybrid(MusicServiceDataSource musicServiceDataSource);

    public MusicServiceConfigurationHybrid(C371908zL r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
