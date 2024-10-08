package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.C371978zS;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;

public class LocationDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C371978zS mConfiguration;

    private native HybridData initHybrid();

    private LocationDataProvider createLocationDataProvider() {
        LocationDataProviderImpl locationDataProviderImpl = new LocationDataProviderImpl();
        this.mConfiguration.A00 = locationDataProviderImpl;
        return locationDataProviderImpl;
    }

    public LocationDataProviderConfigurationHybrid(C371978zS r2) {
        this.mHybridData = initHybrid();
        this.mConfiguration = r2;
    }
}
