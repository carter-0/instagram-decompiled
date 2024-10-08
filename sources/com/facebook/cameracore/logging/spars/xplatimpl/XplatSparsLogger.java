package com.facebook.cameracore.logging.spars.xplatimpl;

import X.0LA;
import X.0dV;
import X.0qQ;
import X.C312616en;
import X.C312626ep;
import com.facebook.jni.HybridData;

public final class XplatSparsLogger {
    public static final C312626ep Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    public static final native boolean consistencyHelperHasError();

    public static final native int consistencyHelperNumProcessedSessions();

    public static final native void debugExpectSessionOpen(String str);

    public static final native void flushAndDestroyConsistencyHelper();

    public static final native void flushConsistencyHelper();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public static final XplatSparsLogger makeInstance(C312616en r0) {
        return C312626ep.A00(r0);
    }

    public void logSessionClosure(String str, boolean z) {
        0qQ.A0B(str, 0);
        logSessionClosureNative(str, z);
    }

    public final native void logSessionClosureNative(String str, boolean z);

    public void logSessionCreation(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        0qQ.A0B(str5, 4);
        String str7 = str6;
        0qQ.A0B(str7, 6);
        logSessionCreationNative(0LA.A01(), str, str2, str3, str4, str5, z, str7);
    }

    public final native void logSessionCreationNative(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7);

    public final native void setRawEventLogger(XplatRawEventLogger xplatRawEventLogger);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.6ep, java.lang.Object] */
    static {
        0dV.A0C("camera-xplat-spars-jni");
    }

    public static final XplatSparsLogger makeInstance(XplatRawEventLogger xplatRawEventLogger) {
        XplatSparsLogger xplatSparsLogger;
        if (xplatRawEventLogger != null) {
            return xplatSparsLogger;
        }
        xplatSparsLogger = new XplatSparsLogger();
        return xplatSparsLogger;
    }

    public XplatSparsLogger(XplatRawEventLogger xplatRawEventLogger) {
        setRawEventLogger(xplatRawEventLogger);
    }

    public XplatSparsLogger() {
    }

    public static final XplatSparsLogger makeInstance() {
        return new XplatSparsLogger();
    }
}
