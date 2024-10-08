package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.0dV;
import X.C9237RUo;
import com.facebook.jni.HybridData;
import java.util.List;

public final class XplatModelMetadataCompletionCallback {
    public static final C9237RUo Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(List list);

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RUo, java.lang.Object] */
    static {
        0dV.A0C("ard-android-model-metadata-manager");
    }

    public XplatModelMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
