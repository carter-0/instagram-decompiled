package com.facebook.papaya.client.engine.lightweight;

import X.0dV;
import X.0qQ;
import X.C51972G9s;
import X.RW8;
import android.content.Context;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class Engine extends HybridClassBase {
    public static final RW8 Companion = new Object();

    private final native void initHybrid(ScheduledExecutorService scheduledExecutorService, String str, ImmutableMap immutableMap, ITransport iTransport, Context context, String str2, String str3, IModelLoader iModelLoader, Set set);

    private final native SettableFuture nativeRun();

    private final native void nativeStop();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RW8, java.lang.Object] */
    static {
        0dV.A0C("papaya-lightweight-engine");
    }

    public Engine(ScheduledExecutorService scheduledExecutorService, String str, ImmutableMap immutableMap, ITransport iTransport, Context context, String str2, String str3, IModelLoader iModelLoader, ImmutableSet immutableSet) {
        0qQ.A0B(scheduledExecutorService, 1);
        C51972G9s.A1E(str2, str3);
        initHybrid(scheduledExecutorService, "ig4a", immutableMap, iTransport, context, str2, str3, (IModelLoader) null, immutableSet);
    }

    public final ListenableFuture run() {
        return nativeRun();
    }
}
