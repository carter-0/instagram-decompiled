package com.trusteddevice;

import android.os.IInterface;

public interface TdfTrustChainBindingSignPttPayloadCallback extends IInterface {
    void Daq(String str);

    void Dar(String str);
}
