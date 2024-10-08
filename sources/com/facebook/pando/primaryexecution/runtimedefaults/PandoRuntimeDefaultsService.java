package com.facebook.pando.primaryexecution.runtimedefaults;

import X.0dV;
import X.C393149vy;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

public abstract class PandoRuntimeDefaultsService extends PandoPrimaryExecution {
    public static final C393149vy Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.9vy] */
    static {
        0dV.A0C("pando-client-runtimedefaults-jni");
    }
}
