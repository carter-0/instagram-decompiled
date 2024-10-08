package com.facebook.cameracore.logging.spars.xplatimpl;

import X.0dV;
import X.0qQ;
import X.C312606em;
import X.C312616en;
import X.C312646es;
import com.facebook.jni.HybridData;

public final class XplatRawEventLogger {
    public static final C312646es Companion = new Object();
    public final C312616en logWriter;
    public final HybridData mHybridData = initHybrid();

    public XplatRawEventLogger(C312616en r2) {
        0qQ.A0B(r2, 1);
        this.logWriter = r2;
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6es, java.lang.Object] */
    static {
        0dV.A0C("camera-xplat-spars-jni");
    }

    public final void logEvent(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        ((C312606em) this.logWriter).A00.logRawEvent(str, str2);
    }
}
