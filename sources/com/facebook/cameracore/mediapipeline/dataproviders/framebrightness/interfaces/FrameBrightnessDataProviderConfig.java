package com.facebook.cameracore.mediapipeline.dataproviders.framebrightness.interfaces;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FrameBrightnessDataProviderConfig {
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;

    public FrameBrightnessDataProviderConfig() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ FrameBrightnessDataProviderConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.frameProcessorDelayTolerance = 30000;
        this.frameProcessorWaitTimeout = 70000;
        this.frameProcessorTimeToLive = 15000;
    }
}
