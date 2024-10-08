package com.facebook.privacy.acs;

import X.0dV;
import X.X8I;

public class VoprfRistretto implements X8I {
    public static native int sodiumInit();

    public native int blind(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native int computeSharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native int getCurveBytes();

    public native int getCurveScalarBytes();

    public native int unblind(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, byte[] bArr5, byte[] bArr6, byte[] bArr7);

    static {
        0dV.A0C("voprf-ristretto");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }
}
