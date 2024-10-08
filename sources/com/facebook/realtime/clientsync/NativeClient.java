package com.facebook.realtime.clientsync;

import X.0dV;
import X.0qQ;
import X.C9552Rcp;
import com.facebook.jni.HybridData;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.Closeable;

public final class NativeClient implements Closeable {
    public static final C9552Rcp Companion = new Object();
    public final HybridData mHybridData;

    public NativeClient(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    private final native ListenableFuture closeAwait(long j);

    private final native ListenableFuture sendEntityUpdate(String str, int i);

    public native void close();

    public native String getID();

    public native ListenableFuture sendPresenceUpdate(String str);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Rcp, java.lang.Object] */
    static {
        0dV.A0C("realtime-client-sync-jni");
    }
}
