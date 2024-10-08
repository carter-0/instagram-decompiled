package com.meta.payments.model.configuration;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum PaymentContainerType implements Parcelable {
    BASIC_CARD_V1,
    FB_TOKEN_V1,
    ECOM_TOKEN_V1;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PaymentContainerType[] paymentContainerTypeArr;
        A00 = 0oU.A00(paymentContainerTypeArr);
        CREATOR = new SWU(35);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
