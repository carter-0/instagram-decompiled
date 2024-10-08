package com.meta.payments.model.configuration;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum PaymentMode implements Parcelable {
    LIVE;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        PaymentMode[] paymentModeArr;
        A00 = 0oU.A00(paymentModeArr);
        CREATOR = new SWU(36);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
