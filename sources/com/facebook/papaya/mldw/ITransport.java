package com.facebook.papaya.mldw;

import X.0dV;
import com.facebook.jni.HybridData;

public abstract class ITransport {
    public HybridData mHybridData;

    static {
        0dV.A0C("papaya-mldw");
    }

    public ITransport(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
