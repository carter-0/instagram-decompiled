package com.instagram.util.regiontracking;

import X.0dV;
import X.O37;
import com.facebook.jni.HybridData;

public abstract class RegionTracker {
    public static final O37 Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid();

    private final native void nativeAddRegion(long j, float f, float f2, float f3, float f4);

    private final native long nativeCreateRegionTracker(int i, float f, float f2, boolean z);

    private final native void nativeDispose(long j);

    private final native Object nativeUpdate(long j, Object obj, int i, int i2, float[] fArr, boolean z);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.O37, java.lang.Object] */
    static {
        0dV.A0C("regiontracking");
    }
}
