package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionOfferViewItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(15);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public final RH6 A06;

    public SelectionOfferViewItem(RH6 rh6, String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A06 = rh6;
        this.A03 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A00 = str4;
        this.A02 = str5;
        this.A05 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A06;
    }

    public SelectionOfferViewItem() {
        this(RH6.A0r, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
