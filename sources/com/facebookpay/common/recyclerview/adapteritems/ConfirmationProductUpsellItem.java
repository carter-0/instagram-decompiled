package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConfirmationProductUpsellItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(89);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final RH6 A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public final RH6 BJZ() {
        return this.A04;
    }

    public ConfirmationProductUpsellItem(RH6 rh6, String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1U(rh6, str, str2);
        0qQ.A0B(str4, 5);
        this.A04 = rh6;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = str4;
    }
}
