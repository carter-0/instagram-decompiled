package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class PaymentHandledResponseData implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(49);
    public final String A00;

    public PaymentHandledResponseData(Integer num, String str) {
        0qQ.A0B(num, 1);
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString("SUBMIT_CONTAINER");
        parcel.writeString(this.A00);
    }
}
