package com.facebook.mediastreaming.opt.transport;

import X.0dV;
import X.XVA;
import com.facebook.jni.HybridData;

public class TraceEventObserverHolder {
    public static final XVA Companion = new Object();
    public HybridData mHybridData;

    private final native HybridData initHybrid(Object obj);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.XVA, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming-transport");
    }
}
