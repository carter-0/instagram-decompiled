package com.facebook.ale.p003native;

import X.0qQ;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ale.native.ResponseCallback  reason: invalid package */
public final class ResponseCallback {
    public HybridData mHybridData;

    public ResponseCallback(HybridData hybridData) {
        0qQ.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public final native void onFailure(String str);

    public final native void onSuccess(String str);

    public final native void onSuccessfullCdnDownload(ByteBuffer byteBuffer);
}
