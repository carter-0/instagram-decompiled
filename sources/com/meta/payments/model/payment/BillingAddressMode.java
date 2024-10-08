package com.meta.payments.model.payment;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum BillingAddressMode implements Parcelable {
    MIN;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        BillingAddressMode[] billingAddressModeArr;
        A00 = 0oU.A00(billingAddressModeArr);
        CREATOR = new SWU(38);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
