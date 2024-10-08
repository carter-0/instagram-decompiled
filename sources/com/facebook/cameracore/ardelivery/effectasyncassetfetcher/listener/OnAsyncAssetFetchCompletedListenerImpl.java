package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.0dV;
import X.C9233RUk;
import com.facebook.jni.HybridData;

public final class OnAsyncAssetFetchCompletedListenerImpl extends OnAsyncAssetFetchCompletedListener {
    public static final C9233RUk Companion = new Object();

    public native void onAsyncAssetFetchCompleted(String str, String str2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.RUk] */
    static {
        0dV.A0C("ard-android-async-asset-fetcher-listener");
    }

    public OnAsyncAssetFetchCompletedListenerImpl(HybridData hybridData) {
        super(hybridData);
    }
}
