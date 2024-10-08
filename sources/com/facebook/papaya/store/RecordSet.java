package com.facebook.papaya.store;

import X.0dV;
import com.facebook.jni.HybridData;

public class RecordSet {
    public final HybridData mHybridData;

    private native Record nativeGet(int i);

    private native int nativeSize();

    static {
        0dV.A0C("papaya-store-interface");
    }

    public RecordSet(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
