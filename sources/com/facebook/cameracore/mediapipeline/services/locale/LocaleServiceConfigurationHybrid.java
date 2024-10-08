package com.facebook.cameracore.mediapipeline.services.locale;

import X.C371888zI;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class LocaleServiceConfigurationHybrid extends ServiceConfiguration {
    public final C371888zI mConfiguration;

    public static native HybridData initHybrid(LocaleDataSource localeDataSource);

    public LocaleServiceConfigurationHybrid(C371888zI r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
