package com.facebook.cameracore.mediapipeline.services.avatars;

import X.0dV;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class AvatarsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AvatarsDataProviderConfigurationHybrid $redex_init_class = null;

    public static native HybridData initHybrid(String str, String str2, int i, AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge, AvatarsNativeInputDelegate avatarsNativeInputDelegate);

    static {
        0dV.A0C("avatarsdataprovider");
    }
}
