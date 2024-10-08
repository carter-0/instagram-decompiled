package com.facebook.tigon.appnetsessionid;

import X.0dV;
import X.0qQ;
import X.C268644dl;
import X.C268704dr;
import com.facebook.jni.HybridData;
import java.util.ArrayList;
import java.util.Iterator;

public final class SessionIdGenerator {
    public static final C268644dl Companion = new Object();
    public volatile C268704dr latestSessionId;
    public final HybridData mHybridData = initHybrid();
    public final ArrayList sessionIdListeners = new ArrayList();

    private final native HybridData initHybrid();

    private final native void initializeSessionIdGenerator();

    public final native void clearLocationId();

    public final native void onBackground();

    public final native void onForeground();

    public final native void onNetworkChange();

    public final native void onSessionChange();

    public final native String updateAndGetLocationId();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.4dl] */
    static {
        0dV.A0C("appnetsessionid");
    }

    private final void publishNewSessionId(String str, String str2, String str3, long j, long j2, long j3) {
        this.latestSessionId = new C268704dr(str, str2, str3, j, j2, j3);
        Iterator it = this.sessionIdListeners.iterator();
        0qQ.A07(it);
        if (it.hasNext()) {
            0qQ.A07(it.next());
            throw new NullPointerException("onNewSessionId");
        }
    }

    public SessionIdGenerator() {
        initializeSessionIdGenerator();
    }
}
