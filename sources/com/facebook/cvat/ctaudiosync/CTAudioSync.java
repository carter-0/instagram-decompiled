package com.facebook.cvat.ctaudiosync;

import X.0dV;
import X.C229632nm;
import X.C62980KpW;
import X.DbW;
import X.JTO;
import X.SKM;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class CTAudioSync {
    public static final C62980KpW Companion = new Object();
    public static boolean isNativeLibLoaded;
    public final HybridData mHybridData;
    public double refSampleRate = -1.0d;

    private final native HybridData initHybrid();

    private final native int nativeGetOffsetSamples();

    private final native double nativeGetProcessingTime();

    private final native void nativeInit(int i, int i2, double d, int i3, int i4, double d2);

    private final native double nativeMaxCrestFactor();

    private final native void nativePrepareBaseBuffer(ByteBuffer byteBuffer);

    private final native void nativeProcess(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private final native void nativeProcessWithPreparedBase(ByteBuffer byteBuffer);

    private final native boolean nativeWasConfident();

    public final int getAssetOffsetInMs(String str, String str2, long j, long j2, long j3, long j4) {
        String str3 = str2;
        boolean A1X = DbW.A1X(str3);
        long j5 = j;
        long A06 = C229632nm.A06(j2, j5, j + 10000000);
        long A062 = C229632nm.A06(0, 0, 10000000);
        String str4 = str;
        ByteBuffer A02 = SKM.A02(str4, j5, A06);
        ByteBuffer A022 = SKM.A02(str3, 0, A062);
        if (A02.capacity() == 0 || A022.capacity() == 0) {
            throw JTO.A0u("Received zero length data");
        }
        int capacity = A02.capacity() / 2;
        int capacity2 = A022.capacity() / 2;
        double A00 = SKM.A00(str4);
        this.refSampleRate = SKM.A00(str3);
        int A01 = SKM.A01(str4);
        int A012 = SKM.A01(str3);
        Double valueOf = Double.valueOf(A00);
        Integer valueOf2 = Integer.valueOf(A1X ? 1 : 0);
        if (valueOf.equals(valueOf2) || Double.valueOf(this.refSampleRate).equals(valueOf2)) {
            throw JTO.A0u("Received zero as sample rate");
        } else if (((double) capacity) < 3.0d * A00 || ((double) capacity2) < 3.0d * this.refSampleRate) {
            throw JTO.A0u("Received insufficient data");
        } else if (Integer.valueOf(A01).equals(valueOf2) || Integer.valueOf(A012).equals(valueOf2)) {
            throw JTO.A0u("Received zero-channel audio");
        } else {
            int capacity3 = A02.capacity() / A01;
            int capacity4 = A022.capacity() / A012;
            double d = this.refSampleRate;
            if (capacity3 < capacity4) {
                nativeInit(capacity, A01, A00, capacity2, A012, d);
                nativeProcess(A02, A022);
                return (int) Math.floor((((double) nativeGetOffsetSamples()) / A00) * 1000.0d);
            }
            nativeInit(capacity2, A012, d, capacity, A01, A00);
            nativeProcess(A022, A02);
            return -((int) Math.floor((((double) nativeGetOffsetSamples()) / this.refSampleRate) * 1000.0d));
        }
    }

    public CTAudioSync() {
        synchronized (Companion) {
            if (!isNativeLibLoaded) {
                0dV.A0C("ctaudiosync-native");
                isNativeLibLoaded = true;
            }
        }
        this.mHybridData = initHybrid();
    }

    public final double getMaxCrestFactor() {
        return nativeMaxCrestFactor();
    }

    public final double getProcessingTime() {
        return nativeGetProcessingTime();
    }

    public final boolean getWasConfident() {
        return nativeWasConfident();
    }
}
