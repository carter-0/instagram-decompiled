package com.facebook.tigon.tigonhuc;

import X.0dV;
import X.C9586RdQ;
import com.facebook.jni.HybridData;

public final class TigonHucBodyProvider {
    public static final C9586RdQ Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native void beginStream(HucBodyStream hucBodyStream);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RdQ, java.lang.Object] */
    static {
        0dV.A0C("tigonhuc");
    }

    public TigonHucBodyProvider(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
