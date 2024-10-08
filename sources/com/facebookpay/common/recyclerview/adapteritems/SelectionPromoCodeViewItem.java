package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class SelectionPromoCodeViewItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(19);
    public String A00;
    public final RH6 A01;

    public SelectionPromoCodeViewItem(RH6 rh6, String str) {
        0qQ.A0B(rh6, 1);
        this.A01 = rh6;
        this.A00 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A01);
        parcel.writeString(this.A00);
    }

    public final RH6 BJZ() {
        return this.A01;
    }

    public SelectionPromoCodeViewItem() {
        this(RH6.A0t, (String) null);
    }
}
