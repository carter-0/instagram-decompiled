package com.facebook.tigon;

import com.facebook.jni.HybridData;

public abstract class TigonXplatBodyProvider extends TigonBodyProvider {
    private native HybridData initHybrid();

    public TigonXplatBodyProvider() {
        this.mHybridData = initHybrid();
    }
}
