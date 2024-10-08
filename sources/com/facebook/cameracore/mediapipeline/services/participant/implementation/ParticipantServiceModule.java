package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.0dV;
import X.C371628yi;
import X.C371698yt;
import X.C380919aj;
import X.C392799vO;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public final class ParticipantServiceModule extends ServiceModule {
    public static final C392799vO Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vO, java.lang.Object] */
    static {
        0dV.A0C("participantservice");
    }

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        if (r3 == null) {
            return null;
        }
        C371628yi r1 = C380919aj.A01;
        if (C371698yt.A01(r3, r1)) {
            return new ParticipantServiceConfigurationHybrid((C380919aj) r3.A02(r1));
        }
        return null;
    }

    public ParticipantServiceModule() {
        this.mHybridData = initHybrid();
    }
}
