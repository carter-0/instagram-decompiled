package com.google.ar.core;

import X.C51971G9r;

public class HitResult {
    private native long nativeCreateAnchor(long j, long j2);

    public static native void nativeDestroyHitResult(long j, long j2);

    private native float nativeGetDistance(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    public native long nativeAcquireTrackable(long j, long j2);

    public final boolean equals(Object obj) {
        if (obj instanceof HitResult) {
            return true;
        }
        return false;
    }

    public final void finalize() {
    }

    public final int hashCode() {
        return C51971G9r.A0m().hashCode();
    }
}
