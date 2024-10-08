package com.facebook.tigon.tigonligerlite;

import X.0dV;
import X.S9Q;
import com.facebook.jni.HybridData;
import com.facebook.proxygen.EventBase;
import com.facebook.proxygen.HTTPClient;
import com.facebook.tigon.iface.TigonServiceHolder;

public final class TigonLigerServiceHolder extends TigonServiceHolder {
    public static final S9Q Companion = new Object();

    public static final native HybridData initHybrid(EventBase eventBase, HTTPClient hTTPClient, String str, boolean z, boolean z2, String[] strArr);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.S9Q] */
    static {
        0dV.A0C("tigonligerlite-jni");
    }
}
