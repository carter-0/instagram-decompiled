package com.facebook.tigon.javaservice;

import X.0qQ;
import com.facebook.jni.HybridData;

public abstract class AbstractRequestToken {
    public final HybridData mHybridData;

    public AbstractRequestToken(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void cancel();

    public abstract void changeHttpPriority(byte b, boolean z);
}
