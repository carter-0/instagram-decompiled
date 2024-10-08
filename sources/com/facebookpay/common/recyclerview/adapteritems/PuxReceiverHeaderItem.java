package com.facebookpay.common.recyclerview.adapteritems;

import X.0qQ;
import X.AnonymousClass7TE;
import X.RH6;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class PuxReceiverHeaderItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = SWV.A00(6);
    public final RH6 A00;
    public final String A01;
    public final String A02;

    public PuxReceiverHeaderItem(RH6 rh6, String str, String str2) {
        0qQ.A0B(rh6, 1);
        this.A00 = rh6;
        this.A02 = str;
        this.A01 = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public final RH6 BJZ() {
        return this.A00;
    }
}
