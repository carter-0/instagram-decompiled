package com.facebook.pando.primaryexecution.cache;

import X.0dV;
import X.C253423ql;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

public final class PandoCacheService extends PandoPrimaryExecution {
    public static final C253423ql Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, boolean z, boolean z2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3ql, java.lang.Object] */
    static {
        0dV.A0C("pando-client-cache-jni");
    }
}
