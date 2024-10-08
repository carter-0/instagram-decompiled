package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C41847B3o;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionTextViewItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(22);
    public Integer A00;
    public String A01;
    public boolean A02;
    public final RH6 A03;

    public SelectionTextViewItem(RH6 rh6, Integer num, String str, boolean z) {
        0qQ.A0B(rh6, 1);
        this.A03 = rh6;
        this.A01 = str;
        this.A00 = num;
        this.A02 = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A03);
        parcel.writeString(this.A01);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public final RH6 BJZ() {
        return this.A03;
    }

    public SelectionTextViewItem() {
        this(RH6.A0u, (Integer) null, (String) null, false);
    }
}
