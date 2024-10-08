package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public class RuntimeScheduler {
    public HybridData mHybridData;

    public RuntimeScheduler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
