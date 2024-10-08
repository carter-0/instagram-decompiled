package com.facebook.cryptopub;

import X.0dV;

public class CryptoPubNative {
    private native String decryptNative(int i, String str, String str2, String str3, String str4);

    private native byte[] encryptNative(int i, String str, String str2, String str3);

    static {
        0dV.A0C("cryptopub-jni");
    }

    public byte[] encrypt(int i, String str, String str2, String str3) {
        return encryptNative(i, str, str2, str3);
    }
}
