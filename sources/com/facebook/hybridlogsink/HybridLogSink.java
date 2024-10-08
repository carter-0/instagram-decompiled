package com.facebook.hybridlogsink;

import X.0dV;
import X.C21512Xde;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.jni.HybridData;

public final class HybridLogSink {
    public static final C21512Xde Companion = new Object();
    public final HybridData mHybridData = initHybrid(IgNetworkConsentStorage.MAX_ENTRIES);

    public static final native HybridData initHybrid(int i);

    public final native String[] getLogMessages();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Xde] */
    static {
        0dV.A0C("hybridlogsinkjni");
    }
}
