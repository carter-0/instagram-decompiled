package com.facebook.pando;

import X.0dV;
import X.AnonymousClass3r0;
import com.facebook.jni.HybridClassBase;

public final class ConnectionManager extends HybridClassBase {
    public static final AnonymousClass3r0 Companion = new Object();

    private final native void initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3r0, java.lang.Object] */
    static {
        0dV.A0C("pando-connection-jni");
    }

    public ConnectionManager() {
        initHybrid();
    }
}
