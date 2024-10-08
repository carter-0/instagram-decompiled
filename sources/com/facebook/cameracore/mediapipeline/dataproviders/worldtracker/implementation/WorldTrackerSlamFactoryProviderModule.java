package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.0dV;
import X.C368508sl;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerSlamFactoryProvider;
import com.facebook.jni.HybridData;

public final class WorldTrackerSlamFactoryProviderModule extends WorldTrackerSlamFactoryProvider {
    public static final C368508sl Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8sl, java.lang.Object] */
    static {
        0dV.A0C("slamfactoryprovider");
    }

    public WorldTrackerSlamFactoryProviderModule() {
        this.mHybridData = initHybrid();
    }
}
