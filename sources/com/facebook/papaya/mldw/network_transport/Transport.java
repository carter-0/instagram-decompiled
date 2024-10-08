package com.facebook.papaya.mldw.network_transport;

import X.0dV;
import X.RWD;
import com.facebook.jni.HybridData;
import com.facebook.papaya.mldw.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;

public final class Transport extends ITransport {
    public static final RWD Companion = new Object();

    public static final native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RWD, java.lang.Object] */
    static {
        0dV.A0C("papaya-mldw-network_transport");
    }
}
