package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C13600TdS;
import X.C41847B3o;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class PuxContactItem implements BaseCheckoutItem, C13600TdS {
    public static final Parcelable.Creator CREATOR = SWV.A00(0);
    public final RH6 A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public PuxContactItem(RH6 rh6, Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A00 = rh6;
        this.A01 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = z;
        this.A02 = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeInt(C41847B3o.A00(parcel, this.A01));
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A02);
    }

    public final Integer B7O() {
        return this.A01;
    }

    public final RH6 BJZ() {
        return this.A00;
    }

    public PuxContactItem() {
        this(RH6.A0c, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }
}
