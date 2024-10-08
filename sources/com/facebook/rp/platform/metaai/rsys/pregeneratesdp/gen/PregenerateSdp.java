package com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen;

import X.0dV;
import X.0qQ;
import X.C69722Nqi;
import com.facebook.jni.HybridData;

public final class PregenerateSdp {
    public static final C69722Nqi Companion = new Object();
    public final HybridData mHybridData;

    public PregenerateSdp(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public static final native HybridData initHybrid0(int i, long j);

    public final native boolean equals(PregenerateSdp pregenerateSdp);

    public final native PregenerateSdpData getData();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Nqi] */
    static {
        0dV.A0C("pregensdp");
    }
}
