package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ItemDetails;

public final class PuxEntityItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(1);
    public final CurrencyAmount A00;
    public final ItemDetails A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final RH6 A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
    }

    public final RH6 BJZ() {
        return this.A06;
    }

    public PuxEntityItem(CurrencyAmount currencyAmount, RH6 rh6, ItemDetails itemDetails, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass7TG.A1P(rh6, str2);
        AnonymousClass7TF.A1E(itemDetails, 5, currencyAmount);
        this.A06 = rh6;
        this.A07 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = itemDetails;
        this.A05 = str4;
        this.A00 = currencyAmount;
        this.A03 = str5;
    }
}
