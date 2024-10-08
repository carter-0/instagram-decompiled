package com.facebook.pando.primaryexecution.cancelledcallbacks;

import X.0dV;
import X.C253573r1;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

public final class PandoCancelledCallbacksService extends PandoPrimaryExecution {
    public static final C253573r1 Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3r1, java.lang.Object] */
    static {
        0dV.A0C("pando-client-cancelledcallbacks-jni");
    }
}
