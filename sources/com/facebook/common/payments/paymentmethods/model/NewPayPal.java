package com.facebook.common.payments.paymentmethods.model;

import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class NewPayPal implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = SWS.A00(72);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public NewPayPal(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public NewPayPal() {
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
    }
}
