package com.facebook.cameracore.mediapipeline.arclass.common;

import X.0dV;
import X.C392579v2;
import com.facebook.jni.HybridData;

public final class ARClass {
    public static final C392579v2 Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(int i);

    public final native int getValue();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9v2, java.lang.Object] */
    static {
        0dV.A0C("arclass");
    }

    public ARClass(int i) {
        this.mHybridData = initHybrid(i);
    }

    public ARClass(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
