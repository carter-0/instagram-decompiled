package com.facebook.pando.primaryexecution.cache;

import X.0dV;
import X.0qQ;
import X.C253453qo;
import com.facebook.jni.HybridData;
import com.facebook.stash.core.FileStash;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PandoResponseCache {
    public static final C253453qo Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybridData(Executor executor, FileStash fileStash, boolean z, int i, boolean z2);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3qo, java.lang.Object] */
    static {
        0dV.A0C("pando-client-cache-jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PandoResponseCache(Executor executor, FileStash fileStash, boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, fileStash, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? false : z2);
    }

    public PandoResponseCache(Executor executor, FileStash fileStash, boolean z, int i, boolean z2) {
        0qQ.A0B(executor, 1);
        0qQ.A0B(fileStash, 2);
        this.mHybridData = initHybridData(executor, fileStash, z, i, z2);
    }
}
