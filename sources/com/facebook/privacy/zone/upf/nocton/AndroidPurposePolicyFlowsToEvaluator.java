package com.facebook.privacy.zone.upf.nocton;

import X.0dV;
import X.0qQ;
import X.CUE;
import com.facebook.jni.HybridData;
import java.util.Map;

public final class AndroidPurposePolicyFlowsToEvaluator {
    public static final CUE Companion = new Object();
    public final HybridData mHybridData;

    public AndroidPurposePolicyFlowsToEvaluator(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native int flowsTo(String str, String str2, Map map);

    public static final native HybridData initHybrid0();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CUE, java.lang.Object] */
    static {
        0dV.A0C("mobile_purpose_policy");
    }

    public AndroidPurposePolicyFlowsToEvaluator() {
        this(initHybrid0());
    }
}
