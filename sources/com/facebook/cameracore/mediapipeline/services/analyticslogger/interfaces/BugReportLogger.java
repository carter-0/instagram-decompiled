package com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces;

import X.AnonymousClass00P;
import com.facebook.jni.HybridData;

public abstract class BugReportLogger {
    public HybridData mHybridData;

    public abstract void logEvent(String str, boolean z);

    public BugReportLogger() {
        throw AnonymousClass00P.createAndThrow();
    }
}
