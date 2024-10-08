package com.instagram.common.api.base;

import X.0dV;
import X.C44627Ci0;
import com.facebook.jni.HybridData;

public abstract class RequestMeasurerUtil {
    public static final C44627Ci0 Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(int i, int i2, int[] iArr, int i3);

    public final native long getLastMeasurementBytes();

    public final native long getLastMeasurementTimeMs();

    public final native boolean requestDidFinishTransferringData(long j, long j2, long j3);

    public final native void requestDidStartTransferringData(long j, long j2, long j3);

    public final native void requestDidTransferData(long j, long j2);

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Ci0] */
    static {
        0dV.A0C("request_measurement_jni");
    }
}
