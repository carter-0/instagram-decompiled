package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.0qQ;
import X.C371838zD;
import X.C392629v7;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C392629v7 Companion = new Object();
    public final C371838zD configuration;
    public final PlatformEventsServiceObjectsWrapper objectsWrapper;

    public PlatformEventsDataProviderConfigurationHybrid(C371838zD r4) {
        0qQ.A0B(r4, 1);
        this.configuration = r4;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = new PlatformEventsServiceObjectsWrapper(r4.A01, r4.A00);
        this.objectsWrapper = platformEventsServiceObjectsWrapper;
        this.mHybridData = initHybrid(platformEventsServiceObjectsWrapper);
    }

    public static final native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);
}
