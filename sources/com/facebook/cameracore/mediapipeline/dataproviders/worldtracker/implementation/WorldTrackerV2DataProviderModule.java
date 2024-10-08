package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.0dV;
import X.C371698yt;
import X.C372128zj;
import X.C392669vB;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public final class WorldTrackerV2DataProviderModule extends ServiceModule {
    public static final C392669vB Companion = new Object();

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vB, java.lang.Object] */
    static {
        0dV.A0C("worldtrackerv2dataprovider");
    }

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        C372128zj r1;
        if (r3 == null || (r1 = r3.A04) == null) {
            return null;
        }
        return new WorldTrackerDataProviderConfigurationHybrid(r1);
    }

    public WorldTrackerV2DataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
