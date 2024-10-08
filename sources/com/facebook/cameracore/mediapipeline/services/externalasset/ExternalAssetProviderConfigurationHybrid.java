package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.C371828zA;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class ExternalAssetProviderConfigurationHybrid extends ServiceConfiguration {
    public final C371828zA mConfiguration;

    public static native HybridData initHybrid(ExternalAssetLocalDataSource externalAssetLocalDataSource);

    public ExternalAssetProviderConfigurationHybrid(C371828zA r2) {
        this.mConfiguration = r2;
        this.mHybridData = initHybrid(r2.A00);
    }

    public void destroy() {
        super.destroy();
    }
}
