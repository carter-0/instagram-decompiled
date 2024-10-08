package com.facebook.tigon.tigonhuc;

import X.0dV;
import X.0qQ;
import X.1SG;
import X.AnonymousClass1SE;
import X.AnonymousClass7TG;
import X.C9587RdR;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import java.util.Map;

public final class TigonHucCallbackForwarder {
    public static final C9587RdR Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native void onBodyNative(byte[] bArr, int i);

    private final native void onEOMNative();

    private final native void onErrorNative(byte[] bArr, int i);

    private final native void onResponseNative(int i, byte[] bArr, int i2);

    private final native void onStartedNative(byte[] bArr, int i);

    private final native void onUploadProgressNative(long j, long j2);

    public final synchronized void onBody(byte[] bArr, int i) {
        0qQ.A0B(bArr, 0);
        onBodyNative(bArr, i);
    }

    public final synchronized void onEOM() {
        onEOMNative();
    }

    public final synchronized void onError(int i, String str, int i2, String str2) {
        AnonymousClass7TG.A1P(str, str2);
        TigonError tigonError = new TigonError(TigonErrorCode.Companion.fromValue(i), str, i2, str2);
        AnonymousClass1SE r0 = new AnonymousClass1SE();
        1SG.A02(r0, tigonError);
        byte[] bArr = r0.A01;
        0qQ.A07(bArr);
        onErrorNative(bArr, r0.A00);
    }

    public final synchronized void onResponse(int i, Map map) {
        0qQ.A0B(map, 1);
        AnonymousClass1SE r0 = new AnonymousClass1SE();
        1SG.A05(r0, map);
        byte[] bArr = r0.A01;
        0qQ.A07(bArr);
        onResponseNative(i, bArr, r0.A00);
    }

    public final synchronized void onStarted(TigonRequest tigonRequest) {
        0qQ.A0B(tigonRequest, 0);
        AnonymousClass1SE r0 = new AnonymousClass1SE();
        1SG.A03(r0, tigonRequest);
        byte[] bArr = r0.A01;
        0qQ.A07(bArr);
        onStartedNative(bArr, r0.A00);
    }

    public final synchronized void onUploadProgress(long j, long j2) {
        onUploadProgressNative(j, j2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RdR, java.lang.Object] */
    static {
        0dV.A0C("tigonhuc");
    }

    public TigonHucCallbackForwarder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
