package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.C41794B0z;
import X.T0O;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

public class NetworkClientImpl extends NetworkClient {
    public final C41794B0z mWorker;

    private native HybridData initHybrid();

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, org.apache.http.client.ResponseHandler] */
    public void sendRequest(NativeDataPromise nativeDataPromise, String str, String str2, String str3, String[] strArr, String[] strArr2, boolean z) {
        try {
            this.mWorker.EMb(new T0O(1, nativeDataPromise, this), str, str2, str3, new Object(), strArr, strArr2, z);
        } catch (Exception e) {
            nativeDataPromise.setException(e.toString());
        }
    }

    public NetworkClientImpl(C41794B0z b0z) {
        this.mWorker = b0z;
        this.mHybridData = initHybrid();
    }
}
