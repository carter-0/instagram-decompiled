package com.facebook.crypto.keychain;

public interface KeyChain {
    byte[] getCipherKey();

    byte[] getMacKey();

    byte[] getNewIV();
}
