package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.0dV;
import X.C360938fO;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.insights.GPUInsights;
import com.facebook.jni.HybridData;

public class IgluConfigHolder {
    public final HybridData mHybridData;

    private native void attachInsightsNative(GPUInsights gPUInsights);

    private native void detachInsightsNative(GPUInsights gPUInsights);

    private native void releaseNative();

    static {
        0dV.A0C("mediapipeline-iglufilter-holder");
    }

    public void release() {
        GPUInsights gPUInsights = C360938fO.A00;
        if (gPUInsights != null) {
            gPUInsights.logExistingEvents("IgluConfigHolder");
            detachInsightsNative(gPUInsights);
        }
        releaseNative();
    }

    public IgluConfigHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
        if (C360938fO.A01 && C360938fO.A00 == null) {
            C360938fO.A00 = new GPUInsights();
        }
        GPUInsights gPUInsights = C360938fO.A00;
        if (gPUInsights != null) {
            attachInsightsNative(gPUInsights);
        }
    }
}
