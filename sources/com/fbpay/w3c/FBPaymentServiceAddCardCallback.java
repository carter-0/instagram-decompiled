package com.fbpay.w3c;

import android.os.IInterface;

public interface FBPaymentServiceAddCardCallback extends IInterface {
    void DgV(String str);

    void onError(String str);
}
