package com.instagram.ml.bodytracking;

import X.0dV;
import X.0wb;
import X.A0S;
import X.AnonymousClass7TG;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class BodyTrackerJni {
    public static final A0S Companion = new Object();
    public static boolean isLibraryLoadSuccessful;
    public final HybridData mHybridData;

    private final native HybridData initHybrid(String str, String str2, boolean z);

    public final native float[] getAllBoundingBoxes();

    public final native float[] getBoundingBox(int i);

    public final native int getDetectedPeopleCount();

    public final native int[] getDetectedPeopleIds();

    public final native void setupSinglePhotoDetection();

    public final native void updateFrameByteBuffer(int i, int i2, ByteBuffer byteBuffer);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.A0S, java.lang.Object] */
    static {
        0dV.A0C("body-tracker");
        try {
            AnonymousClass7TG.A0v();
            isLibraryLoadSuccessful = true;
        } catch (UnsatisfiedLinkError e) {
            isLibraryLoadSuccessful = false;
            0wb.A06("BodyTrackerJni", "SoLoader pytorch library exception:", e);
        }
    }

    public final boolean isReady() {
        if (!isLibraryLoadSuccessful || this.mHybridData == null) {
            return false;
        }
        return true;
    }

    public BodyTrackerJni(String str, String str2, boolean z) {
        HybridData hybridData;
        AnonymousClass7TG.A1O(str, str2);
        if (isLibraryLoadSuccessful) {
            hybridData = initHybrid(str, str2, z);
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
        if (!isLibraryLoadSuccessful) {
            0wb.A03("BodyTrackerJni", "Failed to load library when initializing BodyTrackerJni");
        }
    }
}
