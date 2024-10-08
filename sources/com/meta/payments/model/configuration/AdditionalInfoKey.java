package com.meta.payments.model.configuration;

import X.0oU;
import X.Pxg;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public enum AdditionalInfoKey implements Parcelable {
    ALTERNATIVE_CHECKOUT;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        AdditionalInfoKey[] additionalInfoKeyArr;
        A00 = 0oU.A00(additionalInfoKeyArr);
        CREATOR = new SWU(32);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
