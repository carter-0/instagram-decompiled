package com.facebook.cdl.gltfmemorypointerholder;

import X.0dV;
import X.C62972KpO;
import com.facebook.jni.HybridData;

public final class LiveEditingRawMemoryPointerHolder {
    public static final C62972KpO Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.KpO] */
    static {
        0dV.A0C("gltfholdernew");
    }
}
