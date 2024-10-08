package com.facebook.cameracore.ardelivery.listener.xplatimpl;

import X.0dV;
import X.AnonymousClass6i7;
import X.AnonymousClass8Ew;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.jni.HybridData;

public final class CancelableTokenJNI implements AnonymousClass6i7, CancelableToken {
    public static final AnonymousClass8Ew Companion = new Object();
    public static final String TAG = "CancelableTokenJNI";
    public final HybridData mHybridData;

    private final native void nativeCancel();

    public void setPrefetch(boolean z) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8Ew, java.lang.Object] */
    static {
        0dV.A0C("ard-android-listener");
    }

    public CancelableTokenJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public boolean cancel() {
        nativeCancel();
        return true;
    }
}
