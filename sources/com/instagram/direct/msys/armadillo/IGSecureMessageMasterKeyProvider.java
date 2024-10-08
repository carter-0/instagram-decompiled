package com.instagram.direct.msys.armadillo;

import X.C304556Dy;

public class IGSecureMessageMasterKeyProvider {
    public static final byte[] DECRYPTED_MASTER_KEY = "Dat Thread burglar's up in herrrr!".getBytes();
    public static boolean sInitialized;

    public static native void nativeRegisterMasterKeyProviderHandler();

    static {
        C304556Dy.A00();
    }

    public static byte[] copyDecryptedMasterKey(long j) {
        return DECRYPTED_MASTER_KEY;
    }
}
