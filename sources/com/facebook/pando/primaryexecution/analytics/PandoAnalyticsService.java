package com.facebook.pando.primaryexecution.analytics;

import X.0dV;
import X.C253593r3;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

public final class PandoAnalyticsService extends PandoPrimaryExecution {
    public static final C253593r3 Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, int i);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3r3, java.lang.Object] */
    static {
        0dV.A0C("pando-client-analytics-jni");
    }
}
