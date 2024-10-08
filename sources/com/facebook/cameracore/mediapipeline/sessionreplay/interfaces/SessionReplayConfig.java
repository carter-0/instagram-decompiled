package com.facebook.cameracore.mediapipeline.sessionreplay.interfaces;

public abstract class SessionReplayConfig {
    public abstract boolean isReplayLightEstimationDataEnabled();

    public abstract boolean isReplayMotionDataEnabled();

    public abstract boolean isReplayPlatformAlgorithmDataEnabled();

    public abstract boolean isReplaySnapshotEnabled();
}
