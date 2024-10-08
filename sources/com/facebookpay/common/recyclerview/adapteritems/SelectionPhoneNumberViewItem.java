package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C51974G9v;
import X.RH6;
import X.S9Z;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionPhoneNumberViewItem implements BaseSelectionCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(17);
    public Integer A00;
    public String A01;
    public String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final RH6 A07;

    public final void Ejn(Integer num) {
        0qQ.A0B(num, 0);
        this.A00 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A07);
        parcel.writeString(S9Z.A01(this.A00));
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A03);
    }

    public final RH6 BJZ() {
        return this.A07;
    }

    public final Integer Bs1() {
        return this.A00;
    }

    public final String getId() {
        return this.A04;
    }

    public SelectionPhoneNumberViewItem(RH6 rh6, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C51974G9v.A1P(rh6, num, str, str2);
        this.A07 = rh6;
        this.A00 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = str4;
    }
}
