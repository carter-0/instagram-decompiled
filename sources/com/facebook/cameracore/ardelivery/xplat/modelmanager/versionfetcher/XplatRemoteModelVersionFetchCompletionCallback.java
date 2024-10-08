package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.0dV;
import X.AnonymousClass8LE;
import com.facebook.jni.HybridData;

public final class XplatRemoteModelVersionFetchCompletionCallback {
    public static final AnonymousClass8LE Companion = new Object();
    public HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(XplatModelVersionResponse xplatModelVersionResponse);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8LE, java.lang.Object] */
    static {
        0dV.A0C("ard-remote-model-fetch-callback");
    }

    public XplatRemoteModelVersionFetchCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
