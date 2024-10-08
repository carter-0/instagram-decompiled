package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.common.models.CurrencyAmount;

public final class PayButtonItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(97);
    public final CurrencyAmount A00;
    public final RH6 A01;
    public final String A02;
    public final boolean A03;

    public PayButtonItem(CurrencyAmount currencyAmount, RH6 rh6, String str, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A01 = rh6;
        this.A00 = currencyAmount;
        this.A03 = z;
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final RH6 BJZ() {
        return this.A01;
    }
}
