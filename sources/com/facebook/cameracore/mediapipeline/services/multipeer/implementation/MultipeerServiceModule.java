package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.0dV;
import X.C371628yi;
import X.C371698yt;
import X.C380909ai;
import X.C392779vM;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public final class MultipeerServiceModule extends ServiceModule {
    public static final C392779vM Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vM, java.lang.Object] */
    static {
        0dV.A0C("multipeerservice");
    }

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        if (r3 == null) {
            return null;
        }
        C371628yi r1 = C380909ai.A01;
        if (C371698yt.A01(r3, r1)) {
            return new MultipeerServiceConfigurationHybrid((C380909ai) r3.A02(r1));
        }
        return null;
    }

    public MultipeerServiceModule() {
        this.mHybridData = initHybrid();
    }
}
