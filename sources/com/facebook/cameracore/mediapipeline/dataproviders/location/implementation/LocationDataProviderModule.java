package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.0dV;
import X.C371698yt;
import X.C371978zS;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public class LocationDataProviderModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        0dV.A0C("locationdataprovider");
    }

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        C371978zS r1;
        if (r3 == null || (r1 = r3.A03) == null) {
            return null;
        }
        return new LocationDataProviderConfigurationHybrid(r1);
    }

    public LocationDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
