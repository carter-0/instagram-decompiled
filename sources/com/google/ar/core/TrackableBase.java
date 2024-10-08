package com.google.ar.core;

import X.C51971G9r;

public class TrackableBase {
    private native long nativeCreateAnchor(long j, long j2, Pose pose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native int nativeGetType(long j, long j2);

    public static native void nativeReleaseTrackable(long j, long j2);

    public final boolean equals(Object obj) {
        if (obj instanceof TrackableBase) {
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
