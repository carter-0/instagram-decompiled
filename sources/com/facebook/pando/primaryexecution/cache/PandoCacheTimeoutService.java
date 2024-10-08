package com.facebook.pando.primaryexecution.cache;

import X.0dV;
import X.0qQ;
import X.C253553qy;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;
import java.util.concurrent.ScheduledExecutorService;

public final class PandoCacheTimeoutService extends PandoPrimaryExecution {
    public static final C253553qy Companion = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PandoCacheTimeoutService(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService) {
        super(initHybridData(pandoPrimaryExecution, pandoResponseCache, scheduledExecutorService));
        0qQ.A0B(pandoPrimaryExecution, 1);
        0qQ.A0B(pandoResponseCache, 2);
        0qQ.A0B(scheduledExecutorService, 3);
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, PandoResponseCache pandoResponseCache, ScheduledExecutorService scheduledExecutorService);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3qy, java.lang.Object] */
    static {
        0dV.A0C("pando-client-cache-jni");
    }
}
