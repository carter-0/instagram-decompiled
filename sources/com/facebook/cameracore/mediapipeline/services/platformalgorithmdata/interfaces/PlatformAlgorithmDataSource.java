package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces;

import X.B2Q;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

public interface PlatformAlgorithmDataSource {
    void closeSession();

    void registerListener(B2Q b2q);

    void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);
}
