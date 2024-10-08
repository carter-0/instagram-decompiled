package com.facebook.realtime.clientsync;

import X.0dV;
import X.C8877RDu;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public abstract class NativeClientFactory {
    public static final Companion Companion = new Object();
    public static final C8877RDu DEFAULT_TIER = C8877RDu.PROD;
    public final HybridData mHybridData;

    public final class Companion {
        private final HybridData initHybrid(String str, BaseRequestStreamClient baseRequestStreamClient, Executor executor, DelegatingEventHandler delegatingEventHandler, DelegatingEntityMutator delegatingEntityMutator, int i) {
            return NativeClientFactory.initHybrid(str, baseRequestStreamClient, executor, delegatingEventHandler, delegatingEntityMutator, i);
        }
    }

    private final native ListenableFuture createNativeClient(String str, Object obj, String str2, int i, String str3);

    public static final native HybridData initHybrid(String str, BaseRequestStreamClient baseRequestStreamClient, Executor executor, DelegatingEventHandler delegatingEventHandler, DelegatingEntityMutator delegatingEntityMutator, int i);

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.realtime.clientsync.NativeClientFactory$Companion, java.lang.Object] */
    static {
        0dV.A0C("realtime-client-sync-jni");
    }
}
