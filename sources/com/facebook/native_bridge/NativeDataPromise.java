package com.facebook.native_bridge;

import X.0dV;
import com.facebook.jni.HybridData;

public class NativeDataPromise {
    public final HybridData mHybridData;

    public native void setException(String str);

    public native void setValue(Object obj);

    static {
        0dV.A0C("native_bridge");
    }

    public NativeDataPromise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
