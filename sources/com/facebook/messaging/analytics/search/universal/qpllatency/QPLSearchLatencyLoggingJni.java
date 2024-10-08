package com.facebook.messaging.analytics.search.universal.qpllatency;

import X.0dV;
import X.C69700NqM;
import com.facebook.jni.HybridData;

public final class QPLSearchLatencyLoggingJni {
    public static final C69700NqM Companion = new Object();
    public HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public final native void cacheQueryEnd(int i, String str, int i2);

    public final native void cacheQueryRender(int i, int i2);

    public final native void cacheQueryStart(int i, String str);

    public final native void endCurrentFlow(String str);

    public final native void endFlow(int i, String str);

    public final native void networkQueryEnd(int i, String str, int i2);

    public final native void networkQueryRender(int i, int i2);

    public final native void networkQueryStart(int i, String str);

    public final native int startFlow(int i, String str, int i2, String str2, String str3);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.NqM] */
    static {
        0dV.A0C("search-qpllogger");
    }
}
