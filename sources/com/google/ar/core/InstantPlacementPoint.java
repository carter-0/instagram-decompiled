package com.google.ar.core;

public abstract class InstantPlacementPoint extends TrackableBase {
    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingMethod(long j, long j2);
}
