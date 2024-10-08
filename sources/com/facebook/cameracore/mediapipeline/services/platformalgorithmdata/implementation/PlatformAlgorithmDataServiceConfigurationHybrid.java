package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation;

import X.0qQ;
import X.C371988zT;
import X.C392839vS;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class PlatformAlgorithmDataServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C392839vS Companion = new Object();
    public final C371988zT configuration;
    public final PlatformAlgorithmDataSourceHybrid dataSource;

    public PlatformAlgorithmDataServiceConfigurationHybrid(C371988zT r3) {
        0qQ.A0B(r3, 1);
        this.configuration = r3;
        PlatformAlgorithmDataSourceHybrid platformAlgorithmDataSourceHybrid = new PlatformAlgorithmDataSourceHybrid(r3.A00);
        this.dataSource = platformAlgorithmDataSourceHybrid;
        this.mHybridData = initHybrid(platformAlgorithmDataSourceHybrid);
    }

    public static final native HybridData initHybrid(PlatformAlgorithmDataSourceHybrid platformAlgorithmDataSourceHybrid);

    public final PlatformAlgorithmDataSourceHybrid getDataSource() {
        return this.dataSource;
    }
}
