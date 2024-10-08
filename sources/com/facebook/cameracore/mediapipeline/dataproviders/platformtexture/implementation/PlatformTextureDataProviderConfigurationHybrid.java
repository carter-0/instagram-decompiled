package com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation;

import X.0qQ;
import X.C372078ze;
import X.C392639v8;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class PlatformTextureDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C392639v8 Companion = new Object();
    public final C372078ze configuration;
    public final PlatformTextureDataProviderObjectsWrapper objectsWrapper;

    public PlatformTextureDataProviderConfigurationHybrid(C372078ze r3) {
        0qQ.A0B(r3, 1);
        this.configuration = r3;
        PlatformTextureDataProviderObjectsWrapper platformTextureDataProviderObjectsWrapper = new PlatformTextureDataProviderObjectsWrapper(r3.A00);
        this.objectsWrapper = platformTextureDataProviderObjectsWrapper;
        this.mHybridData = initHybrid(platformTextureDataProviderObjectsWrapper);
    }

    public static final native HybridData initHybrid(PlatformTextureDataProviderObjectsWrapper platformTextureDataProviderObjectsWrapper);
}
