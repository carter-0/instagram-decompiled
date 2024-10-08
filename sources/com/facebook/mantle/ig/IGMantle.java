package com.facebook.mantle.ig;

import X.0dV;
import X.0qQ;
import X.C3728792z;
import com.facebook.jni.HybridData;
import com.facebook.models.IgModelLoader;
import com.facebook.msys.mca.Mailbox;
import com.google.common.collect.ImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class IGMantle {
    public static final C3728792z Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(Object obj, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, String str, IgModelLoader igModelLoader);

    private final native SettableFuture nativeRunMantleWithConfigStr(String str, String str2, ImmutableMap immutableMap);

    public final ListenableFuture runMantleWithConfigStr(String str, String str2, ImmutableMap immutableMap) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(immutableMap, 2);
        return nativeRunMantleWithConfigStr(str, str2, immutableMap);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.92z, java.lang.Object] */
    static {
        0dV.A0C("mantle-ig");
    }

    public IGMantle(Mailbox mailbox, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, String str, IgModelLoader igModelLoader) {
        0qQ.A0B(scheduledExecutorService, 3);
        this.mHybridData = initHybrid(mailbox, executorService, scheduledExecutorService, "", igModelLoader);
    }
}
