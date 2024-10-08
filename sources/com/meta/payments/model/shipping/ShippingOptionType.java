package com.meta.payments.model.shipping;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum ShippingOptionType implements Parcelable {
    SHIPPING,
    DELIVERY;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        ShippingOptionType[] shippingOptionTypeArr;
        A00 = 0oU.A00(shippingOptionTypeArr);
        CREATOR = new SWU(51);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
