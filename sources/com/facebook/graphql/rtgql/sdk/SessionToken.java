package com.facebook.graphql.rtgql.sdk;

import X.0dV;
import X.0qQ;
import X.C21309XUt;
import com.facebook.jni.HybridData;

public final class SessionToken {
    public static final C21309XUt Companion = new Object();
    public static final String TAG = "SessionToken";
    public final HybridData mHybridData;

    public SessionToken(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public final native void cancel();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.XUt] */
    static {
        0dV.A0C("rtgqlsdk");
    }

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }
}
