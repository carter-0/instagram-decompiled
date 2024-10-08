package com.facebook.pando;

import com.facebook.jni.HybridData;

public abstract class PandoPrimaryExecution {
    public HybridData mHybridData;

    public PandoPrimaryExecution(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
