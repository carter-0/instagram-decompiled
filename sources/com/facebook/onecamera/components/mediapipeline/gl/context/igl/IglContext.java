package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.0dV;
import X.C393089vs;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.insights.GPUInsights;
import com.facebook.jni.HybridData;

public final class IglContext {
    public static final C393089vs Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native void attachInsightsNative(GPUInsights gPUInsights);

    public final native void detachInsightsNative(GPUInsights gPUInsights);

    public final native void finish();

    public final native void flush();

    public final native void release();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vs] */
    static {
        0dV.A0C("mediapipeline-igl-context");
    }

    public IglContext(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
