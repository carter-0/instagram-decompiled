package com.fbpay.w3c;

import android.os.IInterface;

public interface FBPaymentService extends IInterface {
    void A7m(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback);

    void A80(CardDetails cardDetails, FBPaymentServiceAddCardCallback fBPaymentServiceAddCardCallback);

    void A81(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback);

    void A86(FBPaymentServiceContactCallback fBPaymentServiceContactCallback);
}
