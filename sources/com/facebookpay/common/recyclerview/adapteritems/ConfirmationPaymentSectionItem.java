package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C51974G9v;
import X.RH6;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;

public final class ConfirmationPaymentSectionItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWZ.A01(88);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final RH6 A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
    }

    public final RH6 BJZ() {
        return this.A05;
    }

    public ConfirmationPaymentSectionItem(RH6 rh6, String str, String str2, String str3, String str4, String str5) {
        C51974G9v.A1L(rh6, str, str3);
        0qQ.A0B(str4, 5);
        this.A05 = rh6;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
        this.A04 = str5;
    }
}
