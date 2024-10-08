package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TG;
import X.Pxj;
import X.RFB;
import X.RFW;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.google.gson.annotations.SerializedName;

public final class PriceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(53);
    @SerializedName("amount")
    public final CurrencyAmount A00;
    @SerializedName("type")
    public final RFW A01;
    @SerializedName("quantity")
    public final Integer A02;
    @SerializedName("iconUrl")
    public final String A03;
    @SerializedName("primaryLabel")
    public final String A04;
    @SerializedName("secondaryLabel")
    public final String A05;
    @SerializedName("status")
    public final RFB A06;
    @SerializedName("metadata")
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        Pxj.A1A(parcel, this.A01);
        Pxj.A1A(parcel, this.A06);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }

    public PriceInfo(CurrencyAmount currencyAmount, RFB rfb, RFW rfw, Integer num, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1O(currencyAmount, str);
        this.A00 = currencyAmount;
        this.A04 = str;
        this.A01 = rfw;
        this.A06 = rfb;
        this.A02 = num;
        this.A07 = str2;
        this.A05 = str3;
        this.A03 = str4;
    }
}
