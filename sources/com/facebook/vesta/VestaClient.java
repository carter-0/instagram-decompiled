package com.facebook.vesta;

import X.0dV;
import X.C280094zz;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class VestaClient {
    public static final VestaClient $redex_init_class = null;

    public static native int beginLoginNative(byte[] bArr, byte[] bArr2);

    public static native int beginRegisterNative(byte[] bArr, byte[] bArr2);

    public static native int finishLoginNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public static native int finishRegisterNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, byte[] bArr9);

    public static native int finishRegisterProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, byte[] bArr9);

    public static native int getApiVersionNative();

    public static native int unpackLoginPayloadNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native int unpackLoginPayloadProtoNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public static native int validateHsmKeyNative(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int verifyRestoreHistoryNative(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8);

    static {
        0dV.A0C("vesta_client_jni");
    }

    public static boolean validateHsmKey(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[4096];
        int validateHsmKeyNative = validateHsmKeyNative(bArr, bArr2, bArr3);
        if (validateHsmKeyNative != 0) {
            throw new C280094zz(validateHsmKeyNative);
        } else if (parseNativeResults(bArr3)[0][0] != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static byte[][] parseNativeResults(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        int i = wrap.get();
        byte[][] bArr2 = new byte[i][];
        for (int i2 = 0; i2 < i; i2++) {
            byte[] bArr3 = new byte[wrap.getInt()];
            bArr2[i2] = bArr3;
            wrap.get(bArr3);
        }
        return bArr2;
    }
}
