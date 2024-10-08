package com.facebook.ohai;

import X.0dV;
import X.0qQ;
import X.C301425zD;
import com.facebook.jni.HybridData;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.NetworkSession;

public final class OhaiPlugin {
    public static final C301425zD Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    private final native void registerSessionHybrid(Object obj, String str, double d, double d2, boolean z, double d3, boolean z2, String str2, boolean z3, String str3, double d4, boolean z4);

    private final native void unregisterSessionHybrid(Object obj, Object obj2);

    public final void register(Mailbox mailbox, String str, double d, double d2, boolean z, double d3, boolean z2, String str2, boolean z3, String str3, double d4, boolean z4) {
        0qQ.A0B(mailbox, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 7);
        0qQ.A0B(str3, 9);
        registerSessionHybrid(mailbox, str, d, d2, z, d3, z2, str2, z3, str3, d4, z4);
    }

    public final void unregister(NetworkSession networkSession, AuthData authData) {
        0qQ.A0B(networkSession, 0);
        0qQ.A0B(authData, 1);
        unregisterSessionHybrid(networkSession, authData);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5zD, java.lang.Object] */
    static {
        0dV.A0C("msysohai-jni");
    }
}
