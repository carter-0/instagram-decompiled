package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C13600TdS;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionActionViewItem implements BaseCheckoutItem, C13600TdS {
    public static final Parcelable.Creator CREATOR = SWV.A00(9);
    public Integer A00;
    public String A01;
    public final Integer A02;
    public final RH6 A03;
    public final String A04;

    public SelectionActionViewItem(RH6 rh6, Integer num, Integer num2, String str, String str2) {
        0qQ.A0B(rh6, 1);
        this.A03 = rh6;
        this.A02 = num;
        this.A04 = str;
        this.A01 = str2;
        this.A00 = num2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A03);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
    }

    public final Integer B7O() {
        return this.A02;
    }

    public final RH6 BJZ() {
        return this.A03;
    }

    public SelectionActionViewItem() {
        this(RH6.A0n, (Integer) null, (Integer) null, (String) null, (String) null);
    }
}
