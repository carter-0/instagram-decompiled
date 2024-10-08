package com.facebook.models;

import X.0dV;
import com.facebook.jni.HybridData;

public class VoltronLoadingResult {
    public final HybridData mHybridData = initHybrid(true, true);

    public VoltronLoadingResult(boolean z, boolean z2) {
    }

    private native HybridData initHybrid(boolean z, boolean z2);

    static {
        0dV.A0C("models-common");
    }
}
