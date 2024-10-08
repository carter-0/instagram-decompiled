package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.0dV;
import X.C371698yt;
import X.C372128zj;
import X.C392659vA;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public final class WorldTrackerDataProviderModule extends ServiceModule {
    public static final C392659vA Companion = new Object();

    private final native HybridData initHybrid();

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        C372128zj r0;
        if (r3 == null || (r0 = r3.A04) == null) {
            return null;
        }
        return new WorldTrackerDataProviderConfigurationHybrid(r0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vA, java.lang.Object] */
    static {
        0dV.A0C("worldtrackerdataprovider");
    }

    public WorldTrackerDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
