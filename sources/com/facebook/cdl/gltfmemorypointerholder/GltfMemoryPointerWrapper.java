package com.facebook.cdl.gltfmemorypointerholder;

import X.0dV;
import X.C62971KpN;
import com.facebook.jni.HybridData;

public final class GltfMemoryPointerWrapper {
    public static final C62971KpN Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native boolean hasColorizationData();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.KpN] */
    static {
        0dV.A0C("gltfholdernew");
    }
}
