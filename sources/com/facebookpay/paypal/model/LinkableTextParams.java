package com.facebookpay.paypal.model;

import X.0qQ;
import X.C51972G9s;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;

public final class LinkableTextParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(14);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
    }

    public LinkableTextParams(String str, int i, int i2, String str2) {
        C51972G9s.A1B(str, str2);
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = str2;
    }
}
