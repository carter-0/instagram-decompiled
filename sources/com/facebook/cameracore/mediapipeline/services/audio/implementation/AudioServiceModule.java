package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.0dV;
import X.C371698yt;
import X.C371718yv;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public class AudioServiceModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        0dV.A0C("audiographservice");
    }

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        C371718yv r1;
        if (r3 == null || (r1 = r3.A06) == null) {
            return null;
        }
        return new AudioServiceConfigurationHybrid(r1);
    }

    public AudioServiceModule() {
        this.mHybridData = initHybrid();
    }
}
