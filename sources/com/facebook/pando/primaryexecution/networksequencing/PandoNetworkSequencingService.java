package com.facebook.pando.primaryexecution.networksequencing;

import X.0dV;
import X.C253303qY;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

public final class PandoNetworkSequencingService extends PandoPrimaryExecution {
    public static final C253303qY Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3qY, java.lang.Object] */
    static {
        0dV.A0C("pando-client-networksequencing-jni");
    }
}
