package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.0dV;
import X.0qQ;
import X.C9232RUj;
import com.facebook.jni.HybridData;

public abstract class OnAsyncAssetFetchCompletedListener {
    public static final C9232RUj Companion = new Object();
    public final HybridData mHybridData;

    public OnAsyncAssetFetchCompletedListener(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void onAsyncAssetFetchCompleted(String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.RUj] */
    static {
        0dV.A0C("ard-android-async-asset-fetcher-listener");
    }
}
