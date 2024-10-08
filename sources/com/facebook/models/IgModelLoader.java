package com.facebook.models;

import X.0KC;
import X.0dV;
import X.C353248Gv;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.models.interfaces.ModelLoaderBase;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class IgModelLoader extends ModelLoaderBase {
    public static final Class TAG = IgModelLoader.class;

    public static native HybridData initHybridWithJavaManifestLoader(String str, XAnalyticsHolder xAnalyticsHolder, TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, ManifestLoaderProxy manifestLoaderProxy, VoltronModuleLoaderProxy voltronModuleLoaderProxy);

    private native void load(String str, long j, Set set, ModelLoaderCallbacks modelLoaderCallbacks);

    static {
        0dV.A0C("models-core_ig");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    public ListenableFuture load(String str, long j) {
        long j2 = j;
        if (j < 0) {
            ? obj = new Object();
            obj.setException(new IOException("Invalid version"));
            return obj;
        }
        HashSet hashSet = new HashSet();
        ? obj2 = new Object();
        load(str, j2, hashSet, new C353248Gv(this, obj2));
        return obj2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    public ListenableFuture loadPersonalized(String str, Long l) {
        ? obj = new Object();
        obj.setException(new IOException("Model personalization on IG4A is not supported"));
        return obj;
    }

    public boolean removePersonalized(String str, Long l) {
        0KC.A03(IgModelLoader.class, "removePersonalized is not supported on IG4A");
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public ListenableFuture load(String str) {
        HashSet hashSet = new HashSet();
        ? obj = new Object();
        load(str, -1, hashSet, new C353248Gv(this, obj));
        return obj;
    }
}
