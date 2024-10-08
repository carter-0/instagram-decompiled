package com.trusteddevice;

import android.os.IInterface;

public interface TrustedDeviceFoundationService extends IInterface {
    void BYe(TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback);

    void Evb(TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback, byte[] bArr);
}
