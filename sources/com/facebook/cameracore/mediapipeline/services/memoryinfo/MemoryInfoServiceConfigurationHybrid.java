package com.facebook.cameracore.mediapipeline.services.memoryinfo;

import X.C371898zJ;
import X.C392749vJ;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class MemoryInfoServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C392749vJ Companion = new Object();
    public final C371898zJ configuration;

    public static final native HybridData initHybrid(MemoryInfoServiceImpl memoryInfoServiceImpl);

    public MemoryInfoServiceConfigurationHybrid(C371898zJ r2) {
        super(initHybrid(r2.A00));
        this.configuration = r2;
    }
}
