package com.meta.payments.model.payment;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum PaymentCtaType implements Parcelable {
    PAY;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PaymentCtaType[] paymentCtaTypeArr;
        A00 = 0oU.A00(paymentCtaTypeArr);
        CREATOR = new SWU(47);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
