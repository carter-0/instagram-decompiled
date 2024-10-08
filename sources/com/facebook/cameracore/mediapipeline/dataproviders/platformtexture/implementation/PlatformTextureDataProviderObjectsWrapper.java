package com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation;

import X.C367648rL;
import com.facebook.jni.HybridData;

public final class PlatformTextureDataProviderObjectsWrapper {
    public final C367648rL input;
    public final HybridData mHybridData;

    private final native void announceContentNative();

    private final native HybridData initHybrid();

    private final native void queueContentNative(String str, byte[] bArr, float f);

    public PlatformTextureDataProviderObjectsWrapper(C367648rL r2) {
        this.input = r2;
        if (r2 != null) {
            r2.A00 = this;
        }
        this.mHybridData = initHybrid();
    }
}
