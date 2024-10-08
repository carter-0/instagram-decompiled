package com.facebook.privacy.aptcrypto;

import X.0dV;

public class PublicKeyEncryption {
    public static native int cryptoBoxDecrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native int cryptoBoxEncrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5);

    public static native int generateCryptoBoxKeypair(byte[] bArr, byte[] bArr2);

    public static native int sodiumInit();

    static {
        0dV.A0C("publickeycrypto");
        if (sodiumInit() == -1) {
            System.err.println("sodiumInit() failed.");
        }
    }
}
