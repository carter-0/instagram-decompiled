package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation;

import X.0qQ;
import X.B2Q;
import X.C392849vT;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

public final class PlatformAlgorithmDataSourceHybrid implements B2Q {
    public static final C392849vT Companion = new Object();
    public final PlatformAlgorithmDataSource dataSource;
    public final HybridData mHybridData = initHybrid();

    public PlatformAlgorithmDataSourceHybrid(PlatformAlgorithmDataSource platformAlgorithmDataSource) {
        0qQ.A0B(platformAlgorithmDataSource, 1);
        this.dataSource = platformAlgorithmDataSource;
        platformAlgorithmDataSource.registerListener(this);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    private final native void nativeCloseSession();

    public final native void nativeUpdateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSourceHybrid platformAlgorithmAlwaysOnDataSourceHybrid);

    public final native void nativeUpdateFrameInReplay(PlatformAlgorithmAlwaysOnDataSourceHybrid platformAlgorithmAlwaysOnDataSourceHybrid);

    public void onFrameUpdate(PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        0qQ.A0B(platformAlgorithmAlwaysOnDataSource, 0);
        nativeUpdateFrameInReplay((PlatformAlgorithmAlwaysOnDataSourceHybrid) platformAlgorithmAlwaysOnDataSource);
    }

    public void onCloseSession() {
        nativeCloseSession();
    }

    public void onFrameUpdate(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        nativeUpdateFrame(j, j2, (PlatformAlgorithmAlwaysOnDataSourceHybrid) platformAlgorithmAlwaysOnDataSource);
    }
}
