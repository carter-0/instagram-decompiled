package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.C371738z0;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C371738z0 mConfiguration;
    public final MotionDataSourceWrapper mMotionDataSourceWrapper;

    public static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataSourceWrapper getDataSource() {
        return this.mMotionDataSourceWrapper;
    }

    public MotionDataProviderConfigurationHybrid(C371738z0 r3) {
        this.mConfiguration = r3;
        MotionDataSourceWrapper motionDataSourceWrapper = new MotionDataSourceWrapper(r3.A00);
        this.mMotionDataSourceWrapper = motionDataSourceWrapper;
        this.mHybridData = initHybrid(motionDataSourceWrapper);
    }
}
