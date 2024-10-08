package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.C368608sy;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces.FrameBrightnessDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.handtracking.interfaces.HandTrackingDataProviderConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.slam.interfaces.SlamLibraryProvider;
import com.facebook.cameracore.mediapipeline.sessionrecording.interfaces.SessionRecordingConfig;
import com.facebook.cameracore.mediapipeline.sessionreplay.interfaces.SessionReplayConfig;

public class EffectServiceHostConfig {
    public final FaceTrackerDataProviderConfig mFaceTrackerDataProviderConfig;
    public final FrameBrightnessDataProviderConfig mFrameBrightnessDataProviderConfig;
    public final SlamLibraryProvider mSlamLibraryProvider;
    public final WorldTrackerDataProviderConfigWithSlam mWorldTrackerDataProviderConfigWithSlam;

    public int getConfigType() {
        return 0;
    }

    public FaceTrackerDataProviderConfig getFaceTrackerDataProviderConfig() {
        return this.mFaceTrackerDataProviderConfig;
    }

    public FrameBrightnessDataProviderConfig getFrameBrightnessDataProviderConfig() {
        return this.mFrameBrightnessDataProviderConfig;
    }

    public HandTrackingDataProviderConfig getHandTrackingDataProviderConfig() {
        return null;
    }

    public SessionRecordingConfig getSessionRecordingConfig() {
        return null;
    }

    public SessionReplayConfig getSessionReplayConfig() {
        return null;
    }

    public SlamLibraryProvider getSlamLibraryProvider() {
        return this.mSlamLibraryProvider;
    }

    public WorldTrackerDataProviderConfigWithSlam getWorldTrackerDataProviderConfigWithSlam() {
        return this.mWorldTrackerDataProviderConfigWithSlam;
    }

    public boolean isGalleryPickerEnabled() {
        return false;
    }

    public EffectServiceHostConfig(C368608sy r2) {
        this.mFaceTrackerDataProviderConfig = r2.A01;
        this.mFrameBrightnessDataProviderConfig = r2.A02;
        this.mWorldTrackerDataProviderConfigWithSlam = r2.A00;
        this.mSlamLibraryProvider = r2.A03;
    }
}
