package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.C51974G9v;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public final class ECPOffer implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(37);
    @SerializedName("discountCode")
    public final String A00;
    @SerializedName("id")
    public final String A01;
    @SerializedName("expirationDateText")
    public final String A02;
    @SerializedName("subtitle")
    public final String A03;
    @SerializedName("title")
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public ECPOffer(String str, String str2, String str3, String str4, String str5) {
        C51974G9v.A1P(str, str2, str3, str4);
        0qQ.A0B(str5, 5);
        this.A01 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A00 = str4;
        this.A02 = str5;
    }
}
