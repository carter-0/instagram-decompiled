package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.C11085S9f;
import X.C51974G9v;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;

@Deprecated(message = "To be replaced with FulfillmentOption")
public final class ShippingOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(55);
    @SerializedName("amount")
    public final CurrencyAmount A00;
    @SerializedName("type")
    public final Integer A01;
    @SerializedName("description")
    public final String A02;
    @SerializedName("id")
    public final String A03;
    @SerializedName("label")
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(C11085S9f.A01(this.A01));
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public ShippingOption(CurrencyAmount currencyAmount, Integer num, String str, String str2, String str3) {
        C51974G9v.A1P(str, num, str2, currencyAmount);
        0qQ.A0B(str3, 5);
        this.A03 = str;
        this.A01 = num;
        this.A04 = str2;
        this.A00 = currencyAmount;
        this.A02 = str3;
    }
}
