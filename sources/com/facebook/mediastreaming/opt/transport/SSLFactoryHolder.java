package com.facebook.mediastreaming.opt.transport;

import X.0dV;
import X.XV9;
import com.facebook.jni.HybridData;

public class SSLFactoryHolder {
    public static final XV9 Companion = new Object();
    public HybridData mHybridData;

    private final native HybridData initHybrid(String str, boolean z, Object obj);

    public final HybridData initHybridData(String str, boolean z, Object obj) {
        return initHybrid(str, false, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XV9] */
    static {
        0dV.A0C("mediastreaming-transport");
    }
}
