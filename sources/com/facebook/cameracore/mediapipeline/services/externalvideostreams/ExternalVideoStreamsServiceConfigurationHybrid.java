package com.facebook.cameracore.mediapipeline.services.externalvideostreams;

import X.C380889ag;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.externalvideostreamsdelegate.ExternalVideoStreamsDelegateManager;
import com.facebook.jni.HybridData;

public abstract class ExternalVideoStreamsServiceConfigurationHybrid extends ServiceConfiguration {
    public final C380889ag serviceConfiguration;

    public static final native HybridData initHybrid(ExternalVideoStreamsDelegateManager externalVideoStreamsDelegateManager);
}
