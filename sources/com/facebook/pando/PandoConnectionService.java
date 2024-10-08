package com.facebook.pando;

import X.0dV;
import X.C253563qz;
import com.facebook.jni.HybridData;

public final class PandoConnectionService extends PandoPrimaryExecution {
    public static final C253563qz Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager, boolean z, boolean z2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3qz] */
    static {
        0dV.A0C("pando-connection-jni");
    }
}
