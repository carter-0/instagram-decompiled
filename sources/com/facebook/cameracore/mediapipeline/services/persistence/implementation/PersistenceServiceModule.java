package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.0dV;
import X.C371628yi;
import X.C371698yt;
import X.C371848zE;
import X.C392819vQ;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public final class PersistenceServiceModule extends ServiceModule {
    public static final C392819vQ Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vQ, java.lang.Object] */
    static {
        0dV.A0C("arpersistenceservice");
    }

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        if (r3 == null) {
            return null;
        }
        C371628yi r1 = C371848zE.A05;
        if (C371698yt.A01(r3, r1)) {
            return new PersistenceServiceConfigurationHybrid((C371848zE) r3.A02(r1));
        }
        return null;
    }

    public PersistenceServiceModule() {
        this.mHybridData = initHybrid();
    }
}
