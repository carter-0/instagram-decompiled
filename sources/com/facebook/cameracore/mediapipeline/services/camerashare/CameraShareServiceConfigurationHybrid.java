package com.facebook.cameracore.mediapipeline.services.camerashare;

import X.C380899ah;
import X.C392709vF;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public final class CameraShareServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C392709vF Companion = new Object();
    public final C380899ah configuration;

    public static final native HybridData initHybrid(String str);

    public CameraShareServiceConfigurationHybrid(C380899ah r2) {
        super(initHybrid(r2.A00));
        this.configuration = r2;
    }
}
