package com.google.ar.core;

import X.C51971G9r;

public class Anchor {
    private native void nativeDetach(long j, long j2);

    private native String nativeGetCloudAnchorId(long j, long j2);

    private native int nativeGetCloudAnchorState(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTerrainAnchorState(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native void nativeReleaseAnchor(long j, long j2);

    public final boolean equals(Object obj) {
        if (obj instanceof Anchor) {
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
