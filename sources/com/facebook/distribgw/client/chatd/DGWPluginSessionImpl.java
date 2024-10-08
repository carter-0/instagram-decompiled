package com.facebook.distribgw.client.chatd;

import X.0dV;
import X.C392919vb;
import com.facebook.distribgw.client.DGWClient;
import java.util.concurrent.ScheduledExecutorService;

public final class DGWPluginSessionImpl {
    public static final C392919vb Companion = new Object();

    public static final native void registerSessionNative(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService, boolean z, long j, boolean z2, boolean z3);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9vb, java.lang.Object] */
    static {
        0dV.A0C("chatddgw-jni");
    }
}
