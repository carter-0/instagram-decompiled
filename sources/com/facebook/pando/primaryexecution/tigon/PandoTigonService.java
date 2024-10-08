package com.facebook.pando.primaryexecution.tigon;

import X.0dV;
import X.C253283qW;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.util.concurrent.Executor;

public final class PandoTigonService extends PandoPrimaryExecution {
    public static final C253283qW Companion = new Object();

    public static final native HybridData initHybridData(String str, TigonServiceHolder tigonServiceHolder, Executor executor, PandoTigonConfig pandoTigonConfig);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.3qW] */
    static {
        0dV.A0C("pando-client-tigon-jni");
    }
}
