package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass5He;
import X.C8910RFd;
import X.RKR;
import X.SWS;
import android.os.Parcelable;

public final class PaymentsCheckoutJSBridgeCall extends PaymentsJSBridgeCall {
    public static final Parcelable.Creator CREATOR = SWS.A00(2);

    public final void A02() {
        super.A02();
        if (AnonymousClass5He.A00(String.valueOf(A00("configuration")))) {
            throw new RKR(C8910RFd.INVALID_PARAM, "Checkout configuration object can not be null or empty");
        }
    }
}
