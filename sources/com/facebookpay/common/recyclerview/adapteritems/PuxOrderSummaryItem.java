package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C51972G9s;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.expresscheckout.models.ItemDetails;
import java.util.List;

public final class PuxOrderSummaryItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(3);
    public final int A00;
    public final CurrencyAmount A01;
    public final CurrencyAmount A02;
    public final RH6 A03;
    public final ItemDetails A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeStringList(this.A07);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
    }

    public final RH6 BJZ() {
        return this.A03;
    }

    public PuxOrderSummaryItem(CurrencyAmount currencyAmount, CurrencyAmount currencyAmount2, RH6 rh6, ItemDetails itemDetails, String str, String str2, List list, int i, boolean z, boolean z2, boolean z3) {
        C51972G9s.A1B(rh6, list);
        C51972G9s.A1E(currencyAmount, currencyAmount2);
        0qQ.A0B(itemDetails, 11);
        this.A03 = rh6;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = list;
        this.A00 = i;
        this.A02 = currencyAmount;
        this.A01 = currencyAmount2;
        this.A0A = z;
        this.A09 = z2;
        this.A08 = z3;
        this.A04 = itemDetails;
    }
}
