package com.facebook.cameracore.ardelivery.xplat.async;

import X.0dV;
import X.C9236RUn;
import com.facebook.jni.HybridData;

public final class XplatAsyncMetadataCompletionCallback {
    public static final C9236RUn Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(XplatAsyncMetadataResponse xplatAsyncMetadataResponse);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.RUn] */
    static {
        0dV.A0C("ard-async-downloader");
    }

    public XplatAsyncMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
